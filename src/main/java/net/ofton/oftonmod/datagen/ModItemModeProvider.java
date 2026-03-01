package net.ofton.oftonmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.ofton.oftonmod.OftonMod;
import net.ofton.oftonmod.item.ModItems;

import java.lang.module.ResolutionException;

public class ModItemModeProvider extends ItemModelProvider {
    public ModItemModeProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OftonMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.LEAF);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(OftonMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
