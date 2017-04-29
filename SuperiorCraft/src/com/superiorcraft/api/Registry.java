package com.superiorcraft.api;

import com.superiorcraft.main.Main;

public class Registry {
	
	public static void registerBlock(CustomBlock b) {
		Main.plugin.getServer().getPluginManager().registerEvents(b, Main.plugin);
	}
	
	public static void registerItem(CustomItem i) {
		Main.plugin.getServer().getPluginManager().registerEvents(i, Main.plugin);
	}
	
	public static void addRecipe(CustomCraftingRecipe r) {
		CustomCrafting.recipes.add(r);
	}
	
}
