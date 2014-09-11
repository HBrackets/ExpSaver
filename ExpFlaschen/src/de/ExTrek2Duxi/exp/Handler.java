package de.ExTrek2Duxi.exp;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.ItemStack;

public class Handler implements Listener {
	@EventHandler
	public void onZaubertischDamage(BlockDamageEvent e) {
		if (e.getBlock().getType().equals(Material.ENCHANTMENT_TABLE)) {
			if (e.getPlayer().getItemInHand().getType().equals(Material.GLASS_BOTTLE)) {
				float lvl = e.getPlayer().getExp();
				if (lvl <= 100) {
					e.getPlayer().setExp(lvl-100);
					e.getPlayer().getInventory().addItem(new ItemStack(Material.EXP_BOTTLE,10));
					e.getPlayer().sendMessage(ChatColor.AQUA+"Du hast 100 Erfahrung benutzt um 10 Exp-Flasche herzustellen!");
				}
			}
		}
	}
}
