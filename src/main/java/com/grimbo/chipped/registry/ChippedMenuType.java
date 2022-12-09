package com.grimbo.chipped.registry;

import com.grimbo.chipped.Chipped;
import com.grimbo.chipped.menus.ChippedMenu;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.MenuType;

public class ChippedMenuType {

	//Add new ContainerTypes here

	public static MenuType<ChippedMenu> botanistWorkbench;
	public static MenuType<ChippedMenu> glassblower;
	public static MenuType<ChippedMenu> carpentersTable;
	public static MenuType<ChippedMenu> loomTable;
	public static MenuType<ChippedMenu> masonTable;
	public static MenuType<ChippedMenu> alchemyBench;
	public static MenuType<ChippedMenu> mechanistWorkbench;

	public static void register() {
		botanistWorkbench = Registry.register(Registry.MENU, new ResourceLocation(Chipped.MOD_ID, "botanist_workbench"),
				new MenuType<>((id, inventory) -> new ChippedMenu(id, inventory, botanistWorkbench, ChippedSerializer.BOTANIST_WORKBENCH_TYPE, ChippedBlocks.BOTANIST_WORKBENCH)));
		glassblower = Registry.register(Registry.MENU, new ResourceLocation(Chipped.MOD_ID, "glassblower"),
				new MenuType<>((id, inventory) -> new ChippedMenu(id, inventory, glassblower, ChippedSerializer.GLASSBLOWER_TYPE, ChippedBlocks.GLASSBLOWER)));
		carpentersTable = Registry.register(Registry.MENU, new ResourceLocation(Chipped.MOD_ID, "carpenters_table"),
				new MenuType<>((id, inventory) -> new ChippedMenu(id, inventory, carpentersTable, ChippedSerializer.CARPENTERS_TABLE_TYPE, ChippedBlocks.CARPENTERS_TABLE)));
		loomTable = Registry.register(Registry.MENU, new ResourceLocation(Chipped.MOD_ID, "loom_table"),
				new MenuType<>((id, inventory) -> new ChippedMenu(id, inventory, loomTable, ChippedSerializer.LOOM_TABLE_TYPE, ChippedBlocks.LOOM_TABLE)));
		masonTable = Registry.register(Registry.MENU, new ResourceLocation(Chipped.MOD_ID, "mason_table"),
				new MenuType<>((id, inventory) -> new ChippedMenu(id, inventory, masonTable, ChippedSerializer.MASON_TABLE_TYPE, ChippedBlocks.MASON_TABLE)));
		alchemyBench = Registry.register(Registry.MENU, new ResourceLocation(Chipped.MOD_ID, "alchemy_bench"),
				new MenuType<>((id, inventory) -> new ChippedMenu(id, inventory, alchemyBench, ChippedSerializer.ALCHEMY_BENCH_TYPE, ChippedBlocks.ALCHEMY_BENCH)));
		mechanistWorkbench = Registry.register(Registry.MENU, new ResourceLocation(Chipped.MOD_ID, "mechanist_workbench"),
				new MenuType<>((id, inventory) -> new ChippedMenu(id, inventory, mechanistWorkbench, ChippedSerializer.MECHANIST_WORKBENCH_TYPE, ChippedBlocks.MECHANIST_WORKBENCH)));
	}
}
