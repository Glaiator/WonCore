
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.woncore.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.woncore.client.model.ModelmastoH_model;
import net.mcreator.woncore.client.model.ModelmastoC_model;
import net.mcreator.woncore.client.model.Modellargage;
import net.mcreator.woncore.client.model.Modelfuturiste_armor;
import net.mcreator.woncore.client.model.Modelcaisse_de_larguage_sans_parachute;
import net.mcreator.woncore.client.model.Modelcaisse_de_larguage;
import net.mcreator.woncore.client.model.ModelTenue_Agent;
import net.mcreator.woncore.client.model.ModelTactical_Armor;
import net.mcreator.woncore.client.model.ModelMastoL_model;
import net.mcreator.woncore.client.model.ModelMastoB_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WoncoreModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelMastoB_model.LAYER_LOCATION, ModelMastoB_model::createBodyLayer);
		event.registerLayerDefinition(ModelmastoC_model.LAYER_LOCATION, ModelmastoC_model::createBodyLayer);
		event.registerLayerDefinition(Modelcaisse_de_larguage_sans_parachute.LAYER_LOCATION, Modelcaisse_de_larguage_sans_parachute::createBodyLayer);
		event.registerLayerDefinition(Modelcaisse_de_larguage.LAYER_LOCATION, Modelcaisse_de_larguage::createBodyLayer);
		event.registerLayerDefinition(Modellargage.LAYER_LOCATION, Modellargage::createBodyLayer);
		event.registerLayerDefinition(ModelMastoL_model.LAYER_LOCATION, ModelMastoL_model::createBodyLayer);
		event.registerLayerDefinition(ModelmastoH_model.LAYER_LOCATION, ModelmastoH_model::createBodyLayer);
		event.registerLayerDefinition(Modelfuturiste_armor.LAYER_LOCATION, Modelfuturiste_armor::createBodyLayer);
		event.registerLayerDefinition(ModelTactical_Armor.LAYER_LOCATION, ModelTactical_Armor::createBodyLayer);
		event.registerLayerDefinition(ModelTenue_Agent.LAYER_LOCATION, ModelTenue_Agent::createBodyLayer);
	}
}
