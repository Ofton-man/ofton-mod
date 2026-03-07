package net.ofton.oftonmod.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ofton.oftonmod.OftonMod;
import net.ofton.oftonmod.block.ModBlocks;

public class ModBlockEntities {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, OftonMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<PlateProcessingMachineBlockEntity>> PLATE_PROCESSING_BE =
            BLOCK_ENTITIES.register("plate_processing_be", () ->
                    BlockEntityType.Builder.of(PlateProcessingMachineBlockEntity::new,
                            ModBlocks.PLATE_PROCESSING_MACHINE.get()).build(null));

    public static void  register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
