package com.grimbo.chipped.compat;

import com.grimbo.chipped.Chipped;
import com.grimbo.chipped.recipe.ChippedRecipe;
import com.grimbo.chipped.registry.ChippedBlocks;
import com.grimbo.chipped.registry.ChippedSerializer;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeType;

public class EmiChippedPlugin implements EmiPlugin {
	public static final EmiRecipeCategory ALCHEMY_BENCH = new EmiRecipeCategory(new ResourceLocation(Chipped.MOD_ID, "alchemy_bench"), EmiStack.of(ChippedBlocks.ALCHEMY_BENCH));
	public static final EmiRecipeCategory BOTANIST_WORKBENCH = new EmiRecipeCategory(new ResourceLocation(Chipped.MOD_ID, "botanist_workbench"), EmiStack.of(ChippedBlocks.BOTANIST_WORKBENCH));
	public static final EmiRecipeCategory CARPENTERS_TABLE = new EmiRecipeCategory(new ResourceLocation(Chipped.MOD_ID, "carpenters_table"), EmiStack.of(ChippedBlocks.CARPENTERS_TABLE));
	public static final EmiRecipeCategory GLASSBLOWER = new EmiRecipeCategory(new ResourceLocation(Chipped.MOD_ID, "glassblower"), EmiStack.of(ChippedBlocks.GLASSBLOWER));
	public static final EmiRecipeCategory LOOM_TABLE = new EmiRecipeCategory(new ResourceLocation(Chipped.MOD_ID, "loom_table"), EmiStack.of(ChippedBlocks.LOOM_TABLE));
	public static final EmiRecipeCategory MASON_TABLE = new EmiRecipeCategory(new ResourceLocation(Chipped.MOD_ID, "mason_table"), EmiStack.of(ChippedBlocks.MASON_TABLE));
	public static final EmiRecipeCategory MECHANIST_WORKBENCH = new EmiRecipeCategory(new ResourceLocation(Chipped.MOD_ID, "mechanist_workbench"), EmiStack.of(ChippedBlocks.MECHANIST_WORKBENCH));


	@Override
	public void register(EmiRegistry registry) {
		registerCategory(registry, ChippedSerializer.ALCHEMY_BENCH_TYPE, ALCHEMY_BENCH);
		registerCategory(registry, ChippedSerializer.BOTANIST_WORKBENCH_TYPE, BOTANIST_WORKBENCH);
		registerCategory(registry, ChippedSerializer.CARPENTERS_TABLE_TYPE, CARPENTERS_TABLE);
		registerCategory(registry, ChippedSerializer.GLASSBLOWER_TYPE, GLASSBLOWER);
		registerCategory(registry, ChippedSerializer.LOOM_TABLE_TYPE, LOOM_TABLE);
		registerCategory(registry, ChippedSerializer.MASON_TABLE_TYPE, MASON_TABLE);
		registerCategory(registry, ChippedSerializer.MECHANIST_WORKBENCH_TYPE, MECHANIST_WORKBENCH);
	}

	private void registerCategory(EmiRegistry registry, RecipeType<ChippedRecipe> type, EmiRecipeCategory category) {
		registry.addCategory(category);
		registry.addWorkstation(category, EmiIngredient.of(Ingredient.of(((EmiStack)category.icon).getItemStack())));
		registry.getRecipeManager().getAllRecipesFor(type).forEach(r -> {
			for (HolderSet<Item> tag : r.tags()) {
				for (Item item : tag.stream().map(Holder::value).toList()) {
					registry.addRecipe(
							new EmiChippedRecipe(category,
							new ResourceLocation(Chipped.MOD_ID, category.id.getPath() + "_" + Registry.ITEM.getKey(item).getPath()),
							Ingredient.of(tag.stream().map(ItemStack::new)),
							new ItemStack(item))
					);
				}
			}
		});
	}
}
