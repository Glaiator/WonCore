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
public class ModelmastoC_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("woncore", "modelmasto_c_model"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;

	public ModelmastoC_model(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition plastron = Body.addOrReplaceChild("plastron", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition proteccousavant = plastron.addOrReplaceChild("proteccousavant", CubeListBuilder.create().texOffs(24, 65).addBox(-2.0F, -2.0F, -9.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.75F, 5.25F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r1 = proteccousavant.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 5).addBox(5.0F, -2.0F, -9.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -1.864F, 2.7591F, 0.0F, 0.3927F, 0.3927F));
		PartDefinition cube_r2 = proteccousavant.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 65).addBox(3.0F, -2.0F, -9.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7426F, 2.3787F, -1.8331F, 0.0F, -0.3927F, -0.3927F));
		PartDefinition protecnuque = plastron.addOrReplaceChild("protecnuque", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Proteccousarriregauche = protecnuque.addOrReplaceChild("Proteccousarriregauche", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Proteccousarriregauche.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 17).addBox(-5.5F, -4.25F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6323F, -3.4468F, -4.8025F, -3.134F, -0.043F, -0.1747F));
		PartDefinition cube_r4 = Proteccousarriregauche.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 25).addBox(-5.5F, 0.25F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6441F, -1.7723F, -3.1557F, -2.3486F, 0.0879F, -0.1737F));
		PartDefinition cube_r5 = Proteccousarriregauche.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -1.75F, 5.75F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9819F, -3.3588F, -3.4222F, -0.1719F, 0.7703F, -0.2444F));
		PartDefinition cube_r6 = Proteccousarriregauche.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 93).addBox(-5.5F, -4.75F, -8.25F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0505F, -3.656F, -4.0028F, -3.134F, 0.0879F, -0.1737F));
		PartDefinition cube_r7 = Proteccousarriregauche.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 73).addBox(-5.5F, -4.25F, -3.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7021F, -3.7152F, -4.2893F, -3.134F, -0.043F, -0.1747F));
		PartDefinition cube_r8 = Proteccousarriregauche.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 32).addBox(-5.5F, -1.25F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4759F, -2.5466F, -4.7454F, -2.7413F, -0.043F, -0.1747F));
		PartDefinition cube_r9 = Proteccousarriregauche.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(54, 49).addBox(-5.5F, -1.25F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2558F, -1.2915F, -4.7118F, -2.3486F, -0.043F, -0.1747F));
		PartDefinition cube_r10 = Proteccousarriregauche.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 38).addBox(-5.5F, -1.25F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0754F, -0.1409F, -4.1936F, -1.9559F, -0.043F, -0.1747F));
		PartDefinition cube_r11 = Proteccousarriregauche.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 73).addBox(-5.5F, -1.25F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0629F, 0.208F, -5.9511F, -2.3486F, -0.043F, -0.1747F));
		PartDefinition cube_r12 = Proteccousarriregauche.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(77, 44).addBox(-5.5F, -1.25F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1897F, 1.4637F, -3.7793F, -1.5632F, -0.043F, -0.1747F));
		PartDefinition cube_r13 = Proteccousarriregauche.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(79, 24).addBox(-5.5F, -1.25F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2038F, 1.8848F, -2.3994F, -1.1705F, -0.043F, -0.1747F));
		PartDefinition cube_r14 = Proteccousarriregauche.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(79, 27).addBox(-5.5F, -1.25F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1182F, 1.7545F, -0.9651F, -0.7778F, -0.043F, -0.1747F));
		PartDefinition cube_r15 = Proteccousarriregauche.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 37).addBox(-5.5F, -2.25F, -3.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0541F, 1.0926F, 0.3053F, -0.3851F, -0.043F, -0.1747F));
		PartDefinition Proteccousarriredroit = protecnuque.addOrReplaceChild("Proteccousarriredroit", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0F, 0.0F));
		PartDefinition cube_r16 = Proteccousarriredroit.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(16, 80).addBox(4.5F, -4.25F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6323F, -3.4468F, -4.8025F, -3.134F, 0.043F, 0.1747F));
		PartDefinition cube_r17 = Proteccousarriredroit.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 87).addBox(4.5F, 0.25F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6441F, -1.7723F, -3.1557F, -2.3486F, -0.0879F, 0.1737F));
		PartDefinition cube_r18 = Proteccousarriredroit.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 15).addBox(4.5F, -1.75F, 5.75F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9819F, -3.3588F, -3.4222F, -0.1719F, -0.7703F, 0.2444F));
		PartDefinition cube_r19 = Proteccousarriredroit.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(66, 93).addBox(4.5F, -4.75F, -8.25F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0505F, -3.656F, -4.0028F, -3.134F, -0.0879F, 0.1737F));
		PartDefinition cube_r20 = Proteccousarriredroit.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(75, 24).addBox(4.5F, -4.25F, -3.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7021F, -3.7152F, -4.2893F, -3.134F, 0.043F, 0.1747F));
		PartDefinition cube_r21 = Proteccousarriredroit.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 80).addBox(4.5F, -1.25F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4759F, -2.5466F, -4.7454F, -2.7413F, 0.043F, 0.1747F));
		PartDefinition cube_r22 = Proteccousarriredroit.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 80).addBox(4.5F, -1.25F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2558F, -1.2915F, -4.7118F, -2.3486F, 0.043F, 0.1747F));
		PartDefinition cube_r23 = Proteccousarriredroit.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 80).addBox(4.5F, -1.25F, -3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0754F, -0.1409F, -4.1936F, -1.9559F, 0.043F, 0.1747F));
		PartDefinition cube_r24 = Proteccousarriredroit.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(81, 30).addBox(4.5F, -1.25F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0629F, 0.208F, -5.9511F, -2.3486F, 0.043F, 0.1747F));
		PartDefinition cube_r25 = Proteccousarriredroit.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(81, 65).addBox(4.5F, -1.25F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1897F, 1.4637F, -3.7793F, -1.5632F, 0.043F, 0.1747F));
		PartDefinition cube_r26 = Proteccousarriredroit.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(81, 68).addBox(4.5F, -1.25F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2038F, 1.8848F, -2.3994F, -1.1705F, 0.043F, 0.1747F));
		PartDefinition cube_r27 = Proteccousarriredroit.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(82, 0).addBox(4.5F, -1.25F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1182F, 1.7545F, -0.9651F, -0.7778F, 0.043F, 0.1747F));
		PartDefinition cube_r28 = Proteccousarriredroit.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(47, 49).addBox(4.5F, -2.25F, -3.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0541F, 1.0926F, 0.3053F, -0.3851F, 0.043F, 0.1747F));
		PartDefinition Proteccousarrirecentre = protecnuque.addOrReplaceChild("Proteccousarrirecentre", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r29 = Proteccousarrirecentre.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(32, 90).addBox(-5.0F, -2.0F, 6.0F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3396F, -4.7646F, 2.5829F, -1.3963F, 0.0F, 0.0F));
		PartDefinition cube_r30 = Proteccousarrirecentre.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(52, 90).addBox(-5.0F, -2.0F, 6.0F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3396F, -3.3731F, -0.4311F, -0.1745F, 0.0F, 0.0F));
		PartDefinition basplastron = plastron.addOrReplaceChild("basplastron", CubeListBuilder.create().texOffs(31, 32).addBox(-4.5F, 0.5F, -2.5F, 9.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Protegebasavant = basplastron.addOrReplaceChild("Protegebasavant", CubeListBuilder.create().texOffs(65, 57).addBox(-2.0F, 11.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 53)
				.addBox(-2.4827F, 11.9239F, -3.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 63).addBox(-0.504F, 15.0452F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.75F, 0.0F));
		PartDefinition cube_r31 = Protegebasavant.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(36, 83).addBox(0.0203F, 0.0028F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0044F, 11.0033F, -2.5F, 0.0F, 0.0F, 1.0908F));
		PartDefinition cube_r32 = Protegebasavant.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(85, 2).addBox(-1.0203F, 0.0028F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0044F, 11.0033F, -2.5F, 0.0F, 0.0F, -1.0908F));
		PartDefinition cube_r33 = Protegebasavant.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(12, 52).addBox(-1.0F, 11.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.8813F, 23.1163F, 0.0F, 0.0F, 0.0F, -2.3562F));
		PartDefinition cube_r34 = Protegebasavant.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(54, 23).addBox(-2.0F, 11.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8813F, 23.1163F, 0.0F, 0.0F, 0.0F, 2.3562F));
		PartDefinition Protegebasarrire = basplastron.addOrReplaceChild("Protegebasarrire", CubeListBuilder.create().texOffs(65, 55).addBox(-2.0F, 11.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 27)
				.addBox(-2.4827F, 11.9239F, -3.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 83).addBox(-0.504F, 15.0452F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 5.0F));
		PartDefinition cube_r35 = Protegebasarrire.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(82, 51).addBox(0.0203F, 0.0028F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0044F, 11.0033F, -2.5F, 0.0F, 0.0F, 1.0908F));
		PartDefinition cube_r36 = Protegebasarrire.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(83, 24).addBox(-1.0203F, 0.0028F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0044F, 11.0033F, -2.5F, 0.0F, 0.0F, -1.0908F));
		PartDefinition cube_r37 = Protegebasarrire.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(27, 21).addBox(-1.0F, 11.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.8813F, 23.1163F, 0.0F, 0.0F, 0.0F, -2.3562F));
		PartDefinition cube_r38 = Protegebasarrire.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(12, 37).addBox(-2.0F, 11.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8813F, 23.1163F, 0.0F, 0.0F, 0.0F, 2.3562F));
		PartDefinition parebale = Body.addOrReplaceChild("parebale", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 0.0F));
		PartDefinition contouravant = parebale.addOrReplaceChild("contouravant",
				CubeListBuilder.create().texOffs(44, 68).addBox(3.25F, 6.5F, -2.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 30).addBox(-3.5F, 11.5F, -2.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 15)
						.addBox(-1.9591F, 5.7986F, -2.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 58).addBox(-4.25F, 6.5F, -2.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 30)
						.addBox(-3.7324F, 4.5681F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 74).addBox(1.7324F, 4.5681F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -0.5F));
		PartDefinition cube_r39 = contouravant.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(4, 73).addBox(3.0F, 9.5F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.9579F, 5.5521F, 0.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r40 = contouravant.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 89).addBox(-0.25F, -5.5F, -0.5F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9824F, 4.8181F, -2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r41 = contouravant.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(82, 91).addBox(-0.75F, -5.5F, -0.5F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9824F, 4.8181F, -2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r42 = contouravant.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 52).addBox(3.0F, 9.5F, -2.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5901F, -3.5729F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r43 = contouravant.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(28, 52).addBox(-4.0F, 9.5F, -2.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5901F, -3.5729F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r44 = contouravant.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(66, 19).addBox(-3.5F, 11.25F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 26).addBox(-3.5F, 11.5F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.3328F, 0.4524F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition cube_r45 = contouravant.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(52, 79).addBox(2.5F, 11.25F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 79).addBox(2.5F, 11.5F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3328F, 0.4524F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r46 = contouravant.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(71, 63).addBox(-5.0F, 9.5F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.9579F, 5.5521F, 0.0F, 0.0F, 0.0F, 1.1781F));
		PartDefinition contourarriere = parebale.addOrReplaceChild("contourarriere",
				CubeListBuilder.create().texOffs(26, 43).addBox(3.25F, 6.5F, 2.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-5.0F, 8.0F, -3.0F, 10.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-3.5F, 11.5F, 2.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 0).addBox(-1.9591F, 5.7986F, 2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-4.25F, 6.5F, 2.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 2).addBox(-3.7324F, 4.5681F, 2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 0)
						.addBox(1.7324F, 4.5681F, 2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r47 = contourarriere.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(63, 59).addBox(3.0F, 9.5F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.9579F, 5.5521F, 5.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r48 = contourarriere.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(5, 0).addBox(3.0F, 9.5F, -2.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5901F, -3.5729F, 5.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r49 = contourarriere.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(5, 15).addBox(-4.0F, 9.5F, -2.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5901F, -3.5729F, 5.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r50 = contourarriere.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(16, 40).addBox(-3.5F, 11.25F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 65).addBox(-3.5F, 11.5F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.3328F, 0.4524F, 5.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition cube_r51 = contourarriere.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(54, 35).addBox(2.5F, 11.25F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 63).addBox(2.5F, 11.5F, -2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3328F, 0.4524F, 5.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r52 = contourarriere.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(9, 67).addBox(-5.0F, 9.5F, -2.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.9579F, 5.5521F, 5.0F, 0.0F, 0.0F, 1.1781F));
		PartDefinition Centreavant = parebale.addOrReplaceChild("Centreavant", CubeListBuilder.create().texOffs(88, 84).addBox(-4.0F, 6.75F, 1.1F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 31)
				.addBox(1.75F, 4.75F, 1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-3.75F, 4.75F, 1.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Centrearriere = parebale.addOrReplaceChild("Centrearriere", CubeListBuilder.create().texOffs(86, 13).addBox(-4.0F, 6.75F, 0.9F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 17)
				.addBox(1.75F, 4.75F, 0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-3.75F, 4.75F, 0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -4.0F));
		PartDefinition portechargeur = parebale.addOrReplaceChild("portechargeur", CubeListBuilder.create(), PartPose.offset(0.5F, -0.75F, 0.0F));
		PartDefinition cube_r53 = portechargeur.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(44, 4).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4591F, 8.2986F, -3.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition portechargeur2 = parebale.addOrReplaceChild("portechargeur2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.5F, 0.0F));
		PartDefinition cube_r54 = portechargeur2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(54, 56).addBox(-2.5F, -0.25F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4591F, 8.2986F, -3.25F, 0.3927F, 0.0F, 0.0F));
		PartDefinition portechargeur3 = parebale.addOrReplaceChild("portechargeur3", CubeListBuilder.create(), PartPose.offset(0.5F, 1.75F, 0.0F));
		PartDefinition cube_r55 = portechargeur3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(46, 2).addBox(-2.5F, 0.25F, -0.55F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4591F, 8.2986F, -3.5F, 0.6981F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition Brasarmurdroite = RightArm.addOrReplaceChild("Brasarmurdroite", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition epaule2 = Brasarmurdroite.addOrReplaceChild("epaule2", CubeListBuilder.create().texOffs(96, 91).addBox(-1.7252F, -2.6596F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.65F, 0.0F, 0.0F));
		PartDefinition cube_r56 = epaule2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(77, 42).addBox(-6.5F, -3.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.073F, -3.3942F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r57 = epaule2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(55, 100).addBox(-2.25F, -0.6F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1739F, 0.8357F, 0.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r58 = epaule2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(16, 37).addBox(-3.5F, -3.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition avantbras2 = Brasarmurdroite.addOrReplaceChild("avantbras2", CubeListBuilder.create(), PartPose.offset(0.25F, 6.25F, 0.0F));
		PartDefinition cube_r59 = avantbras2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(34, 49).addBox(-5.5F, -3.5F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.723F, -3.3942F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition main2 = Brasarmurdroite.addOrReplaceChild("main2",
				CubeListBuilder.create().texOffs(76, 103).addBox(-3.0F, 8.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(40, 103).addBox(-2.8F, 8.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(102, 26)
						.addBox(-3.0F, 8.0F, -2.2F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(102, 6).addBox(-3.2F, 8.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(102, 0)
						.addBox(-3.0F, 8.0F, -1.8F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Brascacheskin2 = Brasarmurdroite
				.addOrReplaceChild(
						"Brascacheskin2", CubeListBuilder.create().texOffs(16, 80).addBox(-2.9F, 1.175F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(56, 77).addBox(-3.0F, 1.175F, -2.1F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F))
								.texOffs(40, 77).addBox(-3.1F, 1.175F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 76).addBox(-3.0F, 1.175F, -1.9F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)),
						PartPose.offset(0.0F, -2.675F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition Brasarmurgauche = LeftArm.addOrReplaceChild("Brasarmurgauche", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition epaule = Brasarmurgauche.addOrReplaceChild("epaule", CubeListBuilder.create().texOffs(28, 97).addBox(-1.2748F, -2.6596F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.65F, 0.0F, 0.0F));
		PartDefinition cube_r60 = epaule.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(85, 76).addBox(1.5F, -3.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.073F, -3.3942F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r61 = epaule.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(105, 78).addBox(-0.75F, -0.6F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1739F, 0.8357F, 0.0F, 0.0F, 0.0F, 1.1781F));
		PartDefinition cube_r62 = epaule.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(66, 105).addBox(1.5F, -3.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition avantbras = Brasarmurgauche.addOrReplaceChild("avantbras", CubeListBuilder.create(), PartPose.offset(-0.25F, 6.25F, 0.0F));
		PartDefinition cube_r63 = avantbras.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(92, 37).addBox(1.5F, -3.5F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.723F, -3.3942F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition main = Brasarmurgauche.addOrReplaceChild("main",
				CubeListBuilder.create().texOffs(105, 45).addBox(-1.0F, 8.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(105, 32).addBox(-1.2F, 8.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(28, 105)
						.addBox(-1.0F, 8.0F, -2.2F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(12, 105).addBox(-0.8F, 8.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(104, 101)
						.addBox(-1.0F, 8.0F, -1.8F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Brascacheskin = Brasarmurgauche
				.addOrReplaceChild(
						"Brascacheskin", CubeListBuilder.create().texOffs(86, 24).addBox(-1.1F, 1.175F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(86, 0).addBox(-1.0F, 1.175F, -2.1F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F))
								.texOffs(85, 63).addBox(-0.9F, 1.175F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(72, 80).addBox(-1.0F, 1.175F, -1.9F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)),
						PartPose.offset(0.0F, -2.675F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
