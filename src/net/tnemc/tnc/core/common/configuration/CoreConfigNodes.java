package net.tnemc.tnc.core.common.configuration;


/**
 * Created by creatorfromhell.
 *
 * The New Chat Minecraft Server Plugin
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0
 * International License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/
 * or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */
public enum CoreConfigNodes implements IConfigNode {

  GENERAL_HEADER {
    @Override
    public String getNode() {
      return "General";
    }
  },

  GENERAL_METRICS {
    @Override
    public String getNode() {
      return "General.Metrics";
    }

    @Override
    public String getDefaultValue() {
      return "true";
    }

    @Override
    public String[] getComments() {
      return new String[] {
          "Whether or not to enable plugin metrics. This lets us track plugin usage."
      };
    }
  },

  CORE_HEADER {
    @Override
    public String getNode() {
      return "Core";
    }
  },

  CORE_GENERAL_CHAT {
    @Override
    public String getNode() {
      return "Core.GeneralChat";
    }

    @Override
    public String[] getComments() {
      return new String[] {
          "All configurations relating to the general, non-roomed chat."
      };
    }
  },

  CORE_GENERAL_CHAT_WORLD_BASED {
    @Override
    public String getNode() {
      return "Core.GeneralChat.WorldBased";
    }

    @Override
    public String getDefaultValue() {
      return "false";
    }

    @Override
    public String[] getComments() {
      return new String[] {
          "Whether or not general chat should be between players in the same world."
      };
    }
  },

  CORE_GENERAL_CHAT_RADIAL {
    @Override
    public String getNode() {
      return "Core.GeneralChat.Radial";
    }

    @Override
    public String getDefaultValue() {
      return "false";
    }

    @Override
    public String[] getComments() {
      return new String[] {
          "Whether or not general chat should be radial-based."
      };
    }
  },

  CORE_GENERAL_CHAT_RADIUS {
    @Override
    public String getNode() {
      return "Core.GeneralChat.Radius";
    }

    @Override
    public String getDefaultValue() {
      return "20";
    }

    @Override
    public String[] getComments() {
      return new String[] {
          "The radius, in blocks, that radial chat uses."
      };
    }
  },

  CORE_GENERAL_CHAT_HANDLER {
    @Override
    public String getNode() {
      return "Core.GeneralChat.Handler";
    }

    @Override
    public String getDefaultValue() {
      return "None";
    }

    @Override
    public String[] getComments() {
      return new String[] {
          "The handler to use for general chat. Set to None to keep vanilla general chat."
      };
    }
  },

  CORE_GENERAL_CHAT_FORMAT {
    @Override
    public String getNode() {
      return "Core.GeneralChat.Format";
    }

    @Override
    public String getDefaultValue() {
      return "<white><$username><green>: <white>$message";
    }

    @Override
    public String[] getComments() {
      return new String[] {
          "The format to use for general chat.",
          "Variables and colour codes found at:",
          "https://github.com/TheNewEconomy/TheNewChat/blob/master/Variables.md"
      };
    }
  },

  CORE_CHATS {
    @Override
    public String getNode() {
      return "Core.Chats";
    }

    @Override
    public String[] getComments() {
      return new String[] {
          "Holds all chats."
      };
    }
  };

  @Override
  public String getFile() {
    return "config.yml";
  }
}
