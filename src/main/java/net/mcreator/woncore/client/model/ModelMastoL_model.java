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
public class ModelMastoL_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("woncore", "model_masto_l_model"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelMastoL_model(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition Protection = RightLeg.addOrReplaceChild("Protection",
				CubeListBuilder.create().texOffs(70, 71).addBox(-2.5F, 6.5F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(71, 54).addBox(-2.5F, 1.5F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(106, 51)
						.addBox(-1.5F, 4.5F, -0.25F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(106, 12).addBox(-1.5F, 4.5F, -2.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Jambeskin = RightLeg
				.addOrReplaceChild(
						"Jambeskin", CubeListBuilder.create().texOffs(70, 0).addBox(-1.1F, 0.175F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(28, 65).addBox(-1.0F, 0.175F, -2.1F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F))
								.texOffs(12, 65).addBox(-0.9F, 0.175F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(59, 61).addBox(-1.0F, 0.175F, -1.9F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)),
						PartPose.offset(-1.0F, -0.425F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition Protectionjambe = LeftLeg.addOrReplaceChild("Protectionjambe",
				CubeListBuilder.create().texOffs(71, 33).addBox(-2.5F, 6.5F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(71, 15).addBox(-2.5F, 1.5F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(92, 105)
						.addBox(-1.5F, 4.5F, -0.25F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 67).addBox(-1.5F, 4.5F, -2.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Jambeskin2 = LeftLeg
				.addOrReplaceChild(
						"Jambeskin2", CubeListBuilder.create().texOffs(59, 38).addBox(-2.9F, 0.175F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(59, 23).addBox(-3.0F, 0.175F, -2.1F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F))
								.texOffs(54, 0).addBox(-3.1F, 0.175F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 52).addBox(-3.0F, 0.175F, -1.9F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)),
						PartPose.offset(1.0F, -0.425F, 0.0F));
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
