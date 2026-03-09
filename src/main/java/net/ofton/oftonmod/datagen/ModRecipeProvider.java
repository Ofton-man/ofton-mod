package net.ofton.oftonmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.ofton.oftonmod.block.ModBlocks;
import net.ofton.oftonmod.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider  implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LEAF_BLOCK.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModItems.LEAF.get())
                .unlockedBy(getHasName(ModItems.LEAF.get()),has(ModItems.LEAF.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAF.get(),9)
                .requires(ModBlocks.LEAF_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.LEAF_BLOCK.get()), has(ModBlocks.LEAF_BLOCK.get()))
                .save(pWriter);

    }
}
