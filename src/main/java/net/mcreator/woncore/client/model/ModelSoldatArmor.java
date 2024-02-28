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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSoldatArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("woncore", "model_soldat_armor"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart RightBoots;
	public final ModelPart LeftBoots;

	public ModelSoldatArmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightBoots = root.getChild("RightBoots");
		this.LeftBoots = root.getChild("LeftBoots");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(2, 23).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, -1.5F, -4.0F, 0.75F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5F, -4.5F, -1.5708F, 1.3963F, -1.5708F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, -1.5F, -4.0F, 0.75F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5F, 4.5F, 1.5708F, -1.3963F, -1.5708F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(0.25F, -1.5F, -4.0F, 0.75F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.5F, -7.5F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, -1.5F, -4.0F, 0.75F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -7.5F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(15, 56).addBox(-3.3F, 8.1F, -3.25F, 1.25F, 3.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(99, 22).addBox(-3.3F, 2.85F, -2.75F, 2.5F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(63, 54)
						.addBox(-3.1F, 2.55F, -2.65F, 2.1F, 0.3F, 0.4F, new CubeDeformation(0.0F)).texOffs(64, 53).mirror().addBox(1.0F, 2.55F, -2.65F, 2.1F, 0.3F, 0.4F, new CubeDeformation(0.0F)).mirror(false).texOffs(98, 23).mirror()
						.addBox(0.8F, 2.85F, -2.75F, 2.5F, 3.0F, 0.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 56).addBox(-1.55F, 8.1F, -3.25F, 1.25F, 3.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(15, 56).mirror()
						.addBox(0.3F, 8.1F, -3.25F, 1.25F, 3.0F, 0.75F, new CubeDeformation(0.0F)).mirror(false).texOffs(96, 23).addBox(-2.05F, 9.1F, -3.0F, 4.0F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(15, 56)
						.addBox(1.95F, 8.1F, -3.25F, 1.25F, 3.0F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 23).mirror().addBox(-0.625F, -0.5F, -0.25F, 1.25F, 1.0F, 0.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.275F, 9.6F, -2.75F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(96, 23).addBox(-0.625F, -0.5F, -0.25F, 1.25F, 1.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.275F, 9.6F, -2.75F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(1.775F, -3.25F, -1.25F, 2.45F, 4.25F, 2.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 16).addBox(-4.225F, -3.25F,
				-1.25F, 2.45F, 4.25F, 2.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8402F, 1.1264F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 18).addBox(-4.2F, -2.0F, 0.0F, 8.4F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 1.5F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 15).addBox(-4.2F, -2.0F, -1.0F, 8.4F, 10.3F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.825F, -1.5F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(55, 18).addBox(-4.2F, -2.0F, -1.0F, 2.4F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 18)
				.addBox(-7.8F, -1.0F, -1.0F, 3.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 18).addBox(-10.2F, -2.0F, -1.0F, 2.4F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 2.0F, -1.5F, -0.1745F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(52, 16).addBox(-3.3F, -2.3F, -2.3F, 4.6F, 9.55F, 4.6F, new CubeDeformation(0.0F)).texOffs(98, 18)
				.addBox(-3.4F, 6.9F, -2.4F, 4.8F, 1.0F, 4.8F, new CubeDeformation(0.0F)).texOffs(93, 15).addBox(-3.2F, -1.9F, -2.4F, 4.4F, 1.9F, 4.8F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild(
				"LeftArm", CubeListBuilder.create().texOffs(58, 15).mirror().addBox(-1.3F, -2.3F, -2.3F, 4.6F, 9.55F, 4.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(99, 22).mirror()
						.addBox(-1.4F, 6.9F, -2.4F, 4.8F, 1.0F, 4.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 22).mirror().addBox(-1.2F, -1.9F, -2.4F, 4.4F, 1.9F, 4.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(52, 50).addBox(-2.2F, -0.4F, -2.3F, 4.3F, 9.85F, 4.6F, new CubeDeformation(0.0F)).texOffs(102, 61).addBox(-1.55F, 3.35F, -2.45F, 3.0F, 3.0F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(52, 50).mirror().addBox(-2.1F, -0.4F, -2.3F, 4.3F, 9.85F, 4.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(102, 61).mirror()
				.addBox(-1.45F, 3.35F, -2.45F, 3.0F, 3.0F, 0.2F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots",
				CubeListBuilder.create().texOffs(102, 58).addBox(-2.3F, 9.45F, -2.4F, 4.5F, 2.6F, 4.8F, new CubeDeformation(0.0F)).texOffs(113, 66).addBox(-1.8F, 10.95F, -2.5F, 3.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftBoots = partdefinition.addOrReplaceChild("LeftBoots", CubeListBuilder.create().texOffs(100, 61).mirror().addBox(-2.2F, 9.45F, -2.4F, 4.5F, 2.6F, 4.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(108, 65).mirror()
				.addBox(-1.7F, 10.95F, -2.5F, 3.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
