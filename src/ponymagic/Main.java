package ponymagic;

import org.bukkit.plugin.java.*;
import org.bukkit.command.*;

public class Main extends JavaPlugin
{
    public void onEnable() {
        this.getCommand("fly").setExecutor((CommandExecutor)new Fly());
        this.getCommand("lobby").setExecutor((CommandExecutor)new Lobby());
        this.getCommand("plotworld").setExecutor((CommandExecutor)new PlotWorld());
    }
}
