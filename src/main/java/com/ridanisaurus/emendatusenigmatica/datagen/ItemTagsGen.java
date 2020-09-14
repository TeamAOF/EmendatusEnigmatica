/*
 * MIT License
 *
 * Copyright (c) 2020 Ridanisaurus
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.ridanisaurus.emendatusenigmatica.datagen;

import com.ridanisaurus.emendatusenigmatica.registries.ItemHandler;
import com.ridanisaurus.emendatusenigmatica.util.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ItemTagsGen extends ItemTagsProvider {

  public ItemTagsGen(DataGenerator gen) { super(gen); }

  @Override
  protected void registerTags() {
    // Ingots
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots")))
            .add(ItemHandler.INGOT_COPPER.get())
            .add(ItemHandler.INGOT_ALUMINUM.get())
            .add(ItemHandler.INGOT_SILVER.get())
            .add(ItemHandler.INGOT_LEAD.get())
            .add(ItemHandler.INGOT_NICKEL.get())
            .add(ItemHandler.INGOT_URANIUM.get())
            .add(ItemHandler.INGOT_OSMIUM.get())
            .add(ItemHandler.INGOT_TIN.get())
            .add(ItemHandler.INGOT_ZINC.get())
            .add(ItemHandler.INGOT_BRONZE.get())
            .add(ItemHandler.INGOT_BRASS.get())
            .add(ItemHandler.INGOT_CONSTANTAN.get())
            .add(ItemHandler.INGOT_ELECTRUM.get())
            .add(ItemHandler.INGOT_STEEL.get())

            .add(ItemHandler.INGOT_INVAR.get())
            .add(ItemHandler.INGOT_LUMIUM.get())
            .add(ItemHandler.INGOT_SIGNALUM.get())
            .add(ItemHandler.INGOT_ENDERIUM.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/copper")))
            .add(ItemHandler.INGOT_COPPER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/aluminum")))
            .add(ItemHandler.INGOT_ALUMINUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/silver")))
            .add(ItemHandler.INGOT_SILVER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/lead")))
            .add(ItemHandler.INGOT_LEAD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/nickel")))
            .add(ItemHandler.INGOT_NICKEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/uranium")))
            .add(ItemHandler.INGOT_URANIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/osmium")))
            .add(ItemHandler.INGOT_OSMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/tin")))
            .add(ItemHandler.INGOT_TIN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/zinc")))
            .add(ItemHandler.INGOT_ZINC.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/bronze")))
            .add(ItemHandler.INGOT_BRONZE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/brass")))
            .add(ItemHandler.INGOT_BRASS.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/constantan")))
            .add(ItemHandler.INGOT_CONSTANTAN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/electrum")))
            .add(ItemHandler.INGOT_ELECTRUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/steel")))
            .add(ItemHandler.INGOT_STEEL.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/invar")))
            .add(ItemHandler.INGOT_INVAR.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/lumium")))
            .add(ItemHandler.INGOT_LUMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/signalum")))
            .add(ItemHandler.INGOT_SIGNALUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ingots/enderium")))
            .add(ItemHandler.INGOT_ENDERIUM.get());

    // Nuggets
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets")))
            .add(ItemHandler.NUGGET_COPPER.get())
            .add(ItemHandler.NUGGET_ALUMINUM.get())
            .add(ItemHandler.NUGGET_SILVER.get())
            .add(ItemHandler.NUGGET_LEAD.get())
            .add(ItemHandler.NUGGET_NICKEL.get())
            .add(ItemHandler.NUGGET_URANIUM.get())
            .add(ItemHandler.NUGGET_OSMIUM.get())
            .add(ItemHandler.NUGGET_TIN.get())
            .add(ItemHandler.NUGGET_ZINC.get())
            .add(ItemHandler.NUGGET_BRONZE.get())
            .add(ItemHandler.NUGGET_BRASS.get())
            .add(ItemHandler.NUGGET_CONSTANTAN.get())
            .add(ItemHandler.NUGGET_ELECTRUM.get())
            .add(ItemHandler.NUGGET_STEEL.get())

            .add(ItemHandler.NUGGET_INVAR.get())
            .add(ItemHandler.NUGGET_LUMIUM.get())
            .add(ItemHandler.NUGGET_SIGNALUM.get())
            .add(ItemHandler.NUGGET_ENDERIUM.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/copper")))
            .add(ItemHandler.NUGGET_COPPER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/aluminum")))
            .add(ItemHandler.NUGGET_ALUMINUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/silver")))
            .add(ItemHandler.NUGGET_SILVER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/lead")))
            .add(ItemHandler.NUGGET_LEAD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/nickel")))
            .add(ItemHandler.NUGGET_NICKEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/uranium")))
            .add(ItemHandler.NUGGET_URANIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/osmium")))
            .add(ItemHandler.NUGGET_OSMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/tin")))
            .add(ItemHandler.NUGGET_TIN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/zinc")))
            .add(ItemHandler.NUGGET_ZINC.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/bronze")))
            .add(ItemHandler.NUGGET_BRONZE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/brass")))
            .add(ItemHandler.NUGGET_BRASS.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/constantan")))
            .add(ItemHandler.NUGGET_CONSTANTAN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/electrum")))
            .add(ItemHandler.NUGGET_ELECTRUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/steel")))
            .add(ItemHandler.NUGGET_STEEL.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/invar")))
            .add(ItemHandler.NUGGET_INVAR.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/lumium")))
            .add(ItemHandler.NUGGET_LUMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/signalum")))
            .add(ItemHandler.NUGGET_SIGNALUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "nuggets/enderium")))
            .add(ItemHandler.NUGGET_ENDERIUM.get());

    // Dusts
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts")))
            .add(ItemHandler.DUST_COPPER.get())
            .add(ItemHandler.DUST_ALUMINUM.get())
            .add(ItemHandler.DUST_SILVER.get())
            .add(ItemHandler.DUST_LEAD.get())
            .add(ItemHandler.DUST_NICKEL.get())
            .add(ItemHandler.DUST_URANIUM.get())
            .add(ItemHandler.DUST_OSMIUM.get())
            .add(ItemHandler.DUST_TIN.get())
            .add(ItemHandler.DUST_ZINC.get())
            .add(ItemHandler.DUST_BRONZE.get())
            .add(ItemHandler.DUST_BRASS.get())
            .add(ItemHandler.DUST_CONSTANTAN.get())
            .add(ItemHandler.DUST_ELECTRUM.get())
            .add(ItemHandler.DUST_STEEL.get())
            .add(ItemHandler.DUST_CHARCOAL.get())
            .add(ItemHandler.DUST_COAL.get())
            .add(ItemHandler.DUST_DIAMOND.get())
            .add(ItemHandler.DUST_EMERALD.get())
            .add(ItemHandler.DUST_GOLD.get())
            .add(ItemHandler.DUST_IRON.get())
            .add(ItemHandler.DUST_LAPIS.get())
            .add(ItemHandler.DUST_OBSIDIAN.get())
            .add(ItemHandler.DUST_QUARTZ.get())
            .add(ItemHandler.DUST_CERTUS_QUARTZ.get())
            .add(ItemHandler.DUST_FLUIX.get())
            .add(ItemHandler.DUST_ENDER.get())
            .add(ItemHandler.DUST_COKE.get())
            .add(ItemHandler.DUST_GRAPHITE.get())
            .add(ItemHandler.DUST_LITHIUM.get())
            .add(ItemHandler.DUST_POTASSIUM_NITRATE.get())
            .add(ItemHandler.DUST_SULFUR.get())

            .add(ItemHandler.DUST_INVAR.get())
            .add(ItemHandler.DUST_LUMIUM.get())
            .add(ItemHandler.DUST_SIGNALUM.get())
            .add(ItemHandler.DUST_ENDERIUM.get())
            .add(ItemHandler.DUST_APATITE.get())
            .add(ItemHandler.DUST_WOOD.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/copper")))
            .add(ItemHandler.DUST_COPPER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/aluminum")))
            .add(ItemHandler.DUST_ALUMINUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/silver")))
            .add(ItemHandler.DUST_SILVER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/lead")))
            .add(ItemHandler.DUST_LEAD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/nickel")))
            .add(ItemHandler.DUST_NICKEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/uranium")))
            .add(ItemHandler.DUST_URANIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/osmium")))
            .add(ItemHandler.DUST_OSMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/tin")))
            .add(ItemHandler.DUST_TIN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/zinc")))
            .add(ItemHandler.DUST_ZINC.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/bronze")))
            .add(ItemHandler.DUST_BRONZE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/brass")))
            .add(ItemHandler.DUST_BRASS.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/constantan")))
            .add(ItemHandler.DUST_CONSTANTAN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/electrum")))
            .add(ItemHandler.DUST_ELECTRUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/steel")))
            .add(ItemHandler.DUST_STEEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/charcoal")))
            .add(ItemHandler.DUST_CHARCOAL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/coal")))
            .add(ItemHandler.DUST_COAL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/diamond")))
            .add(ItemHandler.DUST_DIAMOND.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/emerald")))
            .add(ItemHandler.DUST_EMERALD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/gold")))
            .add(ItemHandler.DUST_GOLD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/iron")))
            .add(ItemHandler.DUST_IRON.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/lapis")))
            .add(ItemHandler.DUST_LAPIS.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/obsidian")))
            .add(ItemHandler.DUST_OBSIDIAN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/quartz")))
            .add(ItemHandler.DUST_QUARTZ.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/certus_quartz")))
            .add(ItemHandler.DUST_CERTUS_QUARTZ.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/fluix")))
            .add(ItemHandler.DUST_FLUIX.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/ender")))
            .add(ItemHandler.DUST_ENDER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/coke")))
            .add(ItemHandler.DUST_COKE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/graphite")))
            .add(ItemHandler.DUST_GRAPHITE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/lithium")))
            .add(ItemHandler.DUST_LITHIUM.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/potassium_nitrate")))
            .add(ItemHandler.DUST_POTASSIUM_NITRATE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/niter")))
            .add(ItemHandler.DUST_POTASSIUM_NITRATE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/saltpeter")))
            .add(ItemHandler.DUST_POTASSIUM_NITRATE.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/sulfur")))
            .add(ItemHandler.DUST_SULFUR.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/invar")))
            .add(ItemHandler.DUST_INVAR.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/lumium")))
            .add(ItemHandler.DUST_LUMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/signalum")))
            .add(ItemHandler.DUST_SIGNALUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/enderium")))
            .add(ItemHandler.DUST_ENDERIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/apatite")))
            .add(ItemHandler.DUST_APATITE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "dusts/wood")))
            .add(ItemHandler.DUST_WOOD.get());

    // Gems
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems")))
            .add(ItemHandler.GEM_CERTUS_QUARTZ.get())
            .add(ItemHandler.GEM_CHARGED_CERTUS_QUARTZ.get())
            .add(ItemHandler.GEM_FLUIX.get())

            .add(ItemHandler.GEM_CINNABAR.get())
            .add(ItemHandler.GEM_APATITE.get())
            .add(ItemHandler.GEM_SULFUR.get())
            .add(ItemHandler.GEM_POTASSIUM_NITRATE.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems/certus_quartz")))
            .add(ItemHandler.GEM_CERTUS_QUARTZ.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems/charged_certus_quartz")))
            .add(ItemHandler.GEM_CHARGED_CERTUS_QUARTZ.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems/fluix")))
            .add(ItemHandler.GEM_FLUIX.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems/cinnabar")))
            .add(ItemHandler.GEM_CINNABAR.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems/apatite")))
            .add(ItemHandler.GEM_APATITE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems/sulfur")))
            .add(ItemHandler.GEM_SULFUR.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems/potassium_nitrate")))
            .add(ItemHandler.GEM_POTASSIUM_NITRATE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems/niter")))
            .add(ItemHandler.GEM_POTASSIUM_NITRATE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gems/saltpeter")))
            .add(ItemHandler.GEM_POTASSIUM_NITRATE.get());

    // Plates
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates")))
            .add(ItemHandler.PLATE_COPPER.get())
            .add(ItemHandler.PLATE_ALUMINUM.get())
            .add(ItemHandler.PLATE_SILVER.get())
            .add(ItemHandler.PLATE_LEAD.get())
            .add(ItemHandler.PLATE_NICKEL.get())
            .add(ItemHandler.PLATE_URANIUM.get())
            .add(ItemHandler.PLATE_OSMIUM.get())
            .add(ItemHandler.PLATE_TIN.get())
            .add(ItemHandler.PLATE_ZINC.get())
            .add(ItemHandler.PLATE_BRONZE.get())
            .add(ItemHandler.PLATE_BRASS.get())
            .add(ItemHandler.PLATE_CONSTANTAN.get())
            .add(ItemHandler.PLATE_ELECTRUM.get())
            .add(ItemHandler.PLATE_STEEL.get())
            .add(ItemHandler.PLATE_GOLD.get())
            .add(ItemHandler.PLATE_IRON.get())
            .add(ItemHandler.PLATE_LAPIS.get())

            .add(ItemHandler.PLATE_DIAMOND.get())
            .add(ItemHandler.PLATE_EMERALD.get())
            .add(ItemHandler.PLATE_INVAR.get())
            .add(ItemHandler.PLATE_LUMIUM.get())
            .add(ItemHandler.PLATE_SIGNALUM.get())
            .add(ItemHandler.PLATE_ENDERIUM.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/copper")))
            .add(ItemHandler.PLATE_COPPER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/aluminum")))
            .add(ItemHandler.PLATE_ALUMINUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/silver")))
            .add(ItemHandler.PLATE_SILVER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/lead")))
            .add(ItemHandler.PLATE_LEAD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/nickel")))
            .add(ItemHandler.PLATE_NICKEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/uranium")))
            .add(ItemHandler.PLATE_URANIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/osmium")))
            .add(ItemHandler.PLATE_OSMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/tin")))
            .add(ItemHandler.PLATE_TIN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/zinc")))
            .add(ItemHandler.PLATE_ZINC.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/bronze")))
            .add(ItemHandler.PLATE_BRONZE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/brass")))
            .add(ItemHandler.PLATE_BRASS.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/constantan")))
            .add(ItemHandler.PLATE_CONSTANTAN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/electrum")))
            .add(ItemHandler.PLATE_ELECTRUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/steel")))
            .add(ItemHandler.PLATE_STEEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/gold")))
            .add(ItemHandler.PLATE_GOLD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/iron")))
            .add(ItemHandler.PLATE_IRON.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/lapis")))
            .add(ItemHandler.PLATE_LAPIS.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/diamond")))
            .add(ItemHandler.PLATE_DIAMOND.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/emerald")))
            .add(ItemHandler.PLATE_EMERALD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/invar")))
            .add(ItemHandler.PLATE_INVAR.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/lumium")))
            .add(ItemHandler.PLATE_LUMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/signalum")))
            .add(ItemHandler.PLATE_SIGNALUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "plates/enderium")))
            .add(ItemHandler.PLATE_ENDERIUM.get());

    // Gears
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears")))
            .add(ItemHandler.GEAR_COPPER.get())
            .add(ItemHandler.GEAR_ALUMINUM.get())
            .add(ItemHandler.GEAR_SILVER.get())
            .add(ItemHandler.GEAR_LEAD.get())
            .add(ItemHandler.GEAR_NICKEL.get())
            .add(ItemHandler.GEAR_URANIUM.get())
            .add(ItemHandler.GEAR_OSMIUM.get())
            .add(ItemHandler.GEAR_TIN.get())
            .add(ItemHandler.GEAR_ZINC.get())
            .add(ItemHandler.GEAR_BRONZE.get())
            .add(ItemHandler.GEAR_BRASS.get())
            .add(ItemHandler.GEAR_CONSTANTAN.get())
            .add(ItemHandler.GEAR_ELECTRUM.get())
            .add(ItemHandler.GEAR_STEEL.get())
            .add(ItemHandler.GEAR_GOLD.get())
            .add(ItemHandler.GEAR_IRON.get())
            .add(ItemHandler.GEAR_LAPIS.get())
            .add(ItemHandler.GEAR_DIAMOND.get())
            .add(ItemHandler.GEAR_EMERALD.get())
            .add(ItemHandler.GEAR_INVAR.get())
            .add(ItemHandler.GEAR_LUMIUM.get())
            .add(ItemHandler.GEAR_SIGNALUM.get())
            .add(ItemHandler.GEAR_ENDERIUM.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/copper")))
            .add(ItemHandler.GEAR_COPPER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/aluminum")))
            .add(ItemHandler.GEAR_ALUMINUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/silver")))
            .add(ItemHandler.GEAR_SILVER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/lead")))
            .add(ItemHandler.GEAR_LEAD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/nickel")))
            .add(ItemHandler.GEAR_NICKEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/uranium")))
            .add(ItemHandler.GEAR_URANIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/osmium")))
            .add(ItemHandler.GEAR_OSMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/tin")))
            .add(ItemHandler.GEAR_TIN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/zinc")))
            .add(ItemHandler.GEAR_ZINC.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/bronze")))
            .add(ItemHandler.GEAR_BRONZE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/brass")))
            .add(ItemHandler.GEAR_BRASS.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/constantan")))
            .add(ItemHandler.GEAR_CONSTANTAN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/electrum")))
            .add(ItemHandler.GEAR_ELECTRUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/steel")))
            .add(ItemHandler.GEAR_STEEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/gold")))
            .add(ItemHandler.GEAR_GOLD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/iron")))
            .add(ItemHandler.GEAR_IRON.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/lapis")))
            .add(ItemHandler.GEAR_LAPIS.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/diamond")))
            .add(ItemHandler.GEAR_DIAMOND.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/emerald")))
            .add(ItemHandler.GEAR_EMERALD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/invar")))
            .add(ItemHandler.GEAR_INVAR.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/lumium")))
            .add(ItemHandler.GEAR_LUMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/signalum")))
            .add(ItemHandler.GEAR_SIGNALUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/enderium")))
            .add(ItemHandler.GEAR_ENDERIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "gears/quartz")))
            .add(ItemHandler.GEAR_QUARTZ.get());

    // Chunks
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks")))
            .add(ItemHandler.CHUNK_COAL.get())
            .add(ItemHandler.CHUNK_IRON.get())
            .add(ItemHandler.CHUNK_GOLD.get())
            .add(ItemHandler.CHUNK_DIAMOND.get())
            .add(ItemHandler.CHUNK_EMERALD.get())
            .add(ItemHandler.CHUNK_LAPIS.get())
            .add(ItemHandler.CHUNK_REDSTONE.get())
            .add(ItemHandler.CHUNK_COPPER.get())
            .add(ItemHandler.CHUNK_ALUMINUM.get())
            .add(ItemHandler.CHUNK_SILVER.get())
            .add(ItemHandler.CHUNK_LEAD.get())
            .add(ItemHandler.CHUNK_NICKEL.get())
            .add(ItemHandler.CHUNK_URANIUM.get())
            .add(ItemHandler.CHUNK_OSMIUM.get())
            .add(ItemHandler.CHUNK_TIN.get())
            .add(ItemHandler.CHUNK_ZINC.get())
            .add(ItemHandler.CHUNK_CERTUS_QUARTZ.get())
            .add(ItemHandler.CHUNK_CHARGED_CERTUS_QUARTZ.get())

            .add(ItemHandler.CHUNK_CINNABAR.get())
            .add(ItemHandler.CHUNK_APATITE.get())
            .add(ItemHandler.CHUNK_SULFUR.get())
            .add(ItemHandler.CHUNK_POTASSIUM_NITRATE.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/coal")))
            .add(ItemHandler.CHUNK_COAL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/iron")))
            .add(ItemHandler.CHUNK_IRON.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/gold")))
            .add(ItemHandler.CHUNK_GOLD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/diamond")))
            .add(ItemHandler.CHUNK_DIAMOND.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/emerald")))
            .add(ItemHandler.CHUNK_EMERALD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/lapis")))
            .add(ItemHandler.CHUNK_LAPIS.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/redstone")))
            .add(ItemHandler.CHUNK_REDSTONE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/copper")))
            .add(ItemHandler.CHUNK_COPPER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/aluminum")))
            .add(ItemHandler.CHUNK_ALUMINUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/silver")))
            .add(ItemHandler.CHUNK_SILVER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/lead")))
            .add(ItemHandler.CHUNK_LEAD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/nickel")))
            .add(ItemHandler.CHUNK_NICKEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/uranium")))
            .add(ItemHandler.CHUNK_URANIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/osmium")))
            .add(ItemHandler.CHUNK_OSMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/tin")))
            .add(ItemHandler.CHUNK_TIN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/zinc")))
            .add(ItemHandler.CHUNK_ZINC.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/certus_quartz")))
            .add(ItemHandler.CHUNK_CERTUS_QUARTZ.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/charged_certus_quartz")))
            .add(ItemHandler.CHUNK_CHARGED_CERTUS_QUARTZ.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/cinnabar")))
            .add(ItemHandler.CHUNK_CINNABAR.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/apatite")))
            .add(ItemHandler.CHUNK_APATITE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/sulfur")))
            .add(ItemHandler.CHUNK_SULFUR.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "chunks/potassium_nitrate")))
            .add(ItemHandler.CHUNK_POTASSIUM_NITRATE.get());

    // Block Items
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks")))
            .add(ItemHandler.BLOCK_COPPER_ITEM.get())
            .add(ItemHandler.BLOCK_ALUMINUM_ITEM.get())
            .add(ItemHandler.BLOCK_SILVER_ITEM.get())
            .add(ItemHandler.BLOCK_LEAD_ITEM.get())
            .add(ItemHandler.BLOCK_NICKEL_ITEM.get())
            .add(ItemHandler.BLOCK_URANIUM_ITEM.get())
            .add(ItemHandler.BLOCK_OSMIUM_ITEM.get())
            .add(ItemHandler.BLOCK_TIN_ITEM.get())
            .add(ItemHandler.BLOCK_ZINC_ITEM.get())
            .add(ItemHandler.BLOCK_BRONZE_ITEM.get())
            .add(ItemHandler.BLOCK_BRASS_ITEM.get())
            .add(ItemHandler.BLOCK_CONSTANTAN_ITEM.get())
            .add(ItemHandler.BLOCK_ELECTRUM_ITEM.get())
            .add(ItemHandler.BLOCK_STEEL_ITEM.get())

            .add(ItemHandler.BLOCK_INVAR_ITEM.get())
            .add(ItemHandler.BLOCK_LUMIUM_ITEM.get())
            .add(ItemHandler.BLOCK_SIGNALUM_ITEM.get())
            .add(ItemHandler.BLOCK_ENDERIUM_ITEM.get())
            .add(ItemHandler.BLOCK_CINNABAR_ITEM.get())
            .add(ItemHandler.BLOCK_APATITE_ITEM.get())
            .add(ItemHandler.BLOCK_SULFUR_ITEM.get())
            .add(ItemHandler.BLOCK_POTASSIUM_NITRATE_ITEM.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/copper")))
            .add(ItemHandler.BLOCK_COPPER_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/aluminum")))
            .add(ItemHandler.BLOCK_ALUMINUM_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/silver")))
            .add(ItemHandler.BLOCK_SILVER_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/lead")))
            .add(ItemHandler.BLOCK_LEAD_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/nickel")))
            .add(ItemHandler.BLOCK_NICKEL_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/uranium")))
            .add(ItemHandler.BLOCK_URANIUM_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/osmium")))
            .add(ItemHandler.BLOCK_OSMIUM_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/tin")))
            .add(ItemHandler.BLOCK_TIN_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/zinc")))
            .add(ItemHandler.BLOCK_ZINC_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/bronze")))
            .add(ItemHandler.BLOCK_BRONZE_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/brass")))
            .add(ItemHandler.BLOCK_BRASS_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/constantan")))
            .add(ItemHandler.BLOCK_CONSTANTAN_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/electrum")))
            .add(ItemHandler.BLOCK_ELECTRUM_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/steel")))
            .add(ItemHandler.BLOCK_STEEL_ITEM.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/invar")))
            .add(ItemHandler.BLOCK_INVAR_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/lumium")))
            .add(ItemHandler.BLOCK_LUMIUM_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/signalum")))
            .add(ItemHandler.BLOCK_SIGNALUM_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/enderium")))
            .add(ItemHandler.BLOCK_ENDERIUM_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/cinnabar")))
            .add(ItemHandler.BLOCK_CINNABAR_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/apatite")))
            .add(ItemHandler.BLOCK_APATITE_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/sulfur")))
            .add(ItemHandler.BLOCK_SULFUR_ITEM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/potassium_nitrate")))
            .add(ItemHandler.BLOCK_POTASSIUM_NITRATE_ITEM.get());

    // Ore Items
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores")))
            .add(ItemHandler.ORE_COAL_ITEM.get())
            .add(ItemHandler.ORE_IRON_ITEM.get())
            .add(ItemHandler.ORE_GOLD_ITEM.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM.get())
            .add(ItemHandler.ORE_EMERALD_ITEM.get())
            .add(ItemHandler.ORE_LAPIS_ITEM.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM.get())
            .add(ItemHandler.ORE_COPPER_ITEM.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM.get())
            .add(ItemHandler.ORE_SILVER_ITEM.get())
            .add(ItemHandler.ORE_LEAD_ITEM.get())
            .add(ItemHandler.ORE_NICKEL_ITEM.get())
            .add(ItemHandler.ORE_URANIUM_ITEM.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM.get())
            .add(ItemHandler.ORE_TIN_ITEM.get())
            .add(ItemHandler.ORE_ZINC_ITEM.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM.get())
            .add(ItemHandler.ORE_APATITE_ITEM.get())
            .add(ItemHandler.ORE_SULFUR_ITEM.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM.get())
            
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM.get())
            .add(ItemHandler.ORE_COAL_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_IRON_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_TIN_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_ANDESITE.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_ANDESITE.get())
            
            .add(ItemHandler.ORE_COAL_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_IRON_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_GOLD_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_COPPER_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_SILVER_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_LEAD_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_TIN_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_ZINC_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_GABBRO.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_APATITE_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_GABBRO.get())
            
            .add(ItemHandler.ORE_COAL_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_IRON_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_TIN_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_C_LIMESTONE.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_C_LIMESTONE.get())
            
            .add(ItemHandler.ORE_COAL_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_IRON_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_GOLD_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_COPPER_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_SILVER_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_LEAD_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_TIN_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_ZINC_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_SCORIA.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_APATITE_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_SCORIA.get())
            
            .add(ItemHandler.ORE_COAL_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_IRON_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_TIN_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_WEATHERED_LIMESTONE.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_WEATHERED_LIMESTONE.get())
            
            .add(ItemHandler.ORE_COAL_ITEM_JASPER.get())
            .add(ItemHandler.ORE_IRON_ITEM_JASPER.get())
            .add(ItemHandler.ORE_GOLD_ITEM_JASPER.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_JASPER.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_JASPER.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_JASPER.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_JASPER.get())
            .add(ItemHandler.ORE_COPPER_ITEM_JASPER.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_JASPER.get())
            .add(ItemHandler.ORE_SILVER_ITEM_JASPER.get())
            .add(ItemHandler.ORE_LEAD_ITEM_JASPER.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_JASPER.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_JASPER.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_JASPER.get())
            .add(ItemHandler.ORE_TIN_ITEM_JASPER.get())
            .add(ItemHandler.ORE_ZINC_ITEM_JASPER.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_JASPER.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_JASPER.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM_JASPER.get())
            .add(ItemHandler.ORE_APATITE_ITEM_JASPER.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_JASPER.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_JASPER.get())
            
            .add(ItemHandler.ORE_COAL_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_IRON_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_TIN_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_Q_LIMESTONE.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_Q_LIMESTONE.get())
            
            .add(ItemHandler.ORE_COAL_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_IRON_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_TIN_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_MARBLE.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_MARBLE.get())
            
            .add(ItemHandler.ORE_COAL_ITEM_SLATE.get())
            .add(ItemHandler.ORE_IRON_ITEM_SLATE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_SLATE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_SLATE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_SLATE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_SLATE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_SLATE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_SLATE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_SLATE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_SLATE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_SLATE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_SLATE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_SLATE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_SLATE.get())
            .add(ItemHandler.ORE_TIN_ITEM_SLATE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_SLATE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_SLATE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_SLATE.get())

            .add(ItemHandler.ORE_CINNABAR_ITEM_SLATE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_SLATE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_SLATE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_SLATE.get())
            
            .add(ItemHandler.CHUNK_COAL.get())
            .add(ItemHandler.CHUNK_IRON.get())
            .add(ItemHandler.CHUNK_GOLD.get())
            .add(ItemHandler.CHUNK_DIAMOND.get())
            .add(ItemHandler.CHUNK_EMERALD.get())
            .add(ItemHandler.CHUNK_LAPIS.get())
            .add(ItemHandler.CHUNK_REDSTONE.get())
            .add(ItemHandler.CHUNK_COPPER.get())
            .add(ItemHandler.CHUNK_ALUMINUM.get())
            .add(ItemHandler.CHUNK_SILVER.get())
            .add(ItemHandler.CHUNK_LEAD.get())
            .add(ItemHandler.CHUNK_NICKEL.get())
            .add(ItemHandler.CHUNK_URANIUM.get())
            .add(ItemHandler.CHUNK_OSMIUM.get())
            .add(ItemHandler.CHUNK_TIN.get())
            .add(ItemHandler.CHUNK_ZINC.get())
            .add(ItemHandler.CHUNK_CERTUS_QUARTZ.get())
            .add(ItemHandler.CHUNK_CHARGED_CERTUS_QUARTZ.get())

            .add(ItemHandler.CHUNK_CINNABAR.get())
            .add(ItemHandler.CHUNK_APATITE.get())
            .add(ItemHandler.CHUNK_SULFUR.get())
            .add(ItemHandler.CHUNK_POTASSIUM_NITRATE.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/coal")))
            .add(ItemHandler.ORE_COAL_ITEM.get())
            .add(ItemHandler.ORE_COAL_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_COAL_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_COAL_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_COAL_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_COAL_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_COAL_ITEM_JASPER.get())
            .add(ItemHandler.ORE_COAL_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_COAL_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_COAL_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_COAL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/iron")))
            .add(ItemHandler.ORE_IRON_ITEM.get())
            .add(ItemHandler.ORE_IRON_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_IRON_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_IRON_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_IRON_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_IRON_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_IRON_ITEM_JASPER.get())
            .add(ItemHandler.ORE_IRON_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_IRON_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_IRON_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_IRON.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/gold")))
            .add(ItemHandler.ORE_GOLD_ITEM.get())
            .add(ItemHandler.ORE_GOLD_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_GOLD_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_GOLD_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_JASPER.get())
            .add(ItemHandler.ORE_GOLD_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_GOLD_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_GOLD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/diamond")))
            .add(ItemHandler.ORE_DIAMOND_ITEM.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_JASPER.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_DIAMOND_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_DIAMOND.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/emerald")))
            .add(ItemHandler.ORE_EMERALD_ITEM.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_JASPER.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_EMERALD_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_EMERALD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/lapis")))
            .add(ItemHandler.ORE_LAPIS_ITEM.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_JASPER.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_LAPIS_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_LAPIS.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/redstone")))
            .add(ItemHandler.ORE_REDSTONE_ITEM.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_JASPER.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_REDSTONE_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_REDSTONE.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/copper")))
            .add(ItemHandler.ORE_COPPER_ITEM.get())
            .add(ItemHandler.ORE_COPPER_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_COPPER_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_COPPER_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_JASPER.get())
            .add(ItemHandler.ORE_COPPER_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_COPPER_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_COPPER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/aluminum")))
            .add(ItemHandler.ORE_ALUMINUM_ITEM.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_JASPER.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_ALUMINUM_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_ALUMINUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/silver")))
            .add(ItemHandler.ORE_SILVER_ITEM.get())
            .add(ItemHandler.ORE_SILVER_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_SILVER_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_SILVER_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_JASPER.get())
            .add(ItemHandler.ORE_SILVER_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_SILVER_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_SILVER.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/lead")))
            .add(ItemHandler.ORE_LEAD_ITEM.get())
            .add(ItemHandler.ORE_LEAD_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_LEAD_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_LEAD_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_JASPER.get())
            .add(ItemHandler.ORE_LEAD_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_LEAD_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_LEAD.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/nickel")))
            .add(ItemHandler.ORE_NICKEL_ITEM.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_JASPER.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_NICKEL_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_NICKEL.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/uranium")))
            .add(ItemHandler.ORE_URANIUM_ITEM.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_JASPER.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_URANIUM_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_URANIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/osmium")))
            .add(ItemHandler.ORE_OSMIUM_ITEM.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_JASPER.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_OSMIUM_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_OSMIUM.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/tin")))
            .add(ItemHandler.ORE_TIN_ITEM.get())
            .add(ItemHandler.ORE_TIN_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_TIN_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_TIN_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_TIN_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_TIN_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_TIN_ITEM_JASPER.get())
            .add(ItemHandler.ORE_TIN_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_TIN_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_TIN_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_TIN.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/zinc")))
            .add(ItemHandler.ORE_ZINC_ITEM.get())
            .add(ItemHandler.ORE_ZINC_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_ZINC_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_ZINC_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_JASPER.get())
            .add(ItemHandler.ORE_ZINC_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_ZINC_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_ZINC.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/certus_quartz")))
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_JASPER.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_CERTUS_QUARTZ_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_CERTUS_QUARTZ.get());
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/charged_certus_quartz")))
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_JASPER.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_CHARGED_CERTUS_QUARTZ_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_CHARGED_CERTUS_QUARTZ.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/cinnabar")))
            .add(ItemHandler.ORE_CINNABAR_ITEM.get())
            .add(ItemHandler.ORE_CINNABAR_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_CINNABAR_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_CINNABAR_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_CINNABAR_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_CINNABAR_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_CINNABAR_ITEM_JASPER.get())
            .add(ItemHandler.ORE_CINNABAR_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_CINNABAR_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_CINNABAR_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_CINNABAR.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/apatite")))
            .add(ItemHandler.ORE_APATITE_ITEM.get())
            .add(ItemHandler.ORE_APATITE_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_APATITE_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_APATITE_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_JASPER.get())
            .add(ItemHandler.ORE_APATITE_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_APATITE_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_APATITE.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/sulfur")))
            .add(ItemHandler.ORE_SULFUR_ITEM.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_JASPER.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_SULFUR_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_SULFUR.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/potassium_nitrate")))
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_ANDESITE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_GABBRO.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_C_LIMESTONE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_SCORIA.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_WEATHERED_LIMESTONE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_JASPER.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_Q_LIMESTONE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_MARBLE.get())
            .add(ItemHandler.ORE_POTASSIUM_NITRATE_ITEM_SLATE.get())
            .add(ItemHandler.CHUNK_POTASSIUM_NITRATE.get());

    // Misc Tags
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "sawdust")))
            .add(ItemHandler.DUST_WOOD.get());

    // Minecraft Additional Tags
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "beacon_payment")))
            .add(ItemHandler.INGOT_COPPER.get())
            .add(ItemHandler.INGOT_ALUMINUM.get())
            .add(ItemHandler.INGOT_SILVER.get())
            .add(ItemHandler.INGOT_LEAD.get())
            .add(ItemHandler.INGOT_NICKEL.get())
            .add(ItemHandler.INGOT_URANIUM.get())
            .add(ItemHandler.INGOT_OSMIUM.get())
            .add(ItemHandler.INGOT_TIN.get())
            .add(ItemHandler.INGOT_ZINC.get())
            .add(ItemHandler.INGOT_BRONZE.get())
            .add(ItemHandler.INGOT_BRASS.get())
            .add(ItemHandler.INGOT_CONSTANTAN.get())
            .add(ItemHandler.INGOT_ELECTRUM.get())
            .add(ItemHandler.INGOT_STEEL.get())
            .add(ItemHandler.INGOT_INVAR.get())
            .add(ItemHandler.INGOT_LUMIUM.get())
            .add(ItemHandler.INGOT_SIGNALUM.get())
            .add(ItemHandler.INGOT_ENDERIUM.get());

    // AE2 Additional Tags
    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.AE2_TAG, "dusts/quartz")))
            .add(ItemHandler.DUST_CERTUS_QUARTZ.get())
            .add(ItemHandler.DUST_QUARTZ.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.AE2_TAG, "dusts/certus_quartz")))
            .add(ItemHandler.DUST_CERTUS_QUARTZ.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.AE2_TAG, "dusts/nether_quartz")))
            .add(ItemHandler.DUST_QUARTZ.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.AE2_TAG, "crystals/certus_quartz")))
            .add(ItemHandler.GEM_CERTUS_QUARTZ.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.AE2_TAG, "crystals/charged_certus_quartz")))
            .add(ItemHandler.GEM_CHARGED_CERTUS_QUARTZ.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.AE2_TAG, "crystals/quartz")))
            .add(ItemHandler.GEM_CERTUS_QUARTZ.get())
            .add(ItemHandler.GEM_CHARGED_CERTUS_QUARTZ.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.AE2_TAG, "crystals/certus")))
            .add(ItemHandler.GEM_CERTUS_QUARTZ.get())
            .add(ItemHandler.GEM_CHARGED_CERTUS_QUARTZ.get());

    getBuilder(new ItemTags.Wrapper(new ResourceLocation(Reference.AE2_TAG, "crystals/fluix")))
            .add(ItemHandler.GEM_FLUIX.get());

  }
}