package net.tnemc.tnc.core.common.chat.variables.TNK;

import net.tnemc.tnc.core.common.chat.ChatVariable;
import net.tnemc.tnk.core.TheNewKings;
import net.tnemc.tnk.core.common.helper.KingdomHelper;
import org.bukkit.entity.Player;

/**
 * Created by creatorfromhell.
 *
 * The New Chat Minecraft Server Plugin
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0
 * International License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/
 * or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */
public class KingdomVariable extends ChatVariable {
  @Override
  public String name() {
    return "$kingdom";
  }

  @Override
  public String parse(Player player, String message) {
    TheNewKings.instance().saveManager().open();
    if(!KingdomHelper.hasKingdomPlayer(player.getUniqueId(), player.getWorld().getName())) {
      TheNewKings.instance().saveManager().close();
      return "";
    }
    String kingdom = KingdomHelper.getKingdomPlayer(player.getUniqueId(), player.getWorld().getName());
    TheNewKings.instance().saveManager().close();
    return kingdom;
  }
}