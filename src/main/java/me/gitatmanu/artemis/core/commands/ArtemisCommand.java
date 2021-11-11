package me.gitatmanu.artemis.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ArtemisCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            sender.sendMessage(ChatColor.DARK_GRAY + "Ahora tienes los poderes de la diosa Artemisa.");
        } else {
            System.out.println("Este comando debe utilizarlo un jugador");
        }
        return true;
    }
}