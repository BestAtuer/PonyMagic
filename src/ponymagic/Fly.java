package ponymagic;

import org.bukkit.command.*;
import org.bukkit.entity.*;
import net.md_5.bungee.api.*;

public class Fly implements CommandExecutor
{
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args)
	{
		if (!(sender instanceof Player))
		{
			return false;
		}
		
		final Player p = (Player) sender;

		if (!p.hasPermission("PonyMagic.fly"))
		{
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "§b小马跳跃 §r> §4你没有权限这么做."));
		}
		else if (p.getAllowFlight())
		{
			p.setAllowFlight(false);
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "§b小马跳跃 §r> §c飞行已关闭."));
		} else
		{
			p.setAllowFlight(true);
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "§b小马跳跃 §r> §a飞行已开启."));
		}
		
		return true;
	}
}
