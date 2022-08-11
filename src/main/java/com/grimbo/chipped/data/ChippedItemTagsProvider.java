package com.grimbo.chipped.data;

import com.grimbo.chipped.Chipped;
import com.grimbo.chipped.api.BlockRegistry;
import com.grimbo.chipped.api.ChippedBlockType;
import com.grimbo.chipped.api.ChippedWoodType;
import com.grimbo.chipped.block.ChippedBlockTypes;

import com.grimbo.chipped.block.ChippedBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.DyeColor;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.grimbo.chipped.block.ChippedBlockTypes.*;
import static com.grimbo.chipped.block.ChippedBlockTypes.OBSIDIAN;

public class ChippedItemTagsProvider extends ItemTagsProvider {

	public ChippedItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider,
			ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockTagProvider, Chipped.MOD_ID, existingFileHelper);
	}

	@Override
	protected void addTags() {
		for (ChippedBlockType<Block> type : BlockRegistry.getBlockTypes()) {
			copy(type.getBlockTag(), type.getItemTag());
		}

		//Default Vanilla tags
		for (ChippedWoodType wood : ChippedWoodType.VALUES) {
			tag(ItemTags.PLANKS).addTag(ChippedBlockTypes.PLANKS.get(wood).getItemTag());
		}

		for (int i = 0; i < 16; i++) {
			DyeColor color = DyeColor.byId(i);
			tag(ItemTags.WOOL).addTag(ChippedBlockTypes.WOOL.get(color).getItemTag());
			tag(ItemTags.CARPETS).addTag(ChippedBlockTypes.CARPETS.get(color).getItemTag());
		}

		tag(ItemTags.STONE_CRAFTING_MATERIALS).addTag(ChippedBlockTypes.COBBLESTONE.getItemTag());
		tag(ItemTags.STONE_CRAFTING_MATERIALS).addTag(ChippedBlockTypes.BLACKSTONES.getItemTag());

		tag(ItemTags.SOUL_FIRE_BASE_BLOCKS).addTag(ChippedBlockTypes.SOUL_SANDS.getItemTag());
		tag(ItemTags.PIGLIN_REPELLENTS).addTag(ChippedBlockTypes.SOUL_LANTERNS.getItemTag());

		//Default Forge tags
		tag(Tags.Items.STONE)
				.addTag(STONE.getItemTag())
				.addTag(ANDESITE.getItemTag())
				.addTag(DIORITE.getItemTag())
				.addTag(GRANITE.getItemTag())
				.addTag(BASALT.getItemTag())
				.addTag(MOSSY_STONE_BRICKS.getItemTag())
				.addTag(BRICKS.getItemTag())
				.addTag(CLAYS.getItemTag())
				.addTag(DARK_PRISMARINE.getItemTag())
				.addTag(PRISMARINE.getItemTag())
				.addTag(GILDED_BLACKSTONES.getItemTag())
				.addTag(COAL_BLOCK.getItemTag())
				.addTag(REDSTONE_BLOCK.getItemTag())
				.addTag(LODESTONE.getItemTag())
				.addTag(MAGMA_BLOCK.getItemTag())
				.addTag(PURPUR_BLOCK.getItemTag())
				.addTag(QUARTZ_BLOCK.getItemTag())
				.addTag(RED_NETHER_BRICKS.getItemTag())
				.addTag(RED_SANDSTONE.getItemTag())
				.addTag(SANDSTONE.getItemTag())
				.addTag(SMOOTH_STONE.getItemTag())
				.addTag(NETHER_BRICKS.getItemTag())
				.addTag(AMETHYST_BLOCK.getItemTag())
				.addTag(CALCITE.getItemTag())
				.addTag(DRIPSTONE_BLOCK.getItemTag())
				.addTag(TUFF.getItemTag())
				.addTag(DEEPSLATE.getItemTag())
				.addTag(RAW_IRON_BLOCK.getItemTag())
				.addTag(RAW_COPPER_BLOCK.getItemTag())
				.addTag(RAW_GOLD_BLOCK.getItemTag())
				.addTag(BLUE_ICE.getItemTag())
				.addTag(ICE.getItemTag())
				.addTag(PACKED_ICE.getItemTag())
				.addTag(DIAMOND_BLOCK.getItemTag())
				.addTag(EMERALD_BLOCK.getItemTag())
				.addTag(GOLD_BLOCK.getItemTag())
				.addTag(IRON_BLOCK.getItemTag())
				.addTag(NETHERITE_BLOCK.getItemTag())
				.addTag(ANCIENT_DEBRIS.getItemTag());

		tag(Tags.Items.COBBLESTONE).addTag(COBBLESTONE.getItemTag());
		tag(Tags.Items.END_STONES).addTag(END_STONE.getItemTag());
		tag(Tags.Items.SAND).addTag(SAND.getItemTag());
		tag(Tags.Items.GRAVEL).addTag(GRAVEL.getItemTag());

		tag(Tags.Items.GLASS).addTag(GLASSES.getItemTag());
		tag(Tags.Items.GLASS_COLORLESS).addTag(GLASSES.getItemTag());
		tag(Tags.Items.GLASS_PANES).addTag(GLASS_PANES.getItemTag());
		tag(Tags.Items.GLASS_PANES_COLORLESS).addTag(GLASS_PANES.getItemTag());

		for (int id = 0; id < 16; ++id) {
			DyeColor color = DyeColor.byId(id);

			tag(Tags.Items.GLASS).addTag(STAINED_GLASSES.get(color).getItemTag());
			tag(ItemTags.create(new ResourceLocation("forge", "glass/"+color))).addTag(STAINED_GLASSES.get(color).getItemTag());

			tag(Tags.Items.GLASS).addTag(STAINED_GLASS_PANES.get(color).getItemTag());
			tag(ItemTags.create(new ResourceLocation("forge", "glass_panes/"+color))).addTag(STAINED_GLASS_PANES.get(color).getItemTag());

			tag(ItemTags.create(new ResourceLocation("forge", "terracotta"))).addTag(TERRACOTTAS.get(color).getItemTag());
			tag(ItemTags.create(new ResourceLocation("forge", "terracotta/"+color))).addTag(TERRACOTTAS.get(color).getItemTag());
			tag(ItemTags.create(new ResourceLocation("forge", "glazed_terracotta"))).addTag(GLAZED_TERRACOTTAS.get(color).getItemTag());
			tag(ItemTags.create(new ResourceLocation("forge", "glazed_terracotta/"+color))).addTag(GLAZED_TERRACOTTAS.get(color).getItemTag());
		}

		tag(Tags.Items.NETHERRACK).addTag(NETHERRACK.getItemTag());

		tag(Tags.Items.OBSIDIAN).addTag(OBSIDIAN.getItemTag());
	}
}
