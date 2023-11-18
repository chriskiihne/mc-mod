package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ExampleModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		CustomPortalBuilder.beginPortal()
        .frameBlock(Blocks.NETHERITE_BLOCK)
        .lightWithItem(Items.ENDER_EYE)
        .destDimID(new Identifier("the_end"))
        .tintColor(45,65,101)
		.flatPortal()
        .registerPortal();
	}
}