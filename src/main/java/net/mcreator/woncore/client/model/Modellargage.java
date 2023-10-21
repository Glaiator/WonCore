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

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modellargage<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("woncore", "modellargage"), "main");
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bone3;

	public Modellargage(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -65.0F, -17.0F, 32.0F, 29.0F, 33.0F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-12.0F, -69.0F, -12.0F, 24.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.7F, -39.0F, -2.8F, 1.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, -0.2182F));
		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 0).addBox(-2.6F, -39.0F, 1.7F, 1.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, -0.2182F));
		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 0).addBox(1.8F, -39.0F, 1.7F, 1.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.2182F));
		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 0).addBox(1.9F, -39.0F, -2.9F, 1.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.2182F));
		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(72, 62).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(-7.0F, -12.0F, 6.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 8)
						.addBox(6.0F, -12.0F, 6.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 9).addBox(6.0F, -12.0F, -7.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-6.0F, 0.0F, -7.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(-6.0F, -13.0F, -7.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-6.0F, -13.0F, 6.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(-6.0F, 0.0F, 6.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-12, -12)
						.addBox(-7.0F, 0.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(-12, -12).addBox(6.0F, 0.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(-12, -12)
						.addBox(-7.0F, -13.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(-12, -12).addBox(6.0F, -13.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-7.0F, -12.0F, -7.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(103, 68).addBox(-7.0F, -4.8F, -13.4F, 1.0F, 1.0F, 18.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 1.5708F, 0.0F));
		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-17, -17).addBox(-7.0F, -4.8F, -13.4F, 1.0F, 1.0F, 18.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, -1.5708F, 0.0F));
		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-17, -17).addBox(6.0F, -4.8F, -13.4F, 1.0F, 1.0F, 18.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(102, 68).addBox(-7.0F, -4.8F, -4.7F, 1.0F, 1.0F, 18.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
