package earth.terrarium.chipped;

import earth.terrarium.chipped.common.registry.ChippedBlocks;
import earth.terrarium.chipped.common.registry.ChippedItems;

public class Chipped {
    public static final String MOD_ID = "chipped";

    public static void init() {
        ChippedBlocks.register();
        ChippedItems.register();
    }
}