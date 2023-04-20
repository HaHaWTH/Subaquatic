package git.jbredwards.subaquatic.mod.common.init;

import git.jbredwards.subaquatic.mod.Subaquatic;
import git.jbredwards.subaquatic.mod.common.block.*;
import git.jbredwards.subaquatic.mod.common.entity.item.EntityBoatChest;
import git.jbredwards.subaquatic.mod.common.entity.item.EntityBoatEnderChest;
import git.jbredwards.subaquatic.mod.common.entity.item.EntityBoatFurnace;
import git.jbredwards.subaquatic.mod.common.entity.item.EntityMinecartEnderChest;
import git.jbredwards.subaquatic.mod.common.item.*;
import git.jbredwards.subaquatic.mod.common.item.block.*;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nonnull;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * stores all of this mod's items
 * @author jbred
 *
 */
public final class SubaquaticItems
{
    // Init
    @Nonnull public static final List<Item> INIT = new LinkedList<>();

    // Item blocks
    @Nonnull public static final ItemBlock DRIED_KELP_BLOCK = register("dried_kelp_block", new ItemBlock(SubaquaticBlocks.DRIED_KELP_BLOCK));
    @Nonnull public static final ItemBlock BLUE_ICE = register("blue_ice", new ItemBlock(SubaquaticBlocks.BLUE_ICE));
    @Nonnull public static final ItemBlock PUMPKIN = register("pumpkin", new ItemBlock(SubaquaticBlocks.PUMPKIN));
    @Nonnull public static final ItemBlockMeta TUBE_CORAL_BLOCK = register("tube_coral_block", new ItemBlockMeta(SubaquaticBlocks.TUBE_CORAL_BLOCK, false, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta BRAIN_CORAL_BLOCK = register("brain_coral_block", new ItemBlockMeta(SubaquaticBlocks.BRAIN_CORAL_BLOCK, false, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta BUBBLE_CORAL_BLOCK = register("bubble_coral_block", new ItemBlockMeta(SubaquaticBlocks.BUBBLE_CORAL_BLOCK, false, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta FIRE_CORAL_BLOCK = register("fire_coral_block", new ItemBlockMeta(SubaquaticBlocks.FIRE_CORAL_BLOCK, false, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta HORN_CORAL_BLOCK = register("horn_coral_block", new ItemBlockMeta(SubaquaticBlocks.HORN_CORAL_BLOCK, false, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta TUBE_CORAL_FAN = register("tube_coral_fan", new ItemBlockMeta(SubaquaticBlocks.TUBE_CORAL_FAN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta BRAIN_CORAL_FAN = register("brain_coral_fan", new ItemBlockMeta(SubaquaticBlocks.BRAIN_CORAL_FAN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta BUBBLE_CORAL_FAN = register("bubble_coral_fan", new ItemBlockMeta(SubaquaticBlocks.BUBBLE_CORAL_FAN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta FIRE_CORAL_FAN = register("fire_coral_fan", new ItemBlockMeta(SubaquaticBlocks.FIRE_CORAL_FAN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta HORN_CORAL_FAN = register("horn_coral_fan", new ItemBlockMeta(SubaquaticBlocks.HORN_CORAL_FAN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta TUBE_CORAL_FIN = register("tube_coral_fin", new ItemBlockMeta(SubaquaticBlocks.TUBE_CORAL_FIN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta BRAIN_CORAL_FIN = register("brain_coral_fin", new ItemBlockMeta(SubaquaticBlocks.BRAIN_CORAL_FIN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta BUBBLE_CORAL_FIN = register("bubble_coral_fin", new ItemBlockMeta(SubaquaticBlocks.BUBBLE_CORAL_FIN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta FIRE_CORAL_FIN = register("fire_coral_fin", new ItemBlockMeta(SubaquaticBlocks.FIRE_CORAL_FIN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockMeta HORN_CORAL_FIN = register("horn_coral_fin", new ItemBlockMeta(SubaquaticBlocks.HORN_CORAL_FIN, true, AbstractBlockCoral.ALIVE));
    @Nonnull public static final ItemBlockCluster SEA_PICKLE = register("sea_pickle", new ItemBlockCluster(SubaquaticBlocks.SEA_PICKLE));
    @Nonnull public static final ItemBlockSeagrass SEAGRASS = register("seagrass", new ItemBlockSeagrass(SubaquaticBlocks.SEAGRASS));
    @Nonnull public static final ItemBlock NAUTILUS_SHELL = register("nautilus_shell", new ItemBlock(SubaquaticBlocks.NAUTILUS_SHELL));
    @Nonnull public static final ItemBlock KELP = register("kelp", new ItemBlock(SubaquaticBlocks.KELP));
    @Nonnull public static final ItemBlockCluster GLOW_LICHEN = register("glow_lichen", new ItemBlockCluster(SubaquaticBlocks.GLOW_LICHEN));
    @Nonnull public static final ItemBlockMeta FROGLIGHT = register("froglight", new ItemBlockMeta(SubaquaticBlocks.FROGLIGHT, true, BlockFroglight.TYPE));
    @Nonnull public static final ItemBlock ROOTED_DIRT = register("rooted_dirt", new ItemBlock(SubaquaticBlocks.ROOTED_DIRT));
    @Nonnull public static final ItemBlock HANGING_ROOTS = register("hanging_roots", new ItemBlock(SubaquaticBlocks.HANGING_ROOTS));
    //@Nonnull public static final ItemBlockMeta MANGROVE_ROOTS = register("mangrove_roots", new ItemBlockMeta(SubaquaticBlocks.MANGROVE_ROOTS, true, BlockMangroveRoots.HAS_MUD));
    @Nonnull public static final ItemBlock MUD = register("mud", new ItemBlock(SubaquaticBlocks.MUD));
    @Nonnull public static final ItemBlock PACKED_MUD = register("packed_mud", new ItemBlock(SubaquaticBlocks.PACKED_MUD));
    @Nonnull public static final ItemBlock PACKED_MUD_BRICKS = register("packed_mud_bricks", new ItemBlock(SubaquaticBlocks.PACKED_MUD_BRICKS));

    // Stairs
    @Nonnull public static final ItemBlock PACKED_MUD_BRICKS_STAIRS = register("packed_mud_bricks_stairs", new ItemBlock(SubaquaticBlocks.PACKED_MUD_BRICKS_STAIRS));

    // Slabs
    @Nonnull public static final ItemSlab PACKED_MUD_BRICKS_SLAB = register("packed_mud_bricks_slab", new ItemSlab(SubaquaticBlocks.PACKED_MUD_BRICKS_SLAB, SubaquaticBlocks.PACKED_MUD_BRICKS_SLAB, SubaquaticBlocks.PACKED_MUD_BRICKS_SLAB_DOUBLE));

    // Walls
    @Nonnull public static final ItemBlock PACKED_MUD_BRICKS_WALL = register("packed_mud_bricks_wall", new ItemBlock(SubaquaticBlocks.PACKED_MUD_BRICKS_WALL));

    // Items
    @Nonnull public static final ItemFood DRIED_KELP = register("dried_kelp", new ItemDurationFood(1, false), item -> item.itemUseDuration = 16);
    @Nonnull public static final ItemMinecartTypeless ENDER_CHEST_MINECART = register("ender_chest_minecart", new ItemMinecartTypeless(EntityMinecartEnderChest::new));

    // Boat containers
    @Nonnull public static final ItemBoatContainer CHEST_BOAT = register("chest_boat", new ItemBoatContainer(EntityBoatChest::new));
    @Nonnull public static final ItemBoatContainer ENDER_CHEST_BOAT = register("ender_chest_boat", new ItemBoatContainer(EntityBoatEnderChest::new));
    @Nonnull public static final ItemBoatContainer FURNACE_BOAT = register("furnace_boat", new ItemBoatContainer(EntityBoatFurnace::new));

    //ore dict registration
    public static void postRegistry() {
        OreDictionary.registerOre("cropPumpkin", PUMPKIN);
        OreDictionary.registerOre("cropPumpkin", Blocks.PUMPKIN);
        OreDictionary.registerOre("cropKelp", KELP);
        OreDictionary.registerOre("cropSeaPickle", SEA_PICKLE);
        OreDictionary.registerOre("foodDriedKelp", DRIED_KELP);
        OreDictionary.registerOre("froglight", new ItemStack(FROGLIGHT, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("mud", MUD);
        OreDictionary.registerOre("mudPacked", PACKED_MUD);
        OreDictionary.registerOre("mudPacked", PACKED_MUD_BRICKS);
        OreDictionary.registerOre("shellNautilus", NAUTILUS_SHELL);
    }

    @Nonnull
    static <I extends Item> I register(@Nonnull String name, @Nonnull I item) {
        INIT.add(item.setRegistryName(Subaquatic.MODID, name).setTranslationKey(Subaquatic.MODID + "." + name).setCreativeTab(SubaquaticCreativeTab.INSTANCE));
        return item;
    }

    @Nonnull
    static <I extends Item> I register(@Nonnull String name, @Nonnull I item, @Nonnull Consumer<I> consumer) {
        consumer.accept(item);
        return register(name, item);
    }
}
