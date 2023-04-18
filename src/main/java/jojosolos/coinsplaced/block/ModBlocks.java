package jojosolos.coinsplaced.block;

import jojosolos.coinsplaced.CoinsPlaced;
import jojosolos.coinsplaced.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block NETHERITE_COIN_PILE = registerBlock("netherite_coin_pile_placed",
            new CoinPileBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque()), ModItemGroup.COINPILEBLOCKS);

    public static final Block DIAMOND_COIN_PILE = registerBlock("diamond_coin_pile_placed",
            new CoinPileBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque()), ModItemGroup.COINPILEBLOCKS);

    public static final Block GOLD_COIN_PILE = registerBlock("gold_coin_pile_placed",
            new CoinPileBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).nonOpaque()), ModItemGroup.COINPILEBLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CoinsPlaced.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registry.ITEM, new Identifier(CoinsPlaced.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
        return item;
    }

    public static void registerModBlocks() {
        CoinsPlaced.LOGGER.info("Registering ModBlocks for " + CoinsPlaced.MOD_ID);
    }
}
