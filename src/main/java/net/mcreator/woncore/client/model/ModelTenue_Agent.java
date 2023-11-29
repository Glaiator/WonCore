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
public class ModelTenue_Agent<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("woncore", "model_tenue_agent"), "main");
	public final ModelPart Helmet;
	public final ModelPart Body;
	public final ModelPart RighArm;
	public final ModelPart LeftArm;
	public final ModelPart rightleg;
	public final ModelPart leftleg;
	public final ModelPart RightBoot;
	public final ModelPart Leftboot;

	public ModelTenue_Agent(ModelPart root) {
		this.Helmet = root.getChild("Helmet");
		this.Body = root.getChild("Body");
		this.RighArm = root.getChild("RighArm");
		this.LeftArm = root.getChild("LeftArm");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.RightBoot = root.getChild("RightBoot");
		this.Leftboot = root.getChild("Leftboot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Steve_r1 = Helmet.addOrReplaceChild("Steve_r1", CubeListBuilder.create().texOffs(106, 79).mirror().addBox(4.6628F, -15.3331F, -0.2848F, 0.3573F, 0.1072F, 0.405F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 79)
				.mirror().addBox(4.6628F, -15.3331F, 1.4304F, 0.3573F, 0.1072F, 0.405F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 79).mirror().addBox(4.5913F, -15.2259F, 1.3947F, 0.4764F, 0.131F, 0.4764F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(106, 79).mirror().addBox(4.6628F, -15.3331F, 0.5728F, 0.3573F, 0.1072F, 0.405F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 79).mirror()
				.addBox(4.5913F, -15.2259F, 0.5371F, 0.4764F, 0.131F, 0.4764F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 79).mirror().addBox(4.5913F, -15.2259F, -0.3205F, 0.4764F, 0.131F, 0.4764F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 79).mirror().addBox(4.5913F, -15.8095F, -0.3205F, 0.4764F, 0.4764F, 0.4764F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 79).mirror()
				.addBox(4.5913F, -15.8095F, 0.5371F, 0.4764F, 0.4764F, 0.4764F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 79).mirror().addBox(4.5913F, -15.8095F, 1.3947F, 0.4764F, 0.4764F, 0.4764F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 78).mirror().addBox(4.639F, -17.2933F, 1.4423F, 0.3811F, 0.6806F, 0.3812F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 78).mirror()
				.addBox(4.639F, -16.6127F, 1.4423F, 0.3811F, 0.9937F, 0.3812F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 78).mirror().addBox(4.6866F, -17.6778F, 1.4662F, 0.2859F, 0.4526F, 0.3216F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 78).mirror().addBox(4.6866F, -17.6778F, 0.6086F, 0.2859F, 0.4526F, 0.3216F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 78).mirror()
				.addBox(4.639F, -17.2933F, 0.5847F, 0.3811F, 0.6806F, 0.3811F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 78).mirror().addBox(4.639F, -16.6127F, 0.5847F, 0.3811F, 0.9937F, 0.3811F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 78).mirror().addBox(4.639F, -17.2933F, -0.2728F, 0.3811F, 0.6806F, 0.3812F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 78).mirror()
				.addBox(4.639F, -16.6127F, -0.2728F, 0.3811F, 0.9937F, 0.3812F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 78).mirror().addBox(4.6866F, -17.6778F, -0.249F, 0.2859F, 0.4526F, 0.3216F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 87).mirror().addBox(4.6866F, -17.6778F, 2.3237F, 0.2859F, 0.4526F, 0.3216F, new CubeDeformation(0.0F)).mirror(false).texOffs(115, 82).mirror()
				.addBox(4.5913F, -15.2259F, 2.2523F, 0.4764F, 0.131F, 0.4764F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 78).mirror().addBox(4.6628F, -15.3331F, 2.288F, 0.3573F, 0.1072F, 0.405F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 81).mirror().addBox(4.5913F, -15.8095F, 2.2523F, 0.4764F, 0.4764F, 0.4764F, new CubeDeformation(0.0F)).mirror(false).texOffs(117, 77).mirror()
				.addBox(4.639F, -17.2933F, 2.2999F, 0.3811F, 0.6806F, 0.3812F, new CubeDeformation(0.0F)).mirror(false).texOffs(108, 76).mirror().addBox(4.639F, -16.6127F, 2.2999F, 0.3811F, 0.9937F, 0.3812F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 18).mirror().addBox(-5.4979F, -14.4133F, 1.7261F, 10.4762F, 0.8494F, 2.8845F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 48).mirror()
				.addBox(-5.2148F, -15.2464F, 1.7261F, 9.9099F, 0.8494F, 2.6898F, new CubeDeformation(0.0F)).mirror(false).texOffs(97, 43).mirror().addBox(-0.2901F, -18.6441F, -4.503F, 4.5605F, 0.4247F, 9.0605F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(97, 44).mirror().addBox(-4.7901F, -18.6441F, -4.503F, 4.5605F, 0.4247F, 9.0605F, new CubeDeformation(0.0F)).mirror(false).texOffs(77, 14).mirror()
				.addBox(4.0989F, -15.2628F, -4.4765F, 0.8794F, 0.8494F, 0.2301F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 14).addBox(4.6985F, -16.5293F, 2.2523F, 0.3692F, 0.3931F, 0.4764F, new CubeDeformation(0.0F)).texOffs(76, 13)
				.addBox(4.6985F, -16.5293F, 0.5371F, 0.3692F, 0.3931F, 0.4764F, new CubeDeformation(0.0F)).texOffs(80, 17).addBox(4.6985F, -16.5293F, 1.3947F, 0.3692F, 0.3931F, 0.4764F, new CubeDeformation(0.0F)).texOffs(73, 15)
				.addBox(4.6985F, -16.5293F, -0.3205F, 0.3692F, 0.3931F, 0.4764F, new CubeDeformation(0.0F)).texOffs(66, 13).addBox(3.9409F, -16.5344F, -4.4117F, 0.7974F, 0.4084F, 8.8651F, new CubeDeformation(0.0F)).texOffs(104, 41).mirror()
				.addBox(3.9056F, -18.2194F, -4.3614F, 0.7895F, 3.1411F, 8.7773F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 13).mirror().addBox(3.5625F, -15.2628F, -5.2109F, 0.6813F, 0.8494F, 0.9801F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(99, 42).mirror().addBox(3.4264F, -16.379F, -4.9277F, 0.7024F, 1.1162F, 9.4852F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 10).mirror()
				.addBox(-4.7105F, -14.4133F, 4.4159F, 8.8924F, 0.8494F, 0.991F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 14).addBox(-4.6988F, -16.5344F, 4.5964F, 8.8651F, 0.4084F, 0.429F, new CubeDeformation(0.0F)).texOffs(101, 46)
				.mirror().addBox(-4.6485F, -18.2194F, 4.5575F, 8.7773F, 3.9422F, 0.4247F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 14).mirror().addBox(-2.5515F, -15.9667F, -5.2109F, 4.5835F, 0.8455F, 1.1217F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(69, 15).addBox(-4.6988F, -16.5344F, -4.9836F, 8.8651F, 0.4084F, 0.5719F, new CubeDeformation(0.0F)).texOffs(101, 47).mirror()
				.addBox(-4.6485F, -18.2194F, -4.9277F, 8.7773F, 2.325F, 0.5663F, new CubeDeformation(0.0F)).mirror(false).texOffs(103, 46).mirror().addBox(-4.1556F, -12.1419F, 4.6199F, 0.4492F, 5.3906F, 0.2695F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(106, 43).mirror().addBox(-3.347F, -11.9622F, 4.6199F, 0.4492F, 3.5937F, 0.2695F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 46).mirror()
				.addBox(-4.0658F, -12.3216F, 4.2605F, 1.0781F, 1.0781F, 0.3594F, new CubeDeformation(0.0F)).mirror(false).texOffs(112, 53).mirror().addBox(3.9602F, -11.3355F, 3.2744F, 0.2722F, 0.6976F, 1.2166F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(107, 43).mirror().addBox(4.0793F, -11.1908F, -4.221F, 0.1531F, 2.4332F, 2.3652F, new CubeDeformation(0.0F)).mirror(false).texOffs(111, 44).mirror()
				.addBox(4.0793F, -11.1908F, -4.4932F, 0.1531F, 3.2074F, 0.2723F, new CubeDeformation(0.0F)).mirror(false).texOffs(98, 46).mirror().addBox(-4.7518F, -12.2798F, 0.2408F, 8.9843F, 0.9529F, 4.2503F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(98, 46).mirror().addBox(-4.7518F, -12.2798F, -4.221F, 8.9843F, 1.089F, 4.4618F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 45).mirror()
				.addBox(-4.7518F, -12.2798F, -4.4932F, 8.9843F, 3.1309F, 0.2723F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, 0.0F, 0.0F));
		PartDefinition Steve_r2 = Helmet.addOrReplaceChild("Steve_r2",
				CubeListBuilder.create().texOffs(15, 11).mirror().addBox(-0.249F, 14.2777F, -8.5498F, 0.3216F, 0.2021F, 0.2021F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 11).mirror()
						.addBox(0.6086F, 14.2777F, -8.5498F, 0.3216F, 0.2021F, 0.2021F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 11).mirror().addBox(1.4662F, 14.2777F, -8.5498F, 0.3216F, 0.2021F, 0.2021F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(112, 77).mirror().addBox(2.3237F, 14.2777F, -8.5498F, 0.3216F, 0.2021F, 0.2021F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, -1.5708F, -2.3562F));
		PartDefinition Steve_r3 = Helmet.addOrReplaceChild("Steve_r3", CubeListBuilder.create().texOffs(71, 11).addBox(4.0991F, -14.5303F, -6.2027F, 0.8794F, 0.8494F, 6.1494F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, -0.1396F, 0.0F, 0.0F));
		PartDefinition Steve_r4 = Helmet.addOrReplaceChild("Steve_r4",
				CubeListBuilder.create().texOffs(67, 13).mirror().addBox(-5.4979F, -14.5303F, -6.2027F, 0.8794F, 0.8494F, 6.1494F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 46).mirror()
						.addBox(0.1852F, -15.6357F, -6.2961F, 4.5099F, 1.2578F, 6.0875F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 46).mirror().addBox(-5.2148F, -15.6357F, -6.2961F, 5.4099F, 1.2578F, 6.0875F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, -0.1396F, 0.0F, 0.0F));
		PartDefinition Steve_r5 = Helmet.addOrReplaceChild("Steve_r5",
				CubeListBuilder.create().texOffs(76, 17).mirror().addBox(-7.1517F, -14.4133F, -0.6236F, 0.8494F, 0.8494F, 1.1237F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 14)
						.addBox(-0.6074F, -16.5344F, 5.7604F, 0.8088F, 0.4084F, 0.7391F, new CubeDeformation(0.0F)).texOffs(111, 46).mirror().addBox(-0.6034F, -18.2194F, 5.7107F, 0.8008F, 3.8061F, 0.7318F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Steve_r6 = Helmet.addOrReplaceChild("Steve_r6",
				CubeListBuilder.create().texOffs(80, 14).mirror().addBox(5.9348F, -14.4133F, -0.2561F, 0.8494F, 0.8494F, 1.1237F, new CubeDeformation(0.0F)).mirror(false).texOffs(77, 16).mirror()
						.addBox(-0.5779F, -16.5344F, 6.095F, 0.8088F, 0.4084F, 0.781F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 16).addBox(-0.5779F, -16.5344F, 5.9939F, 0.8088F, 0.4084F, 0.8821F, new CubeDeformation(0.0F))
						.texOffs(113, 42).mirror().addBox(-0.5649F, -18.2194F, 5.9366F, 0.8008F, 3.8061F, 0.8734F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Steve_r7 = Helmet.addOrReplaceChild("Steve_r7", CubeListBuilder.create().texOffs(102, 43).mirror().addBox(-15.9341F, -10.0599F, -4.3614F, 0.5248F, 0.6006F, 8.7773F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Steve_r8 = Helmet.addOrReplaceChild("Steve_r8", CubeListBuilder.create().texOffs(101, 42).mirror().addBox(15.1419F, -10.4274F, -4.3614F, 0.4247F, 0.6006F, 8.7773F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, 0.0F, -0.7854F));
		PartDefinition Steve_r9 = Helmet.addOrReplaceChild("Steve_r9",
				CubeListBuilder.create().texOffs(74, 20).addBox(-5.4977F, -15.2628F, -4.4765F, 0.8794F, 0.8494F, 0.2301F, new CubeDeformation(0.0F)).texOffs(66, 11)
						.addBox(-5.2704F, -16.5344F, -4.4117F, 0.7974F, 0.4084F, 8.8651F, new CubeDeformation(0.0F)).texOffs(104, 43).addBox(-5.2145F, -18.2194F, -4.3614F, 0.7895F, 3.1411F, 8.7773F, new CubeDeformation(0.0F)).texOffs(102, 43)
						.mirror().addBox(-4.6485F, -16.379F, -4.9277F, 0.7024F, 1.1162F, 9.4852F, new CubeDeformation(0.0F)).mirror(false).texOffs(73, 15).mirror()
						.addBox(-4.7636F, -15.2628F, -5.2109F, 0.6813F, 0.8494F, 0.9801F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, 0.0F, 0.0F));
		PartDefinition Steve_r10 = Helmet.addOrReplaceChild("Steve_r10",
				CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-1.7061F, -8.694F, -4.1506F, 0.5445F, 0.4424F, 0.2042F, new CubeDeformation(0.0F)).mirror(false).texOffs(75, 16).mirror()
						.addBox(-1.7061F, -8.694F, -5.1715F, 0.5445F, 0.4424F, 0.2042F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 16).mirror().addBox(-1.1616F, -8.694F, -5.1715F, 0.2042F, 0.4424F, 1.2251F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(81, 15).mirror().addBox(-2.71F, -8.694F, -5.1715F, 1.0039F, 0.4424F, 1.2251F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Steve_r11 = Helmet.addOrReplaceChild("Steve_r11", CubeListBuilder.create().texOffs(100, 43).mirror().addBox(1.8812F, -16.8168F, -4.9277F, 1.9112F, 1.1162F, 9.4852F, new CubeDeformation(0.0F)).mirror(false).texOffs(75, 17)
				.mirror().addBox(1.3998F, -15.7963F, -5.2109F, 2.0085F, 0.8494F, 0.9801F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, 0.0F, -0.3927F));
		PartDefinition Steve_r12 = Helmet.addOrReplaceChild("Steve_r12", CubeListBuilder.create().texOffs(73, 16).mirror().addBox(-3.8885F, -15.5974F, -5.2109F, 2.0085F, 0.8494F, 0.9801F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 41)
				.mirror().addBox(-4.2725F, -16.6179F, -4.9277F, 1.9112F, 1.1162F, 9.4852F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Steve_r13 = Helmet.addOrReplaceChild("Steve_r13", CubeListBuilder.create().texOffs(102, 46).mirror().addBox(-4.1288F, -10.2629F, 14.7869F, 8.7773F, 0.6006F, 0.9441F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, -2.3562F, 0.0F, 3.1416F));
		PartDefinition Steve_r14 = Helmet.addOrReplaceChild("Steve_r14", CubeListBuilder.create().texOffs(105, 48).mirror().addBox(-4.6485F, -10.2244F, 15.2208F, 8.7773F, 0.6006F, 0.5487F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.7854F, 0.0F, 0.0F));
		PartDefinition Steve_r15 = Helmet.addOrReplaceChild("Steve_r15",
				CubeListBuilder.create().texOffs(76, 20).mirror().addBox(-0.3163F, -15.2628F, 6.4883F, 1.0386F, 0.8494F, 0.5647F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 45).mirror()
						.addBox(-0.1974F, -18.2194F, 5.8981F, 0.8008F, 3.0274F, 0.8734F, new CubeDeformation(0.0F)).mirror(false).texOffs(79, 14).addBox(-0.2014F, -16.5344F, 6.1074F, 0.8088F, 0.4084F, 0.7391F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, -3.1416F, -0.7854F, 3.1416F));
		PartDefinition Steve_r16 = Helmet.addOrReplaceChild("Steve_r16",
				CubeListBuilder.create().texOffs(77, 18).mirror().addBox(-0.3548F, -15.2628F, 6.1208F, 1.0386F, 0.8494F, 0.5647F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 15)
						.addBox(-0.2309F, -16.5344F, 5.689F, 0.8088F, 0.4084F, 0.781F, new CubeDeformation(0.0F)).texOffs(108, 44).mirror().addBox(-0.2359F, -18.2194F, 5.6307F, 0.8008F, 3.0274F, 0.7732F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, -3.1416F, 0.7854F, 3.1416F));
		PartDefinition Steve_r17 = Helmet.addOrReplaceChild("Steve_r17", CubeListBuilder.create().texOffs(97, 45).mirror().addBox(-4.7518F, -11.6633F, -3.3926F, 8.9843F, 1.2762F, 4.6368F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Steve_r18 = Helmet.addOrReplaceChild("Steve_r18", CubeListBuilder.create().texOffs(98, 39).mirror().addBox(-4.7518F, -10.878F, -2.1F, 0.1361F, 0.9529F, 8.9672F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.2443F, 0.0F, 0.0F));
		PartDefinition Steve_r19 = Helmet.addOrReplaceChild("Steve_r19", CubeListBuilder.create().texOffs(112, 45).mirror().addBox(10.0185F, -6.4485F, 4.0231F, 0.7518F, 8.7324F, 0.4679F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, 0.0F, -1.4923F));
		PartDefinition Steve_r20 = Helmet.addOrReplaceChild("Steve_r20",
				CubeListBuilder.create().texOffs(105, 46).mirror().addBox(4.0793F, -10.5043F, 4.6924F, 0.1531F, 0.8082F, 1.6675F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 43).mirror()
						.addBox(4.0793F, -11.3126F, 0.7673F, 0.1531F, 1.6165F, 3.9251F, new CubeDeformation(0.0F)).mirror(false).texOffs(102, 42).mirror().addBox(4.0793F, -9.6961F, -1.8956F, 0.1531F, 0.7713F, 8.8341F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.3054F, 0.0F, 0.0F));
		PartDefinition Steve_r21 = Helmet.addOrReplaceChild("Steve_r21", CubeListBuilder.create().texOffs(103, 46).mirror().addBox(-5.7879F, -9.6308F, -4.4932F, 8.9074F, 1.1727F, 0.2723F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2696F, 9.7781F, -0.0963F, 0.0F, 0.0F, 0.1309F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_r1 = Body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(103, 45).mirror().addBox(-2.8865F, -8.2623F, -2.4365F, 1.25F, 1.875F, 4.875F, new CubeDeformation(0.0F)).mirror(false).texOffs(103, 45).mirror()
						.addBox(2.1135F, -8.2623F, -2.4365F, 1.25F, 1.875F, 4.875F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 14).mirror().addBox(2.176F, 2.6127F, -2.499F, 0.3125F, 0.375F, 0.1875F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(72, 14).addBox(-2.0115F, 2.6127F, 2.3135F, 0.3125F, 0.375F, 0.1875F, new CubeDeformation(0.0F)).texOffs(72, 14).mirror().addBox(2.176F, 2.6127F, 2.3135F, 0.3125F, 0.375F, 0.1875F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(72, 14).addBox(-3.8865F, 2.9877F, -2.624F, 0.3125F, 0.875F, 5.25F, new CubeDeformation(0.0F)).texOffs(72, 14).mirror().addBox(4.051F, 2.9877F, -2.624F, 0.3125F, 0.875F, 5.25F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(72, 14).addBox(-2.0115F, 2.9877F, -2.624F, 0.3125F, 0.875F, 5.25F, new CubeDeformation(0.0F)).texOffs(72, 14).mirror().addBox(2.176F, 2.9877F, -2.624F, 0.3125F, 0.875F, 5.25F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(71, 16).mirror().addBox(-0.199F, 2.9721F, 2.251F, 0.875F, 0.8906F, 0.3125F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 16).mirror()
						.addBox(-0.574F, 3.8627F, 2.3135F, 0.5625F, 0.125F, 0.1875F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 16).mirror().addBox(0.4885F, 3.8627F, 2.3135F, 0.5625F, 0.125F, 0.1875F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(71, 16).mirror().addBox(-0.574F, 2.8393F, 2.3135F, 0.5625F, 0.125F, 0.1875F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 16).mirror()
						.addBox(0.4885F, 2.8393F, 2.3135F, 0.5625F, 0.125F, 0.1875F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 16).mirror().addBox(0.926F, 2.9564F, 2.3135F, 0.125F, 0.9063F, 0.1875F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(71, 16).addBox(-0.574F, 2.9564F, 2.3135F, 0.125F, 0.9063F, 0.1875F, new CubeDeformation(0.0F)).texOffs(71, 16).addBox(-0.3865F, 3.0502F, -2.5615F, 1.25F, 0.75F, 0.4375F, new CubeDeformation(0.0F)).texOffs(69, 14)
						.mirror().addBox(5.1135F, 3.0502F, -1.5615F, 0.125F, 0.75F, 3.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(69, 14).addBox(-4.7615F, 3.0502F, -1.5615F, 0.125F, 0.75F, 3.125F, new CubeDeformation(0.0F)).texOffs(69, 14)
						.addBox(-4.2615F, 3.0502F, -2.5615F, 3.875F, 0.75F, 5.125F, new CubeDeformation(0.0F)).texOffs(69, 14).mirror().addBox(0.8635F, 3.0502F, -2.5615F, 3.875F, 0.75F, 5.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(69, 14)
						.addBox(-3.1365F, 2.1127F, -2.6865F, 3.0F, 0.5F, 5.375F, new CubeDeformation(0.0F)).texOffs(69, 14).addBox(-3.1365F, -6.3873F, -2.6865F, 3.0F, 0.5F, 5.375F, new CubeDeformation(0.0F)).texOffs(69, 14).mirror()
						.addBox(0.6135F, 2.1127F, -2.6865F, 3.0F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(69, 14).mirror().addBox(0.6135F, -6.3873F, -2.6865F, 3.0F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(103, 44).mirror().addBox(2.8658F, -5.4865F, -2.8502F, 0.1392F, 0.1266F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(103, 44).mirror()
						.addBox(-2.6534F, -5.4865F, -2.8502F, 0.1392F, 0.1266F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(103, 44).mirror().addBox(-2.8306F, 0.9838F, -2.8502F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(103, 44).mirror().addBox(-2.8306F, -0.1412F, -2.8502F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 14).mirror()
						.addBox(-3.3306F, 1.4838F, 2.5248F, 3.1436F, 0.3598F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 14).mirror().addBox(-3.3306F, 0.2338F, 2.5248F, 3.1436F, 0.3598F, 0.3275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(70, 14).mirror().addBox(-3.3306F, -1.0162F, 2.5248F, 3.1436F, 0.3598F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(102, 46).mirror()
						.addBox(-2.8306F, -1.2662F, -2.8502F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 17).mirror().addBox(-3.3306F, 0.8588F, 2.5248F, 3.1436F, 0.3598F, 0.3275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(76, 17).mirror().addBox(-3.3306F, -0.3912F, 2.5248F, 3.1436F, 0.3598F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 17).mirror()
						.addBox(-3.3306F, -1.6412F, 2.5248F, 3.1436F, 0.3598F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(103, 48).mirror().addBox(-2.8306F, -2.3912F, -2.8502F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(103, 48).mirror().addBox(-2.8306F, -3.5162F, -2.8502F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(103, 48).mirror()
						.addBox(-2.8306F, -4.6412F, -2.8502F, 6.0186F, 0.6098F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(103, 48).mirror().addBox(-2.8306F, -5.36F, -2.8502F, 6.0186F, 0.2036F, 0.3275F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(103, 48).mirror().addBox(-2.5142F, -5.765F, -2.8502F, 5.38F, 0.405F, 0.3275F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 13).mirror()
						.addBox(-4.1679F, -1.2623F, -2.4216F, 8.8127F, 3.375F, 4.8451F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 13).mirror().addBox(-3.3865F, -5.8873F, 2.6885F, 3.375F, 1.5F, 0.25F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(67, 13).mirror().addBox(2.301F, -3.8873F, 2.6885F, 1.4375F, 1.5F, 0.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 13).mirror()
						.addBox(0.8635F, -1.6373F, 2.6885F, 2.875F, 3.625F, 0.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 13).mirror().addBox(-3.1365F, -6.1373F, 2.6885F, 2.875F, 2.0F, 0.25F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(67, 13).mirror().addBox(2.551F, -4.1373F, 2.6885F, 0.9375F, 2.0F, 0.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 13).mirror()
						.addBox(1.1135F, -1.8873F, 2.6885F, 2.375F, 4.125F, 0.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(115, 44).mirror().addBox(0.1369F, -6.0123F, 2.6885F, 0.1875F, 8.2656F, 0.0625F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(109, 45).mirror().addBox(-0.5349F, -3.3717F, 2.8057F, 0.0859F, 0.1875F, 0.0313F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 45).mirror()
						.addBox(-0.5349F, -3.5201F, 2.751F, 0.0859F, 0.1484F, 0.0938F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 45).mirror().addBox(-3.1365F, -3.5123F, 2.751F, 2.75F, 0.125F, 0.0625F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(67, 11).mirror().addBox(-3.2615F, -3.7623F, 2.6885F, 3.0F, 1.75F, 0.0625F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 11).mirror()
						.addBox(-3.6365F, -5.8873F, -2.6865F, 7.75F, 8.0F, 5.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(112, 44).mirror().addBox(0.1135F, -7.0357F, 2.1885F, 0.25F, 2.4609F, 0.125F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(2, 3).mirror().addBox(-4.0115F, -7.0123F, -2.1865F, 8.5F, 11.4375F, 4.375F, new CubeDeformation(0.001F)).mirror(false).texOffs(0, 2).mirror()
						.addBox(-0.3865F, -8.0123F, -2.1865F, 1.25F, 1.0F, 2.75F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror().addBox(-4.0115F, -8.0123F, -2.1865F, 3.625F, 1.0F, 4.375F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 4).mirror().addBox(0.8635F, -8.0123F, -2.1865F, 3.625F, 1.0F, 4.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition body_r2 = Body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(103, 45).addBox(-0.0048F, -8.4043F, -2.4365F, 0.5625F, 2.0625F, 4.875F, new CubeDeformation(0.0F)).texOffs(109, 45).mirror()
				.addBox(0.3904F, -3.395F, 2.8057F, 0.0547F, 0.2031F, 0.0313F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 0.0F, -2.8798F));
		PartDefinition body_r3 = Body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(103, 45).mirror().addBox(-0.097F, -8.5278F, -2.4365F, 0.5625F, 2.0625F, 4.875F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 45).mirror()
				.addBox(-1.3955F, -3.1404F, 2.8057F, 0.0547F, 0.2031F, 0.0313F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 3.1416F, 0.0F, 2.8798F));
		PartDefinition body_r4 = Body.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(68, 17).mirror().addBox(3.9059F, 3.92F, -2.6865F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 17).mirror()
						.addBox(1.2543F, 6.5716F, -2.6865F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 15).addBox(-0.2925F, 2.358F, 2.9307F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).texOffs(74, 15)
						.addBox(4.1711F, 3.9048F, 2.9307F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).texOffs(74, 15).addBox(0.1052F, 5.1423F, 2.9307F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).texOffs(74, 15)
						.addBox(-1.4858F, 3.5513F, 2.9307F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).texOffs(74, 15).addBox(4.1711F, 3.6548F, 2.6885F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).texOffs(74, 15)
						.addBox(0.1052F, 4.8923F, 2.6885F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).texOffs(72, 14).addBox(-1.4858F, 3.3013F, 2.501F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 3.1416F, 0.0F, -0.7854F));
		PartDefinition body_r5 = Body.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(68, 17).mirror().addBox(-4.9503F, 3.5827F, -2.6865F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 17).mirror()
						.addBox(-2.2987F, 6.2344F, -2.6865F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 17).mirror().addBox(-1.9451F, 0.2239F, 2.501F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(74, 15).addBox(-0.7228F, -2.1777F, 2.9932F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(74, 15).addBox(-3.2419F, 3.2582F, 2.9932F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(74, 15)
						.addBox(-4.4793F, -0.8077F, 2.9932F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(74, 15).addBox(-1.9161F, -3.3709F, 2.9932F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 14)
						.addBox(-2.1219F, 6.3076F, 2.6885F, 0.3536F, 0.25F, 0.4375F, new CubeDeformation(0.0F)).texOffs(72, 14).addBox(-4.7293F, 0.8717F, 2.6885F, 0.3536F, 0.25F, 0.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 0.0F, 0.7854F));
		PartDefinition body_r6 = Body.addOrReplaceChild("body_r6",
				CubeListBuilder.create().texOffs(68, 17).mirror().addBox(1.5742F, 0.9136F, -2.6865F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 17).mirror()
						.addBox(-1.0775F, 3.5653F, -2.6865F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 15).addBox(1.1764F, 0.0285F, 2.9932F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(74, 15)
						.addBox(-5.6447F, -1.1054F, 2.9932F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(74, 15).addBox(-0.1936F, -3.728F, 2.9932F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(74, 15)
						.addBox(2.3696F, -1.1648F, 2.9932F, 0.3536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 14).addBox(-5.4969F, -1.2077F, 2.6885F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).texOffs(72, 14)
						.addBox(-0.061F, -3.8151F, 2.6885F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).texOffs(72, 14).addBox(2.0161F, 0.2949F, 2.501F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)).texOffs(103, 44).mirror()
						.addBox(-2.05F, -6.1029F, -2.8502F, 0.6581F, 0.2025F, 0.3275F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 3.1416F, 0.0F, 2.3562F));
		PartDefinition body_r7 = Body.addOrReplaceChild("body_r7",
				CubeListBuilder.create().texOffs(68, 17).addBox(-1.801F, 1.6373F, 2.9307F, 0.9161F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).texOffs(68, 17).addBox(0.2615F, 5.8873F, 2.9307F, 2.875F, 0.25F, 0.1953F, new CubeDeformation(0.0F))
						.texOffs(68, 17).addBox(-3.4885F, 3.8873F, 2.9307F, 0.9375F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).texOffs(68, 17).addBox(-3.4885F, 1.6373F, 2.9307F, 0.9161F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).texOffs(72, 15)
						.addBox(-1.551F, -1.4975F, 3.0557F, 0.4161F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).texOffs(72, 15).addBox(-1.801F, -1.2787F, 2.9932F, 0.9161F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 15)
						.addBox(1.5115F, 4.1275F, 3.0557F, 0.4161F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).texOffs(72, 15).addBox(-3.2385F, 2.1275F, 3.0557F, 0.4161F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).texOffs(72, 15)
						.addBox(-3.2385F, -1.4975F, 3.0557F, 0.4161F, 0.2188F, 0.0703F, new CubeDeformation(0.0F)).texOffs(72, 15).addBox(0.2829F, 4.3463F, 2.9932F, 2.8536F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 15)
						.addBox(-3.4885F, 2.3463F, 2.9932F, 0.9161F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 15).addBox(-3.4885F, -1.2787F, 2.9932F, 0.9161F, 0.25F, 0.1328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 0.0F, 0.0F));
		PartDefinition body_r8 = Body.addOrReplaceChild("body_r8",
				CubeListBuilder.create().texOffs(107, 47).mirror().addBox(-1.0287F, 0.8635F, 2.9932F, 2.6661F, 1.0F, 0.1016F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 47).mirror()
						.addBox(4.5963F, -3.199F, 2.9932F, 1.2911F, 2.9375F, 0.1016F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 47).mirror().addBox(2.5963F, 2.4885F, 2.9932F, 1.2911F, 1.0F, 0.1016F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(107, 47).mirror().addBox(-1.0287F, 2.4885F, 2.9932F, 2.6661F, 1.0F, 0.1016F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 14)
						.addBox(-1.0287F, 1.801F, 2.9932F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 14).addBox(4.5963F, -0.2615F, 2.9932F, 1.2911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 14)
						.addBox(2.5963F, 3.4885F, 2.9932F, 1.2911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 14).addBox(-1.0287F, 3.4885F, 2.9932F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 14)
						.addBox(-1.0287F, 0.6349F, 2.9932F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(72, 14).addBox(4.5963F, -3.3865F, 2.9932F, 1.2911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(74, 15)
						.addBox(2.5963F, 2.301F, 2.9932F, 1.2911F, 0.25F, 0.1328F, new CubeDeformation(0.0F)).texOffs(74, 15).addBox(-1.0287F, 2.3224F, 2.9932F, 2.6661F, 0.25F, 0.1328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 3.1416F, 0.0F, -1.5708F));
		PartDefinition body_r9 = Body.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(74, 15).addBox(1.6067F, -0.7088F, 2.9307F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).texOffs(74, 15)
				.addBox(2.8F, 0.4845F, 2.9307F, 0.3536F, 0.25F, 0.1953F, new CubeDeformation(0.0F)).texOffs(72, 14).mirror().addBox(2.7406F, -3.6104F, 2.6885F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 14).mirror()
				.addBox(3.978F, 0.4554F, 2.6885F, 0.3536F, 0.5F, 0.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 14).mirror().addBox(0.8845F, 3.549F, 2.501F, 0.3536F, 0.5F, 0.4375F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 14)
				.mirror().addBox(-1.944F, 1.2509F, -2.6865F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 14).mirror().addBox(0.7077F, 3.9026F, -2.6865F, 0.7071F, 0.5F, 5.375F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 44).mirror().addBox(1.6405F, -5.8542F, -2.8502F, 0.6581F, 0.2025F, 0.3275F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 0.0F, -2.3562F));
		PartDefinition body_r10 = Body.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(71, 15).addBox(-4.1131F, 2.3334F, -0.5531F, 8.7031F, 1.25F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 2.7489F, 0.0F, -3.1416F));
		PartDefinition body_r11 = Body.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-4.1131F, 2.3581F, 0.3627F, 8.7031F, 1.25F, 0.25F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -2.7489F, 0.0F, 3.1416F));
		PartDefinition body_r12 = Body.addOrReplaceChild("body_r12",
				CubeListBuilder.create().texOffs(71, 15).addBox(-2.2328F, 3.0502F, 4.4169F, 0.125F, 0.75F, 0.1875F, new CubeDeformation(0.0F)).texOffs(71, 16).addBox(1.7691F, 3.0502F, -4.2686F, 0.125F, 0.75F, 0.1875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 0.0F, -0.7854F, 0.0F));
		PartDefinition body_r13 = Body.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(1.7706F, 3.0502F, 4.0797F, 0.125F, 0.75F, 0.1875F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 16).mirror()
				.addBox(-2.2314F, 3.0502F, -4.6059F, 0.125F, 0.75F, 0.1875F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 0.0F, 0.7854F, 0.0F));
		PartDefinition body_r14 = Body.addOrReplaceChild("body_r14",
				CubeListBuilder.create().texOffs(71, 15).addBox(-0.3104F, 3.0502F, 5.0606F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).texOffs(71, 16).addBox(0.0009F, 3.0502F, -4.7457F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F))
						.texOffs(70, 18).addBox(-3.5402F, -3.2248F, 0.7047F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).texOffs(70, 18).addBox(-3.5402F, -4.0998F, 0.7047F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).texOffs(69, 14)
						.addBox(-4.126F, -5.7248F, 2.221F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).texOffs(69, 14).addBox(-4.162F, -4.7248F, 2.206F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).texOffs(69, 14)
						.addBox(-4.162F, -5.2248F, 2.206F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 0.0F, -1.1781F, 0.0F));
		PartDefinition body_r15 = Body.addOrReplaceChild("body_r15",
				CubeListBuilder.create().texOffs(71, 15).mirror().addBox(0.0028F, 3.0502F, 4.6199F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 16).mirror()
						.addBox(-0.3085F, 3.0502F, -5.1864F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 18).mirror().addBox(2.3469F, -3.2248F, -1.9045F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(70, 18).mirror().addBox(2.3469F, -4.0998F, -1.9045F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 18).mirror()
						.addBox(2.3469F, -4.7248F, -1.9045F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 18).mirror().addBox(2.3469F, -5.2248F, -1.9045F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(70, 18).mirror().addBox(2.3002F, -5.7248F, -1.9152F, 0.1125F, 0.3625F, 0.175F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 0.0F, 1.1781F, 0.0F));
		PartDefinition body_r16 = Body.addOrReplaceChild("body_r16",
				CubeListBuilder.create().texOffs(78, 16).addBox(1.6882F, 3.0502F, 4.8618F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).texOffs(78, 17).addBox(-1.8152F, 3.0502F, -4.5098F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F))
						.texOffs(69, 14).addBox(-3.001F, -3.2248F, 0.8184F, 0.1125F, 0.3625F, 1.1875F, new CubeDeformation(0.0F)).texOffs(69, 14).addBox(-3.001F, -4.0998F, 0.8184F, 0.1125F, 0.3625F, 1.1875F, new CubeDeformation(0.0F)).texOffs(69, 14)
						.addBox(-3.001F, -4.7248F, 0.8184F, 0.1125F, 0.3625F, 2.8125F, new CubeDeformation(0.0F)).texOffs(69, 14).addBox(-3.001F, -5.2248F, 0.8184F, 0.1125F, 0.3625F, 2.8125F, new CubeDeformation(0.0F)).texOffs(69, 14)
						.addBox(-2.962F, -5.7248F, 0.8461F, 0.1125F, 0.3625F, 2.7847F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body_r17 = Body.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-1.8132F, 3.0502F, 4.3848F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 17).mirror()
				.addBox(1.6902F, 3.0502F, -4.9868F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 0.0F, 1.5708F, 0.0F));
		PartDefinition body_r18 = Body.addOrReplaceChild("body_r18",
				CubeListBuilder.create().texOffs(78, 16).addBox(3.4585F, 3.0502F, 3.9133F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).texOffs(70, 18).addBox(-3.4029F, 3.0502F, -3.5968F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, -1.1781F, 3.1416F));
		PartDefinition body_r19 = Body.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-3.401F, 3.0502F, 3.4726F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 17).mirror()
				.addBox(3.4604F, 3.0502F, -4.0375F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 1.1781F, 3.1416F));
		PartDefinition body_r20 = Body.addOrReplaceChild("body_r20",
				CubeListBuilder.create().texOffs(78, 17).addBox(-3.1253F, -3.2248F, -1.8812F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).texOffs(78, 17)
						.addBox(-3.1253F, -4.0998F, -1.8812F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).texOffs(78, 17).addBox(-4.6117F, -5.7248F, -1.2233F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).texOffs(70, 18)
						.addBox(-4.6267F, -4.7248F, -1.2594F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).texOffs(70, 18).addBox(-4.6267F, -5.2248F, -1.2594F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r21 = Body.addOrReplaceChild("body_r21",
				CubeListBuilder.create().texOffs(78, 17).mirror().addBox(0.4036F, -3.2248F, -2.962F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 17).mirror()
						.addBox(0.4036F, -4.0998F, -2.962F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 17).mirror().addBox(0.4036F, -4.7248F, -2.962F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(78, 17).mirror().addBox(0.4036F, -5.2248F, -2.962F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 17).mirror()
						.addBox(0.363F, -5.7248F, -2.9365F, 0.1125F, 0.3625F, 0.2844F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r22 = Body.addOrReplaceChild("body_r22",
				CubeListBuilder.create().texOffs(70, 17).addBox(4.7311F, 3.0502F, 2.3596F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).texOffs(70, 18).addBox(-4.5203F, 3.0502F, -2.1458F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, -0.7854F, 3.1416F));
		PartDefinition body_r23 = Body.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(70, 17).mirror().addBox(-4.5189F, 3.0502F, 2.0223F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 18).mirror()
				.addBox(4.7326F, 3.0502F, -2.4831F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 0.7854F, 3.1416F));
		PartDefinition body_r24 = Body.addOrReplaceChild("body_r24",
				CubeListBuilder.create().texOffs(70, 17).addBox(5.3123F, 3.0502F, 0.4371F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).texOffs(69, 14).addBox(-4.9974F, 3.0502F, -0.3776F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, -0.3927F, 3.1416F));
		PartDefinition body_r25 = Body.addOrReplaceChild("body_r25", CubeListBuilder.create().texOffs(70, 17).mirror().addBox(-4.9966F, 3.0502F, 0.2545F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 18).mirror()
				.addBox(5.3131F, 3.0502F, -0.5602F, 0.125F, 0.75F, 0.125F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 0.3927F, 3.1416F));
		PartDefinition body_r26 = Body.addOrReplaceChild("body_r26", CubeListBuilder.create().texOffs(75, 17).addBox(-4.0268F, -1.2623F, 2.0557F, 0.5F, 3.375F, 0.5938F, new CubeDeformation(0.0F)).texOffs(67, 13).mirror()
				.addBox(3.7415F, -1.2623F, -3.0754F, 0.5F, 3.375F, 0.5938F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 1.1083F, 3.1416F));
		PartDefinition body_r27 = Body.addOrReplaceChild("body_r27", CubeListBuilder.create().texOffs(67, 13).mirror().addBox(3.7397F, -1.2623F, 2.4826F, 0.5F, 3.375F, 0.5938F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 13).addBox(-4.0286F,
				-1.2623F, -2.6486F, 0.5F, 3.375F, 0.5938F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, -1.1083F, 3.1416F));
		PartDefinition body_r28 = Body.addOrReplaceChild("body_r28", CubeListBuilder.create().texOffs(73, 17).mirror().addBox(-3.2615F, -2.6558F, 2.074F, 3.0F, 0.25F, 0.0625F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 2.8798F, 0.0F, -3.1416F));
		PartDefinition body_r29 = Body.addOrReplaceChild("body_r29", CubeListBuilder.create().texOffs(73, 17).mirror().addBox(-3.2615F, -3.1721F, 3.5685F, 3.0F, 0.25F, 0.0625F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -2.8798F, 0.0F, 3.1416F));
		PartDefinition body_r30 = Body.addOrReplaceChild("body_r30", CubeListBuilder.create().texOffs(104, 44).mirror().addBox(3.8597F, -6.9584F, 2.1885F, 0.125F, 1.1953F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 0.0F, -2.5744F));
		PartDefinition body_r31 = Body.addOrReplaceChild("body_r31", CubeListBuilder.create().texOffs(113, 47).mirror().addBox(-3.5824F, -7.2147F, 2.1885F, 0.125F, 1.1953F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 3.1416F, 0.0F, 2.5744F));
		PartDefinition body_r32 = Body.addOrReplaceChild("body_r32", CubeListBuilder.create().texOffs(0, 1).addBox(-6.9652F, -3.979F, 0.4385F, 1.125F, 0.5625F, 1.75F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, 3.1416F, 0.0F, 2.138F));
		PartDefinition body_r33 = Body.addOrReplaceChild("body_r33", CubeListBuilder.create().texOffs(0, 1).mirror().addBox(6.0965F, -3.5767F, 0.4385F, 1.125F, 0.5625F, 1.75F, new CubeDeformation(-0.001F)).mirror(false),
				PartPose.offsetAndRotation(0.2615F, 7.8248F, -0.0875F, -3.1416F, 0.0F, -2.138F));
		PartDefinition RighArm = partdefinition.addOrReplaceChild("RighArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArm_r1 = RighArm.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(0, 4).mirror().addBox(4.051F, -4.1998F, -2.374F, 4.5625F, 1.1875F, 4.75F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 10).mirror()
						.addBox(3.801F, -3.8248F, -2.124F, 4.5625F, 7.125F, 4.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror().addBox(4.2385F, -8.0123F, -2.1865F, 4.1875F, 4.1875F, 4.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.2615F, 5.8248F, -0.0875F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition Steve_r22 = LeftArm.addOrReplaceChild("Steve_r22", CubeListBuilder.create().texOffs(107, 17).mirror().addBox(2.2285F, 8.7246F, 0.0485F, 0.2909F, 0.4706F, 1.905F, new CubeDeformation(0.0F)).mirror(false).texOffs(103, 14)
				.mirror().addBox(2.2285F, 8.7246F, -1.9515F, 0.2909F, 0.4706F, 1.905F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7385F, 5.8248F, -0.0875F, -3.1416F, 0.0F, 0.7854F));
		PartDefinition Steve_r23 = LeftArm.addOrReplaceChild("Steve_r23", CubeListBuilder.create().texOffs(104, 10).mirror().addBox(-8.2835F, -7.7129F, 0.0485F, 0.3325F, 2.9925F, 1.905F, new CubeDeformation(0.0F)).mirror(false).texOffs(103, 14)
				.mirror().addBox(-8.4735F, -7.5229F, 0.0485F, 0.19F, 0.9025F, 1.905F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 12).mirror().addBox(-8.5685F, -6.9054F, 0.811F, 0.285F, 0.475F, 0.38F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(76, 14).mirror().addBox(-8.5685F, -6.9054F, -1.189F, 0.285F, 0.475F, 0.38F, new CubeDeformation(0.0F)).mirror(false).texOffs(112, 14).mirror()
				.addBox(-8.4735F, -7.5229F, -1.9515F, 0.19F, 0.9025F, 1.905F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 18).mirror().addBox(-8.2835F, -7.7129F, -1.9515F, 0.3325F, 2.9925F, 1.905F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 4).mirror().addBox(-8.1365F, -4.1998F, -2.374F, 4.5625F, 1.1875F, 4.75F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 12).mirror()
				.addBox(-7.8865F, -3.8248F, -2.124F, 4.5625F, 7.125F, 4.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror().addBox(-7.949F, -8.0123F, -2.1865F, 4.1875F, 4.1875F, 4.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.7385F, 5.8248F, -0.0875F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Steve_r24 = LeftArm.addOrReplaceChild("Steve_r24", CubeListBuilder.create().texOffs(109, 15).mirror().addBox(-11.3112F, 0.4034F, 0.0485F, 0.19F, 0.2687F, 1.905F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 16)
				.mirror().addBox(-11.3112F, 0.4034F, -1.9515F, 0.19F, 0.2687F, 1.905F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7385F, 5.8248F, -0.0875F, 3.1416F, 0.0F, 2.3562F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition Steve_r25 = rightleg.addOrReplaceChild("Steve_r25", CubeListBuilder.create().texOffs(110, 15).mirror().addBox(4.2385F, 4.4877F, -1.499F, 0.3125F, 4.375F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(111, 18)
				.addBox(4.1135F, 4.7377F, -1.499F, 1.125F, 1.1875F, 3.0F, new CubeDeformation(0.0F)).texOffs(75, 18).mirror().addBox(4.9885F, 5.5502F, -0.249F, 0.375F, 0.625F, 0.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(115, 16)
				.addBox(4.3635F, 4.4877F, -1.499F, 0.625F, 3.9375F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 48).mirror().addBox(0.707F, 5.5667F, 2.011F, 3.0012F, 2.4038F, 0.48F, new CubeDeformation(0.0F)).mirror(false).texOffs(111, 19).mirror()
				.addBox(1.1145F, 7.7217F, 2.491F, 2.1862F, 0.3438F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 17).mirror().addBox(1.1145F, 6.9717F, 2.491F, 2.1862F, 0.3438F, 0.125F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(112, 15).mirror().addBox(1.1145F, 6.2217F, 2.491F, 2.1862F, 0.3438F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 17).mirror()
				.addBox(1.1145F, 5.4717F, 2.491F, 2.1862F, 0.3438F, 0.125F, new CubeDeformation(0.0F)).mirror(false).texOffs(75, 43).mirror().addBox(1.1145F, 5.1592F, 2.011F, 2.1862F, 3.2188F, 0.48F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 11).mirror().addBox(-0.199F, 7.5502F, -2.374F, 4.875F, 0.4375F, 4.75F, new CubeDeformation(0.0F)).mirror(false).texOffs(69, 14).mirror().addBox(-0.199F, 5.5502F, -2.374F, 4.875F, 0.4375F, 4.75F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 4).mirror().addBox(-0.0115F, 4.0502F, -2.1865F, 4.5F, 11.5625F, 4.375F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(2.1615F, -4.1752F, -0.0875F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Steve_r26 = rightleg.addOrReplaceChild("Steve_r26", CubeListBuilder.create().texOffs(105, 16).mirror().addBox(0.1041F, 6.7007F, -1.499F, 0.25F, 0.3536F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(75, 46).mirror()
				.addBox(-1.7742F, 5.9821F, 2.011F, 0.4601F, 0.5763F, 0.48F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1615F, -4.1752F, -0.0875F, -3.1416F, 0.0F, -2.3562F));
		PartDefinition Steve_r27 = rightleg.addOrReplaceChild("Steve_r27",
				CubeListBuilder.create().texOffs(111, 17).mirror().addBox(-9.4849F, -3.0493F, -1.499F, 0.3828F, 0.6192F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(81, 49).mirror()
						.addBox(-8.2581F, -3.5901F, 2.011F, 0.4374F, 0.5763F, 0.48F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 44).mirror().addBox(-4.8736F, -3.4363F, 2.011F, 0.4374F, 0.5763F, 0.48F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(2.1615F, -4.1752F, -0.0875F, 3.1416F, 0.0F, -0.7854F));
		PartDefinition body_r34 = rightleg.addOrReplaceChild("body_r34", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(4.6986F, -6.7122F, 2.011F, 0.4374F, 0.5763F, 0.48F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1615F, -4.1752F, -0.0875F, -3.1416F, 0.0F, 0.7854F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition Steve_r28 = leftleg.addOrReplaceChild("Steve_r28",
				CubeListBuilder.create().texOffs(110, 15).addBox(-4.551F, 4.4877F, -1.499F, 0.3125F, 4.375F, 3.0F, new CubeDeformation(0.0F)).texOffs(111, 18).mirror()
						.addBox(-5.2385F, 4.7377F, -1.499F, 1.125F, 1.1875F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(75, 18).addBox(-5.3635F, 5.5502F, -0.249F, 0.375F, 0.625F, 0.5F, new CubeDeformation(0.0F)).texOffs(115, 16).mirror()
						.addBox(-4.9885F, 4.4877F, -1.499F, 0.625F, 3.9375F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 48).addBox(-3.7083F, 5.5667F, 2.011F, 3.0012F, 2.4038F, 0.48F, new CubeDeformation(0.0F)).texOffs(111, 19)
						.addBox(-3.3008F, 7.7217F, 2.491F, 2.1862F, 0.3438F, 0.125F, new CubeDeformation(0.0F)).texOffs(109, 17).addBox(-3.3008F, 6.9717F, 2.491F, 2.1862F, 0.3438F, 0.125F, new CubeDeformation(0.0F)).texOffs(112, 15)
						.addBox(-3.3008F, 6.2217F, 2.491F, 2.1862F, 0.3438F, 0.125F, new CubeDeformation(0.0F)).texOffs(105, 17).addBox(-3.3008F, 5.4717F, 2.491F, 2.1862F, 0.3438F, 0.125F, new CubeDeformation(0.0F)).texOffs(75, 43)
						.addBox(-3.3008F, 5.1592F, 2.011F, 2.1862F, 3.2188F, 0.48F, new CubeDeformation(0.0F)).texOffs(71, 11).addBox(-4.676F, 7.5502F, -2.374F, 4.875F, 0.4375F, 4.75F, new CubeDeformation(0.0F)).texOffs(69, 14)
						.addBox(-4.676F, 5.5502F, -2.374F, 4.875F, 0.4375F, 4.75F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-4.4885F, 4.0502F, -2.1865F, 4.5F, 11.5625F, 4.375F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-2.1615F, -4.1752F, -0.0875F, -3.1416F, 0.0F, -3.1416F));
		PartDefinition Steve_r29 = leftleg.addOrReplaceChild("Steve_r29",
				CubeListBuilder.create().texOffs(105, 16).addBox(-0.3541F, 6.7007F, -1.499F, 0.25F, 0.3536F, 3.0F, new CubeDeformation(0.0F)).texOffs(75, 46).addBox(1.3141F, 5.9821F, 2.011F, 0.4601F, 0.5763F, 0.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1615F, -4.1752F, -0.0875F, -3.1416F, 0.0F, 2.3562F));
		PartDefinition Steve_r30 = leftleg.addOrReplaceChild(
				"Steve_r30", CubeListBuilder.create().texOffs(111, 17).addBox(9.1021F, -3.0493F, -1.499F, 0.3828F, 0.6192F, 3.0F, new CubeDeformation(0.0F)).texOffs(81, 49)
						.addBox(7.8206F, -3.5901F, 2.011F, 0.4374F, 0.5763F, 0.48F, new CubeDeformation(0.0F)).texOffs(74, 44).addBox(4.4362F, -3.4363F, 2.011F, 0.4374F, 0.5763F, 0.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1615F, -4.1752F, -0.0875F, 3.1416F, 0.0F, 0.7854F));
		PartDefinition body_r35 = leftleg.addOrReplaceChild("body_r35", CubeListBuilder.create().texOffs(78, 45).addBox(-5.136F, -6.7122F, 2.011F, 0.4374F, 0.5763F, 0.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1615F, -4.1752F, -0.0875F, -3.1416F, 0.0F, -0.7854F));
		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition body_r36 = RightBoot.addOrReplaceChild("body_r36", CubeListBuilder.create().texOffs(103, 46).mirror().addBox(-1.536F, 15.8847F, 3.0274F, 1.8564F, 0.4284F, 2.5704F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 15)
				.mirror().addBox(-1.4902F, 14.2389F, 3.0449F, 1.82F, 1.65F, 2.52F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1615F, -4.1752F, -0.0875F, -3.1416F, -0.3927F, 3.1416F));
		PartDefinition body_r37 = RightBoot.addOrReplaceChild("body_r37", CubeListBuilder.create().texOffs(103, 46).mirror().addBox(-5.7595F, 15.8847F, 0.7231F, 2.499F, 0.4284F, 3.0307F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 15)
				.mirror().addBox(-5.7116F, 14.2389F, 0.7529F, 2.45F, 1.65F, 2.9713F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1615F, -4.1752F, -0.0875F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body_r38 = RightBoot.addOrReplaceChild("body_r38",
				CubeListBuilder.create().texOffs(100, 43).mirror().addBox(-0.2605F, 15.8847F, -2.5056F, 4.998F, 0.4284F, 5.8904F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 14).mirror()
						.addBox(-0.4075F, 11.7164F, -2.5774F, 5.292F, 0.6075F, 5.1516F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 14).mirror().addBox(-0.2115F, 12.1139F, -2.3866F, 4.9F, 2.125F, 4.77F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(100, 14).mirror().addBox(-0.2115F, 14.2389F, -2.3866F, 4.9F, 1.65F, 5.77F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1615F, -4.1752F, -0.0875F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition body_r39 = RightBoot.addOrReplaceChild("body_r39", CubeListBuilder.create().texOffs(100, 43).mirror().addBox(3.8158F, 15.8847F, 1.3142F, 1.8564F, 0.4284F, 2.5704F, new CubeDeformation(0.0F)).mirror(false).texOffs(100, 14)
				.mirror().addBox(3.8064F, 14.2389F, 1.3316F, 1.82F, 1.65F, 2.52F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1615F, -4.1752F, -0.0875F, -3.1416F, 0.3927F, 3.1416F));
		PartDefinition Leftboot = partdefinition.addOrReplaceChild("Leftboot", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition body_r40 = Leftboot.addOrReplaceChild("body_r40",
				CubeListBuilder.create().texOffs(101, 12).mirror().addBox(-4.4075F, 11.7164F, -2.5774F, 5.292F, 0.6075F, 5.1516F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 12).mirror()
						.addBox(-4.2115F, 12.1139F, -2.3866F, 4.9F, 2.125F, 4.77F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 12).mirror().addBox(-4.2115F, 14.2389F, -2.3866F, 4.9F, 1.65F, 5.77F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(101, 44).mirror().addBox(-4.2605F, 15.8847F, -2.5056F, 4.998F, 0.4284F, 5.8904F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6385F, -4.1752F, -0.0875F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition body_r41 = Leftboot.addOrReplaceChild("body_r41", CubeListBuilder.create().texOffs(101, 12).mirror().addBox(0.1109F, 14.2389F, 2.8624F, 1.82F, 1.65F, 2.52F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 44).mirror()
				.addBox(0.1203F, 15.8847F, 2.8449F, 1.8564F, 0.4284F, 2.5704F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6385F, -4.1752F, -0.0875F, -3.1416F, 0.3927F, 3.1416F));
		PartDefinition body_r42 = Leftboot.addOrReplaceChild("body_r42", CubeListBuilder.create().texOffs(101, 12).mirror().addBox(-5.1857F, 14.2389F, 1.5142F, 1.82F, 1.65F, 2.52F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 44).mirror()
				.addBox(-5.2315F, 15.8847F, 1.4967F, 1.8564F, 0.4284F, 2.5704F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6385F, -4.1752F, -0.0875F, -3.1416F, -0.3927F, 3.1416F));
		PartDefinition body_r43 = Leftboot.addOrReplaceChild("body_r43", CubeListBuilder.create().texOffs(101, 12).mirror().addBox(3.2616F, 14.2389F, 0.2759F, 2.45F, 1.65F, 2.9713F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 44).mirror()
				.addBox(3.2605F, 15.8847F, 0.2462F, 2.499F, 0.4284F, 3.0307F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6385F, -4.1752F, -0.0875F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RighArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftboot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
