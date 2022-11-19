package org.multicoder.mcpaintball.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.multicoder.mcpaintball.MCPaintball;
import org.multicoder.mcpaintball.item.*;

public class iteminit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCPaintball.MODID);

    public static final RegistryObject<Item> RED_PISTOL = ITEMS.register("weapon/pistol/red_pistol", RedPistolItem::new);
    public static final RegistryObject<Item> BLUE_PISTOL = ITEMS.register("weapon/pistol/blue_pistol", BluePistolItem::new);
    public static final RegistryObject<Item> GREEN_PISTOL = ITEMS.register("weapon/pistol/green_pistol", GreenPistolItem::new);

    public static final RegistryObject<Item> RED_SHOTGUN = ITEMS.register("weapon/shotgun/red_shotgun", RedShotgunItem::new);
    public static final RegistryObject<Item> BLUE_SHOTGUN = ITEMS.register("weapon/shotgun/blue_shotgun", BlueShotgunItem::new);
    public static final RegistryObject<Item> GREEN_SHOTGUN = ITEMS.register("weapon/shotgun/green_shotgun", GreenShotgunItem::new);

    public static final RegistryObject<Item> RED_RIFLE = ITEMS.register("weapon/rifle/red_rifle", RedRifleItem::new);
    public static final RegistryObject<Item> BLUE_RIFLE = ITEMS.register("weapon/rifle/blue_rifle", BlueRifleItem::new);
    public static final RegistryObject<Item> GREEN_RIFLE = ITEMS.register("weapon/rifle/green_rifle", GreenRifleItem::new);
}
