package net.tnemc.tnc.core.common.chat.handlers;

import net.tnemc.tnc.core.common.chat.ChatHandler;
import net.tnemc.tnc.core.common.chat.handlers.core.BasicType;

/**
 * Created by creatorfromhell.
 *
 * The New Chat Minecraft Server Plugin
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0
 * International License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/
 * or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */
public class CoreHandler extends ChatHandler {

  public CoreHandler() {

    addType(new BasicType());
  }

  @Override
  public String getName() {
    return "core";
  }
}