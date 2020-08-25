package net.peacefulcraft.guishop.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.peacefulcraft.guishop.GUIShop;

public class ShopCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (!(sender instanceof Player)) {
      sender.sendMessage(GUIShop.messagingPrefix + "GUIShops are only openable by players");
      return true;
    }

    if (command.getLabel().equalsIgnoreCase("shop") || command.getLabel().equalsIgnoreCase("buy")) {
      GUIShop._this().getIndexShop().openShop(((Player) sender));
    }
    
    return true;
  } 
}