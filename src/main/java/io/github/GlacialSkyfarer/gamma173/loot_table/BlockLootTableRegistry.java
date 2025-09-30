package io.github.GlacialSkyfarer.gamma173.loot_table;

import com.google.gson.Gson;
import io.github.GlacialSkyfarer.gamma173.Gamma173;
import net.modificationstation.stationapi.api.resource.Filters;
import net.modificationstation.stationapi.api.resource.ResourceHelper;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.impl.recipe.JsonRecipeType;
import net.modificationstation.stationapi.impl.recipe.JsonRecipesLoader;
import org.apache.logging.log4j.Logger;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Hashtable;

import static io.github.GlacialSkyfarer.gamma173.Gamma173.NAMESPACE;

public abstract class BlockLootTableRegistry {

    public static Hashtable<Identifier, BlockLootTable> lootTables = new Hashtable<>();

    public static void loadJson() {
        Gamma173.LOGGER.info("Searching for JSON recipes...");
        String tablePath = NAMESPACE + "/loot_tables/block";
        ResourceHelper.DATA.find(tablePath, Filters.FileType.JSON).forEach(lootTable -> {
            LOGGER.info(lootTable.getFile());
            registerTable(lootTable);
        });
    }

    static Logger LOGGER = NAMESPACE.getLogger();

    public static void registerTable(URL table) {

        Identifier id = null;
        BlockLootTable t;
        try {

            BlockLootTableJson json = new Gson().fromJson(new InputStreamReader(table.openStream()), BlockLootTableJson.class);
            id = json.id;
            t = json.table;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (id == null) {
            LOGGER.error("Block loot table id was null!");
            return;
        }
        if (lootTables.containsKey(id)) {
            LOGGER.error("Block loot table '{}' is already registered!", id);
            return;
        }
        lootTables.put(id, t);
    }

    public static BlockLootTable getTable(Identifier id) {
        if (!lootTables.containsKey(id)) {
            LOGGER.error("Block loot table '{}' does not exist!", id);
            return null;
        }
        return lootTables.get(id);
    }

}
