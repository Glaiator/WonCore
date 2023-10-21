package net.mcreator.woncore.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMastoB_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("woncore", "model_masto_b_model"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelMastoB_model(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition pied2 = RightLeg.addOrReplaceChild("pied2",
				CubeListBuilder.create().texOffs(97, 58).addBox(1.0F, 21.2F, -1.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(44, 97).addBox(1.2F, 21.0F, -1.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(54, 17)
						.addBox(1.0F, 21.0F, -2.1F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(16, 52).addBox(0.8F, 21.0F, -1.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 37)
						.addBox(1.0F, 21.0F, -1.7F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-3.1F, -10.0F, -0.1F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition pied = LeftLeg.addOrReplaceChild("pied",
				CubeListBuilder.create().texOffs(101, 64).addBox(-5.0F, 21.2F, -1.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 101).addBox(-5.2F, 21.0F, -1.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(100, 72)
						.addBox(-5.0F, 21.0F, -2.1F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(92, 99).addBox(-4.8F, 21.0F, -1.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(98, 20)
						.addBox(-5.0F, 21.0F, -1.7F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(3.1F, -10.0F, -0.1F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
