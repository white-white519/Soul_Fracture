package ru.whiteyt.soul_fracture;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item>
            ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Soul_fracture.MODID);
    public static final RegistryObject<Item> AMULET = ITEMS.register("amulet", () -> new Item(new Item.Properties()));
}