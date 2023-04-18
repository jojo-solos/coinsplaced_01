package jojosolos.coinsplaced.item;

import jojosolos.coinsplaced.CoinsPlaced;
import net.darkhax.coins.CoinsContent;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import net.darkhax.coins.CoinsFabric;
import net.darkhax.bookshelf.api.registry.RegistryDataProvider;

public class ModItemGroup {

    public static ItemGroup COINPILEBLOCKS;

    public static void registerItemGroups() {
        COINPILEBLOCKS = FabricItemGroupBuilder.build(new Identifier(CoinsPlaced.MOD_ID, "coinsplaced"),
                () -> new ItemStack(Items.NETHERITE_BLOCK));
    }
}
