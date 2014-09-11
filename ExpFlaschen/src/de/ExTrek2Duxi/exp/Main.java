package de.ExTrek2Duxi.exp;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new Handler(), this);
		super.onEnable();
	}
}
