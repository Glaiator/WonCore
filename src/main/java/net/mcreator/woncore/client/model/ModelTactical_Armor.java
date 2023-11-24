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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelTactical_Armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("woncore", "model_tactical_armor"), "main");
	public final ModelPart armorHead;
	public final ModelPart armorBody;
	public final ModelPart armorLeftArm;
	public final ModelPart armorRightArm;
	public final ModelPart armorLeftLeg;
	public final ModelPart armorRightLeg;
	public final ModelPart armorLeftBoot;
	public final ModelPart armorRightBoot;

	public ModelTactical_Armor(ModelPart root) {
		this.armorHead = root.getChild("armorHead");
		this.armorBody = root.getChild("armorBody");
		this.armorLeftArm = root.getChild("armorLeftArm");
		this.armorRightArm = root.getChild("armorRightArm");
		this.armorLeftLeg = root.getChild("armorLeftLeg");
		this.armorRightLeg = root.getChild("armorRightLeg");
		this.armorLeftBoot = root.getChild("armorLeftBoot");
		this.armorRightBoot = root.getChild("armorRightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armorHead = partdefinition.addOrReplaceChild("armorHead",
				CubeListBuilder.create().texOffs(11, 74).addBox(4.5272F, -3.7436F, -2.7716F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)).texOffs(11, 74)
						.addBox(4.5272F, -5.7937F, -0.7214F, 0.6232F, 5.1185F, 1.0181F, new CubeDeformation(0.0F)).texOffs(105, 78).addBox(5.0171F, -3.6825F, -2.4645F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).texOffs(105, 78)
						.addBox(5.0171F, -5.4866F, -0.6603F, 0.5484F, 4.5043F, 0.896F, new CubeDeformation(0.0F)).texOffs(105, 78).addBox(5.3879F, -3.575F, -1.924F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F)).texOffs(105, 78)
						.addBox(5.3879F, -4.9461F, -0.5528F, 0.4168F, 3.4232F, 0.6809F, new CubeDeformation(0.0F)).texOffs(96, 41).addBox(-4.8949F, -3.3845F, -4.8624F, 5.75F, 3.6F, 9.825F, new CubeDeformation(0.0F)).texOffs(96, 41)
						.addBox(0.8551F, -3.3845F, -4.8624F, 4.0F, 3.6F, 9.825F, new CubeDeformation(0.0F)).texOffs(103, 46).addBox(-0.5107F, -4.2123F, -4.8624F, 0.9816F, 0.8914F, 0.15F, new CubeDeformation(0.0F)).texOffs(102, 45)
						.addBox(-4.8949F, -6.8051F, 3.3958F, 9.75F, 3.4206F, 1.5669F, new CubeDeformation(0.0F)).texOffs(106, 76).mirror().addBox(-5.8446F, -3.575F, -1.924F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(106, 76).mirror().addBox(-5.8446F, -4.9461F, -0.5528F, 0.4168F, 3.4232F, 0.6809F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 76).mirror()
						.addBox(-5.6054F, -3.6825F, -2.4645F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 76).mirror().addBox(-5.6054F, -5.4866F, -0.6603F, 0.5484F, 4.5043F, 0.896F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(11, 73).mirror().addBox(-5.1903F, -3.7436F, -2.7716F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 73).mirror()
						.addBox(-5.1903F, -5.7937F, -0.7214F, 0.6232F, 5.1185F, 1.0181F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r1 = armorHead.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(11, 73).mirror().addBox(0.6564F, -2.5592F, -0.5091F, 0.6232F, 5.1185F, 1.0181F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 73).mirror()
						.addBox(0.6564F, -0.5091F, -2.5592F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 72).mirror().addBox(0.2413F, -2.2521F, -0.448F, 0.5484F, 4.5043F, 0.896F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(106, 76).mirror().addBox(0.2413F, -0.448F, -2.2521F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 78)
						.addBox(11.2346F, -1.7116F, -0.3405F, 0.4168F, 3.4232F, 0.6809F, new CubeDeformation(0.0F)).texOffs(105, 78).addBox(11.2346F, -0.3405F, -1.7116F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F)).texOffs(105, 78)
						.addBox(10.8638F, -2.2521F, -0.448F, 0.5484F, 4.5043F, 0.896F, new CubeDeformation(0.0F)).texOffs(105, 78).addBox(10.8638F, -0.448F, -2.2521F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).texOffs(11, 74)
						.addBox(10.3739F, -2.5592F, -0.5091F, 0.6232F, 5.1185F, 1.0181F, new CubeDeformation(0.0F)).texOffs(11, 74).addBox(10.3739F, -0.5091F, -2.5592F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8467F, -3.2345F, -0.2124F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = armorHead.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(11, 73).mirror().addBox(0.6564F, -2.5592F, -0.5091F, 0.6232F, 5.1185F, 1.0181F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 73).mirror()
						.addBox(0.6564F, -0.5091F, -2.5592F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 76).mirror().addBox(0.2413F, -2.2521F, -0.448F, 0.5484F, 4.5043F, 0.896F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(106, 76).mirror().addBox(0.2413F, -0.448F, -2.2521F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 78)
						.addBox(11.2346F, -1.7116F, -0.3405F, 0.4168F, 3.4232F, 0.6809F, new CubeDeformation(0.0F)).texOffs(105, 78).addBox(11.2346F, -0.3405F, -1.7116F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F)).texOffs(105, 78)
						.addBox(10.8638F, -2.2521F, -0.448F, 0.5484F, 4.5043F, 0.896F, new CubeDeformation(0.0F)).texOffs(105, 78).addBox(10.8638F, -0.448F, -2.2521F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).texOffs(11, 74)
						.addBox(10.3739F, -2.5592F, -0.5091F, 0.6232F, 5.1185F, 1.0181F, new CubeDeformation(0.0F)).texOffs(11, 74).addBox(10.3739F, -0.5091F, -2.5592F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8467F, -3.2345F, -0.2124F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = armorHead.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(11, 73).mirror().addBox(0.6564F, -0.5091F, -2.5592F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 76).mirror()
						.addBox(0.2413F, -0.448F, -2.2521F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 78).addBox(11.2346F, -0.3405F, -1.7116F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F))
						.texOffs(105, 78).addBox(10.8638F, -0.448F, -2.2521F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).texOffs(11, 74).addBox(10.3739F, -0.5091F, -2.5592F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8467F, -3.2345F, -0.2124F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = armorHead.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(11, 73).mirror().addBox(0.6564F, -0.5091F, -2.5592F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 76).mirror()
						.addBox(0.2413F, -0.448F, -2.2521F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 78).addBox(11.2346F, -0.3405F, -1.7116F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F))
						.texOffs(105, 78).addBox(10.8638F, -0.448F, -2.2521F, 0.5484F, 0.896F, 4.5043F, new CubeDeformation(0.0F)).texOffs(11, 74).addBox(10.3739F, -0.5091F, -2.5592F, 0.6232F, 1.0181F, 5.1185F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8467F, -3.2345F, -0.2124F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r5 = armorHead.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(109, 72).mirror().addBox(-0.1375F, -0.3271F, -0.548F, 0.275F, 0.6543F, 1.096F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.5159F, -5.3773F, 0.7657F, -0.3316F, 0.2007F, 0.5236F));
		PartDefinition hexadecagon_r6 = armorHead.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(109, 72).mirror().addBox(-0.4492F, 0.3854F, -0.548F, 0.275F, 0.6543F, 1.096F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 76).mirror().addBox(-0.1742F, -0.7146F, -1.048F, 0.3484F, 1.4293F, 2.096F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3562F, -5.547F, 0.8376F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r7 = armorHead.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(106, 76).mirror().addBox(0.439F, -1.7116F, -0.3405F, 0.4168F, 3.4232F, 0.6809F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 76).mirror().addBox(0.439F, -0.3405F, -1.7116F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2836F, -3.2345F, -0.2124F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r8 = armorHead.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(106, 76).mirror().addBox(0.439F, -1.7116F, -0.3405F, 0.4168F, 3.4232F, 0.6809F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 76).mirror().addBox(0.439F, -0.3405F, -1.7116F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2836F, -3.2345F, -0.2124F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r9 = armorHead.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(106, 76).mirror().addBox(0.439F, -0.3405F, -1.7116F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.2836F, -3.2345F, -0.2124F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r10 = armorHead.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(106, 76).mirror().addBox(0.439F, -0.3405F, -1.7116F, 0.4168F, 0.6809F, 3.4232F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.2836F, -3.2345F, -0.2124F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r1 = armorHead.addOrReplaceChild(
				"Steve_r1", CubeListBuilder.create().texOffs(103, 76).addBox(4.842F, -0.234F, -4.842F, 0.15F, 0.468F, 9.678F, new CubeDeformation(0.0F)).texOffs(98, 76)
						.addBox(-4.842F, -0.234F, 0.008F, 9.684F, 0.468F, 4.984F, new CubeDeformation(0.0F)).texOffs(98, 78).addBox(-4.842F, -0.234F, -4.992F, 9.684F, 0.468F, 4.984F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0198F, -9.5635F, 0.0439F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r2 = armorHead.addOrReplaceChild("Steve_r2", CubeListBuilder.create().texOffs(74, 46).addBox(-0.2514F, -0.4268F, -0.2597F, 0.5029F, 1.1035F, 0.5193F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2801F, -4.6498F, -4.7249F, 0.0F, 3.1416F, -1.9635F));
		PartDefinition Steve_r3 = armorHead.addOrReplaceChild("Steve_r3", CubeListBuilder.create().texOffs(74, 46).addBox(-0.2514F, -0.5393F, -0.2597F, 0.5029F, 0.7285F, 0.5193F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9756F, -5.271F, -4.7249F, 0.0F, 3.1416F, -2.7489F));
		PartDefinition Steve_r4 = armorHead.addOrReplaceChild("Steve_r4", CubeListBuilder.create().texOffs(74, 46).mirror().addBox(-0.2514F, -0.5393F, -0.2597F, 0.5029F, 0.7285F, 0.5193F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0155F, -5.271F, -4.7249F, 0.0F, -3.1416F, 2.7489F));
		PartDefinition Steve_r5 = armorHead.addOrReplaceChild("Steve_r5", CubeListBuilder.create().texOffs(74, 49).mirror().addBox(0.2514F, -0.5381F, -2.5972F, 0.375F, 1.0349F, 2.8693F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 52)
				.mirror().addBox(0.0486F, -0.5631F, -0.2722F, 0.2029F, 1.0849F, 0.5443F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2998F, -4.1888F, -4.7374F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Steve_r6 = armorHead.addOrReplaceChild("Steve_r6", CubeListBuilder.create().texOffs(76, 72).mirror().addBox(-0.5827F, -0.0516F, -0.3182F, 1.1654F, 0.9532F, 0.6365F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.7201F, -8.9078F, -5.2315F, 0.3927F, -3.1416F, 0.0F));
		PartDefinition Steve_r7 = armorHead.addOrReplaceChild("Steve_r7", CubeListBuilder.create().texOffs(76, 72).mirror().addBox(-0.5827F, 0.0734F, -0.3182F, 1.1654F, 0.8282F, 0.6365F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.7201F, -8.27F, -5.5523F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Steve_r8 = armorHead.addOrReplaceChild("Steve_r8", CubeListBuilder.create().texOffs(76, 72).mirror().addBox(-0.5827F, -0.1141F, -0.3182F, 1.1654F, 1.8032F, 0.6365F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.7201F, -7.3847F, -5.5329F, -0.3927F, -3.1416F, 0.0F));
		PartDefinition Steve_r9 = armorHead.addOrReplaceChild("Steve_r9", CubeListBuilder.create().texOffs(76, 72).addBox(-0.5827F, -0.0516F, -0.3182F, 1.1654F, 0.9532F, 0.6365F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6802F, -8.9078F, -5.2315F, 0.3927F, 3.1416F, 0.0F));
		PartDefinition Steve_r10 = armorHead.addOrReplaceChild("Steve_r10", CubeListBuilder.create().texOffs(76, 72).addBox(-0.5827F, 0.0734F, -0.3182F, 1.1654F, 0.8282F, 0.6365F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6802F, -8.27F, -5.5523F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Steve_r11 = armorHead.addOrReplaceChild("Steve_r11", CubeListBuilder.create().texOffs(76, 72).addBox(-0.5827F, -0.1141F, -0.3182F, 1.1654F, 1.8032F, 0.6365F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6802F, -7.3847F, -5.5329F, -0.3927F, 3.1416F, 0.0F));
		PartDefinition Steve_r12 = armorHead.addOrReplaceChild("Steve_r12", CubeListBuilder.create().texOffs(102, 49).addBox(-5.8874F, 1.4775F, 4.4284F, 11.7746F, 0.2547F, 0.6336F, new CubeDeformation(0.0F)).texOffs(102, 49).addBox(-5.8874F, 1.1025F,
				4.8034F, 11.7746F, 0.2547F, 0.2586F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0201F, -7.0584F, 0.0696F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Steve_r13 = armorHead.addOrReplaceChild("Steve_r13", CubeListBuilder.create().texOffs(102, 49).addBox(-5.8873F, 0.0014F, -0.1815F, 11.7746F, 0.1801F, 0.1801F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0199F, -5.4535F, -4.4882F, -0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r14 = armorHead.addOrReplaceChild("Steve_r14", CubeListBuilder.create().texOffs(102, 49).addBox(-0.4712F, 1.0002F, -6.6782F, 1.1673F, 0.2547F, 0.6347F, new CubeDeformation(0.0F)).texOffs(102, 49).addBox(-0.4712F, 0.6252F,
				-6.6782F, 1.1673F, 0.2547F, 0.6347F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6532F, -6.581F, -0.7625F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Steve_r15 = armorHead.addOrReplaceChild("Steve_r15", CubeListBuilder.create().texOffs(102, 49).addBox(-5.062F, -1.9436F, 4.7858F, 10.124F, 0.2547F, 1.1016F, new CubeDeformation(0.0F)).texOffs(102, 49).addBox(-5.062F, -2.3186F,
				4.7858F, 10.124F, 0.2547F, 1.1016F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0198F, -3.6373F, 0.0696F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Steve_r16 = armorHead.addOrReplaceChild("Steve_r16", CubeListBuilder.create().texOffs(102, 49).addBox(-0.6962F, 1.0002F, -6.6782F, 1.1673F, 0.2547F, 0.6347F, new CubeDeformation(0.0F)).texOffs(112, 50).addBox(-0.6962F, 0.6252F,
				-6.6782F, 1.1673F, 0.2547F, 0.6347F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6927F, -6.581F, -0.7625F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Steve_r17 = armorHead.addOrReplaceChild("Steve_r17", CubeListBuilder.create().texOffs(102, 49).addBox(-5.8873F, 0.0014F, -0.1815F, 11.7746F, 0.1801F, 0.1801F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0199F, -5.8285F, -4.8632F, -0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r18 = armorHead.addOrReplaceChild("Steve_r18",
				CubeListBuilder.create().texOffs(103, 76).mirror().addBox(4.59F, -2.262F, -0.036F, 0.87F, 3.4613F, 4.872F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 7)
						.addBox(-4.992F, -2.805F, -4.842F, 9.984F, 0.075F, 5.784F, new CubeDeformation(0.0F)).texOffs(100, 81).addBox(-5.46F, 1.014F, -4.836F, 10.92F, 0.936F, 2.964F, new CubeDeformation(0.0F)).texOffs(68, 47)
						.addBox(-4.9043F, 1.932F, -5.928F, 9.7988F, 0.936F, 1.092F, new CubeDeformation(0.0F)).texOffs(78, 45).addBox(4.212F, 0.996F, 4.692F, 0.7508F, 0.936F, 1.08F, new CubeDeformation(0.0F)).texOffs(2, 2)
						.addBox(-4.834F, -2.807F, -4.998F, 9.676F, 0.47F, 0.165F, new CubeDeformation(0.0F)).texOffs(103, 81).addBox(-4.836F, -2.262F, 4.836F, 9.672F, 3.312F, 0.624F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0198F, -7.0675F, 0.0439F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Steve_r19 = armorHead.addOrReplaceChild("Steve_r19", CubeListBuilder.create().texOffs(2, 3).mirror().addBox(-0.5412F, -2.73F, -6.3473F, 0.9825F, 4.194F, 0.9624F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.7485F, -6.6058F, 0.7096F, 0.0F, 2.3562F, 0.0F));
		PartDefinition Steve_r20 = armorHead.addOrReplaceChild("Steve_r20", CubeListBuilder.create().texOffs(2, 3).mirror().addBox(-0.1918F, -0.0373F, -0.0543F, 2.9336F, 0.0746F, 0.9586F, new CubeDeformation(-0.001F)).mirror(false),
				PartPose.offsetAndRotation(-5.5113F, -9.1205F, 0.011F, 0.0F, -2.7489F, -1.5708F));
		PartDefinition Steve_r21 = armorHead.addOrReplaceChild("Steve_r21",
				CubeListBuilder.create().texOffs(2, 7).mirror().addBox(-4.992F, -0.0375F, -4.8795F, 0.384F, 0.075F, 5.784F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 7).mirror()
						.addBox(-4.608F, -0.0375F, -4.8795F, 2.225F, 0.075F, 4.809F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 4).mirror().addBox(-2.383F, -0.0375F, -4.8795F, 1.65F, 0.075F, 2.634F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(2, 4).mirror().addBox(-2.383F, -0.0375F, -2.2455F, 0.65F, 0.075F, 1.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.5113F, -4.3438F, 0.0064F, 0.0F, -3.1416F, -1.5708F));
		PartDefinition Steve_r22 = armorHead.addOrReplaceChild("Steve_r22", CubeListBuilder.create().texOffs(2, 7).mirror().addBox(-4.992F, -0.0375F, -4.8795F, 0.759F, 0.425F, 5.784F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.5154F, -6.3161F, 0.0064F, 0.0F, -3.1416F, -0.7854F));
		PartDefinition Steve_r23 = armorHead.addOrReplaceChild("Steve_r23",
				CubeListBuilder.create().texOffs(10, 9).addBox(1.733F, -0.0375F, -2.2455F, 0.65F, 0.075F, 1.8F, new CubeDeformation(0.0F)).texOffs(10, 9).addBox(0.733F, -0.0375F, -4.8795F, 1.65F, 0.075F, 2.634F, new CubeDeformation(0.0F))
						.texOffs(2, 7).addBox(2.383F, -0.0375F, -4.8795F, 2.225F, 0.075F, 4.809F, new CubeDeformation(0.0F)).texOffs(2, 7).addBox(4.608F, -0.0375F, -4.8795F, 0.384F, 0.075F, 5.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4714F, -4.3438F, 0.0064F, 0.0F, 3.1416F, 1.5708F));
		PartDefinition Steve_r24 = armorHead.addOrReplaceChild("Steve_r24", CubeListBuilder.create().texOffs(2, 3).addBox(-2.7418F, -0.0373F, -0.0543F, 2.9336F, 0.0746F, 0.9586F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(5.4714F, -9.1205F, 0.011F, 0.0F, 2.7489F, 1.5708F));
		PartDefinition Steve_r25 = armorHead.addOrReplaceChild("Steve_r25", CubeListBuilder.create().texOffs(2, 7).addBox(4.233F, -0.0375F, -4.8795F, 0.759F, 0.425F, 5.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.4756F, -6.3161F, 0.0064F, 0.0F, 3.1416F, 0.7854F));
		PartDefinition Steve_r26 = armorHead.addOrReplaceChild("Steve_r26", CubeListBuilder.create().texOffs(2, 7).addBox(1.8148F, -5.535F, -0.867F, 3.1772F, 0.075F, 1.809F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3835F, -4.3375F, -1.3659F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Steve_r27 = armorHead.addOrReplaceChild("Steve_r27", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(1.1582F, -0.0373F, -0.9043F, 3.6836F, 0.0746F, 1.8086F, new CubeDeformation(-0.001F)).mirror(false),
				PartPose.offsetAndRotation(-0.1925F, -9.835F, -1.9154F, 0.0F, -2.7489F, 0.0F));
		PartDefinition Steve_r28 = armorHead.addOrReplaceChild("Steve_r28", CubeListBuilder.create().texOffs(2, 4).addBox(-4.8418F, -0.0373F, -0.9043F, 3.6836F, 0.0746F, 1.8086F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.1527F, -9.835F, -1.9154F, 0.0F, 2.7489F, 0.0F));
		PartDefinition hexadecagon_r11 = armorHead.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(79, 73).addBox(-0.1572F, -0.0155F, -1.7211F, 0.375F, 0.3809F, 2.2232F, new CubeDeformation(0.0F)).texOffs(79, 73)
				.addBox(-0.1572F, -0.4905F, -2.1211F, 0.325F, 0.9809F, 2.3732F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.837F, -3.2345F, -0.5529F, 0.3927F, 0.0F, 0.0F));
		PartDefinition Steve_r29 = armorHead.addOrReplaceChild("Steve_r29", CubeListBuilder.create().texOffs(72, 44).mirror().addBox(0.9626F, -1.9526F, -0.2722F, 0.2029F, 1.3235F, 0.5443F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5525F, -4.772F, -4.7374F, 0.0F, -3.1416F, 2.3562F));
		PartDefinition Steve_r30 = armorHead.addOrReplaceChild("Steve_r30", CubeListBuilder.create().texOffs(77, 76).mirror().addBox(-0.8976F, 1.3636F, -0.2722F, 0.649F, 0.3F, 0.4603F, new CubeDeformation(0.0F)).mirror(false).texOffs(80, 76).mirror()
				.addBox(-1.1226F, 1.6636F, -0.2722F, 1.099F, 0.175F, 0.4603F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6975F, -4.772F, -4.7374F, 0.0F, -3.1416F, 1.5708F));
		PartDefinition Steve_r31 = armorHead.addOrReplaceChild("Steve_r31", CubeListBuilder.create().texOffs(72, 47).mirror().addBox(0.0486F, -1.1518F, -0.2722F, 0.2029F, 1.3235F, 0.5443F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.647F, -4.2599F, -4.7374F, 0.0F, -3.1416F, -2.3562F));
		PartDefinition Steve_r32 = armorHead.addOrReplaceChild("Steve_r32",
				CubeListBuilder.create().texOffs(78, 76).mirror().addBox(-1.3226F, -1.4209F, -0.2722F, 1.499F, 2.8595F, 0.4603F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 75).mirror()
						.addBox(-1.1476F, 1.4386F, -0.2722F, 1.199F, 0.4F, 0.4603F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 49).mirror().addBox(0.1764F, -1.2689F, -0.2722F, 0.2029F, 2.3035F, 0.5443F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.5525F, -4.772F, -4.7374F, 0.0F, -3.1416F, 1.5708F));
		PartDefinition Steve_r33 = armorHead.addOrReplaceChild("Steve_r33", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(0.0486F, -0.7318F, -0.6922F, 0.2029F, 2.3035F, 0.5443F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8553F, -3.5192F, -5.1574F, 0.0F, -3.1416F, -1.5708F));
		PartDefinition Steve_r34 = armorHead.addOrReplaceChild("Steve_r34", CubeListBuilder.create().texOffs(76, 52).mirror().addBox(0.0486F, -0.3118F, -0.6922F, 0.2029F, 1.0435F, 0.5443F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.167F, -3.7801F, -5.1574F, 0.0F, -3.1416F, -1.1781F));
		PartDefinition Steve_r35 = armorHead.addOrReplaceChild("Steve_r35", CubeListBuilder.create().texOffs(76, 49).mirror().addBox(0.5435F, 0.8107F, -0.2722F, 0.2029F, 1.0435F, 0.5443F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5525F, -4.772F, -4.7374F, 0.0F, -3.1416F, 1.1781F));
		PartDefinition Steve_r36 = armorHead.addOrReplaceChild("Steve_r36",
				CubeListBuilder.create().texOffs(76, 75).addBox(0.0236F, 1.6636F, -0.2722F, 1.099F, 0.175F, 0.4603F, new CubeDeformation(0.0F)).texOffs(76, 75).addBox(0.2486F, 1.3636F, -0.2722F, 0.649F, 0.3F, 0.4603F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7374F, -4.772F, -4.7374F, 0.0F, 3.1416F, -1.5708F));
		PartDefinition Steve_r37 = armorHead.addOrReplaceChild(
				"Steve_r37", CubeListBuilder.create().texOffs(76, 75).addBox(-0.0514F, 1.4386F, -0.2722F, 1.199F, 0.4F, 0.4603F, new CubeDeformation(0.0F)).texOffs(79, 75)
						.addBox(-0.1764F, -1.4209F, -0.2722F, 1.499F, 2.8595F, 0.4603F, new CubeDeformation(0.0F)).texOffs(76, 45).addBox(-0.3793F, -1.2689F, -0.2722F, 0.2029F, 2.3035F, 0.5443F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5126F, -4.772F, -4.7374F, 0.0F, 3.1416F, -1.5708F));
		PartDefinition Steve_r38 = armorHead.addOrReplaceChild("Steve_r38", CubeListBuilder.create().texOffs(75, 50).addBox(-0.6264F, -0.5381F, -2.5972F, 0.375F, 1.0349F, 2.8693F, new CubeDeformation(0.0F)).texOffs(76, 48).addBox(-0.2514F, -0.5631F,
				-0.2722F, 0.2029F, 1.0849F, 0.5443F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2599F, -4.1888F, -4.7374F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Steve_r39 = armorHead.addOrReplaceChild("Steve_r39", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(-0.2514F, -0.4268F, -0.2597F, 0.5029F, 1.1035F, 0.5193F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3199F, -4.6498F, -4.7249F, 0.0F, -3.1416F, 1.9635F));
		PartDefinition Steve_r40 = armorHead.addOrReplaceChild("Steve_r40", CubeListBuilder.create().texOffs(76, 45).addBox(-0.7464F, 0.8107F, -0.2722F, 0.2029F, 1.0435F, 0.5443F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5126F, -4.772F, -4.7374F, 0.0F, 3.1416F, -1.1781F));
		PartDefinition Steve_r41 = armorHead.addOrReplaceChild("Steve_r41", CubeListBuilder.create().texOffs(76, 45).addBox(-1.1654F, -1.9526F, -0.2722F, 0.2029F, 1.3235F, 0.5443F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5126F, -4.772F, -4.7374F, 0.0F, 3.1416F, -2.3562F));
		PartDefinition Steve_r42 = armorHead.addOrReplaceChild("Steve_r42", CubeListBuilder.create().texOffs(76, 48).addBox(-0.2514F, -1.1518F, -0.2722F, 0.2029F, 1.3235F, 0.5443F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6071F, -4.2599F, -4.7374F, 0.0F, 3.1416F, 2.3562F));
		PartDefinition cube_r1 = armorHead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(109, 50).mirror().addBox(-0.075F, -0.5625F, -0.075F, 1.275F, 1.125F, 0.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.9615F, -2.966F, -4.7874F, 0.0F, 0.0F, -0.7854F));
		PartDefinition Steve_r43 = armorHead.addOrReplaceChild("Steve_r43", CubeListBuilder.create().texOffs(68, 48).addBox(-0.2514F, -0.3118F, -0.6922F, 0.2029F, 1.0435F, 0.5443F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1271F, -3.7801F, -5.1574F, 0.0F, 3.1416F, 1.1781F));
		PartDefinition Steve_r44 = armorHead.addOrReplaceChild("Steve_r44", CubeListBuilder.create().texOffs(68, 48).addBox(-0.2514F, -0.7318F, -0.6922F, 0.2029F, 2.3035F, 0.5443F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8155F, -3.5192F, -5.1574F, 0.0F, 3.1416F, 1.5708F));
		PartDefinition Steve_r45 = armorHead.addOrReplaceChild("Steve_r45", CubeListBuilder.create().texOffs(66, 48).addBox(-0.468F, -0.468F, -0.6191F, 11.544F, 0.9301F, 2.2981F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2842F, -4.6675F, 4.4814F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Steve_r46 = armorHead.addOrReplaceChild("Steve_r46", CubeListBuilder.create().texOffs(100, 81).mirror().addBox(3.2892F, 3.1923F, 0.864F, 0.5783F, 0.6619F, 3.972F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0201F, -9.32F, 0.0439F, 0.0F, -3.1416F, 0.7854F));
		PartDefinition Steve_r47 = armorHead.addOrReplaceChild("Steve_r47", CubeListBuilder.create().texOffs(100, 81).mirror().addBox(-0.4412F, -2.73F, -6.3473F, 0.8825F, 3.336F, 0.9624F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6798F, -6.5995F, -0.6159F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Steve_r48 = armorHead.addOrReplaceChild("Steve_r48",
				CubeListBuilder.create().texOffs(69, 72).addBox(2.8612F, -5.5692F, -5.0918F, 0.2777F, 0.4774F, 10.1837F, new CubeDeformation(0.0F)).texOffs(69, 72)
						.addBox(2.8673F, -5.0918F, 4.9327F, 0.2654F, 3.3782F, 0.6365F, new CubeDeformation(0.0F)).texOffs(68, 72).addBox(2.8673F, -5.0918F, -5.5692F, 0.2654F, 4.4309F, 0.4774F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6299F, -4.332F, 0.0431F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Steve_r49 = armorHead.addOrReplaceChild("Steve_r49", CubeListBuilder.create().texOffs(68, 72).addBox(2.6286F, -0.4501F, -6.418F, 0.2654F, 0.6751F, 1.0612F, new CubeDeformation(0.0F)).texOffs(68, 72).addBox(5.3167F, -0.4501F,
				-6.418F, 0.2654F, 0.6751F, 1.0612F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1253F, -5.0447F, -0.8288F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r50 = armorHead.addOrReplaceChild("Steve_r50", CubeListBuilder.create().texOffs(68, 72).addBox(2.6286F, -0.4501F, -6.418F, 2.0654F, 0.6751F, 1.0612F, new CubeDeformation(0.0F)).texOffs(68, 72).addBox(8.0289F, -0.4501F,
				-6.418F, 2.0654F, 0.6751F, 1.0612F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3814F, -5.0447F, -0.8288F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r51 = armorHead.addOrReplaceChild("Steve_r51",
				CubeListBuilder.create().texOffs(68, 72).addBox(2.8673F, -5.0918F, 4.9327F, 2.0654F, 3.3782F, 0.6365F, new CubeDeformation(0.0F)).texOffs(68, 72)
						.addBox(2.8612F, -5.5692F, -5.0918F, 2.0777F, 0.4774F, 10.1837F, new CubeDeformation(0.0F)).texOffs(68, 72).addBox(2.8673F, -5.0918F, -5.5692F, 2.0654F, 4.4309F, 0.4774F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1799F, -4.332F, 0.0431F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Steve_r52 = armorHead.addOrReplaceChild("Steve_r52", CubeListBuilder.create().texOffs(68, 72).addBox(2.8673F, -0.3375F, -7.5385F, 2.0654F, 0.6751F, 0.6168F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1799F, -4.332F, 0.0431F, -0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r53 = armorHead.addOrReplaceChild("Steve_r53", CubeListBuilder.create().texOffs(68, 72).addBox(2.8673F, -0.3375F, -7.5385F, 0.2654F, 0.6751F, 0.6168F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6299F, -4.332F, 0.0431F, -0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r54 = armorHead.addOrReplaceChild("Steve_r54",
				CubeListBuilder.create().texOffs(68, 72).addBox(-3.1327F, -5.0918F, 4.9327F, 0.2654F, 3.3782F, 0.6365F, new CubeDeformation(0.0F)).texOffs(68, 72)
						.addBox(-3.1388F, -5.5692F, -5.0918F, 0.2777F, 0.4774F, 10.1837F, new CubeDeformation(0.0F)).texOffs(68, 72).addBox(-3.1327F, -5.0918F, -5.5692F, 0.2654F, 4.4309F, 0.4774F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6698F, -4.332F, 0.0431F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Steve_r55 = armorHead.addOrReplaceChild("Steve_r55", CubeListBuilder.create().texOffs(68, 72).addBox(-3.1327F, -0.3375F, -7.5385F, 0.2654F, 0.6751F, 0.6168F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6698F, -4.332F, 0.0431F, -0.7854F, -3.1416F, 0.0F));
		PartDefinition Steve_r56 = armorHead.addOrReplaceChild("Steve_r56",
				CubeListBuilder.create().texOffs(68, 72).addBox(-4.9327F, -5.0918F, 4.9327F, 2.0654F, 3.3782F, 0.6365F, new CubeDeformation(0.0F)).texOffs(68, 72)
						.addBox(-4.9388F, -5.5692F, -5.0918F, 2.0777F, 0.4774F, 10.1837F, new CubeDeformation(0.0F)).texOffs(68, 72).addBox(-4.9327F, -5.0918F, -5.5692F, 2.0654F, 4.4309F, 0.4774F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2198F, -4.332F, 0.0431F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Steve_r57 = armorHead.addOrReplaceChild("Steve_r57", CubeListBuilder.create().texOffs(68, 72).addBox(-4.9327F, -0.3375F, -7.5385F, 2.0654F, 0.6751F, 0.6168F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2198F, -4.332F, 0.0431F, -0.7854F, -3.1416F, 0.0F));
		PartDefinition cube_r2 = armorHead.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(104, 46).addBox(-1.2F, -0.5625F, -0.075F, 1.275F, 1.125F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9217F, -2.966F, -4.7874F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r3 = armorHead.addOrReplaceChild(
				"cube_r3", CubeListBuilder.create().texOffs(88, 41).addBox(-4.6439F, -1.8F, -4.8375F, 9.5189F, 2.1103F, 0.15F, new CubeDeformation(0.0F)).texOffs(88, 41)
						.addBox(4.7311F, -1.8F, -14.3625F, 0.1439F, 2.1103F, 9.525F, new CubeDeformation(0.0F)).texOffs(100, 46).addBox(-4.6439F, -1.8F, -14.5125F, 9.5189F, 2.1103F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.294F, 0.9177F, 9.6501F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r4 = armorHead.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(98, 41).addBox(-0.875F, -1.8F, -4.8375F, 5.75F, 3.7025F, 8.9385F, new CubeDeformation(0.0F)).texOffs(98, 41).addBox(-4.875F, -1.8F, -4.8375F, 5.75F, 3.7025F, 8.9385F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0199F, -3.5728F, 0.2957F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r12 = armorHead.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(106, 79).addBox(-0.1375F, -0.3271F, -0.548F, 0.275F, 0.6543F, 1.096F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4761F, -5.3773F, 0.7657F, -0.3316F, -0.2007F, -0.5236F));
		PartDefinition hexadecagon_r13 = armorHead.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(106, 79).addBox(0.1742F, 0.3854F, -0.548F, 0.275F, 0.6543F, 1.096F, new CubeDeformation(0.0F)).texOffs(106, 79).addBox(-0.1742F, -0.7146F, -1.048F, 0.3484F, 1.4293F, 2.096F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3163F, -5.547F, 0.8376F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Steve_r58 = armorHead.addOrReplaceChild("Steve_r58", CubeListBuilder.create().texOffs(66, 45).addBox(-0.4845F, -0.468F, -0.6881F, 11.5437F, 0.936F, 1.3013F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2677F, -5.0366F, 2.762F, 0.925F, 3.1416F, 0.0F));
		PartDefinition Steve_r59 = armorHead.addOrReplaceChild("Steve_r59", CubeListBuilder.create().texOffs(66, 45).addBox(-0.4845F, -0.468F, -1.0631F, 11.5437F, 0.936F, 1.6762F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2677F, -5.9442F, 1.6132F, 0.5323F, 3.1416F, 0.0F));
		PartDefinition Steve_r60 = armorHead.addOrReplaceChild("Steve_r60", CubeListBuilder.create().texOffs(66, 45).addBox(-0.4845F, -0.468F, -1.6631F, 11.5437F, 0.936F, 2.2762F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2677F, -6.4267F, -0.3896F, 0.1396F, 3.1416F, 0.0F));
		PartDefinition Steve_r61 = armorHead.addOrReplaceChild("Steve_r61", CubeListBuilder.create().texOffs(66, 45).addBox(-0.4845F, -0.468F, -0.6131F, 11.5437F, 0.936F, 1.2262F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2677F, -6.3688F, -1.408F, -0.2531F, 3.1416F, 0.0F));
		PartDefinition Steve_r62 = armorHead.addOrReplaceChild("Steve_r62", CubeListBuilder.create().texOffs(66, 45).addBox(-0.4845F, -0.468F, -0.6131F, 11.5437F, 0.936F, 1.2262F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2677F, -5.9257F, -2.3268F, -0.6458F, 3.1416F, 0.0F));
		PartDefinition Steve_r63 = armorHead.addOrReplaceChild("Steve_r63", CubeListBuilder.create().texOffs(66, 45).addBox(-0.4845F, -0.468F, -0.0131F, 11.5437F, 0.936F, 0.9262F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2677F, -5.6327F, -2.6647F, -0.2531F, -3.1416F, 0.0F));
		PartDefinition Steve_r64 = armorHead.addOrReplaceChild("Steve_r64",
				CubeListBuilder.create().texOffs(107, 76).addBox(-5.46F, -2.262F, -0.036F, 0.87F, 3.4613F, 4.872F, new CubeDeformation(0.0F)).texOffs(68, 47).addBox(-5.772F, 0.996F, 4.7092F, 11.5437F, 0.936F, 0.2535F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0201F, -7.0675F, 0.0439F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Steve_r65 = armorHead.addOrReplaceChild("Steve_r65", CubeListBuilder.create().texOffs(68, 47).addBox(-5.772F, -0.468F, 2.046F, 11.5437F, 0.936F, 1.3762F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0198F, -5.1297F, -1.3404F, 0.1396F, -3.1416F, 0.0F));
		PartDefinition Steve_r66 = armorHead.addOrReplaceChild("Steve_r66", CubeListBuilder.create().texOffs(68, 47).addBox(-5.928F, -0.468F, 0.0878F, 0.936F, 0.936F, 1.2382F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6229F, -4.6675F, 1.8464F, 0.0F, 2.3562F, 0.0F));
		PartDefinition Steve_r67 = armorHead.addOrReplaceChild("Steve_r67", CubeListBuilder.create().texOffs(68, 47).addBox(4.992F, -0.468F, 0.0878F, 0.936F, 0.936F, 1.2382F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6624F, -4.6675F, 1.8464F, 0.0F, -2.3562F, 0.0F));
		PartDefinition Steve_r68 = armorHead.addOrReplaceChild("Steve_r68", CubeListBuilder.create().texOffs(68, 47).addBox(-0.4619F, 0.858F, -6.5473F, 1.1445F, 0.936F, 0.6222F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.64F, -6.9295F, -0.7719F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Steve_r69 = armorHead.addOrReplaceChild("Steve_r69", CubeListBuilder.create().texOffs(68, 47).addBox(-4.9627F, -2.028F, 4.692F, 0.7507F, 0.936F, 1.08F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0198F, -4.0435F, 0.0439F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Steve_r70 = armorHead.addOrReplaceChild("Steve_r70", CubeListBuilder.create().texOffs(68, 47).addBox(-4.2503F, -2.1797F, 4.536F, 8.424F, 0.9317F, 1.236F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.058F, -3.8875F, 0.0439F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Steve_r71 = armorHead.addOrReplaceChild("Steve_r71", CubeListBuilder.create().texOffs(78, 48).addBox(-0.6825F, 0.858F, -6.5473F, 1.1445F, 0.936F, 0.6222F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6795F, -6.9295F, -0.7719F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Steve_r72 = armorHead.addOrReplaceChild("Steve_r72", CubeListBuilder.create().texOffs(100, 79).addBox(-4.602F, -0.4412F, -6.2922F, 9.672F, 0.6619F, 1.0404F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2538F, -5.0362F, -0.8109F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r73 = armorHead.addOrReplaceChild("Steve_r73", CubeListBuilder.create().texOffs(103, 79).addBox(-0.4412F, -2.73F, -6.3473F, 0.8825F, 3.336F, 0.9624F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.64F, -6.5995F, -0.6159F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Steve_r74 = armorHead.addOrReplaceChild("Steve_r74", CubeListBuilder.create().texOffs(2, 3).addBox(-0.4412F, -2.73F, -6.3473F, 0.9825F, 4.194F, 0.9624F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7087F, -6.6058F, 0.7096F, 0.0F, -2.3562F, 0.0F));
		PartDefinition Steve_r75 = armorHead.addOrReplaceChild("Steve_r75", CubeListBuilder.create().texOffs(2, 3).addBox(-4.836F, -0.4309F, -7.3907F, 9.672F, 0.7619F, 0.6047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0218F, -4.3438F, 0.1206F, -0.7854F, -3.1416F, 0.0F));
		PartDefinition Steve_r76 = armorHead.addOrReplaceChild("Steve_r76", CubeListBuilder.create().texOffs(108, 78).addBox(-3.8675F, 3.1923F, -0.036F, 0.5783F, 0.6619F, 4.872F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0198F, -9.32F, 0.0439F, 0.0F, 3.1416F, -0.7854F));
		PartDefinition Steve_r77 = armorHead.addOrReplaceChild("Steve_r77", CubeListBuilder.create().texOffs(2, 3).addBox(-4.834F, -5.6223F, -5.4617F, 9.67F, 4.3503F, 0.4697F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0198F, -3.7135F, 0.1189F, 0.0F, -3.1416F, 0.0F));
		PartDefinition armorBody = partdefinition.addOrReplaceChild("armorBody",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.625F, 0.0F, -2.1875F, 3.625F, 1.0F, 4.5156F, new CubeDeformation(0.0F)).texOffs(66, 40).addBox(-3.875F, 2.125F, -2.6875F, 7.75F, 8.0F, 5.375F, new CubeDeformation(0.0F)).texOffs(66, 40)
						.addBox(-3.375F, 1.625F, -2.6875F, 6.75F, 0.5F, 5.375F, new CubeDeformation(0.0F)).texOffs(80, 11).mirror().addBox(-0.125F, 0.9766F, -2.3125F, 0.25F, 11.4609F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
						.addBox(-4.25F, 0.0F, -2.1875F, 3.625F, 1.0F, 4.5156F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.625F, 0.0F, -0.5625F, 1.25F, 1.0F, 2.8906F, new CubeDeformation(0.0F)).texOffs(67, 43)
						.addBox(-4.4064F, 6.75F, -2.4226F, 8.8127F, 3.375F, 4.8451F, new CubeDeformation(0.0F)).texOffs(67, 43).addBox(0.6458F, 6.125F, -2.9375F, 2.6042F, 4.125F, 0.25F, new CubeDeformation(0.0F)).texOffs(67, 43)
						.addBox(0.3958F, 6.375F, -2.9375F, 3.1042F, 3.625F, 0.25F, new CubeDeformation(0.0F)).texOffs(67, 43).addBox(1.9375F, 11.0F, -2.625F, 0.3125F, 0.875F, 5.25F, new CubeDeformation(0.0F)).texOffs(67, 43)
						.addBox(1.9375F, 10.625F, -2.5F, 0.3125F, 0.375F, 0.1875F, new CubeDeformation(0.0F)).texOffs(67, 43).addBox(1.9375F, 10.625F, 2.3125F, 0.3125F, 0.375F, 0.1875F, new CubeDeformation(0.0F)).texOffs(67, 43)
						.addBox(3.8125F, 11.0F, -2.625F, 0.3125F, 0.875F, 5.25F, new CubeDeformation(0.0F)).texOffs(67, 43).addBox(0.625F, 11.0625F, -2.5625F, 3.875F, 0.75F, 5.125F, new CubeDeformation(0.0F)).texOffs(67, 43).mirror()
						.addBox(-4.5F, 11.0625F, -2.5625F, 3.875F, 0.75F, 5.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 43).mirror().addBox(-2.25F, 11.0F, -2.625F, 0.3125F, 0.875F, 5.25F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(74, 47).mirror().addBox(-2.25F, 10.625F, -2.5F, 0.3125F, 0.375F, 0.1875F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 47).mirror()
						.addBox(-4.125F, 11.0F, -2.625F, 0.3125F, 0.875F, 5.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 47).mirror().addBox(-0.625F, 11.0625F, 2.125F, 1.25F, 0.75F, 0.4375F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(77, 73).addBox(-0.1016F, 2.0F, -2.75F, 0.1875F, 8.2656F, 0.0625F, new CubeDeformation(0.0F)).texOffs(68, 46).addBox(-3.375F, 10.125F, -2.6875F, 6.75F, 0.5F, 5.375F, new CubeDeformation(0.0F)).texOffs(71, 47).mirror()
						.addBox(-5.0F, 11.0625F, -1.5625F, 0.125F, 0.75F, 3.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 46).addBox(4.875F, 11.0625F, -1.5625F, 0.125F, 0.75F, 3.125F, new CubeDeformation(0.0F)).texOffs(74, 47)
						.addBox(0.75F, 3.875F, -2.9375F, 2.5F, 2.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(74, 47).addBox(0.5F, 4.125F, -2.9375F, 1.4375F, 1.5F, 0.25F, new CubeDeformation(0.0F)).texOffs(73, 47)
						.addBox(-3.375F, 1.875F, -2.9375F, 2.875F, 2.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(73, 47).addBox(-3.625F, 2.125F, -2.9375F, 3.375F, 1.5F, 0.25F, new CubeDeformation(0.0F)).texOffs(74, 51)
						.addBox(-3.5F, 4.25F, -2.75F, 3.0F, 0.625F, 0.0625F, new CubeDeformation(0.0F)).texOffs(105, 83).addBox(-3.375F, 4.5F, -2.8125F, 2.75F, 0.125F, 0.0625F, new CubeDeformation(0.0F)).texOffs(106, 80)
						.addBox(-0.7734F, 4.4922F, -2.8438F, 0.0859F, 0.1484F, 0.0938F, new CubeDeformation(0.0F)).texOffs(106, 80).addBox(-0.7734F, 4.6406F, -2.8359F, 0.0859F, 0.1875F, 0.0313F, new CubeDeformation(0.0F)).texOffs(106, 76)
						.addBox(1.875F, -0.25F, -2.4375F, 1.25F, 1.875F, 4.875F, new CubeDeformation(0.0F)).texOffs(106, 76).addBox(-3.125F, -0.25F, -2.4375F, 1.25F, 1.875F, 4.875F, new CubeDeformation(0.0F)).texOffs(18, 80)
						.addBox(0.25F, 10.7891F, -2.5F, 0.5625F, 0.125F, 0.1875F, new CubeDeformation(0.0F)).texOffs(18, 80).addBox(-0.8125F, 10.7891F, -2.5F, 0.5625F, 0.125F, 0.1875F, new CubeDeformation(0.0F)).texOffs(75, 51)
						.addBox(-0.4375F, 10.9219F, -2.5625F, 0.875F, 1.1406F, 0.3125F, new CubeDeformation(0.0F)).texOffs(14, 73).addBox(0.6875F, 10.9063F, -2.5F, 0.125F, 1.1563F, 0.1875F, new CubeDeformation(0.0F)).texOffs(14, 73)
						.addBox(-0.8125F, 10.9063F, -2.5F, 0.125F, 1.1563F, 0.1875F, new CubeDeformation(0.0F)).texOffs(79, 53).addBox(-1.0625F, 10.5625F, 2.375F, 0.3125F, 0.375F, 0.1875F, new CubeDeformation(0.0F)).texOffs(72, 74)
						.addBox(-3.0691F, 8.9961F, 2.5237F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).texOffs(72, 74).addBox(-3.0691F, 6.7461F, 2.5237F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).texOffs(72, 74)
						.addBox(-3.0691F, 5.6211F, 2.5237F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).texOffs(72, 74).addBox(-3.0691F, 4.4961F, 2.5237F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).texOffs(72, 74)
						.addBox(-3.0691F, 3.3711F, 2.5237F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).texOffs(72, 74).addBox(-2.7527F, 2.2473F, 2.5237F, 5.38F, 0.405F, 0.3275F, new CubeDeformation(0.0F)).texOffs(72, 74)
						.addBox(-2.8919F, 2.5258F, 2.5237F, 0.1392F, 0.1266F, 0.3275F, new CubeDeformation(0.0F)).texOffs(72, 74).addBox(2.6273F, 2.5258F, 2.5237F, 0.1392F, 0.1266F, 0.3275F, new CubeDeformation(0.0F)).texOffs(72, 74)
						.addBox(-3.0691F, 2.6523F, 2.5237F, 6.0186F, 0.2036F, 0.3275F, new CubeDeformation(0.0F)).texOffs(14, 76).addBox(-0.8125F, 11.9766F, -2.5F, 0.5625F, 0.125F, 0.1875F, new CubeDeformation(0.0F)).texOffs(14, 76)
						.addBox(0.25F, 11.9766F, -2.5F, 0.5625F, 0.125F, 0.1875F, new CubeDeformation(0.0F)).texOffs(76, 72).addBox(-3.0691F, 7.8711F, 2.5237F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).texOffs(78, 46)
						.addBox(-3.1667F, 6.125F, -2.9375F, 2.3542F, 4.125F, 0.25F, new CubeDeformation(0.0F)).texOffs(75, 46).addBox(-3.4167F, 6.375F, -2.9375F, 2.8542F, 3.625F, 0.25F, new CubeDeformation(0.0F)).texOffs(75, 46)
						.addBox(-3.5F, 5.1875F, -2.75F, 3.0F, 0.625F, 0.0625F, new CubeDeformation(0.0F)).texOffs(13, 13).addBox(-4.25F, 1.0F, -2.1875F, 8.5F, 11.4375F, 4.5156F, new CubeDeformation(0.001F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_r1 = armorBody.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(75, 46).addBox(-1.5F, 0.625F, -0.0313F, 3.0F, 0.25F, 0.0625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 5.2007F, -2.8816F, 0.2618F, 0.0F, 0.0F));
		PartDefinition body_r2 = armorBody.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(75, 46).addBox(-1.5F, 0.625F, -0.0313F, 3.0F, 0.25F, 0.0625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 4.3504F, -2.4933F, -0.2618F, 0.0F, 0.0F));
		PartDefinition body_r3 = armorBody.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-1.2008F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6667F, 9.9482F, -2.7188F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r4 = armorBody.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(78, 46).addBox(0.8473F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3125F, 9.9482F, -2.7188F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r5 = armorBody.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(78, 46).addBox(0.8473F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6667F, 6.4268F, -2.7188F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r6 = armorBody.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-1.2008F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.3125F, 6.4268F, -2.7188F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r7 = armorBody.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-0.1143F, -0.125F, -0.0664F, 0.7911F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.9268F, 6.25F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r8 = armorBody.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.1143F, 6.3384F, -3.0586F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r9 = armorBody.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-3.5133F, 1.024F, -0.4063F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8776F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r10 = armorBody.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3018F, 6.3384F, -3.0586F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r11 = armorBody.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-3.5133F, 1.024F, -0.4063F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8365F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r12 = armorBody.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.1143F, 9.0777F, -3.0586F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r13 = armorBody.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-0.1143F, -0.125F, -0.0664F, 0.7911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 46).mirror()
				.addBox(0.1357F, -0.3438F, -0.0664F, 0.2911F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9268F, 9.1661F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r14 = armorBody.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3018F, 9.0777F, -3.0586F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r15 = armorBody.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(111, 82).addBox(-3.5133F, 0.024F, -0.375F, 2.6661F, 1.0F, 0.1016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.774F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r16 = armorBody.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(0.0107F, -0.125F, -0.0664F, 0.7911F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.3643F, 6.25F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r17 = armorBody.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.6768F, 6.3384F, -3.0586F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r18 = armorBody.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-3.5133F, 1.024F, -0.4063F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.4401F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r19 = armorBody.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8643F, 6.3384F, -3.0586F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r20 = armorBody.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-3.5133F, 1.024F, -0.4063F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.399F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r21 = armorBody.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.6768F, 9.0777F, -3.0586F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r22 = armorBody.addOrReplaceChild("body_r22", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(0.0107F, -0.125F, -0.0664F, 0.7911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 49).mirror()
				.addBox(0.2607F, -0.3438F, -0.0664F, 0.2911F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3643F, 9.1661F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r23 = armorBody.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8643F, 9.0777F, -3.0586F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r24 = armorBody.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(111, 76).addBox(-3.5133F, 0.024F, -0.375F, 2.6661F, 1.0F, 0.1016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2115F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r25 = armorBody.addOrReplaceChild("body_r25", CubeListBuilder.create().texOffs(76, 44).addBox(-0.4063F, -1.6875F, -2.4375F, 0.5F, 3.375F, 0.5938F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1831F, 8.4375F, 3.4263F, 0.0F, -1.1083F, 0.0F));
		PartDefinition body_r26 = armorBody.addOrReplaceChild("body_r26", CubeListBuilder.create().texOffs(72, 74).addBox(2.7708F, -3.2425F, 5.0237F, 0.6581F, 0.2025F, 0.3275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6247F, 2.5809F, -2.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r27 = armorBody.addOrReplaceChild("body_r27", CubeListBuilder.create().texOffs(72, 74).addBox(-3.4296F, -3.2432F, 5.0237F, 0.6581F, 0.2025F, 0.3275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5003F, 2.5809F, -2.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r28 = armorBody.addOrReplaceChild("body_r28", CubeListBuilder.create().texOffs(106, 76).mirror().addBox(0.0625F, -0.9375F, -2.4375F, 0.5625F, 2.0625F, 4.875F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2361F, 0.8173F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition body_r29 = armorBody.addOrReplaceChild("body_r29", CubeListBuilder.create().texOffs(106, 76).addBox(-0.625F, -0.9375F, -2.4375F, 0.5625F, 2.0625F, 4.875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2361F, 0.8173F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition Steve_r78 = armorBody.addOrReplaceChild("Steve_r78", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -2.0625F, 1.8447F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.7628F, 9.7165F, 0.0F, -0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r79 = armorBody.addOrReplaceChild("Steve_r79", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0625F, 1.8447F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.7628F, 9.7165F, 0.0F, -0.7854F, -1.5708F, 0.0F));
		PartDefinition body_r30 = armorBody.addOrReplaceChild("body_r30", CubeListBuilder.create().texOffs(106, 80).addBox(-0.043F, -0.1094F, -0.0156F, 0.0547F, 0.2031F, 0.0313F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7605F, 4.7345F, -2.8203F, 0.0F, 0.0F, 0.2618F));
		PartDefinition body_r31 = armorBody.addOrReplaceChild("body_r31", CubeListBuilder.create().texOffs(106, 80).addBox(-0.043F, -0.1094F, -0.0156F, 0.0547F, 0.2031F, 0.0313F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6703F, 4.7264F, -2.8203F, 0.0F, 0.0F, -0.2618F));
		PartDefinition body_r32 = armorBody.addOrReplaceChild("body_r32", CubeListBuilder.create().texOffs(74, 51).addBox(-1.5F, 0.625F, -0.0313F, 3.0F, 0.25F, 0.0625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 4.2632F, -2.8816F, 0.2618F, 0.0F, 0.0F));
		PartDefinition body_r33 = armorBody.addOrReplaceChild("body_r33", CubeListBuilder.create().texOffs(74, 51).addBox(-1.5F, 0.625F, -0.0313F, 3.0F, 0.25F, 0.0625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.4129F, -2.4933F, -0.2618F, 0.0F, 0.0F));
		PartDefinition body_r34 = armorBody.addOrReplaceChild("body_r34", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-0.1768F, 0.0F, -0.3125F, 0.3536F, 0.25F, 0.4375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.3232F, 2.1768F, -2.8125F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r35 = armorBody.addOrReplaceChild("body_r35", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(0.0732F, -0.3438F, -0.0664F, 0.4161F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6768F, 3.5411F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r36 = armorBody.addOrReplaceChild("body_r36", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.9893F, 3.4527F, -3.0586F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r37 = armorBody.addOrReplaceChild("body_r37", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-1.9893F, -0.125F, -0.0664F, 2.8536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5107F, 3.5411F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r38 = armorBody.addOrReplaceChild("body_r38", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8857F, 3.4527F, -3.0586F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r39 = armorBody.addOrReplaceChild("body_r39", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-1.2008F, 0.774F, -0.0313F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.875F, 3.5732F, -2.9063F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r40 = armorBody.addOrReplaceChild("body_r40", CubeListBuilder.create().texOffs(74, 51).addBox(0.8473F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.5732F, -2.7188F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r41 = armorBody.addOrReplaceChild("body_r41", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-2.1383F, 1.024F, -0.4063F, 1.2911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.649F, 1.2777F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r42 = armorBody.addOrReplaceChild("body_r42", CubeListBuilder.create().texOffs(114, 79).addBox(-2.1383F, -1.5385F, -0.375F, 1.2911F, 2.9375F, 0.1016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.899F, 1.2777F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r43 = armorBody.addOrReplaceChild("body_r43", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-2.1383F, 1.024F, -0.4063F, 1.2911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.524F, 1.2777F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r44 = armorBody.addOrReplaceChild("body_r44", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-1.9893F, -0.125F, -0.0664F, 2.875F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.4893F, 2.0F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r45 = armorBody.addOrReplaceChild("body_r45", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.9893F, 2.0884F, -3.0586F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r46 = armorBody.addOrReplaceChild("body_r46", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-1.2008F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 2.1768F, -2.7188F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r47 = armorBody.addOrReplaceChild("body_r47", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-0.1768F, 0.0F, -0.3125F, 0.3536F, 0.25F, 0.4375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8018F, 4.1768F, -2.8125F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r48 = armorBody.addOrReplaceChild("body_r48", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(0.0732F, -0.3438F, -0.0664F, 0.4161F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.3232F, 5.5411F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r49 = armorBody.addOrReplaceChild("body_r49", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.7607F, 5.4527F, -3.0586F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r50 = armorBody.addOrReplaceChild("body_r50", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-1.6143F, -0.125F, -0.0664F, 2.4786F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.6357F, 5.5411F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r51 = armorBody.addOrReplaceChild("body_r51", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2607F, 5.4527F, -3.0586F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r52 = armorBody.addOrReplaceChild("body_r52", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-1.2008F, 0.774F, -0.0313F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.25F, 5.5732F, -2.9063F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r53 = armorBody.addOrReplaceChild("body_r53", CubeListBuilder.create().texOffs(73, 47).addBox(0.8473F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 5.5732F, -2.7188F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r54 = armorBody.addOrReplaceChild("body_r54", CubeListBuilder.create().texOffs(73, 47).mirror().addBox(-2.1383F, 1.024F, -0.4063F, 1.2911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.524F, 3.2777F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r55 = armorBody.addOrReplaceChild("body_r55", CubeListBuilder.create().texOffs(116, 80).addBox(-2.1383F, -1.476F, -0.375F, 1.2911F, 2.5F, 0.1016F, new CubeDeformation(0.0F)).texOffs(74, 47).mirror()
				.addBox(-2.1383F, 1.024F, -0.4063F, 1.2911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.226F, 3.2777F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r56 = armorBody.addOrReplaceChild("body_r56", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-1.6143F, -0.125F, -0.0664F, 2.5F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.6357F, 4.0F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r57 = armorBody.addOrReplaceChild("body_r57", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.7607F, 4.0884F, -3.0586F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r58 = armorBody.addOrReplaceChild("body_r58", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-1.2008F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.75F, 4.1768F, -2.7188F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r59 = armorBody.addOrReplaceChild("body_r59", CubeListBuilder.create().texOffs(74, 47).addBox(1.3691F, -0.025F, -0.7992F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).texOffs(78, 47).addBox(1.3691F, -0.525F,
				-0.7992F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.984F, 3.3125F, -2.8416F, 0.0F, 2.7489F, 0.0F));
		PartDefinition body_r60 = armorBody.addOrReplaceChild("body_r60",
				CubeListBuilder.create().texOffs(78, 47).addBox(0.57F, -0.025F, -1.4144F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).texOffs(78, 47).addBox(0.57F, -0.525F, -1.4144F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9861F, 3.3125F, -2.8438F, 0.0F, 1.9635F, 0.0F));
		PartDefinition body_r61 = armorBody.addOrReplaceChild("body_r61", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-1.4816F, -0.025F, -0.7992F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9882F, 3.3125F, -2.8416F, 0.0F, -2.7489F, 0.0F));
		PartDefinition body_r62 = armorBody.addOrReplaceChild("body_r62", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.6825F, -0.025F, -1.4144F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 47)
				.mirror().addBox(-0.6825F, -0.525F, -1.4144F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9861F, 3.3125F, -2.8438F, 0.0F, -1.9635F, 0.0F));
		PartDefinition body_r63 = armorBody.addOrReplaceChild("body_r63", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.6825F, -0.025F, -1.4144F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9861F, 2.3125F, -2.8047F, 0.0F, -1.9635F, 0.0F));
		PartDefinition body_r64 = armorBody.addOrReplaceChild("body_r64", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-1.4816F, -0.025F, -0.7992F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9882F, 2.3125F, -2.8026F, 0.0F, -2.7489F, 0.0F));
		PartDefinition body_r65 = armorBody.addOrReplaceChild("body_r65", CubeListBuilder.create().texOffs(78, 47).addBox(0.57F, -0.025F, -1.4144F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0139F, 2.3125F, -2.8047F, 0.0F, 1.9635F, 0.0F));
		PartDefinition body_r66 = armorBody.addOrReplaceChild("body_r66", CubeListBuilder.create().texOffs(78, 47).addBox(1.3691F, -0.025F, -0.7992F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0118F, 2.3125F, -2.8026F, 0.0F, 2.7489F, 0.0F));
		PartDefinition body_r67 = armorBody.addOrReplaceChild("body_r67", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.1562F, -0.025F, -1.4063F, 0.1125F, 0.3625F, 2.8125F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 47)
				.mirror().addBox(-0.1562F, -0.525F, -1.4063F, 0.1125F, 0.3625F, 2.8125F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9861F, 3.3125F, -2.8438F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body_r68 = armorBody.addOrReplaceChild("body_r68", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.1562F, -0.025F, -1.3785F, 0.1125F, 0.3625F, 2.7847F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0139F, 2.3125F, -2.8047F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body_r69 = armorBody.addOrReplaceChild("body_r69", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-1.4816F, -0.025F, -0.7992F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9882F, 2.8125F, -2.8416F, 0.0F, -2.7489F, 0.0F));
		PartDefinition body_r70 = armorBody.addOrReplaceChild("body_r70", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.0938F, -1.6875F, 1.8438F, 0.5F, 3.375F, 0.5938F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1831F, 8.4375F, -3.4263F, 0.0F, -1.1083F, 0.0F));
		PartDefinition body_r71 = armorBody.addOrReplaceChild("body_r71", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.0938F, -1.6875F, -2.4375F, 0.5F, 3.375F, 0.5938F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1831F, 8.4375F, 3.4263F, 0.0F, 1.1083F, 0.0F));
		PartDefinition body_r72 = armorBody.addOrReplaceChild("body_r72", CubeListBuilder.create().texOffs(78, 50).mirror().addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.1875F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.4471F, 11.4375F, 0.6173F, 0.0F, -2.3562F, 0.0F));
		PartDefinition body_r73 = armorBody.addOrReplaceChild("body_r73", CubeListBuilder.create().texOffs(78, 50).mirror().addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.2036F, 11.4375F, 1.1585F, 0.0F, -1.9635F, 0.0F));
		PartDefinition body_r74 = armorBody.addOrReplaceChild("body_r74", CubeListBuilder.create().texOffs(74, 49).mirror().addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.1858F, 11.4375F, 1.7517F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body_r75 = armorBody.addOrReplaceChild("body_r75", CubeListBuilder.create().texOffs(74, 49).mirror().addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3963F, 11.4375F, 2.3066F, 0.0F, -1.1781F, 0.0F));
		PartDefinition body_r76 = armorBody.addOrReplaceChild("body_r76", CubeListBuilder.create().texOffs(74, 49).mirror().addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.8031F, 11.4375F, 2.7386F, 0.0F, -0.7854F, 0.0F));
		PartDefinition body_r77 = armorBody.addOrReplaceChild("body_r77", CubeListBuilder.create().texOffs(74, 49).mirror().addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.3443F, 11.4375F, 2.9821F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r78 = armorBody.addOrReplaceChild("body_r78", CubeListBuilder.create().texOffs(74, 46).addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3443F, 11.4375F, -2.9821F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r79 = armorBody.addOrReplaceChild("body_r79", CubeListBuilder.create().texOffs(74, 46).addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8031F, 11.4375F, -2.7386F, 0.0F, 0.7854F, 0.0F));
		PartDefinition body_r80 = armorBody.addOrReplaceChild("body_r80", CubeListBuilder.create().texOffs(74, 46).addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3963F, 11.4375F, -2.3066F, 0.0F, 1.1781F, 0.0F));
		PartDefinition body_r81 = armorBody.addOrReplaceChild("body_r81", CubeListBuilder.create().texOffs(74, 46).addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1858F, 11.4375F, -1.7517F, 0.0F, 1.5708F, 0.0F));
		PartDefinition body_r82 = armorBody.addOrReplaceChild("body_r82", CubeListBuilder.create().texOffs(74, 46).addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2036F, 11.4375F, -1.1585F, 0.0F, 1.9635F, 0.0F));
		PartDefinition body_r83 = armorBody.addOrReplaceChild("body_r83", CubeListBuilder.create().texOffs(74, 46).addBox(-0.0625F, -0.375F, 1.375F, 0.125F, 0.75F, 0.1875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4471F, 11.4375F, -0.6173F, 0.0F, 2.3562F, 0.0F));
		PartDefinition body_r84 = armorBody.addOrReplaceChild("body_r84", CubeListBuilder.create().texOffs(74, 49).addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3443F, 11.4375F, 2.9821F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r85 = armorBody.addOrReplaceChild("body_r85", CubeListBuilder.create().texOffs(74, 49).addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8031F, 11.4375F, 2.7386F, 0.0F, 0.7854F, 0.0F));
		PartDefinition body_r86 = armorBody.addOrReplaceChild("body_r86", CubeListBuilder.create().texOffs(74, 49).addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1858F, 11.4375F, 1.7517F, 0.0F, 1.5708F, 0.0F));
		PartDefinition body_r87 = armorBody.addOrReplaceChild("body_r87", CubeListBuilder.create().texOffs(74, 49).addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3963F, 11.4375F, 2.3066F, 0.0F, 1.1781F, 0.0F));
		PartDefinition body_r88 = armorBody.addOrReplaceChild("body_r88", CubeListBuilder.create().texOffs(74, 49).addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2036F, 11.4375F, 1.1585F, 0.0F, 1.9635F, 0.0F));
		PartDefinition body_r89 = armorBody.addOrReplaceChild("body_r89", CubeListBuilder.create().texOffs(74, 49).addBox(-0.0625F, -0.375F, -1.5625F, 0.125F, 0.75F, 0.1875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4471F, 11.4375F, 0.6173F, 0.0F, 2.3562F, 0.0F));
		PartDefinition body_r90 = armorBody.addOrReplaceChild("body_r90", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.0625F, -0.375F, 1.375F, 0.125F, 0.75F, 0.1875F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.4471F, 11.4375F, -0.6173F, 0.0F, -2.3562F, 0.0F));
		PartDefinition body_r91 = armorBody.addOrReplaceChild("body_r91", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.2036F, 11.4375F, -1.1585F, 0.0F, -1.9635F, 0.0F));
		PartDefinition body_r92 = armorBody.addOrReplaceChild("body_r92", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1858F, 11.4375F, -1.7517F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body_r93 = armorBody.addOrReplaceChild("body_r93", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.3963F, 11.4375F, -2.3066F, 0.0F, -1.1781F, 0.0F));
		PartDefinition body_r94 = armorBody.addOrReplaceChild("body_r94", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.8031F, 11.4375F, -2.7386F, 0.0F, -0.7854F, 0.0F));
		PartDefinition body_r95 = armorBody.addOrReplaceChild("body_r95", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.0625F, -0.375F, 1.4375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.3443F, 11.4375F, -2.9821F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r96 = armorBody.addOrReplaceChild("body_r96", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(0.1357F, -0.3438F, -0.0664F, 0.4161F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 47)
				.mirror().addBox(-0.1143F, -0.125F, -0.0664F, 0.9161F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4482F, 9.1661F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r97 = armorBody.addOrReplaceChild("body_r97", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(0.0732F, -0.3438F, -0.0664F, 0.4161F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 46)
				.mirror().addBox(-0.1768F, -0.125F, -0.0664F, 0.9161F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0732F, 9.1661F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r98 = armorBody.addOrReplaceChild("body_r98", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0732F, 6.3384F, -3.0586F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r99 = armorBody.addOrReplaceChild("body_r99", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.1143F, -0.125F, -0.0664F, 0.9161F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4482F, 6.25F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r100 = armorBody.addOrReplaceChild("body_r100", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1357F, 6.3384F, -3.0586F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r101 = armorBody.addOrReplaceChild("body_r101", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-3.5133F, 1.024F, -0.4063F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6276F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r102 = armorBody.addOrReplaceChild("body_r102", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1357F, 9.0777F, -3.0586F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r103 = armorBody.addOrReplaceChild("body_r103", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0732F, 9.0777F, -3.0586F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r104 = armorBody.addOrReplaceChild("body_r104", CubeListBuilder.create().texOffs(106, 73).addBox(-3.5133F, 0.024F, -0.375F, 2.6661F, 1.0F, 0.1016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.601F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r105 = armorBody.addOrReplaceChild("body_r105", CubeListBuilder.create().texOffs(77, 49).mirror().addBox(-3.5133F, 1.024F, -0.4063F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5385F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r106 = armorBody.addOrReplaceChild("body_r106", CubeListBuilder.create().texOffs(105, 78).addBox(-3.5133F, 0.024F, -0.375F, 2.6661F, 1.0F, 0.1016F, new CubeDeformation(0.0F)).texOffs(68, 46).mirror()
				.addBox(-3.5133F, 1.024F, -0.4063F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.226F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r107 = armorBody.addOrReplaceChild("body_r107", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-0.1768F, -0.125F, -0.0664F, 0.9161F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0732F, 6.25F, -3.0586F, 0.0F, 0.0F, -3.1416F));
		PartDefinition body_r108 = armorBody.addOrReplaceChild("body_r108", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.7607F, 9.0777F, -3.0586F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r109 = armorBody.addOrReplaceChild("body_r109", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.8232F, 9.0777F, -3.0586F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r110 = armorBody.addOrReplaceChild("body_r110", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-3.5133F, 1.024F, -0.4063F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0599F, 5.5277F, -2.7188F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r111 = armorBody.addOrReplaceChild("body_r111", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-0.5486F, -0.4969F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.8232F, 6.3384F, -3.0586F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r112 = armorBody.addOrReplaceChild("body_r112", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-0.5486F, 0.2469F, -0.0664F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.7607F, 6.3384F, -3.0586F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r113 = armorBody.addOrReplaceChild("body_r113", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-4.3516F, -0.5625F, -0.1875F, 8.7031F, 1.25F, 0.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 10.5F, 1.5625F, 0.3927F, 0.0F, 0.0F));
		PartDefinition body_r114 = armorBody.addOrReplaceChild("body_r114", CubeListBuilder.create().texOffs(67, 43).addBox(-4.3516F, -0.5625F, -0.0625F, 8.7031F, 1.25F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.5F, -1.625F, -0.3927F, 0.0F, 0.0F));
		PartDefinition body_r115 = armorBody.addOrReplaceChild("body_r115", CubeListBuilder.create().texOffs(67, 43).addBox(0.8473F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1458F, 6.4268F, -2.7188F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r116 = armorBody.addOrReplaceChild("body_r116", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-1.2008F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.75F, 6.4268F, -2.7188F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r117 = armorBody.addOrReplaceChild("body_r117", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-1.2008F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1458F, 9.9482F, -2.7188F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r118 = armorBody.addOrReplaceChild("body_r118", CubeListBuilder.create().texOffs(67, 43).addBox(0.8473F, 0.774F, -0.2188F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 9.9482F, -2.7188F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r119 = armorBody.addOrReplaceChild("body_r119", CubeListBuilder.create().texOffs(67, 43).addBox(-0.4063F, -1.6875F, 1.8438F, 0.5F, 3.375F, 0.5938F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1831F, 8.4375F, -3.4263F, 0.0F, 1.1083F, 0.0F));
		PartDefinition body_r120 = armorBody.addOrReplaceChild("body_r120", CubeListBuilder.create().texOffs(75, 17).mirror().addBox(0.0F, -1.3438F, -0.0625F, 0.125F, 1.1953F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.2031F, -2.25F, 0.0F, 0.0F, -0.5672F));
		PartDefinition body_r121 = armorBody.addOrReplaceChild("body_r121", CubeListBuilder.create().texOffs(77, 16).mirror().addBox(-0.125F, -1.3438F, -0.0625F, 0.125F, 1.1953F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.2031F, -2.25F, 0.0F, 0.0F, 0.5672F));
		PartDefinition body_r122 = armorBody.addOrReplaceChild("body_r122", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.8125F, -0.4375F, -2.1875F, 1.125F, 0.5625F, 1.75F, new CubeDeformation(-0.001F)).mirror(false),
				PartPose.offsetAndRotation(-0.0201F, 1.7637F, 0.0F, 0.0F, 0.0F, 1.0036F));
		PartDefinition body_r123 = armorBody.addOrReplaceChild("body_r123", CubeListBuilder.create().texOffs(0, 0).addBox(0.6875F, -0.4375F, -2.1875F, 1.125F, 0.5625F, 1.75F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0201F, 1.7637F, 0.0F, 0.0F, 0.0F, -1.0036F));
		PartDefinition body_r124 = armorBody.addOrReplaceChild("body_r124", CubeListBuilder.create().texOffs(66, 40).addBox(-0.3536F, -0.25F, -2.6875F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4482F, 2.0518F, 0.0F, 0.0F, 0.0F, -2.3562F));
		PartDefinition body_r125 = armorBody.addOrReplaceChild("body_r125", CubeListBuilder.create().texOffs(66, 40).addBox(-0.3536F, -0.25F, -2.6875F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4482F, 2.0518F, 0.0F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body_r126 = armorBody.addOrReplaceChild("body_r126", CubeListBuilder.create().texOffs(66, 40).addBox(-0.3536F, -0.25F, -2.6875F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4482F, 10.1982F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r127 = armorBody.addOrReplaceChild("body_r127", CubeListBuilder.create().texOffs(66, 40).addBox(-3.125F, -0.25F, -2.6875F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4079F, 8.2385F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition armorLeftArm = partdefinition.addOrReplaceChild("armorLeftArm",
				CubeListBuilder.create().texOffs(16, 16).addBox(-1.0F, -1.8125F, -2.375F, 4.0F, 4.75F, 4.75F, new CubeDeformation(0.0F)).texOffs(104, 46).addBox(-1.0625F, 8.25F, -2.0625F, 4.125F, 1.8125F, 4.125F, new CubeDeformation(0.0F))
						.texOffs(16, 16).addBox(-1.0F, 3.4375F, -2.375F, 4.0F, 3.875F, 4.75F, new CubeDeformation(0.0F)).texOffs(73, 44).addBox(-1.125F, 7.5625F, -2.125F, 4.25F, 0.75F, 4.25F, new CubeDeformation(0.0F)).texOffs(73, 42)
						.addBox(-1.125F, 9.0417F, -1.125F, 1.3125F, 1.0833F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 44).addBox(-1.125F, 8.4375F, -2.125F, 1.3125F, 1.6875F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition Steve_r80 = armorLeftArm.addOrReplaceChild("Steve_r80", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9836F, -0.9375F, 0.4535F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0164F, 7.2797F, -1.0164F, -0.7854F, -1.5708F, 0.0F));
		PartDefinition RightArm_r1 = armorLeftArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(38, 77).addBox(-0.1771F, -0.0313F, -0.1875F, 0.3542F, 0.0625F, 0.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1771F, 9.5937F, 1.5625F, 0.0F, 0.7854F, 1.5708F));
		PartDefinition RightArm_r2 = armorLeftArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(38, 77).addBox(-0.1771F, -0.0313F, -0.1875F, 0.3542F, 0.0625F, 0.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1771F, 9.5937F, 0.5F, 0.0F, 0.7854F, 1.5708F));
		PartDefinition RightArm_r3 = armorLeftArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(38, 77).addBox(-0.1771F, -0.0313F, -0.1875F, 0.3542F, 0.0625F, 0.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1771F, 9.5937F, -0.5F, 0.0F, 0.7854F, 1.5708F));
		PartDefinition RightArm_r4 = armorLeftArm.addOrReplaceChild("RightArm_r4", CubeListBuilder.create().texOffs(38, 77).addBox(-0.1771F, -0.0313F, -0.1875F, 0.3542F, 0.0625F, 0.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1771F, 9.5937F, -1.5625F, 0.0F, 0.7854F, 1.5708F));
		PartDefinition RightArm_r5 = armorLeftArm.addOrReplaceChild("RightArm_r5",
				CubeListBuilder.create().texOffs(77, 79).addBox(-0.3021F, -0.0313F, -0.3125F, 0.6042F, 0.0625F, 0.625F, new CubeDeformation(0.0F)).texOffs(79, 78)
						.addBox(-0.3021F, -0.0313F, -1.375F, 0.6042F, 0.0625F, 0.625F, new CubeDeformation(0.0F)).texOffs(79, 78).addBox(-0.3021F, -0.0313F, -2.375F, 0.6042F, 0.0625F, 0.625F, new CubeDeformation(0.0F)).texOffs(79, 78)
						.addBox(-0.3021F, -0.0313F, -3.4375F, 0.6042F, 0.0625F, 0.625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1146F, 9.5937F, 1.5625F, 0.0F, 0.0F, 1.5708F));
		PartDefinition RightArm_r6 = armorLeftArm.addOrReplaceChild("RightArm_r6",
				CubeListBuilder.create().texOffs(73, 44).addBox(-1.9688F, -1.0469F, -2.75F, 1.0625F, 1.6875F, 1.375F, new CubeDeformation(0.0F)).texOffs(73, 44).addBox(-1.9688F, -0.4427F, -1.75F, 1.0625F, 1.0833F, 1.8125F, new CubeDeformation(0.0F))
						.texOffs(73, 44).addBox(-0.8438F, -1.0469F, -2.75F, 0.9375F, 1.6875F, 1.375F, new CubeDeformation(0.0F)).texOffs(73, 42).addBox(-0.8438F, -0.4427F, -1.75F, 0.9375F, 1.0833F, 1.8125F, new CubeDeformation(0.0F)).texOffs(73, 44)
						.addBox(0.1563F, -1.0469F, -2.75F, 0.9375F, 1.6875F, 1.375F, new CubeDeformation(0.0F)).texOffs(73, 42).addBox(0.1563F, -0.4427F, -1.75F, 0.9375F, 1.0833F, 1.8125F, new CubeDeformation(0.0F)).texOffs(73, 42)
						.addBox(1.1563F, -0.4427F, -1.75F, 1.0625F, 1.0833F, 1.8125F, new CubeDeformation(0.0F)).texOffs(73, 44).addBox(1.1563F, -1.0469F, -2.75F, 1.0625F, 1.6875F, 1.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3438F, 9.4844F, -0.125F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Steve_r81 = armorLeftArm.addOrReplaceChild("Steve_r81", CubeListBuilder.create().texOffs(2, 2).addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7628F, 3.2165F, 0.0F, 0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r82 = armorLeftArm.addOrReplaceChild("Steve_r82", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9836F, -0.9375F, 0.4535F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0164F, 7.2797F, -1.0164F, -0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r83 = armorLeftArm.addOrReplaceChild("Steve_r83", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0164F, -0.9375F, 0.4535F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0164F, 7.2797F, -1.0164F, -0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r84 = armorLeftArm.addOrReplaceChild("Steve_r84", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0625F, 1.8447F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.0915F, -0.7628F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r85 = armorLeftArm.addOrReplaceChild("Steve_r85",
				CubeListBuilder.create().texOffs(16, 24).addBox(-1.687F, -2.0625F, -4.5154F, 0.5303F, 3.875F, 6.1872F, new CubeDeformation(0.0F)).texOffs(16, 24).addBox(-1.687F, -7.3125F, -4.5154F, 0.5303F, 4.75F, 6.1872F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.5F, -2.0107F, 0.0F, 2.3562F, 0.0F));
		PartDefinition Steve_r86 = armorLeftArm.addOrReplaceChild("Steve_r86",
				CubeListBuilder.create().texOffs(16, 24).addBox(1.1566F, -2.0625F, -4.5154F, 0.5303F, 3.875F, 6.1872F, new CubeDeformation(0.0F)).texOffs(16, 24).addBox(1.1566F, -7.3125F, -4.5154F, 0.5303F, 4.75F, 6.1872F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.5F, 2.0107F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Steve_r87 = armorLeftArm.addOrReplaceChild("Steve_r87", CubeListBuilder.create().texOffs(2, 19).addBox(-3.0164F, -0.9375F, -0.9839F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0164F, 3.4047F, 1.0164F, 0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r88 = armorLeftArm.addOrReplaceChild("Steve_r88", CubeListBuilder.create().texOffs(2, 19).addBox(-0.9836F, -0.9375F, -0.9839F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0164F, 3.4047F, 1.0164F, 0.7854F, -3.1416F, 0.0F));
		PartDefinition Steve_r89 = armorLeftArm.addOrReplaceChild("Steve_r89", CubeListBuilder.create().texOffs(2, 19).addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.2165F, 0.7628F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r90 = armorLeftArm
				.addOrReplaceChild(
						"Steve_r90", CubeListBuilder.create().texOffs(16, 16).addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 3.875F, 4.75F, new CubeDeformation(0.0F)).texOffs(16, 16)
								.addBox(-2.0F, -7.6875F, -2.0F, 4.0F, 0.375F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(-2.0F, -7.3125F, -2.375F, 4.0F, 4.75F, 4.75F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 5.5F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r91 = armorLeftArm.addOrReplaceChild("Steve_r91", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9836F, -0.9375F, 0.4535F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0164F, 2.9047F, -1.0164F, -0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r92 = armorLeftArm.addOrReplaceChild("Steve_r92", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0625F, 1.8447F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7628F, 2.7165F, 0.0F, -0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r93 = armorLeftArm.addOrReplaceChild("Steve_r93", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0164F, -0.9375F, 0.4535F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0164F, 2.9047F, -1.0164F, -0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r94 = armorLeftArm.addOrReplaceChild("Steve_r94", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0625F, 1.8447F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.7165F, -0.7628F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r95 = armorLeftArm.addOrReplaceChild("Steve_r95", CubeListBuilder.create().texOffs(2, 19).addBox(-3.0164F, -0.9375F, -0.9839F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0164F, -1.8453F, 1.0164F, 0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r96 = armorLeftArm.addOrReplaceChild("Steve_r96", CubeListBuilder.create().texOffs(2, 19).addBox(-0.9836F, -0.9375F, -0.9839F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0164F, -1.8453F, 1.0164F, 0.7854F, -3.1416F, 0.0F));
		PartDefinition Steve_r97 = armorLeftArm.addOrReplaceChild("Steve_r97", CubeListBuilder.create().texOffs(2, 2).addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7628F, -2.0335F, 0.0F, 0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r98 = armorLeftArm.addOrReplaceChild("Steve_r98", CubeListBuilder.create().texOffs(2, 19).addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0335F, 0.7628F, 0.7854F, 0.0F, 0.0F));
		PartDefinition armorRightArm = partdefinition.addOrReplaceChild("armorRightArm",
				CubeListBuilder.create().texOffs(72, 73).addBox(-3.112F, 3.8965F, -2.508F, 4.224F, 3.582F, 5.016F, new CubeDeformation(0.0F)).texOffs(105, 78).addBox(-3.1745F, 4.2715F, -2.5705F, 2.7865F, 0.832F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(104, 83).addBox(-3.1745F, 6.1465F, -2.5705F, 2.7865F, 0.832F, 0.0F, new CubeDeformation(0.0F)).texOffs(104, 83).addBox(-0.6745F, 6.084F, -2.633F, 1.349F, 0.957F, 0.5785F, new CubeDeformation(0.0F)).texOffs(104, 83)
						.addBox(-0.6745F, 4.209F, -2.633F, 1.349F, 0.957F, 0.5785F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(-3.0F, -1.8125F, -2.375F, 4.0F, 4.75F, 4.75F, new CubeDeformation(0.0F)).texOffs(103, 48).mirror()
						.addBox(-3.0625F, 8.25F, -2.0625F, 4.125F, 1.8125F, 4.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 16).addBox(-3.0F, 3.4375F, -2.375F, 4.0F, 3.875F, 4.75F, new CubeDeformation(0.0F)).texOffs(73, 47).mirror()
						.addBox(-3.125F, 7.5625F, -2.125F, 4.25F, 0.75F, 4.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 45).mirror().addBox(-0.1875F, 9.0417F, -1.125F, 1.3125F, 1.0833F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(73, 47).mirror().addBox(-0.1875F, 8.4375F, -2.125F, 1.3125F, 1.6875F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition Steve_r99 = armorRightArm.addOrReplaceChild("Steve_r99", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0164F, -0.9375F, 0.4535F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0164F, 7.2797F, -1.0164F, -0.7854F, 1.5708F, 0.0F));
		PartDefinition RightArm_r7 = armorRightArm.addOrReplaceChild("RightArm_r7", CubeListBuilder.create().texOffs(47, 77).mirror().addBox(-0.1771F, -0.0313F, -0.1875F, 0.3542F, 0.0625F, 0.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1771F, 9.5937F, 1.5625F, 0.0F, -0.7854F, -1.5708F));
		PartDefinition RightArm_r8 = armorRightArm.addOrReplaceChild("RightArm_r8", CubeListBuilder.create().texOffs(47, 77).mirror().addBox(-0.1771F, -0.0313F, -0.1875F, 0.3542F, 0.0625F, 0.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1771F, 9.5937F, 0.5F, 0.0F, -0.7854F, -1.5708F));
		PartDefinition RightArm_r9 = armorRightArm.addOrReplaceChild("RightArm_r9", CubeListBuilder.create().texOffs(47, 77).mirror().addBox(-0.1771F, -0.0313F, -0.1875F, 0.3542F, 0.0625F, 0.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1771F, 9.5937F, -0.5F, 0.0F, -0.7854F, -1.5708F));
		PartDefinition RightArm_r10 = armorRightArm.addOrReplaceChild("RightArm_r10", CubeListBuilder.create().texOffs(47, 77).mirror().addBox(-0.1771F, -0.0313F, -0.1875F, 0.3542F, 0.0625F, 0.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1771F, 9.5937F, -1.5625F, 0.0F, -0.7854F, -1.5708F));
		PartDefinition RightArm_r11 = armorRightArm.addOrReplaceChild("RightArm_r11",
				CubeListBuilder.create().texOffs(75, 74).mirror().addBox(-0.3021F, -0.0313F, -0.3125F, 0.6042F, 0.0625F, 0.625F, new CubeDeformation(0.0F)).mirror(false).texOffs(75, 74).mirror()
						.addBox(-0.3021F, -0.0313F, -1.375F, 0.6042F, 0.0625F, 0.625F, new CubeDeformation(0.0F)).mirror(false).texOffs(75, 74).mirror().addBox(-0.3021F, -0.0313F, -2.375F, 0.6042F, 0.0625F, 0.625F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(75, 74).mirror().addBox(-0.3021F, -0.0313F, -3.4375F, 0.6042F, 0.0625F, 0.625F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1146F, 9.5937F, 1.5625F, 0.0F, 0.0F, -1.5708F));
		PartDefinition RightArm_r12 = armorRightArm.addOrReplaceChild("RightArm_r12",
				CubeListBuilder.create().texOffs(73, 47).mirror().addBox(0.9063F, -1.0469F, -2.75F, 1.0625F, 1.6875F, 1.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 47).mirror()
						.addBox(0.9063F, -0.4427F, -1.75F, 1.0625F, 1.0833F, 1.8125F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 47).mirror().addBox(-0.0938F, -1.0469F, -2.75F, 0.9375F, 1.6875F, 1.375F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(73, 45).mirror().addBox(-0.0938F, -0.4427F, -1.75F, 0.9375F, 1.0833F, 1.8125F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 47).mirror()
						.addBox(-1.0938F, -1.0469F, -2.75F, 0.9375F, 1.6875F, 1.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 45).mirror().addBox(-1.0938F, -0.4427F, -1.75F, 0.9375F, 1.0833F, 1.8125F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(73, 45).mirror().addBox(-2.2188F, -0.4427F, -1.75F, 1.0625F, 1.0833F, 1.8125F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 47).mirror()
						.addBox(-2.2188F, -1.0469F, -2.75F, 1.0625F, 1.6875F, 1.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3438F, 9.4844F, -0.125F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r100 = armorRightArm.addOrReplaceChild("Steve_r100", CubeListBuilder.create().texOffs(2, 2).addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7628F, 3.2165F, 0.0F, 0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r101 = armorRightArm.addOrReplaceChild("Steve_r101", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0164F, -0.9375F, 0.4535F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0164F, 7.2797F, -1.0164F, -0.7854F, -3.1416F, 0.0F));
		PartDefinition Steve_r102 = armorRightArm.addOrReplaceChild("Steve_r102", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9836F, -0.9375F, 0.4535F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0164F, 7.2797F, -1.0164F, -0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r103 = armorRightArm.addOrReplaceChild("Steve_r103", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -2.0625F, 1.8447F, 4.0F, 0.5F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 7.0915F, -0.7628F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r104 = armorRightArm.addOrReplaceChild("Steve_r104",
				CubeListBuilder.create().texOffs(16, 24).addBox(1.1566F, -2.0625F, -4.5154F, 0.5303F, 3.875F, 6.1872F, new CubeDeformation(0.0F)).texOffs(16, 24).addBox(1.1566F, -7.3125F, -4.5154F, 0.5303F, 4.75F, 6.1872F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.5F, -2.0107F, 0.0F, -2.3562F, 0.0F));
		PartDefinition Steve_r105 = armorRightArm.addOrReplaceChild("Steve_r105",
				CubeListBuilder.create().texOffs(16, 24).addBox(-1.687F, -2.0625F, -4.5154F, 0.5303F, 3.875F, 6.1872F, new CubeDeformation(0.0F)).texOffs(16, 24).addBox(-1.687F, -7.3125F, -4.5154F, 0.5303F, 4.75F, 6.1872F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.5F, 2.0107F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Steve_r106 = armorRightArm.addOrReplaceChild("Steve_r106", CubeListBuilder.create().texOffs(2, 19).addBox(-0.9836F, -0.9375F, -0.9839F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0164F, 3.4047F, 1.0164F, 0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r107 = armorRightArm.addOrReplaceChild("Steve_r107", CubeListBuilder.create().texOffs(2, 19).addBox(-3.0164F, -0.9375F, -0.9839F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0164F, 3.4047F, 1.0164F, 0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r108 = armorRightArm.addOrReplaceChild("Steve_r108", CubeListBuilder.create().texOffs(2, 19).addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.2165F, 0.7628F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r109 = armorRightArm
				.addOrReplaceChild(
						"Steve_r109", CubeListBuilder.create().texOffs(16, 16).addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 3.875F, 4.75F, new CubeDeformation(0.0F)).texOffs(16, 16)
								.addBox(-2.0F, -7.6875F, -2.0F, 4.0F, 0.375F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(-2.0F, -7.3125F, -2.375F, 4.0F, 4.75F, 4.75F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.0F, 5.5F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Steve_r110 = armorRightArm.addOrReplaceChild("Steve_r110", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0164F, -0.9375F, 0.4535F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0164F, 2.9047F, -1.0164F, -0.7854F, -3.1416F, 0.0F));
		PartDefinition Steve_r111 = armorRightArm.addOrReplaceChild("Steve_r111", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -2.0625F, 1.8447F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7628F, 2.7165F, 0.0F, -0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r112 = armorRightArm.addOrReplaceChild("Steve_r112", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9836F, -0.9375F, 0.4535F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0164F, 2.9047F, -1.0164F, -0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r113 = armorRightArm.addOrReplaceChild("Steve_r113", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -2.0625F, 1.8447F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.7165F, -0.7628F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r114 = armorRightArm.addOrReplaceChild("Steve_r114", CubeListBuilder.create().texOffs(2, 19).addBox(-0.9836F, -0.9375F, -0.9839F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0164F, -1.8453F, 1.0164F, 0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r115 = armorRightArm.addOrReplaceChild("Steve_r115", CubeListBuilder.create().texOffs(2, 19).addBox(-3.0164F, -0.9375F, -0.9839F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0164F, -1.8453F, 1.0164F, 0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r116 = armorRightArm.addOrReplaceChild("Steve_r116", CubeListBuilder.create().texOffs(2, 2).addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7628F, -2.0335F, 0.0F, 0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r117 = armorRightArm.addOrReplaceChild("Steve_r117", CubeListBuilder.create().texOffs(2, 19).mirror().addBox(-2.0F, -2.0625F, -2.375F, 4.0F, 0.4375F, 0.5303F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -2.0335F, 0.7628F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r118 = armorRightArm.addOrReplaceChild(
				"Steve_r118", CubeListBuilder.create().texOffs(104, 83).addBox(1.2214F, -0.093F, 0.9818F, 0.56F, 0.832F, 0.7837F, new CubeDeformation(0.0F)).texOffs(78, 79)
						.addBox(1.2214F, -1.968F, 0.9818F, 0.56F, 0.832F, 0.0F, new CubeDeformation(0.0F)).texOffs(105, 78).addBox(1.2214F, -1.968F, 0.9818F, 0.56F, 0.832F, 0.7837F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0625F, 6.2395F, -2.1858F, 0.0F, -2.3562F, 0.0F));
		PartDefinition Steve_r119 = armorRightArm.addOrReplaceChild(
				"Steve_r119", CubeListBuilder.create().texOffs(104, 83).addBox(-2.112F, -0.093F, 2.117F, 4.224F, 0.832F, 0.391F, new CubeDeformation(0.0F)).texOffs(78, 79)
						.addBox(-2.112F, -1.968F, 2.117F, 4.224F, 0.832F, 0.0F, new CubeDeformation(0.0F)).texOffs(105, 78).addBox(-2.112F, -1.968F, 2.117F, 4.224F, 0.832F, 0.391F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0625F, 6.2395F, -0.0625F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Steve_r120 = armorRightArm.addOrReplaceChild("Steve_r120", CubeListBuilder.create().texOffs(72, 73).addBox(-2.112F, -1.593F, -2.508F, 4.224F, 3.582F, 5.016F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.4895F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Steve_r121 = armorRightArm.addOrReplaceChild("Steve_r121", CubeListBuilder.create().texOffs(72, 73).addBox(1.2214F, -1.593F, -4.7682F, 0.56F, 3.582F, 6.5337F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.4895F, -2.1233F, 0.0F, -2.3562F, 0.0F));
		PartDefinition Steve_r122 = armorRightArm.addOrReplaceChild("Steve_r122", CubeListBuilder.create().texOffs(72, 73).addBox(-1.7814F, -1.593F, -4.7682F, 0.56F, 3.582F, 6.5337F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.4895F, 2.1233F, 0.0F, -0.7854F, 0.0F));
		PartDefinition armorLeftLeg = partdefinition.addOrReplaceChild("armorLeftLeg",
				CubeListBuilder.create().texOffs(4, 4).addBox(-1.8992F, 0.6269F, -2.3741F, 3.9984F, 4.0606F, 4.7481F, new CubeDeformation(0.0F)).texOffs(4, 4).addBox(-1.8992F, 5.3769F, -2.3741F, 3.9984F, 3.6231F, 4.7481F, new CubeDeformation(0.0F))
						.texOffs(99, 43).addBox(-1.9792F, 2.1794F, -2.469F, 4.1583F, 1.018F, 4.938F, new CubeDeformation(0.0F)).texOffs(76, 48).addBox(-0.2917F, 2.1378F, -2.5107F, 0.25F, 0.1014F, 0.1667F, new CubeDeformation(0.0F)).texOffs(76, 48)
						.addBox(-0.0417F, 2.1378F, -2.5107F, 0.2833F, 1.1014F, 0.1667F, new CubeDeformation(0.0F)).texOffs(108, 47).addBox(-0.1667F, 2.2419F, -2.5523F, 0.1375F, 0.893F, 0.0833F, new CubeDeformation(0.0F)).texOffs(75, 49)
						.addBox(-0.2917F, 3.1378F, -2.5107F, 0.25F, 0.1014F, 0.1667F, new CubeDeformation(0.0F)).texOffs(75, 49).addBox(0.2417F, 2.2419F, -2.5107F, 0.5417F, 0.893F, 0.1667F, new CubeDeformation(0.0F)).texOffs(75, 49)
						.addBox(0.7708F, 2.1378F, -2.5107F, 0.2833F, 1.1014F, 0.1667F, new CubeDeformation(0.0F)).texOffs(108, 47).addBox(1.0417F, 2.1794F, -2.5523F, 0.1583F, 1.018F, 0.0833F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition Steve_r123 = armorLeftLeg.addOrReplaceChild("Steve_r123", CubeListBuilder.create().texOffs(5, 5).mirror().addBox(-1.9992F, -5.0941F, -2.124F, 3.9984F, 1.0F, 4.2481F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 4.7816F, 0.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Steve_r124 = armorLeftLeg.addOrReplaceChild("Steve_r124", CubeListBuilder.create().texOffs(105, 44).addBox(1.2024F, -0.7691F, -4.6941F, 0.5513F, 1.018F, 6.4321F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 2.9486F, 2.0903F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Steve_r125 = armorLeftLeg.addOrReplaceChild("Steve_r125",
				CubeListBuilder.create().texOffs(80, 75).addBox(1.3993F, -2.2447F, -0.4601F, 0.1287F, 0.0812F, 0.4872F, new CubeDeformation(0.0F)).texOffs(76, 78)
						.addBox(-0.9284F, -2.4071F, -0.4601F, 2.4564F, 0.1624F, 0.4872F, new CubeDeformation(0.0F)).texOffs(7, 79).addBox(-0.9013F, -2.2447F, -0.4331F, 2.4023F, 0.9978F, 0.4331F, new CubeDeformation(0.0F)).texOffs(77, 75)
						.addBox(-0.9284F, -2.2447F, -0.4601F, 0.1287F, 0.0812F, 0.4872F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9299F, 3.0284F, 0.2998F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r126 = armorLeftLeg.addOrReplaceChild("Steve_r126", CubeListBuilder.create().texOffs(104, 50).addBox(-0.1521F, -0.3055F, -0.1721F, 0.3041F, 0.6111F, 0.3443F, new CubeDeformation(0.0F)).texOffs(104, 50).addBox(-0.1521F,
				1.1561F, -0.1721F, 0.3041F, 0.6111F, 0.3443F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7867F, 2.2976F, 1.2569F, 0.0F, -2.3562F, 0.0F));
		PartDefinition Steve_r127 = armorLeftLeg.addOrReplaceChild("Steve_r127", CubeListBuilder.create().texOffs(74, 48).addBox(-0.1435F, -1.5139F, -0.1624F, 0.2869F, 3.0278F, 0.3248F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7827F, 3.0284F, 1.1858F, 0.0F, -2.3562F, 0.0F));
		PartDefinition Steve_r128 = armorLeftLeg.addOrReplaceChild("Steve_r128", CubeListBuilder.create().texOffs(109, 48).addBox(0.6656F, -0.3055F, -0.1721F, 0.3041F, 0.6111F, 0.3443F, new CubeDeformation(0.0F)).texOffs(109, 48).addBox(0.6656F,
				-1.7671F, -0.1721F, 0.3041F, 0.6111F, 0.3443F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2085F, 3.7592F, -1.8351F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Steve_r129 = armorLeftLeg.addOrReplaceChild("Steve_r129", CubeListBuilder.create().texOffs(109, 48).addBox(-1.4862F, -0.1043F, 3.1133F, 2.9724F, 0.6111F, 0.4591F, new CubeDeformation(0.0F)).texOffs(109, 48).addBox(-1.4862F,
				-1.5659F, 3.1133F, 2.9724F, 0.6111F, 0.4591F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7714F, 3.5579F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r130 = armorLeftLeg.addOrReplaceChild("Steve_r130", CubeListBuilder.create().texOffs(109, 48).addBox(-1.4964F, -0.3055F, -0.1435F, 2.5423F, 0.6111F, 0.3156F, new CubeDeformation(0.0F)).texOffs(109, 48).addBox(-1.4964F,
				-1.7671F, -0.1435F, 2.5423F, 0.6111F, 0.3156F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8438F, 3.7592F, -0.2252F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r131 = armorLeftLeg.addOrReplaceChild("Steve_r131", CubeListBuilder.create().texOffs(73, 46).addBox(-1.4117F, -1.5139F, -0.1353F, 2.3984F, 3.0278F, 0.2977F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8365F, 3.0284F, -0.2125F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r132 = armorLeftLeg.addOrReplaceChild("Steve_r132", CubeListBuilder.create().texOffs(73, 46).addBox(-1.4021F, -1.3241F, 2.9371F, 2.8041F, 3.0278F, 0.4331F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5741F, 2.8385F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r133 = armorLeftLeg.addOrReplaceChild("Steve_r133", CubeListBuilder.create().texOffs(73, 46).addBox(0.6279F, -1.5139F, -0.1624F, 0.2869F, 3.0278F, 0.3248F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2372F, 3.0284F, -1.7312F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Steve_r134 = armorLeftLeg.addOrReplaceChild("Steve_r134", CubeListBuilder.create().texOffs(103, 46).addBox(-2.0792F, -0.7691F, -2.469F, 4.1583F, 1.018F, 4.938F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 2.9486F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r135 = armorLeftLeg.addOrReplaceChild("Steve_r135", CubeListBuilder.create().texOffs(103, 46).addBox(-1.7537F, -0.7691F, -4.6941F, 0.5513F, 1.018F, 6.4321F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 2.9486F, -2.0903F, 0.0F, 2.3562F, 0.0F));
		PartDefinition Steve_r136 = armorLeftLeg.addOrReplaceChild("Steve_r136", CubeListBuilder.create().texOffs(85, 48).addBox(-0.0625F, -0.1444F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3512F, 3.1261F, -2.4273F, 0.0F, 0.0F, 1.1781F));
		PartDefinition Steve_r137 = armorLeftLeg.addOrReplaceChild("Steve_r137", CubeListBuilder.create().texOffs(85, 48).addBox(-0.0625F, -0.1444F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6613F, 3.1261F, -2.4273F, 0.0F, 0.0F, 1.9635F));
		PartDefinition Steve_r138 = armorLeftLeg.addOrReplaceChild("Steve_r138", CubeListBuilder.create().texOffs(75, 49).addBox(-0.2708F, -0.4465F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.462F, 2.5589F, -2.4273F, 0.0F, 0.0F, 1.1781F));
		PartDefinition Steve_r139 = armorLeftLeg.addOrReplaceChild("Steve_r139", CubeListBuilder.create().texOffs(75, 49).addBox(-0.0625F, -0.1444F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3512F, 2.2508F, -2.4273F, 0.0F, 0.0F, 1.9635F));
		PartDefinition Steve_r140 = armorLeftLeg.addOrReplaceChild("Steve_r140", CubeListBuilder.create().texOffs(0, 18).addBox(-1.9992F, -2.0617F, -2.3741F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.406F, 0.7625F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r141 = armorLeftLeg.addOrReplaceChild("Steve_r141", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9992F, -2.0617F, -2.3741F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8625F, 0.406F, 0.0F, 0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r142 = armorLeftLeg.addOrReplaceChild("Steve_r142", CubeListBuilder.create().texOffs(0, 18).addBox(-0.9832F, -0.9371F, -0.9835F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.116F, 0.5941F, 1.016F, 0.7854F, -3.1416F, 0.0F));
		PartDefinition Steve_r143 = armorLeftLeg.addOrReplaceChild("Steve_r143", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0152F, -0.9371F, -0.9835F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.116F, 0.5941F, 1.016F, 0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r144 = armorLeftLeg.addOrReplaceChild("Steve_r144", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9992F, -2.0617F, 1.8439F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8625F, 8.781F, 0.0F, -0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r145 = armorLeftLeg.addOrReplaceChild("Steve_r145", CubeListBuilder.create().texOffs(0, 17).addBox(-0.9832F, -0.9371F, 0.4534F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.116F, 8.9691F, -1.016F, -0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r146 = armorLeftLeg.addOrReplaceChild("Steve_r146", CubeListBuilder.create().texOffs(0, 17).addBox(-3.0152F, -0.9371F, 0.4534F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.116F, 8.9691F, -1.016F, -0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r147 = armorLeftLeg.addOrReplaceChild("Steve_r147", CubeListBuilder.create().texOffs(0, 17).addBox(-1.9992F, -2.0617F, 1.8439F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 8.781F, -0.7625F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r148 = armorLeftLeg.addOrReplaceChild("Steve_r148", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9992F, -2.0617F, -2.3741F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8625F, 5.156F, 0.0F, 0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r149 = armorLeftLeg.addOrReplaceChild("Steve_r149", CubeListBuilder.create().texOffs(0, 18).addBox(-0.9832F, -0.9371F, -0.9835F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.116F, 5.3441F, 1.016F, 0.7854F, -3.1416F, 0.0F));
		PartDefinition Steve_r150 = armorLeftLeg.addOrReplaceChild("Steve_r150", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0152F, -0.9371F, -0.9835F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.116F, 5.3441F, 1.016F, 0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r151 = armorLeftLeg.addOrReplaceChild("Steve_r151", CubeListBuilder.create().texOffs(0, 18).addBox(-1.9992F, -2.0617F, -2.3741F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 5.156F, 0.7625F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r152 = armorLeftLeg.addOrReplaceChild("Steve_r152",
				CubeListBuilder.create().texOffs(6, 6).addBox(1.1562F, -2.0617F, -4.5136F, 0.5301F, 3.6231F, 6.1847F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(1.1562F, -6.8117F, -4.5136F, 0.5301F, 4.0606F, 6.1847F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 7.4386F, 2.0099F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Steve_r153 = armorLeftLeg.addOrReplaceChild("Steve_r153", CubeListBuilder.create().texOffs(6, 6).addBox(-1.6863F, -2.0617F, -4.5136F, 0.5301F, 3.6231F, 6.1847F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-1.6863F,
				-6.8117F, -4.5136F, 0.5301F, 4.0606F, 6.1847F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 7.4386F, -2.0099F, 0.0F, 2.3562F, 0.0F));
		PartDefinition Steve_r154 = armorLeftLeg.addOrReplaceChild("Steve_r154", CubeListBuilder.create().texOffs(4, 4).addBox(-1.9992F, -2.0617F, -2.3741F, 3.9984F, 3.6231F, 4.7481F, new CubeDeformation(0.0F)).texOffs(4, 4).addBox(-1.9992F,
				-6.8117F, -2.3741F, 3.9984F, 4.0606F, 4.7481F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 7.4386F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Steve_r155 = armorLeftLeg.addOrReplaceChild("Steve_r155", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9992F, -2.0617F, 1.8439F, 3.9984F, 0.4998F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8625F, 4.4666F, 0.0F, -0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r156 = armorLeftLeg.addOrReplaceChild("Steve_r156", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9832F, -0.9371F, 0.4534F, 3.9984F, 0.4998F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.116F, 4.6547F, -1.016F, -0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r157 = armorLeftLeg.addOrReplaceChild("Steve_r157", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0152F, -0.9371F, 0.4534F, 3.9984F, 0.4998F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.116F, 4.6547F, -1.016F, -0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r158 = armorLeftLeg.addOrReplaceChild("Steve_r158", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9992F, -2.0617F, 1.8439F, 3.9984F, 0.4998F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 4.4666F, -0.7625F, -0.7854F, 0.0F, 0.0F));
		PartDefinition armorRightLeg = partdefinition.addOrReplaceChild("armorRightLeg",
				CubeListBuilder.create().texOffs(107, 45).addBox(0.1125F, 2.5128F, -2.5523F, 0.1583F, 0.5389F, 0.0833F, new CubeDeformation(0.0F)).texOffs(75, 46)
						.addBox(0.0708F, 2.4503F, -2.5107F, 0.1875F, 0.0597F, 0.1667F, new CubeDeformation(0.0F)).texOffs(75, 46).addBox(0.2583F, 2.4503F, -2.5107F, 0.2208F, 0.6639F, 0.1667F, new CubeDeformation(0.0F)).texOffs(107, 47)
						.addBox(0.9667F, 2.5544F, -2.5523F, 0.1375F, 0.4555F, 0.0833F, new CubeDeformation(0.0F)).texOffs(78, 47).addBox(0.4667F, 2.5544F, -2.5107F, 0.3542F, 0.4555F, 0.1667F, new CubeDeformation(0.0F)).texOffs(78, 47)
						.addBox(0.8208F, 2.4503F, -2.5107F, 0.1583F, 0.6639F, 0.1667F, new CubeDeformation(0.0F)).texOffs(78, 47).addBox(0.9792F, 3.0128F, -2.5107F, 0.25F, 0.1014F, 0.1667F, new CubeDeformation(0.0F)).texOffs(78, 47)
						.addBox(0.9792F, 2.4503F, -2.5107F, 0.25F, 0.1014F, 0.1667F, new CubeDeformation(0.0F)).texOffs(78, 47).addBox(0.0708F, 3.0544F, -2.5107F, 0.1875F, 0.0597F, 0.1667F, new CubeDeformation(0.0F)).texOffs(77, 47)
						.addBox(0.0708F, 3.5753F, -2.5107F, 0.1875F, 0.0597F, 0.1667F, new CubeDeformation(0.0F)).texOffs(116, 50).addBox(0.1125F, 3.6378F, -2.5523F, 0.1583F, 0.5389F, 0.0833F, new CubeDeformation(0.0F)).texOffs(77, 53)
						.addBox(0.4667F, 3.6794F, -2.5107F, 0.3542F, 0.4555F, 0.1667F, new CubeDeformation(0.0F)).texOffs(77, 53).addBox(0.2583F, 3.5753F, -2.5107F, 0.2208F, 0.6639F, 0.1667F, new CubeDeformation(0.0F)).texOffs(77, 53)
						.addBox(0.8208F, 3.5753F, -2.5107F, 0.1583F, 0.6639F, 0.1667F, new CubeDeformation(0.0F)).texOffs(77, 53).addBox(0.9792F, 3.5753F, -2.5107F, 0.25F, 0.1014F, 0.1667F, new CubeDeformation(0.0F)).texOffs(106, 50)
						.addBox(0.9667F, 3.6794F, -2.5523F, 0.1375F, 0.4555F, 0.0833F, new CubeDeformation(0.0F)).texOffs(78, 46).addBox(0.9792F, 4.1378F, -2.5107F, 0.25F, 0.1014F, 0.1667F, new CubeDeformation(0.0F)).texOffs(78, 46)
						.addBox(0.0708F, 4.1794F, -2.5107F, 0.1875F, 0.0597F, 0.1667F, new CubeDeformation(0.0F)).texOffs(100, 45).addBox(-2.1792F, 3.6169F, -2.469F, 4.1583F, 0.5805F, 4.938F, new CubeDeformation(0.0F)).texOffs(100, 45)
						.addBox(-2.1792F, 2.4919F, -2.469F, 4.1583F, 0.5805F, 4.938F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition Steve_r159 = armorRightLeg.addOrReplaceChild("Steve_r159", CubeListBuilder.create().texOffs(100, 45).addBox(1.2024F, -0.3316F, -4.6941F, 0.5513F, 0.5805F, 6.4321F, new CubeDeformation(0.0F)).texOffs(100, 45).addBox(1.2024F,
				0.7934F, -4.6941F, 0.5513F, 0.5805F, 6.4321F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.8236F, -2.0903F, 0.0F, -2.3562F, 0.0F));
		PartDefinition Steve_r160 = armorRightLeg.addOrReplaceChild("Steve_r160", CubeListBuilder.create().texOffs(100, 45).addBox(-2.0792F, -0.3316F, -2.469F, 4.1583F, 0.5805F, 4.938F, new CubeDeformation(0.0F)).texOffs(100, 45).addBox(-2.0792F,
				-1.4566F, -2.469F, 4.1583F, 0.5805F, 4.938F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 3.9486F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Steve_r161 = armorRightLeg.addOrReplaceChild("Steve_r161", CubeListBuilder.create().texOffs(100, 45).addBox(-1.7537F, -0.3316F, -4.6941F, 0.5513F, 0.5805F, 6.4321F, new CubeDeformation(0.0F)).texOffs(100, 45).addBox(-1.7537F,
				0.7934F, -4.6941F, 0.5513F, 0.5805F, 6.4321F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.8236F, 2.0903F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Steve_r162 = armorRightLeg.addOrReplaceChild("Steve_r162", CubeListBuilder.create().texOffs(78, 46).addBox(-0.0625F, -0.1444F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5887F, 4.1261F, -2.4273F, 0.0F, 0.0F, -1.9635F));
		PartDefinition Steve_r163 = armorRightLeg.addOrReplaceChild("Steve_r163", CubeListBuilder.create().texOffs(78, 46).addBox(-0.0625F, -0.1444F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7113F, 4.1261F, -2.4273F, 0.0F, 0.0F, -1.1781F));
		PartDefinition Steve_r164 = armorRightLeg.addOrReplaceChild("Steve_r164", CubeListBuilder.create().texOffs(77, 53).addBox(-0.0625F, -0.1444F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7113F, 3.6883F, -2.4273F, 0.0F, 0.0F, -1.9635F));
		PartDefinition Steve_r165 = armorRightLeg.addOrReplaceChild("Steve_r165", CubeListBuilder.create().texOffs(77, 53).addBox(0.1458F, -0.4465F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.788F, 3.9964F, -2.4273F, 0.0F, 0.0F, -1.1781F));
		PartDefinition Steve_r166 = armorRightLeg.addOrReplaceChild("Steve_r166", CubeListBuilder.create().texOffs(78, 47).addBox(-0.0625F, -0.1444F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7113F, 3.0011F, -2.4273F, 0.0F, 0.0F, -1.1781F));
		PartDefinition Steve_r167 = armorRightLeg.addOrReplaceChild("Steve_r167", CubeListBuilder.create().texOffs(78, 47).addBox(-0.0625F, -0.1444F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5887F, 3.0011F, -2.4273F, 0.0F, 0.0F, -1.9635F));
		PartDefinition Steve_r168 = armorRightLeg.addOrReplaceChild("Steve_r168", CubeListBuilder.create().texOffs(75, 46).addBox(-0.0625F, -0.1444F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7113F, 2.5633F, -2.4273F, 0.0F, 0.0F, -1.9635F));
		PartDefinition Steve_r169 = armorRightLeg.addOrReplaceChild("Steve_r169", CubeListBuilder.create().texOffs(75, 46).addBox(0.1458F, -0.4465F, -0.0833F, 0.125F, 0.2889F, 0.1667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.788F, 2.8714F, -2.4273F, 0.0F, 0.0F, -1.1781F));
		PartDefinition Steve_r170 = armorRightLeg.addOrReplaceChild("Steve_r170", CubeListBuilder.create().texOffs(0, 18).addBox(-1.9992F, -4.6165F, 1.2591F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-1.9992F,
				-1.2578F, -2.0997F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, 0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r171 = armorRightLeg.addOrReplaceChild("Steve_r171",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.9992F, -4.6165F, 1.2591F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.9992F, -1.2578F, -2.0997F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, 0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r172 = armorRightLeg.addOrReplaceChild("Steve_r172", CubeListBuilder.create().texOffs(0, 18).addBox(-1.9992F, -4.6165F, 1.2591F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-1.9992F,
				-1.2578F, -2.0997F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, 0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r173 = armorRightLeg.addOrReplaceChild("Steve_r173", CubeListBuilder.create().texOffs(0, 18).addBox(-1.9992F, -4.6165F, 1.2591F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-1.9992F,
				-1.2578F, -2.0997F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r174 = armorRightLeg.addOrReplaceChild("Steve_r174", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9992F, 1.3055F, 4.1328F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(-1.9992F, -1.7452F, 1.0821F, 3.9984F, 0.4998F, 0.5301F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r175 = armorRightLeg.addOrReplaceChild("Steve_r175", CubeListBuilder.create().texOffs(0, 17).addBox(-1.9992F, 1.3055F, 4.1328F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(-1.9992F, -1.7452F, 1.0821F, 3.9984F, 0.4998F, 0.5301F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, -0.7854F, 1.5708F, 0.0F));
		PartDefinition Steve_r176 = armorRightLeg.addOrReplaceChild("Steve_r176", CubeListBuilder.create().texOffs(0, 17).addBox(-1.9992F, 1.3055F, 4.1328F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(-1.9992F, -1.7452F, 1.0821F, 3.9984F, 0.4998F, 0.5301F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, -0.7854F, 3.1416F, 0.0F));
		PartDefinition Steve_r177 = armorRightLeg.addOrReplaceChild("Steve_r177", CubeListBuilder.create().texOffs(0, 17).addBox(-1.9992F, 1.3055F, 4.1328F, 3.9984F, 0.4373F, 0.5301F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(-1.9992F, -1.7452F, 1.0821F, 3.9984F, 0.4998F, 0.5301F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, -0.7854F, -1.5708F, 0.0F));
		PartDefinition Steve_r178 = armorRightLeg.addOrReplaceChild("Steve_r178",
				CubeListBuilder.create().texOffs(6, 6).addBox(-0.2651F, 0.5953F, -3.0924F, 0.5301F, 3.6231F, 6.1847F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.2651F, -4.1547F, -3.0924F, 0.5301F, 4.0606F, 6.1847F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition Steve_r179 = armorRightLeg.addOrReplaceChild("Steve_r179",
				CubeListBuilder.create().texOffs(6, 6).addBox(-0.2651F, 0.5953F, -3.0924F, 0.5301F, 3.6231F, 6.1847F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.2651F, -4.1547F, -3.0924F, 0.5301F, 4.0606F, 6.1847F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, 0.0F, 2.3562F, 0.0F));
		PartDefinition Steve_r180 = armorRightLeg.addOrReplaceChild("Steve_r180",
				CubeListBuilder.create().texOffs(4, 4).addBox(-1.9992F, 0.5953F, -2.374F, 3.9984F, 3.6231F, 4.7481F, new CubeDeformation(0.0F)).texOffs(4, 4).addBox(-1.9992F, -4.1547F, -2.374F, 3.9984F, 4.0606F, 4.7481F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Steve_r181 = armorRightLeg.addOrReplaceChild(
				"Steve_r181", CubeListBuilder.create().texOffs(4, 4).addBox(-1.9992F, 0.5953F, -2.374F, 3.9984F, 3.6231F, 4.7481F, new CubeDeformation(0.0F)).texOffs(5, 5)
						.addBox(-1.9992F, -5.0941F, -2.124F, 3.9984F, 1.0F, 4.2481F, new CubeDeformation(0.0F)).texOffs(4, 4).addBox(-1.9992F, -4.1547F, -2.374F, 3.9984F, 4.0606F, 4.7481F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 4.7816F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition armorLeftBoot = partdefinition.addOrReplaceChild("armorLeftBoot",
				CubeListBuilder.create().texOffs(67, 44).addBox(-2.399F, 11.8971F, -3.3837F, 4.998F, 0.4284F, 5.8904F, new CubeDeformation(0.0F)).texOffs(67, 44).addBox(-2.399F, 10.7096F, 1.9288F, 4.998F, 1.1875F, 0.5779F, new CubeDeformation(0.0F))
						.texOffs(69, 75).addBox(-2.35F, 10.2512F, -3.3824F, 4.9F, 1.65F, 5.77F, new CubeDeformation(0.0F)).texOffs(69, 75).addBox(-2.35F, 8.1262F, -2.3824F, 4.9F, 2.125F, 4.77F, new CubeDeformation(0.0F)).texOffs(12, 75)
						.addBox(-1.6F, 9.7512F, -2.5074F, 3.4F, 0.1719F, 0.125F, new CubeDeformation(0.0F)).texOffs(12, 75).addBox(-1.6F, 8.7929F, -2.5074F, 3.4F, 0.1719F, 0.125F, new CubeDeformation(0.0F)).texOffs(68, 47)
						.addBox(-2.421F, 8.1246F, -2.4482F, 5.042F, 0.42F, 4.9016F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition body_r128 = armorLeftBoot.addOrReplaceChild("body_r128", CubeListBuilder.create().texOffs(12, 75).addBox(-1.7F, -0.0859F, -0.0625F, 3.4F, 0.1719F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 9.358F, -2.4449F, 0.0F, 0.0F, -0.1309F));
		PartDefinition body_r129 = armorLeftBoot.addOrReplaceChild("body_r129", CubeListBuilder.create().texOffs(12, 75).addBox(-1.7F, -0.0859F, -0.0625F, 3.4F, 0.1719F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 9.358F, -2.4449F, 0.0F, 0.0F, 0.1309F));
		PartDefinition body_r130 = armorLeftBoot.addOrReplaceChild("body_r130", CubeListBuilder.create().texOffs(69, 75).addBox(0.63F, -1.16F, 0.21F, 1.82F, 1.65F, 2.52F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7582F, 11.4112F, -4.967F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r131 = armorLeftBoot.addOrReplaceChild("body_r131", CubeListBuilder.create().texOffs(69, 75).addBox(0.63F, -1.16F, -0.2413F, 2.45F, 1.65F, 2.9713F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3444F, 11.4112F, -6.3405F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body_r132 = armorLeftBoot.addOrReplaceChild("body_r132", CubeListBuilder.create().texOffs(69, 75).addBox(0.63F, -1.16F, 0.21F, 1.82F, 1.65F, 2.52F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8873F, 11.4112F, -6.1457F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r133 = armorLeftBoot.addOrReplaceChild("body_r133",
				CubeListBuilder.create().texOffs(67, 44).addBox(0.6426F, 0.4998F, 0.2142F, 1.8564F, 0.4284F, 2.5704F, new CubeDeformation(0.0F)).texOffs(67, 44).addBox(0.6426F, -0.0002F, 0.2142F, 1.8564F, 0.5F, 0.9454F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9271F, 11.3972F, -6.2023F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r134 = armorLeftBoot.addOrReplaceChild("body_r134",
				CubeListBuilder.create().texOffs(67, 44).addBox(0.6426F, 0.4998F, -0.2461F, 2.499F, 0.4284F, 3.0307F, new CubeDeformation(0.0F)).texOffs(67, 44).addBox(0.6426F, -0.0002F, -0.2461F, 2.499F, 0.5F, 3.0307F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3692F, 11.3972F, -6.4011F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body_r135 = armorLeftBoot.addOrReplaceChild("body_r135",
				CubeListBuilder.create().texOffs(67, 44).addBox(0.6426F, -0.0002F, 0.2142F, 1.8564F, 0.5F, 0.9454F, new CubeDeformation(0.0F)).texOffs(67, 44).addBox(0.6426F, 0.4998F, 0.2142F, 1.8564F, 0.4284F, 2.5704F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7754F, 11.3972F, -5.0001F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r136 = armorLeftBoot.addOrReplaceChild("body_r136",
				CubeListBuilder.create().texOffs(67, 44).addBox(-2.499F, -0.0521F, 0.2889F, 4.998F, 0.5833F, 0.3333F, new CubeDeformation(0.0F)).texOffs(67, 44).addBox(-2.499F, -0.5938F, -0.2889F, 4.998F, 1.6667F, 0.5779F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 11.3337F, 1.7132F, -0.7854F, 0.0F, 0.0F));
		PartDefinition armorRightBoot = partdefinition.addOrReplaceChild("armorRightBoot",
				CubeListBuilder.create().texOffs(70, 44).mirror().addBox(-2.599F, 11.8971F, -3.3837F, 4.998F, 0.4284F, 5.8904F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 44).mirror()
						.addBox(-2.599F, 10.7096F, 1.9288F, 4.998F, 1.1875F, 0.5779F, new CubeDeformation(0.0F)).mirror(false).texOffs(69, 74).mirror().addBox(-2.55F, 10.2512F, -3.3824F, 4.9F, 1.65F, 5.77F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(69, 74).mirror().addBox(-2.55F, 8.1262F, -2.3824F, 4.9F, 2.125F, 4.77F, new CubeDeformation(0.0F)).mirror(false).texOffs(17, 75).mirror()
						.addBox(-1.8F, 9.7512F, -2.5074F, 3.4F, 0.1719F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(17, 75).mirror().addBox(-1.8F, 8.7929F, -2.5074F, 3.4F, 0.1719F, 0.125F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(68, 43).mirror().addBox(-2.621F, 8.1246F, -2.4482F, 5.042F, 0.42F, 4.9016F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition body_r137 = armorRightBoot.addOrReplaceChild("body_r137", CubeListBuilder.create().texOffs(17, 75).mirror().addBox(-1.7F, -0.0859F, -0.0625F, 3.4F, 0.1719F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1F, 9.358F, -2.4449F, 0.0F, 0.0F, 0.1309F));
		PartDefinition body_r138 = armorRightBoot.addOrReplaceChild("body_r138", CubeListBuilder.create().texOffs(17, 75).mirror().addBox(-1.7F, -0.0859F, -0.0625F, 3.4F, 0.1719F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1F, 9.358F, -2.4449F, 0.0F, 0.0F, -0.1309F));
		PartDefinition body_r139 = armorRightBoot.addOrReplaceChild("body_r139", CubeListBuilder.create().texOffs(69, 74).mirror().addBox(-2.45F, -1.16F, 0.21F, 1.82F, 1.65F, 2.52F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.7582F, 11.4112F, -4.967F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r140 = armorRightBoot.addOrReplaceChild("body_r140", CubeListBuilder.create().texOffs(69, 74).mirror().addBox(-3.08F, -1.16F, -0.2413F, 2.45F, 1.65F, 2.9713F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3444F, 11.4112F, -6.3405F, 0.0F, 1.5708F, 0.0F));
		PartDefinition body_r141 = armorRightBoot.addOrReplaceChild("body_r141", CubeListBuilder.create().texOffs(69, 74).mirror().addBox(-2.45F, -1.16F, 0.21F, 1.82F, 1.65F, 2.52F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8873F, 11.4112F, -6.1457F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r142 = armorRightBoot.addOrReplaceChild("body_r142", CubeListBuilder.create().texOffs(70, 44).mirror().addBox(-2.499F, 0.4998F, 0.2142F, 1.8564F, 0.4284F, 2.5704F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 44)
				.mirror().addBox(-2.499F, -0.0002F, 0.2142F, 1.8564F, 0.5F, 0.9454F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9271F, 11.3972F, -6.2023F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r143 = armorRightBoot.addOrReplaceChild("body_r143", CubeListBuilder.create().texOffs(70, 44).mirror().addBox(-3.1416F, 0.4998F, -0.2461F, 2.499F, 0.4284F, 3.0307F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 44)
				.mirror().addBox(-3.1416F, -0.0002F, -0.2461F, 2.499F, 0.5F, 3.0307F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3692F, 11.3972F, -6.4011F, 0.0F, 1.5708F, 0.0F));
		PartDefinition body_r144 = armorRightBoot.addOrReplaceChild("body_r144", CubeListBuilder.create().texOffs(70, 44).mirror().addBox(-2.499F, -0.0002F, 0.2142F, 1.8564F, 0.5F, 0.9454F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 44)
				.mirror().addBox(-2.499F, 0.4998F, 0.2142F, 1.8564F, 0.4284F, 2.5704F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7754F, 11.3972F, -5.0001F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r145 = armorRightBoot.addOrReplaceChild("body_r145", CubeListBuilder.create().texOffs(70, 44).mirror().addBox(-2.499F, -0.0521F, 0.2889F, 4.998F, 0.5833F, 0.3333F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 44)
				.mirror().addBox(-2.499F, -0.5938F, -0.2889F, 4.998F, 1.6667F, 0.5779F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 11.3337F, 1.7132F, -0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armorHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorLeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
