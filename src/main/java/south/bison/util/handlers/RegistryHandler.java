package net.south.bison.util.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.south.bison.init.EntityInit;
import net.south.bison.init.ItemInit;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    public static void  preInitRegistries()
    {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
    }
}