// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfuturiste_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "futuriste_armor"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RighArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightBoots;
	private final ModelPart Leftboots;

	public Modelfuturiste_armor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RighArm = root.getChild("RighArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightBoots = root.getChild("RightBoots");
		this.Leftboots = root.getChild("Leftboots");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(855, 536)
				.addBox(-4.4F, -7.7F, -4.4F, 8.8F, 7.7F, 7.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Helmet_r1 = Head.addOrReplaceChild("Helmet_r1",
				CubeListBuilder.create().texOffs(150, 495)
						.addBox(-8.8355F, -4.7353F, -4.3828F, 0.5716F, 0.1778F, 9.35F, new CubeDeformation(0.0F))
						.texOffs(130, 417)
						.addBox(-10.0509F, -3.5033F, -4.3828F, 0.7778F, 0.4528F, 9.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.4016F, 0.0928F, 3.1416F, 0.0F, 2.3562F));

		PartDefinition Helmet_r2 = Head.addOrReplaceChild("Helmet_r2",
				CubeListBuilder.create().texOffs(133, 435)
						.addBox(8.264F, -4.7353F, -4.3828F, 0.5716F, 0.1778F, 9.35F, new CubeDeformation(0.0F))
						.texOffs(158, 435)
						.addBox(9.273F, -3.5033F, -4.3828F, 0.7778F, 0.4528F, 9.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.4016F, 0.0928F, -3.1416F, 0.0F, -2.3562F));

		PartDefinition Helmet_r3 = Head.addOrReplaceChild("Helmet_r3", CubeListBuilder.create().texOffs(118, 410)
				.addBox(-4.95F, -10.7908F, 1.3893F, 9.9F, 0.3266F, 1.3063F, new CubeDeformation(0.0F)).texOffs(95, 472)
				.addBox(-4.95F, -10.7908F, -1.1201F, 9.9F, 0.825F, 2.5094F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.4016F, 0.0928F, 2.9234F, 0.0F, 3.1416F));

		PartDefinition Helmet_r4 = Head.addOrReplaceChild("Helmet_r4", CubeListBuilder.create().texOffs(103, 390)
				.addBox(-2.6813F, -9.4016F, -4.3828F, 5.4313F, 0.1375F, 9.35F, new CubeDeformation(0.0F))
				.texOffs(108, 490).addBox(-4.4F, -9.2641F, -4.3828F, 8.8F, 0.55F, 9.35F, new CubeDeformation(0.0F))
				.texOffs(855, 825)
				.addBox(-4.2625F, -14.4891F, -4.7953F, 8.525F, 0.6875F, 0.55F, new CubeDeformation(0.0F))
				.texOffs(753, 827)
				.addBox(-4.8125F, -14.4891F, -4.2453F, 9.625F, 0.6875F, 1.4437F, new CubeDeformation(0.0F))
				.texOffs(115, 430).addBox(-4.95F, -13.9391F, -4.3828F, 9.9F, 3.9875F, 1.65F, new CubeDeformation(0.0F))
				.texOffs(110, 422).addBox(-4.4F, -13.9391F, -4.9328F, 8.8F, 4.675F, 0.55F, new CubeDeformation(0.0F))
				.texOffs(140, 467).addBox(-4.4F, -18.4766F, -4.9328F, 8.8F, 4.4F, 0.55F, new CubeDeformation(0.0F))
				.texOffs(148, 517).addBox(-4.95F, -10.7766F, -2.7328F, 9.9F, 0.825F, 3.9789F, new CubeDeformation(0.0F))
				.texOffs(175, 420).addBox(-4.95F, -16.4141F, -4.3828F, 9.9F, 2.3375F, 1.65F, new CubeDeformation(0.0F))
				.texOffs(73, 415).addBox(-4.95F, -9.4016F, -4.3828F, 0.6875F, 0.1375F, 9.35F, new CubeDeformation(0.0F))
				.texOffs(53, 445)
				.addBox(4.8125F, -9.4016F, -4.3828F, 0.1375F, 0.1375F, 9.35F, new CubeDeformation(0.0F))
				.texOffs(732, 725)
				.addBox(-4.6063F, -9.4016F, 4.4172F, 9.2813F, 0.2063F, 0.4813F, new CubeDeformation(0.0F))
				.texOffs(111, 423).addBox(-4.95F, -9.9516F, -4.3828F, 9.9F, 0.55F, 9.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.4016F, 0.0928F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition Helmet_r5 = Head.addOrReplaceChild("Helmet_r5",
				CubeListBuilder.create().texOffs(795, 820).addBox(-14.4891F, -0.4011F, -6.4048F, 0.6875F, 0.7778F,
						0.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.4016F, 0.0928F, 2.3562F, 0.0F, 1.5708F));

		PartDefinition Helmet_r6 = Head.addOrReplaceChild("Helmet_r6",
				CubeListBuilder.create().texOffs(828, 810)
						.addBox(-14.4891F, -0.3768F, -6.4048F, 0.6875F, 0.7778F, 0.55F, new CubeDeformation(0.0F))
						.texOffs(143, 420)
						.addBox(-17.9266F, -0.3768F, -6.5993F, 3.85F, 0.7778F, 0.55F, new CubeDeformation(0.0F))
						.texOffs(158, 452)
						.addBox(-13.9391F, -0.3768F, -6.5993F, 4.675F, 0.7778F, 0.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.4016F, 0.0928F, -2.3562F, 0.0F, 1.5708F));

		PartDefinition Helmet_r7 = Head.addOrReplaceChild("Helmet_r7",
				CubeListBuilder.create().texOffs(140, 410)
						.addBox(-17.9266F, -0.3768F, 6.0493F, 3.85F, 0.7778F, 0.55F, new CubeDeformation(0.0F))
						.texOffs(148, 442)
						.addBox(-13.9391F, -0.3768F, 6.0493F, 4.675F, 0.7778F, 0.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.4016F, 0.0928F, -0.7854F, 0.0F, 1.5708F));

		PartDefinition Helmet_r8 = Head.addOrReplaceChild("Helmet_r8",
				CubeListBuilder.create().texOffs(440, 112)
						.addBox(-4.8125F, -8.3293F, 14.2924F, 9.625F, 0.381F, 0.6806F, new CubeDeformation(0.0F))
						.texOffs(133, 480)
						.addBox(-4.95F, -13.2236F, 8.9748F, 9.9F, 0.3438F, 0.6188F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8516F, 0.0928F, -2.3562F, 0.0F, -3.1416F));

		PartDefinition Helmet_r9 = Head.addOrReplaceChild("Helmet_r9", CubeListBuilder.create().texOffs(450, 160)
				.addBox(-4.8125F, -17.2391F, 0.2922F, 9.625F, 1.0313F, 4.675F, new CubeDeformation(0.0F))
				.texOffs(148, 445)
				.addBox(-2.496F, -17.9266F, -0.3125F, 4.9919F, 0.55F, 1.7188F, new CubeDeformation(0.0F))
				.texOffs(458, 177)
				.addBox(-4.2625F, -17.7891F, 0.2922F, 8.525F, 0.55F, 4.675F, new CubeDeformation(0.0F))
				.texOffs(468, 142)
				.addBox(-4.8125F, -16.2078F, 0.2922F, 9.625F, 0.4812F, 4.1938F, new CubeDeformation(0.0F))
				.texOffs(60, 422).addBox(-4.4F, -17.9266F, -4.3828F, 8.8F, 0.55F, 4.675F, new CubeDeformation(0.0F))
				.texOffs(143, 435)
				.addBox(-4.95F, -17.3766F, -4.3828F, 9.9F, 1.5125F, 4.675F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8516F, 0.0928F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition Helmet_r10 = Head.addOrReplaceChild("Helmet_r10",
				CubeListBuilder.create().texOffs(168, 450).addBox(-2.7593F, -17.9266F, -2.4893F, 1.7188F, 0.55F,
						1.7188F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8516F, 0.0928F, -3.1416F, -0.7854F, 3.1416F));

		PartDefinition Helmet_r11 = Head.addOrReplaceChild("Helmet_r11",
				CubeListBuilder.create().texOffs(133, 457).addBox(1.0405F, -17.9266F, -2.4893F, 1.7188F, 0.55F, 1.7188F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8516F, 0.0928F, 3.1416F, 0.7854F, 3.1416F));

		PartDefinition Helmet_r12 = Head.addOrReplaceChild("Helmet_r12", CubeListBuilder.create().texOffs(428, 150)
				.addBox(8.7869F, -15.5928F, 0.2922F, 0.7778F, 0.55F, 4.675F, new CubeDeformation(0.0F)).texOffs(98, 430)
				.addBox(8.7869F, -15.7873F, -4.3828F, 0.7778F, 0.55F, 4.675F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8516F, 0.0928F, -3.1416F, 0.0F, -2.3562F));

		PartDefinition Helmet_r13 = Head.addOrReplaceChild("Helmet_r13",
				CubeListBuilder.create().texOffs(415, 155)
						.addBox(-9.5647F, -15.5928F, 0.2922F, 0.7778F, 0.55F, 4.675F, new CubeDeformation(0.0F))
						.texOffs(133, 445)
						.addBox(-9.5647F, -15.7873F, -4.3828F, 0.7778F, 0.55F, 4.675F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8516F, 0.0928F, 3.1416F, 0.0F, 2.3562F));

		PartDefinition Helmet_r14 = Head.addOrReplaceChild("Helmet_r14", CubeListBuilder.create().texOffs(115, 447)
				.addBox(-4.95F, -5.9559F, -9.8609F, 9.9F, 0.3438F, 0.6188F, new CubeDeformation(0.0F)).texOffs(135, 452)
				.addBox(-4.4F, -9.5769F, -15.7751F, 8.8F, 0.7778F, 0.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.4016F, 0.0928F, 2.3562F, 0.0F, 3.1416F));

		PartDefinition Helmet_r15 = Head.addOrReplaceChild("Helmet_r15",
				CubeListBuilder.create().texOffs(120, 412).addBox(-4.4F, -10.0387F, 3.0627F, 8.8F, 0.7778F, 0.55F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.4016F, 0.0928F, -2.3562F, 0.0F, -3.1416F));

		PartDefinition Helmet_r16 = Head.addOrReplaceChild("Helmet_r16",
				CubeListBuilder.create().texOffs(450, 117).addBox(-4.8125F, -15.0538F, -6.2296F, 9.625F, 0.4125F,
						0.4813F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8516F, 0.0928F, 2.7489F, 0.0F, 3.1416F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_r1 = Body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(143, 400).addBox(0.3745F, -4.375F, 0.313F, 0.2836F, 8.75F, 0.5303F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition body_r2 = Body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(118, 385)
				.addBox(0.0435F, -4.375F, 0.4861F, 1.2602F, 8.75F, 0.4477F, new CubeDeformation(0.0F)).texOffs(150, 427)
				.addBox(-0.3315F, -4.375F, 0.8611F, 0.4321F, 8.75F, 1.2602F, new CubeDeformation(0.0F))
				.texOffs(160, 457)
				.addBox(2.1876F, -4.375F, -1.1932F, 0.7955F, 8.6875F, 0.7955F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, 3.1416F, 0.7854F, 1.5708F));

		PartDefinition body_r3 = Body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(445, 450)
				.addBox(-2.6406F, -2.0219F, -2.3594F, 0.6187F, 0.6187F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(402, 480)
				.addBox(-2.0219F, -2.6406F, -2.3594F, 0.6187F, 0.6187F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(165, 487).addBox(-4.0273F, -3.0848F, 2.0156F, 1.0F, 1.1536F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(183, 455).addBox(-1.7734F, -5.3387F, 2.0156F, 1.0F, 1.1536F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(158, 392).addBox(-6.2657F, -4.6493F, 1.8906F, 1.0F, 1.1614F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(110, 397).addBox(-6.7176F, -3.3058F, 2.0156F, 1.0F, 1.1536F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(153, 445).addBox(-4.4637F, -5.5597F, 2.0156F, 1.0F, 1.1536F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(130, 407).addBox(1.2485F, -3.7013F, 2.2656F, 0.875F, 2.2109F, 0.25F, new CubeDeformation(0.0F))
				.texOffs(160, 452)
				.addBox(-2.3301F, -5.7364F, 1.8906F, 2.75F, 4.0112F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, 3.1416F, 0.0F, 2.3562F));

		PartDefinition body_r4 = Body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(417, 520)
				.addBox(1.2333F, -2.8464F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(417, 467)
				.addBox(-1.2435F, -1.4866F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(470, 447)
				.addBox(-2.3511F, -0.5629F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(440, 460)
				.addBox(1.8667F, -1.6196F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(377, 447)
				.addBox(-0.6101F, -0.2597F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(467, 457)
				.addBox(-1.5069F, 0.5296F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(517, 410).addBox(2.5F, -0.3927F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(492, 435).addBox(0.0233F, 0.9671F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(532, 455)
				.addBox(-0.6627F, 1.6221F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(412, 455).addBox(0.6566F, 2.1939F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(447, 470).addBox(3.1334F, 0.8341F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(427, 430)
				.addBox(0.1815F, 2.7146F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, 3.1416F, 0.0F, 2.5744F));

		PartDefinition body_r5 = Body
				.addOrReplaceChild(
						"body_r5", CubeListBuilder.create().texOffs(462, 400)
								.addBox(3.0F, -1.9219F, -2.3594F, 1.375F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(402, 417)
								.addBox(0.25F, -1.9219F, -2.3594F, 2.75F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(465, 387)
								.addBox(-1.25F, -1.5469F, -2.3594F, 2.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(477, 447)
								.addBox(-3.0F, -1.9219F, -2.3594F, 2.75F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(472, 517)
								.addBox(-4.375F, -1.9219F, -2.3594F, 1.375F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(455, 457)
								.addBox(2.875F, -0.5469F, -2.3594F, 1.5F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(437, 457)
								.addBox(0.375F, -0.5469F, -2.3594F, 2.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(410, 427)
								.addBox(-1.125F, -0.1719F, -2.3594F, 2.25F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(512, 437)
								.addBox(-2.875F, -0.5469F, -2.3594F, 2.5F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(455, 395)
								.addBox(-4.375F, -0.5469F, -2.3594F, 1.5F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(397, 387)
								.addBox(2.75F, 0.8281F, -2.3594F, 1.625F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(452, 475)
								.addBox(0.5F, 0.8281F, -2.3594F, 2.25F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(537, 480)
								.addBox(-1.0F, 1.2031F, -2.3594F, 2.0F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(395, 442)
								.addBox(-2.75F, 0.8281F, -2.3594F, 2.25F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(407, 440)
								.addBox(-4.375F, 0.8281F, -2.3594F, 1.625F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(515, 477)
								.addBox(-0.875F, 2.5781F, -2.3594F, 1.75F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(452, 510)
								.addBox(0.625F, 2.2031F, -2.3594F, 2.0F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(527, 437)
								.addBox(-4.375F, 2.2031F, -2.3594F, 1.75F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(477, 455)
								.addBox(-2.625F, 2.2031F, -2.3594F, 2.0F, 0.5F, 0.5F, new CubeDeformation(0.0F))
								.texOffs(155, 417)
								.addBox(0.375F, -6.9219F, 2.0156F, 2.4375F, 3.25F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(128, 455)
								.addBox(0.125F, -6.6719F, 2.0156F, 2.9375F, 2.75F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(88, 447)
								.addBox(-3.0625F, -6.6719F, 2.0156F, 2.9375F, 2.75F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(432, 432)
								.addBox(-4.375F, -3.2969F, -2.3594F, 3.9375F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(485, 432)
								.addBox(2.625F, 2.2031F, -2.3594F, 1.75F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(457, 452)
								.addBox(0.4375F, -3.2969F, -2.3594F, 3.9375F, 0.875F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(432, 405)
								.addBox(-3.8442F, -7.7512F, -2.365F, 3.51F, 0.945F, 0.135F, new CubeDeformation(0.0F))
								.texOffs(437, 455)
								.addBox(-3.8442F, -6.8062F, -2.365F, 0.675F, 0.7425F, 0.135F, new CubeDeformation(0.0F))
								.texOffs(898, 814).mirror()
								.addBox(-3.2029F, -6.8062F, -2.2975F, 1.1981F, 0.4725F, 0.0675F,
										new CubeDeformation(0.0F))
								.mirror(false).texOffs(868, 801).mirror()
								.addBox(2.0048F, -6.8062F, -2.2975F, 1.1981F, 0.4725F, 0.0675F,
										new CubeDeformation(0.0F))
								.mirror(false).texOffs(435, 417)
								.addBox(3.1692F, -6.8062F, -2.365F, 0.675F, 0.7425F, 0.135F, new CubeDeformation(0.0F))
								.texOffs(480, 445)
								.addBox(0.3342F, -7.7512F, -2.365F, 3.51F, 0.945F, 0.135F, new CubeDeformation(0.0F))
								.texOffs(118, 437)
								.addBox(-4.375F, -1.7344F, 1.2656F, 0.875F, 2.3125F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(110, 422)
								.addBox(3.5F, -1.7344F, 1.2656F, 0.875F, 2.3125F, 1.25F, new CubeDeformation(0.0F))
								.texOffs(83, 67).mirror()
								.addBox(-4.25F, -8.7469F, -2.2344F, 8.5F, 13.05F, 4.5F, new CubeDeformation(0.0F))
								.mirror(false).texOffs(133, 397)
								.addBox(-2.8125F, -6.9219F, 2.0156F, 2.4375F, 3.25F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(98, 415)
								.addBox(2.9375F, -7.5469F, 1.8906F, 1.25F, 4.1875F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(123, 432)
								.addBox(-0.1875F, -8.3594F, 1.8906F, 4.375F, 1.625F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(128, 482)
								.addBox(-0.1875F, -7.5469F, 1.8906F, 1.75F, 4.1875F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(155, 470)
								.addBox(0.75F, -7.2969F, 1.8906F, 2.6875F, 3.9375F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(143, 455)
								.addBox(-3.4375F, -7.2969F, 1.8906F, 2.6875F, 3.9375F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(163, 470)
								.addBox(-4.1875F, -7.5469F, 1.8906F, 1.25F, 4.1875F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(125, 435)
								.addBox(-1.5625F, -7.5469F, 1.8906F, 1.75F, 4.1875F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(128, 422)
								.addBox(-4.1875F, -8.3594F, 1.8906F, 4.375F, 1.625F, 1.0F, new CubeDeformation(-0.4F))
								.texOffs(766, 781).mirror()
								.addBox(-1.5F, -8.2969F, 1.8125F, 3.0F, 5.3125F, 1.0F, new CubeDeformation(-0.4F))
								.mirror(false),
						PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition body_r6 = Body.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(480, 482)
				.addBox(1.6244F, -0.4921F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(447, 505)
				.addBox(0.5728F, -1.4309F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(397, 395)
				.addBox(-1.857F, -2.9298F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(430, 430).addBox(0.7333F, 0.5625F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(485, 437)
				.addBox(-0.1135F, -0.2329F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(337, 425)
				.addBox(-2.5433F, -1.7318F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(422, 440)
				.addBox(-0.1577F, 1.6171F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(450, 465)
				.addBox(-0.7998F, 0.9651F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(527, 460)
				.addBox(-3.2295F, -0.5338F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(390, 440)
				.addBox(-1.4861F, 2.1632F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(530, 490)
				.addBox(-1.0488F, 2.6718F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(395, 445)
				.addBox(-3.9158F, 0.6643F, -2.3594F, 0.7344F, 0.3516F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, -3.1416F, 0.0F, -2.5307F));

		PartDefinition body_r7 = Body.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(163, 452)
				.addBox(3.4637F, -5.5597F, 2.0156F, 1.0F, 1.1536F, 1.0F, new CubeDeformation(-0.4F)).texOffs(158, 447)
				.addBox(5.2701F, -4.6449F, 1.8906F, 1.0F, 1.1614F, 1.0F, new CubeDeformation(-0.4F)).texOffs(133, 355)
				.addBox(5.7176F, -3.3058F, 2.0156F, 1.0F, 1.1536F, 1.0F, new CubeDeformation(-0.4F)).texOffs(155, 452)
				.addBox(0.7734F, -5.3387F, 2.0156F, 1.0F, 1.1536F, 1.0F, new CubeDeformation(-0.4F)).texOffs(120, 442)
				.addBox(3.0273F, -3.0848F, 2.0156F, 1.0F, 1.1536F, 1.0F, new CubeDeformation(-0.4F)).texOffs(419, 122)
				.addBox(-0.5858F, -1.2576F, 2.4781F, 0.7F, 1.85F, 0.2F, new CubeDeformation(0.0F)).texOffs(472, 497)
				.addBox(-0.7843F, -1.5123F, 2.2656F, 0.875F, 2.3125F, 0.25F, new CubeDeformation(0.0F))
				.texOffs(110, 427)
				.addBox(-2.1235F, -3.7013F, 2.2656F, 0.875F, 2.2109F, 0.25F, new CubeDeformation(0.0F))
				.texOffs(165, 472)
				.addBox(-0.4199F, -5.7364F, 1.8906F, 2.75F, 4.0112F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, -3.1416F, 0.0F, -2.3562F));

		PartDefinition body_r8 = Body.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(723, 503).mirror()
				.addBox(-0.5025F, -0.2938F, 1.7656F, 1.1536F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, -3.1416F, 0.0F, -3.0543F));

		PartDefinition body_r9 = Body.addOrReplaceChild("body_r9",
				CubeListBuilder.create().texOffs(100, 415)
						.addBox(-1.6322F, -5.8122F, -2.365F, 3.4019F, 0.6666F, 0.135F, new CubeDeformation(0.0F))
						.texOffs(445, 457)
						.addBox(-1.231F, -7.0825F, -2.365F, 3.5269F, 0.6666F, 0.135F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, 3.1416F, 0.0F, -2.7489F));

		PartDefinition body_r10 = Body.addOrReplaceChild("body_r10",
				CubeListBuilder.create().texOffs(150, 427)
						.addBox(-1.7697F, -5.8122F, -2.365F, 3.4019F, 0.6666F, 0.135F, new CubeDeformation(0.0F))
						.texOffs(435, 450)
						.addBox(-2.2959F, -7.0825F, -2.365F, 3.5269F, 0.6666F, 0.135F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, -3.1416F, 0.0F, 2.7489F));

		PartDefinition body_r11 = Body.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(434, 182)
				.addBox(0.0637F, -0.3632F, 2.4781F, 0.3984F, 0.9328F, 0.2F, new CubeDeformation(0.0F)).texOffs(807, 796)
				.addBox(0.4075F, -0.6835F, 2.4781F, 0.3125F, 1.5188F, 0.1375F, new CubeDeformation(0.0F))
				.texOffs(476, 142).addBox(0.72F, -0.8085F, 2.4781F, 0.25F, 1.7688F, 0.2F, new CubeDeformation(0.0F))
				.texOffs(150, 405)
				.addBox(-2.3906F, -4.3125F, 1.2656F, 0.25F, 0.9375F, 1.1875F, new CubeDeformation(0.0F))
				.texOffs(432, 427)
				.addBox(0.1178F, -1.0052F, 2.2656F, 1.0156F, 2.2109F, 0.25F, new CubeDeformation(0.0F))
				.texOffs(123, 405).addBox(-0.5781F, -3.5F, 2.2656F, 0.75F, 1.5625F, 0.25F, new CubeDeformation(0.0F))
				.texOffs(203, 447)
				.addBox(1.0887F, -1.9168F, 1.8906F, 2.8232F, 3.8336F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, 3.1416F, 0.0F, -1.5708F));

		PartDefinition body_r12 = Body.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(454, 135)
				.addBox(-0.5924F, 0.1142F, 2.4781F, 0.6F, 1.25F, 0.2F, new CubeDeformation(0.0F)).texOffs(125, 435)
				.addBox(0.6937F, -4.1009F, 2.2656F, 0.2031F, 0.4063F, 0.1875F, new CubeDeformation(0.0F))
				.texOffs(143, 435)
				.addBox(-0.5106F, -3.3654F, 2.2656F, 0.4063F, 0.875F, 0.1875F, new CubeDeformation(0.0F))
				.texOffs(462, 477).addBox(-0.8002F, 0.0907F, 2.2656F, 0.75F, 1.5625F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, -3.1416F, 0.0F, -0.7854F));

		PartDefinition body_r13 = Body.addOrReplaceChild("body_r13",
				CubeListBuilder.create().texOffs(165, 407)
						.addBox(-0.8968F, -4.1009F, 2.2656F, 0.2031F, 0.4063F, 0.1875F, new CubeDeformation(0.0F))
						.texOffs(140, 442)
						.addBox(0.1043F, -3.3654F, 2.2656F, 0.4063F, 0.875F, 0.1875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, 3.1416F, 0.0F, 0.7854F));

		PartDefinition body_r14 = Body.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(195, 465)
				.addBox(2.1406F, -4.375F, 1.2656F, 0.25F, 1.0F, 1.1875F, new CubeDeformation(0.0F)).texOffs(832, 786)
				.addBox(2.1406F, -4.25F, 1.2656F, 0.3125F, 8.4375F, 1.125F, new CubeDeformation(0.0F)).texOffs(108, 390)
				.addBox(1.8281F, -4.375F, 1.2656F, 0.3125F, 8.6875F, 1.1875F, new CubeDeformation(0.0F))
				.texOffs(128, 492)
				.addBox(2.3906F, -4.375F, 1.2656F, 0.5625F, 8.6875F, 1.1875F, new CubeDeformation(0.0F))
				.texOffs(125, 480).addBox(-0.1719F, -3.5F, 2.2656F, 0.75F, 1.5625F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5469F, -0.0156F, -3.1416F, 0.0F, 1.5708F));

		PartDefinition RighArm = partdefinition.addOrReplaceChild("RighArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition RightArm_r1 = RighArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(810, 802)
				.mirror().addBox(-8.2806F, -5.4268F, -2.5469F, 0.932F, 0.375F, 5.0625F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(123, 386).mirror()
				.addBox(-7.1719F, -8.4375F, -2.4219F, 2.25F, 1.3125F, 4.875F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(807, 819).mirror()
				.addBox(-2.2969F, -8.5625F, -2.1719F, 0.5F, 0.125F, 4.375F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 366).mirror()
				.addBox(-2.5469F, -8.4375F, -2.4219F, 3.625F, 1.9375F, 4.875F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(800, 832).mirror()
				.addBox(0.3281F, -8.5625F, -2.1719F, 0.5F, 0.125F, 4.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 6.0469F, -0.0156F, -3.1416F, 0.0F, 1.5708F));

		PartDefinition RightArm_r2 = RighArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(815, 802)
				.mirror().addBox(3.2221F, -4.5846F, -2.4844F, 2.125F, 0.3125F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(851, 884)
				.addBox(-0.4991F, -10.1669F, -2.2344F, 0.932F, 0.4609F, 4.5F, new CubeDeformation(0.0F))
				.texOffs(847, 849).mirror()
				.addBox(-1.6241F, -9.1434F, -2.5469F, 3.182F, 0.375F, 5.0625F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 433).mirror()
				.addBox(-1.6241F, -9.7059F, -2.4219F, 3.182F, 1.1875F, 4.875F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 6.0469F, -0.0156F, 3.1416F, 0.0F, 2.3562F));

		PartDefinition RightArm_r3 = RighArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(785, 737)
				.mirror().addBox(4.2721F, 3.2221F, -2.4844F, 2.125F, 0.3125F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(145, 427).mirror()
				.addBox(11.4763F, -0.2541F, -2.4219F, 0.2683F, 0.4419F, 4.875F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(138, 411).mirror()
				.addBox(4.2721F, 2.7953F, -2.4219F, 2.125F, 1.9375F, 4.875F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 6.0469F, -0.0156F, -3.1416F, 0.0F, -2.3562F));

		PartDefinition RightArm_r4 = RighArm.addOrReplaceChild("RightArm_r4", CubeListBuilder.create().texOffs(100, 421)
				.mirror().addBox(4.875F, -8.4844F, -2.4219F, 3.25F, 1.3125F, 4.875F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(138, 400).mirror()
				.addBox(8.125F, -8.1719F, -2.4219F, 0.3125F, 1.0F, 4.875F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(466, 190).mirror()
				.addBox(3.875F, -3.9219F, -2.2969F, 1.0625F, 0.3125F, 4.625F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(427, 140).mirror()
				.addBox(3.9375F, 2.2031F, -2.2344F, 4.3125F, 0.5625F, 4.5F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 1).addBox(4.0F, -8.2344F, -2.1719F, 4.1875F, 10.8125F, 4.375F, new CubeDeformation(0.0F))
				.texOffs(128, 407).mirror()
				.addBox(4.9974F, -1.0443F, -2.4219F, 0.3125F, 0.625F, 4.875F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(416, 160).mirror()
				.addBox(3.875F, -3.6094F, -2.2969F, 4.4375F, 0.5625F, 4.625F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(474, 205).mirror()
				.addBox(3.875F, -4.4844F, -2.2969F, 4.4375F, 0.5625F, 4.625F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 6.0469F, -0.0156F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition RightArm_r5 = RighArm.addOrReplaceChild("RightArm_r5", CubeListBuilder.create().texOffs(780, 834)
				.mirror().addBox(-2.1719F, -8.5625F, 0.0469F, 0.5F, 0.125F, 1.75F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(927, 882).mirror()
				.addBox(1.7031F, -8.5625F, -0.3281F, 0.5F, 0.125F, 1.75F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 6.0469F, -0.0156F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition RightArm_r6 = RighArm.addOrReplaceChild("RightArm_r6",
				CubeListBuilder.create().texOffs(130, 433).mirror()
						.addBox(-5.3585F, 3.8338F, -2.4219F, 2.125F, 1.9375F, 4.875F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(5.0F, 6.0469F, -0.0156F, -3.1416F, 0.0F, -0.7854F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(810, 802)
				.addBox(7.3487F, -5.4268F, -2.5469F, 0.932F, 0.375F, 5.0625F, new CubeDeformation(0.0F))
				.texOffs(123, 386)
				.addBox(4.9219F, -8.4375F, -2.4219F, 2.25F, 1.3125F, 4.875F, new CubeDeformation(0.0F))
				.texOffs(807, 819).addBox(1.7969F, -8.5625F, -2.1719F, 0.5F, 0.125F, 4.375F, new CubeDeformation(0.0F))
				.texOffs(105, 366)
				.addBox(-1.0781F, -8.4375F, -2.4219F, 3.625F, 1.9375F, 4.875F, new CubeDeformation(0.0F))
				.texOffs(800, 832)
				.addBox(-0.8281F, -8.5625F, -2.1719F, 0.5F, 0.125F, 4.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 6.0469F, -0.0156F, 3.1416F, 0.0F, -1.5708F));

		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(815, 802)
						.addBox(-5.3471F, -4.5846F, -2.4844F, 2.125F, 0.3125F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(851, 884).mirror()
						.addBox(-0.4328F, -10.1669F, -2.2344F, 0.932F, 0.4609F, 4.5F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(847, 849)
						.addBox(-1.5578F, -9.1434F, -2.5469F, 3.182F, 0.375F, 5.0625F, new CubeDeformation(0.0F))
						.texOffs(130, 433)
						.addBox(-1.5578F, -9.7059F, -2.4219F, 3.182F, 1.1875F, 4.875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 6.0469F, -0.0156F, -3.1416F, 0.0F, -2.3562F));

		PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(785, 737)
				.addBox(-6.3971F, 3.2221F, -2.4844F, 2.125F, 0.3125F, 5.0F, new CubeDeformation(0.0F)).texOffs(145, 427)
				.addBox(-11.7446F, -0.2541F, -2.4219F, 0.2683F, 0.4419F, 4.875F, new CubeDeformation(0.0F))
				.texOffs(138, 411)
				.addBox(-6.3971F, 2.7953F, -2.4219F, 2.125F, 1.9375F, 4.875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 6.0469F, -0.0156F, 3.1416F, 0.0F, 2.3562F));

		PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(100, 421)
				.addBox(-8.125F, -8.4844F, -2.4219F, 3.25F, 1.3125F, 4.875F, new CubeDeformation(0.0F))
				.texOffs(138, 400)
				.addBox(-8.4375F, -8.1719F, -2.4219F, 0.3125F, 1.0F, 4.875F, new CubeDeformation(0.0F))
				.texOffs(466, 190)
				.addBox(-4.9375F, -3.9219F, -2.2969F, 1.0625F, 0.3125F, 4.625F, new CubeDeformation(0.0F))
				.texOffs(427, 140).addBox(-8.25F, 2.2031F, -2.2344F, 4.3125F, 0.5625F, 4.5F, new CubeDeformation(0.0F))
				.texOffs(0, 1).mirror()
				.addBox(-8.1875F, -8.2344F, -2.1719F, 4.1875F, 10.8125F, 4.375F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(128, 407)
				.addBox(-5.3099F, -1.0443F, -2.4219F, 0.3125F, 0.625F, 4.875F, new CubeDeformation(0.0F))
				.texOffs(416, 160)
				.addBox(-8.3125F, -3.6094F, -2.2969F, 4.4375F, 0.5625F, 4.625F, new CubeDeformation(0.0F))
				.texOffs(474, 205)
				.addBox(-8.3125F, -4.4844F, -2.2969F, 4.4375F, 0.5625F, 4.625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 6.0469F, -0.0156F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition LeftArm_r5 = LeftArm.addOrReplaceChild("LeftArm_r5", CubeListBuilder.create().texOffs(780, 834)
				.addBox(1.6719F, -8.5625F, 0.0469F, 0.5F, 0.125F, 1.75F, new CubeDeformation(0.0F)).texOffs(927, 882)
				.addBox(-2.2031F, -8.5625F, -0.3281F, 0.5F, 0.125F, 1.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 6.0469F, -0.0156F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition LeftArm_r6 = LeftArm.addOrReplaceChild("LeftArm_r6",
				CubeListBuilder.create().texOffs(130, 433).addBox(3.2335F, 3.8338F, -2.4219F, 2.125F, 1.9375F, 4.875F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 6.0469F, -0.0156F, 3.1416F, 0.0F, 0.7854F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(765, 796)
						.addBox(5.0643F, -4.4729F, -6.6964F, 0.7873F, 4.9458F, 0.125F, new CubeDeformation(0.0F))
						.texOffs(895, 846)
						.addBox(4.5076F, -4.4729F, -7.9155F, 0.125F, 4.9458F, 0.7873F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 3.1416F, 0.7854F, 1.5708F));

		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(780, 833)
						.addBox(8.7845F, -4.4729F, -0.634F, 0.7873F, 4.9458F, 0.125F, new CubeDeformation(0.0F))
						.texOffs(872, 808)
						.addBox(8.7845F, -4.4729F, -2.4098F, 0.7873F, 4.9458F, 0.125F, new CubeDeformation(0.0F))
						.texOffs(892, 836)
						.addBox(8.2277F, -4.4729F, -1.853F, 0.125F, 4.9458F, 0.7873F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, -3.1416F, 0.0F, 1.5708F));

		PartDefinition RightLeg_r3 = RightLeg.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(780, 761)
						.addBox(-6.4084F, -4.4729F, 7.1282F, 0.125F, 4.9458F, 0.7873F, new CubeDeformation(0.0F))
						.texOffs(765, 748)
						.addBox(-5.8516F, -4.4729F, 8.3472F, 0.7873F, 4.9458F, 0.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 0.0F, -0.7854F, -1.5708F));

		PartDefinition RightLeg_r4 = RightLeg.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(775, 773).addBox(-10.1285F, -4.4729F, 1.0657F, 0.125F, 4.9458F,
						0.7873F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Rightleg_r5 = RightLeg.addOrReplaceChild("Rightleg_r5",
				CubeListBuilder.create().texOffs(118, 385).mirror()
						.addBox(-0.3125F, 4.5781F, 0.5156F, 4.625F, 0.75F, 0.8125F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(125, 425).mirror()
						.addBox(-0.3125F, 4.7656F, 0.3281F, 4.625F, 0.5625F, 0.1875F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(93, 377).mirror()
						.addBox(-0.3125F, 8.6704F, 0.7936F, 4.625F, 0.3438F, 0.5469F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(100, 382).mirror()
						.addBox(-0.3125F, 8.9829F, 0.9811F, 4.625F, 0.2188F, 0.3594F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(125, 440).mirror()
						.addBox(-0.3125F, 9.4531F, 0.7656F, 4.625F, 0.1875F, 0.5625F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(175, 450).mirror()
						.addBox(-0.3125F, 9.6406F, 0.5781F, 4.625F, 0.5625F, 0.75F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(148, 477).mirror()
						.addBox(-0.3125F, 4.5781F, 1.3281F, 4.625F, 4.625F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(440, 442).mirror()
						.addBox(0.3125F, 5.5955F, 1.3281F, 3.375F, 2.6076F, 1.25F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(412, 430).mirror()
						.addBox(0.3125F, 10.4705F, 1.3281F, 3.375F, 2.6076F, 1.25F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(75, 412).mirror()
						.addBox(-0.3125F, 9.4531F, 1.3281F, 4.625F, 3.4063F, 0.5156F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(103, 387).mirror()
						.addBox(-0.3125F, 9.4531F, 1.8359F, 4.625F, 4.625F, 0.4922F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(485, 472).mirror()
						.addBox(-0.25F, 6.7031F, -2.2344F, 4.5F, 0.5F, 4.5F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(362, 422).mirror()
						.addBox(-0.25F, 11.8281F, -2.2344F, 4.5F, 0.5F, 4.5F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 1)
						.addBox(-0.1875F, 2.8781F, -2.1719F, 4.375F, 11.575F, 4.375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition Rightleg_r6 = RightLeg.addOrReplaceChild("Rightleg_r6",
				CubeListBuilder.create().texOffs(133, 412).mirror()
						.addBox(-0.3125F, 3.6018F, -3.1378F, 4.625F, 0.1875F, 0.2652F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, -2.3562F, 0.0F, -3.1416F));

		PartDefinition Rightleg_r7 = RightLeg.addOrReplaceChild("Rightleg_r7",
				CubeListBuilder.create().texOffs(140, 385).mirror()
						.addBox(-0.3125F, -5.8129F, -7.2003F, 4.625F, 0.1875F, 0.2652F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, -0.7854F, 0.0F, 3.1416F));

		PartDefinition Rightleg_r8 = RightLeg.addOrReplaceChild("Rightleg_r8",
				CubeListBuilder.create().texOffs(135, 425).mirror()
						.addBox(-0.3125F, -7.4132F, 6.143F, 4.625F, 0.1875F, 0.2652F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 0.7854F, 0.0F, 3.1416F));

		PartDefinition Rightleg_r9 = RightLeg.addOrReplaceChild("Rightleg_r9",
				CubeListBuilder.create().texOffs(425, 130).mirror()
						.addBox(-10.2581F, -0.3925F, -1.9067F, 2.16F, 4.785F, 0.8947F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(382, 117).mirror()
						.addBox(-9.6255F, -0.3925F, -2.5394F, 0.8947F, 4.785F, 2.16F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 3.1416F, 0.0F, -1.5708F));

		PartDefinition Rightleg_r10 = RightLeg.addOrReplaceChild("Rightleg_r10",
				CubeListBuilder.create().texOffs(420, 140).mirror()
						.addBox(-8.6018F, -0.3925F, 5.0106F, 2.16F, 4.785F, 0.8947F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(467, 117).mirror()
						.addBox(-7.9692F, -0.3925F, 4.378F, 0.8947F, 4.785F, 2.16F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, -3.1416F, 0.7854F, -1.5708F));

		PartDefinition Rightleg_r11 = RightLeg.addOrReplaceChild("Rightleg_r11",
				CubeListBuilder.create().texOffs(118, 452).mirror()
						.addBox(-0.3125F, 3.1628F, 12.3888F, 4.625F, 0.5313F, 1.3203F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 1.9635F, 0.0F, 3.1416F));

		PartDefinition Rightleg_r12 = RightLeg.addOrReplaceChild("Rightleg_r12",
				CubeListBuilder.create().texOffs(153, 500).mirror()
						.addBox(-0.3125F, 4.307F, 8.9159F, 4.625F, 0.6875F, 1.4375F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 2.138F, 0.0F, 3.1416F));

		PartDefinition Rightleg_r13 = RightLeg.addOrReplaceChild("Rightleg_r13",
				CubeListBuilder.create().texOffs(95, 390).mirror()
						.addBox(-0.3125F, -4.8637F, 6.2692F, 4.625F, 0.8125F, 1.4375F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 1.1781F, 0.0F, 3.1416F));

		PartDefinition Rightleg_r14 = RightLeg.addOrReplaceChild("Rightleg_r14",
				CubeListBuilder.create().texOffs(455, 137).mirror()
						.addBox(-0.4375F, 2.7552F, 3.9263F, 4.875F, 0.5F, 0.5F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(138, 462).mirror()
						.addBox(-0.3125F, 2.723F, 3.9996F, 4.625F, 0.8125F, 1.4375F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 2.3562F, 0.0F, 3.1416F));

		PartDefinition Rightleg_r15 = RightLeg.addOrReplaceChild("Rightleg_r15",
				CubeListBuilder.create().texOffs(475, 437).mirror()
						.addBox(0.3125F, 5.4843F, -1.0094F, 3.375F, 0.6719F, 1.25F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(445, 450).mirror()
						.addBox(0.3125F, 9.9882F, -2.875F, 3.375F, 0.6719F, 1.25F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, -2.7489F, 0.0F, -3.1416F));

		PartDefinition Rightleg_r16 = RightLeg.addOrReplaceChild("Rightleg_r16",
				CubeListBuilder.create().texOffs(480, 502).mirror()
						.addBox(0.3125F, 6.5921F, 4.2711F, 3.375F, 0.6719F, 1.25F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(425, 415).mirror()
						.addBox(0.3125F, 11.096F, 6.1367F, 3.375F, 0.6719F, 1.25F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -3.4531F, -0.0156F, 2.7489F, 0.0F, 3.1416F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(765, 796).mirror()
						.addBox(-5.8516F, -4.4729F, -6.6964F, 0.7873F, 4.9458F, 0.125F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(895, 846).mirror()
						.addBox(-4.6326F, -4.4729F, -7.9155F, 0.125F, 4.9458F, 0.7873F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, -3.1416F, -0.7854F, -1.5708F));

		PartDefinition LeftLeg_r2 = LeftLeg.addOrReplaceChild("LeftLeg_r2", CubeListBuilder.create().texOffs(780, 833)
				.mirror().addBox(-9.5718F, -4.4729F, -0.634F, 0.7873F, 4.9458F, 0.125F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(872, 808).mirror()
				.addBox(-9.5718F, -4.4729F, -2.4098F, 0.7873F, 4.9458F, 0.125F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(892, 836).mirror()
				.addBox(-8.3527F, -4.4729F, -1.853F, 0.125F, 4.9458F, 0.7873F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 3.1416F, 0.0F, -1.5708F));

		PartDefinition LeftLeg_r3 = LeftLeg.addOrReplaceChild("LeftLeg_r3", CubeListBuilder.create().texOffs(780, 761)
				.mirror().addBox(6.2834F, -4.4729F, 7.1282F, 0.125F, 4.9458F, 0.7873F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(765, 748).mirror()
				.addBox(5.0643F, -4.4729F, 8.3472F, 0.7873F, 4.9458F, 0.125F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 0.0F, 0.7854F, 1.5708F));

		PartDefinition LeftLeg_r4 = LeftLeg.addOrReplaceChild("LeftLeg_r4",
				CubeListBuilder.create().texOffs(775, 773).mirror()
						.addBox(10.0035F, -4.4729F, 1.0657F, 0.125F, 4.9458F, 0.7873F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Leftleg_r5 = LeftLeg.addOrReplaceChild("Leftleg_r5", CubeListBuilder.create().texOffs(118, 385)
				.addBox(-4.3125F, 4.5781F, 0.5156F, 4.625F, 0.75F, 0.8125F, new CubeDeformation(0.0F)).texOffs(125, 425)
				.addBox(-4.3125F, 4.7656F, 0.3281F, 4.625F, 0.5625F, 0.1875F, new CubeDeformation(0.0F))
				.texOffs(93, 377)
				.addBox(-4.3125F, 8.6704F, 0.7936F, 4.625F, 0.3438F, 0.5469F, new CubeDeformation(0.0F))
				.texOffs(100, 382)
				.addBox(-4.3125F, 8.9829F, 0.9811F, 4.625F, 0.2188F, 0.3594F, new CubeDeformation(0.0F))
				.texOffs(125, 440)
				.addBox(-4.3125F, 9.4531F, 0.7656F, 4.625F, 0.1875F, 0.5625F, new CubeDeformation(0.0F))
				.texOffs(175, 450).addBox(-4.3125F, 9.6406F, 0.5781F, 4.625F, 0.5625F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(148, 477).addBox(-4.3125F, 4.5781F, 1.3281F, 4.625F, 4.625F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(440, 442).addBox(-3.6875F, 5.5955F, 1.3281F, 3.375F, 2.6076F, 1.25F, new CubeDeformation(0.0F))
				.texOffs(412, 430)
				.addBox(-3.6875F, 10.4705F, 1.3281F, 3.375F, 2.6076F, 1.25F, new CubeDeformation(0.0F)).texOffs(75, 412)
				.addBox(-4.3125F, 9.4531F, 1.3281F, 4.625F, 3.4063F, 0.5156F, new CubeDeformation(0.0F))
				.texOffs(103, 387)
				.addBox(-4.3125F, 9.4531F, 1.8359F, 4.625F, 4.625F, 0.4922F, new CubeDeformation(0.0F))
				.texOffs(485, 472).addBox(-4.25F, 6.7031F, -2.2344F, 4.5F, 0.5F, 4.5F, new CubeDeformation(0.0F))
				.texOffs(362, 422).addBox(-4.25F, 11.8281F, -2.2344F, 4.5F, 0.5F, 4.5F, new CubeDeformation(0.0F))
				.texOffs(0, 1).mirror()
				.addBox(-4.1875F, 2.8781F, -2.1719F, 4.375F, 11.575F, 4.375F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition Leftleg_r6 = LeftLeg.addOrReplaceChild("Leftleg_r6",
				CubeListBuilder.create().texOffs(133, 412).addBox(-4.3125F, 3.6018F, -3.1378F, 4.625F, 0.1875F, 0.2652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, -2.3562F, 0.0F, -3.1416F));

		PartDefinition Leftleg_r7 = LeftLeg.addOrReplaceChild("Leftleg_r7",
				CubeListBuilder.create().texOffs(140, 385).addBox(-4.3125F, -5.8129F, -7.2003F, 4.625F, 0.1875F,
						0.2652F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, -0.7854F, 0.0F, 3.1416F));

		PartDefinition Leftleg_r8 = LeftLeg.addOrReplaceChild("Leftleg_r8",
				CubeListBuilder.create().texOffs(135, 425).addBox(-4.3125F, -7.4132F, 6.143F, 4.625F, 0.1875F, 0.2652F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 0.7854F, 0.0F, 3.1416F));

		PartDefinition Leftleg_r9 = LeftLeg.addOrReplaceChild("Leftleg_r9",
				CubeListBuilder.create().texOffs(425, 130)
						.addBox(8.0981F, -0.3925F, -1.9067F, 2.16F, 4.785F, 0.8947F, new CubeDeformation(0.0F))
						.texOffs(382, 117)
						.addBox(8.7308F, -0.3925F, -2.5394F, 0.8947F, 4.785F, 2.16F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, -3.1416F, 0.0F, 1.5708F));

		PartDefinition Leftleg_r10 = LeftLeg.addOrReplaceChild("Leftleg_r10", CubeListBuilder.create().texOffs(420, 140)
				.addBox(6.4418F, -0.3925F, 5.0106F, 2.16F, 4.785F, 0.8947F, new CubeDeformation(0.0F)).texOffs(467, 117)
				.addBox(7.0745F, -0.3925F, 4.378F, 0.8947F, 4.785F, 2.16F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 3.1416F, -0.7854F, 1.5708F));

		PartDefinition Leftleg_r11 = LeftLeg.addOrReplaceChild("Leftleg_r11",
				CubeListBuilder.create().texOffs(118, 452).addBox(-4.3125F, 3.1628F, 12.3888F, 4.625F, 0.5313F, 1.3203F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 1.9635F, 0.0F, 3.1416F));

		PartDefinition Leftleg_r12 = LeftLeg.addOrReplaceChild("Leftleg_r12",
				CubeListBuilder.create().texOffs(153, 500).addBox(-4.3125F, 4.307F, 8.9159F, 4.625F, 0.6875F, 1.4375F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 2.138F, 0.0F, 3.1416F));

		PartDefinition Leftleg_r13 = LeftLeg.addOrReplaceChild("Leftleg_r13",
				CubeListBuilder.create().texOffs(95, 390).addBox(-4.3125F, -4.8637F, 6.2692F, 4.625F, 0.8125F, 1.4375F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 1.1781F, 0.0F, 3.1416F));

		PartDefinition Leftleg_r14 = LeftLeg.addOrReplaceChild("Leftleg_r14", CubeListBuilder.create().texOffs(455, 137)
				.addBox(-4.4375F, 2.7552F, 3.9263F, 4.875F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(138, 462)
				.addBox(-4.3125F, 2.723F, 3.9996F, 4.625F, 0.8125F, 1.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 2.3562F, 0.0F, 3.1416F));

		PartDefinition Leftleg_r15 = LeftLeg.addOrReplaceChild("Leftleg_r15",
				CubeListBuilder.create().texOffs(475, 437)
						.addBox(-3.6875F, 5.4843F, -1.0094F, 3.375F, 0.6719F, 1.25F, new CubeDeformation(0.0F))
						.texOffs(445, 450)
						.addBox(-3.6875F, 9.9882F, -2.875F, 3.375F, 0.6719F, 1.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, -2.7489F, 0.0F, -3.1416F));

		PartDefinition Leftleg_r16 = LeftLeg.addOrReplaceChild("Leftleg_r16", CubeListBuilder.create().texOffs(480, 502)
				.addBox(-3.6875F, 6.5921F, 4.2711F, 3.375F, 0.6719F, 1.25F, new CubeDeformation(0.0F)).texOffs(425, 415)
				.addBox(-3.6875F, 11.096F, 6.1367F, 3.375F, 0.6719F, 1.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -3.4531F, -0.0156F, 2.7489F, 0.0F, 3.1416F));

		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightBoot_r1 = RightBoots.addOrReplaceChild("RightBoot_r1",
				CubeListBuilder.create().texOffs(-1, 3).mirror()
						.addBox(-0.1306F, 15.2341F, -2.4543F, 4.4412F, 1.5675F, 4.6259F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(123, 422)
						.addBox(-0.2261F, 15.1688F, 0.7421F, 4.6322F, 1.3062F, 1.4369F, new CubeDeformation(0.0F))
						.texOffs(178, 550)
						.addBox(-0.1658F, 14.9076F, -1.2336F, 4.5719F, 0.6286F, 0.5388F, new CubeDeformation(0.0F))
						.texOffs(145, 495)
						.addBox(-0.1658F, 14.9076F, -0.6947F, 4.5719F, 1.3062F, 1.6981F, new CubeDeformation(0.0F))
						.texOffs(-1, 3).mirror()
						.addBox(-0.1306F, 14.7116F, -2.4543F, 4.4413F, 0.5225F, 4.6913F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.9F, -4.1485F, -0.0163F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition RightBoot_r2 = RightBoots.addOrReplaceChild("RightBoot_r2",
				CubeListBuilder.create().texOffs(0, 4).mirror()
						.addBox(-1.1186F, 15.2341F, 1.866F, 1.9594F, 1.5675F, 2.7431F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(160, 445)
						.addBox(-1.2067F, 15.1688F, 1.8284F, 1.9594F, 1.3062F, 2.8084F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -4.1485F, -0.0163F, 3.1416F, -0.48F, -3.1416F));

		PartDefinition RightBoot_r3 = RightBoots.addOrReplaceChild("RightBoot_r3",
				CubeListBuilder.create().texOffs(0, 4).mirror()
						.addBox(2.8669F, 15.2341F, -0.0642F, 1.9594F, 1.5675F, 2.7431F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(108, 447)
						.addBox(2.955F, 15.1688F, -0.1017F, 1.9594F, 1.3062F, 2.8084F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -4.1485F, -0.0163F, 3.1416F, 0.48F, -3.1416F));

		PartDefinition RightBoot_r4 = RightBoots.addOrReplaceChild("RightBoot_r4",
				CubeListBuilder.create().texOffs(0, 4).mirror()
						.addBox(-4.6048F, 15.2341F, 1.136F, 2.031F, 1.5675F, 1.908F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(168, 495)
						.addBox(-4.6701F, 15.1688F, 1.0707F, 2.1616F, 1.3062F, 2.0386F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -4.1485F, -0.0163F, 0.0F, -1.5708F, 0.0F));

		PartDefinition RightBoot_r5 = RightBoots.addOrReplaceChild("RightBoot_r5",
				CubeListBuilder.create().texOffs(123, 497)
						.addBox(-0.1658F, 14.1399F, 4.8276F, 4.5719F, 0.2612F, 1.0858F, new CubeDeformation(0.0F))
						.texOffs(113, 342)
						.addBox(-0.1658F, 15.4604F, 3.8951F, 4.5719F, 0.2613F, 1.0858F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -4.1485F, -0.0163F, 2.8798F, 0.0F, 3.1416F));

		PartDefinition RightBoot_r6 = RightBoots.addOrReplaceChild("RightBoot_r6",
				CubeListBuilder.create().texOffs(852, 764)
						.addBox(-0.2612F, 15.8873F, -2.2043F, 4.7025F, 0.9144F, 0.0653F, new CubeDeformation(0.0F))
						.texOffs(455, 170)
						.addBox(-0.1959F, 15.822F, -2.2696F, 4.5719F, 1.045F, 0.3919F, new CubeDeformation(0.0F))
						.texOffs(752, 732)
						.addBox(-0.2612F, 16.7363F, -2.139F, 4.7025F, 0.0653F, 0.8491F, new CubeDeformation(0.0F))
						.texOffs(342, 145)
						.addBox(-0.1959F, 16.4751F, -1.8777F, 4.5719F, 0.3919F, 0.6531F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -4.1485F, 0.2337F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition RightBoot_r7 = RightBoots.addOrReplaceChild("RightBoot_r7",
				CubeListBuilder.create().texOffs(507, 167).addBox(-0.1959F, -12.983F, -10.7837F, 4.5719F, 0.4674F,
						0.9237F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -4.1485F, 0.2337F, -0.7854F, 0.0F, -3.1416F));

		PartDefinition RightBoot_r8 = RightBoots.addOrReplaceChild("RightBoot_r8",
				CubeListBuilder.create().texOffs(115, 402).addBox(-0.1658F, 9.6674F, -11.9562F, 4.5719F, 1.3063F,
						0.5388F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, -4.1485F, -0.0163F, -2.3562F, 0.0F, 3.1416F));

		PartDefinition Leftboots = partdefinition.addOrReplaceChild("Leftboots", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftBoot_r1 = Leftboots.addOrReplaceChild("LeftBoot_r1",
				CubeListBuilder.create().texOffs(-1, 3)
						.addBox(-4.3106F, 15.2341F, -2.4543F, 4.4412F, 1.5675F, 4.6259F, new CubeDeformation(0.0F))
						.texOffs(123, 422).mirror()
						.addBox(-4.4061F, 15.1688F, 0.7421F, 4.6322F, 1.3062F, 1.4369F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(178, 550).mirror()
						.addBox(-4.4061F, 14.9076F, -1.2336F, 4.5719F, 0.6286F, 0.5388F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(145, 495).mirror()
						.addBox(-4.4061F, 14.9076F, -0.6947F, 4.5719F, 1.3062F, 1.6981F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(-1, 3)
						.addBox(-4.3106F, 14.7116F, -2.4543F, 4.4413F, 0.5225F, 4.6913F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, -4.1485F, -0.0163F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition LeftBoot_r2 = Leftboots.addOrReplaceChild("LeftBoot_r2",
				CubeListBuilder.create().texOffs(0, 4)
						.addBox(-0.8408F, 15.2341F, 1.866F, 1.9594F, 1.5675F, 2.7431F, new CubeDeformation(0.0F))
						.texOffs(160, 445).mirror()
						.addBox(-0.7527F, 15.1688F, 1.8284F, 1.9594F, 1.3062F, 2.8084F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.9F, -4.1485F, -0.0163F, -3.1416F, 0.48F, 3.1416F));

		PartDefinition LeftBoot_r3 = Leftboots.addOrReplaceChild("LeftBoot_r3",
				CubeListBuilder.create().texOffs(0, 4)
						.addBox(-4.8263F, 15.2341F, -0.0642F, 1.9594F, 1.5675F, 2.7431F, new CubeDeformation(0.0F))
						.texOffs(108, 447).mirror()
						.addBox(-4.9144F, 15.1688F, -0.1017F, 1.9594F, 1.3062F, 2.8084F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.9F, -4.1485F, -0.0163F, -3.1416F, -0.48F, 3.1416F));

		PartDefinition LeftBoot_r4 = Leftboots.addOrReplaceChild("LeftBoot_r4", CubeListBuilder.create().texOffs(0, 4)
				.addBox(2.5739F, 15.2341F, 1.136F, 2.031F, 1.5675F, 1.908F, new CubeDeformation(0.0F)).texOffs(168, 495)
				.mirror().addBox(2.5085F, 15.1688F, 1.0707F, 2.1616F, 1.3062F, 2.0386F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(-1.9F, -4.1485F, -0.0163F, 0.0F, 1.5708F, 0.0F));

		PartDefinition LeftBoot_r5 = Leftboots.addOrReplaceChild("LeftBoot_r5",
				CubeListBuilder.create().texOffs(123, 497).mirror()
						.addBox(-4.4061F, 14.1399F, 4.8276F, 4.5719F, 0.2612F, 1.0858F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(113, 342).mirror()
						.addBox(-4.4061F, 15.4604F, 3.8951F, 4.5719F, 0.2613F, 1.0858F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.9F, -4.1485F, -0.0163F, 2.8798F, 0.0F, 3.1416F));

		PartDefinition LeftBoot_r6 = Leftboots.addOrReplaceChild("LeftBoot_r6",
				CubeListBuilder.create().texOffs(852, 764).mirror()
						.addBox(-4.4413F, 15.8873F, -2.2043F, 4.7025F, 0.9144F, 0.0653F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(455, 170).mirror()
						.addBox(-4.3759F, 15.822F, -2.2696F, 4.5719F, 1.045F, 0.3919F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(752, 732).mirror()
						.addBox(-4.4413F, 16.7363F, -2.139F, 4.7025F, 0.0653F, 0.8491F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(342, 145).mirror()
						.addBox(-4.3759F, 16.4751F, -1.8777F, 4.5719F, 0.3919F, 0.6531F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.9F, -4.1485F, 0.2337F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition LeftBoot_r7 = Leftboots.addOrReplaceChild("LeftBoot_r7",
				CubeListBuilder.create().texOffs(507, 167).mirror()
						.addBox(-4.3759F, -12.983F, -10.7837F, 4.5719F, 0.4674F, 0.9237F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.9F, -4.1485F, 0.2337F, -0.7854F, 0.0F, 3.1416F));

		PartDefinition LeftBoot_r8 = Leftboots
				.addOrReplaceChild("LeftBoot_r8",
						CubeListBuilder.create().texOffs(115, 402).mirror()
								.addBox(-4.4061F, 9.6674F, -11.9562F, 4.5719F, 1.3063F, 0.5388F,
										new CubeDeformation(0.0F))
								.mirror(false),
						PartPose.offsetAndRotation(-1.9F, -4.1485F, -0.0163F, -2.3562F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RighArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftboots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}