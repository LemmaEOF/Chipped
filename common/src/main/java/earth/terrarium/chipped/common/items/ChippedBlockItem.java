package earth.terrarium.chipped.common.items;

import earth.terrarium.chipped.api.PaletteType;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChippedBlockItem extends BlockItem {

    private final PaletteType type;

    public ChippedBlockItem(PaletteType type, Block block, Properties properties) {
        super(block, properties);
        this.type = type;
    }

    @Override
    public Component getName(@NotNull ItemStack itemStack) {
        return this.getBlock().getName();
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
        list.add(this.type.groupName().copy().withStyle(ChatFormatting.GRAY));
    }
}
