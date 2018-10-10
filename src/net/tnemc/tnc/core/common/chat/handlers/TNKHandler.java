package net.tnemc.tnc.core.common.chat.handlers;

import net.tnemc.tnc.core.common.chat.ChatHandler;
import net.tnemc.tnc.core.common.chat.handlers.towny.AllyType;
import net.tnemc.tnc.core.common.chat.handlers.towny.NationType;
import net.tnemc.tnc.core.common.chat.handlers.towny.TownType;
import net.tnemc.tnc.core.common.chat.variables.TNK.KingdomVariable;
import net.tnemc.tnc.core.common.chat.variables.TNK.PactVariable;
import net.tnemc.tnc.core.common.chat.variables.TNK.VillageVariable;

/**
 * Created by creatorfromhell.
 *
 * The New Chat Minecraft Server Plugin
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0
 * International License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/
 * or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */
public class TNKHandler extends ChatHandler {

  public TNKHandler() {

    addType(new AllyType());
    addType(new NationType());
    addType(new TownType());

    addVariable(new PactVariable());
    addVariable(new KingdomVariable());
    addVariable(new VillageVariable());
  }

  @Override
  public String getName() {
    return "tnk";
  }
}