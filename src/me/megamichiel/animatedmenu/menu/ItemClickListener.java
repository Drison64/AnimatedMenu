package me.megamichiel.animatedmenu.menu;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

public interface ItemClickListener {
	
	public abstract void onClick(Player who, ClickType click, MenuItem item);
	
}