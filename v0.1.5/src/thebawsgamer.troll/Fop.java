package thebawsgamer.troll;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fop implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd,String commandLabel, String args[]) {
		if(commandLabel.equalsIgnoreCase("falseop")){
			if(args.length == 0){
				Player player = (Player) sender;
				player.sendMessage(ChatColor.GRAY +""+ ChatColor.ITALIC +"[CONSOLE: Opped " + player.getName() + "]");
				}else if (args.length == 1){
					Player player = (Player) sender;
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					if(targetPlayer != null){
					targetPlayer.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "[CONSOLE: Opped " + targetPlayer.getName() +"]");
						}else{
							player.sendMessage(ChatColor.RED + args[0] + " is not online!");
						}
					}
		}
		return false;
		}
}
