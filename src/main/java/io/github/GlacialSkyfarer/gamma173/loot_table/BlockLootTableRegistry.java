package io.github.GlacialSkyfarer.gamma173.loot_table;

import io.github.GlacialSkyfarer.gamma173.Gamma173;
import net.modificationstation.stationapi.api.StationAPI;
import net.modificationstation.stationapi.api.resource.Filters;
import net.modificationstation.stationapi.api.resource.ResourceFinder;
import net.modificationstation.stationapi.api.resource.ResourceHelper;
import net.modificationstation.stationapi.api.resource.ResourceManager;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.impl.recipe.JsonRecipesLoader;
import org.apache.logging.log4j.Logger;

import java.util.Hashtable;

import static io.github.GlacialSkyfarer.gamma173.Gamma173.NAMESPACE;

public abstract class BlockLootTableRegistry {

    public static Hashtable<Identifier, BlockLootTable> lootTables = new Hashtable<>();

    public static void loadJson() {
        Gamma173.LOGGER.info("Searching for JSON recipes...");
        String tablePath = String.valueOf(Gamma173.NAMESPACE) + "/recipes";
    }

    static Logger LOGGER = NAMESPACE.getLogger();

    public static void registerTable(Identifier id, BlockLootTable table) throws Exception {
        if (lootTables.containsKey(id)) {
            LOGGER.error("Block loot table '{}' is already registered!", id);
            return;
        }
        lootTables.put(id, table);
    }

    public static BlockLootTable getTable(Identifier id) {
        if (!lootTables.containsKey(id)) {
            LOGGER.error("Block loot table '{}' does not exist!", id);
            return null;
        }
        return lootTables.get(id);
    }

}
