
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.woncore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.woncore.entity.Airdrop2Entity;
import net.mcreator.woncore.entity.Airdrop1Entity;
import net.mcreator.woncore.WoncoreMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WoncoreModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, WoncoreMod.MODID);
	public static final RegistryObject<EntityType<Airdrop1Entity>> AIRDROP_1 = register("airdrop_1",
			EntityType.Builder.<Airdrop1Entity>of(Airdrop1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Airdrop1Entity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<Airdrop2Entity>> AIRDROP_2 = register("airdrop_2",
			EntityType.Builder.<Airdrop2Entity>of(Airdrop2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Airdrop2Entity::new).fireImmune().sized(1f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Airdrop1Entity.init();
			Airdrop2Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(AIRDROP_1.get(), Airdrop1Entity.createAttributes().build());
		event.put(AIRDROP_2.get(), Airdrop2Entity.createAttributes().build());
	}
}
