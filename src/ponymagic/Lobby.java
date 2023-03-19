package ponymagic;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import net.md_5.bungee.api.*;

public class Lobby implements CommandExecutor
{
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args)
	{
		if (!(sender instanceof Player))
		{
			return false;
		}

		final Player p = (Player) sender;

		if (!p.hasPermission("PonyMagic.wtp"))
		{
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "§b小马跳跃 §r> §4你没有权限这么做."));
		}

		Location loc = new Location(Bukkit.getWorld("World"), -30.5, 145, -0.5, -90.0f, 0f);
		p.teleport(loc);
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', "§b小马跳跃 §r> §a已传送至大厅."));
		return true;
	}
}
