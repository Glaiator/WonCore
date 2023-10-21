// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcaisse_de_larguage<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "caisse_de_larguage"), "main");
	private final ModelPart cube;
	private final ModelPart eye0;
	private final ModelPart eye1;
	private final ModelPart mouth;
	private final ModelPart Parachute1;
	private final ModelPart Parachute2;
	private final ModelPart Parachute3;
	private final ModelPart Parachute4;
	private final ModelPart Parachute5;
	private final ModelPart Parachute6;
	private final ModelPart Parachute7;
	private final ModelPart bb_main;

	public Modelcaisse_de_larguage(ModelPart root) {
		this.cube = root.getChild("cube");
		this.eye0 = root.getChild("eye0");
		this.eye1 = root.getChild("eye1");
		this.mouth = root.getChild("mouth");
		this.Parachute1 = root.getChild("Parachute1");
		this.Parachute2 = root.getChild("Parachute2");
		this.Parachute3 = root.getChild("Parachute3");
		this.Parachute4 = root.getChild("Parachute4");
		this.Parachute5 = root.getChild("Parachute5");
		this.Parachute6 = root.getChild("Parachute6");
		this.Parachute7 = root.getChild("Parachute7");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cube = partdefinition.addOrReplaceChild("cube",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, 11.0F, -7.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 10.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-7.0F, 10.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 90)
						.addBox(6.0F, 23.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(97, 0)
						.addBox(-7.0F, 23.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-6.0F, 23.0F, 6.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(97, 15)
						.addBox(-6.0F, 10.0F, 6.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(97, 17)
						.addBox(-6.0F, 10.0F, -7.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(97, 19)
						.addBox(-6.0F, 23.0F, -7.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(6.0F, 11.0F, -7.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(6.0F, 11.0F, 6.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-7.0F, 11.0F, 6.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 62)
						.addBox(-6.0F, 11.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = cube
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(58, 91).addBox(-7.0F, -4.8F, -4.7F, 1.0F, 1.0F, 18.3F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = cube.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(38, 90).addBox(6.0F, -4.8F, -13.4F, 1.0F, 1.0F, 18.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = cube.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 90).addBox(-7.0F, -4.8F, -13.4F, 1.0F, 1.0F, 18.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = cube.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(78, 86).addBox(-7.0F, -4.8F, -13.4F, 1.0F, 1.0F, 18.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, -0.7854F, 1.5708F, 0.0F));

		PartDefinition eye0 = partdefinition.addOrReplaceChild("eye0", CubeListBuilder.create().texOffs(16, 0).addBox(
				1.3F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eye1 = partdefinition.addOrReplaceChild("eye1", CubeListBuilder.create().texOffs(4, 15).addBox(
				-3.3F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mouth = partdefinition.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(10, 15)
				.addBox(-1.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Parachute1 = partdefinition.addOrReplaceChild("Parachute1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition bone61 = Parachute1.addOrReplaceChild("bone61", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r5 = bone61.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r6 = bone61.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r7 = bone61.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r8 = bone61.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r9 = bone61.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone62 = Parachute1.addOrReplaceChild("bone62", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r10 = bone62.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r11 = bone62.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r12 = bone62.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r13 = bone62.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r14 = bone62.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone63 = Parachute1.addOrReplaceChild("bone63", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r15 = bone63.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r16 = bone63.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r17 = bone63.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r18 = bone63.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r19 = bone63.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone64 = Parachute1.addOrReplaceChild("bone64", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r20 = bone64.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r21 = bone64.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r22 = bone64.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r23 = bone64.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r24 = bone64.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone65 = Parachute1.addOrReplaceChild("bone65", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r25 = bone65.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r26 = bone65.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r27 = bone65.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r28 = bone65.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r29 = bone65.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone66 = Parachute1.addOrReplaceChild("bone66", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r30 = bone66.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r31 = bone66.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r32 = bone66.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r33 = bone66.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r34 = bone66.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone67 = Parachute1.addOrReplaceChild("bone67", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r35 = bone67.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r36 = bone67.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r37 = bone67.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r38 = bone67.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r39 = bone67.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone68 = Parachute1.addOrReplaceChild("bone68", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r40 = bone68.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r41 = bone68.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r42 = bone68.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r43 = bone68.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r44 = bone68.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone69 = Parachute1.addOrReplaceChild("bone69", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r45 = bone69.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r46 = bone69.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r47 = bone69.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r48 = bone69.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r49 = bone69.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone70 = Parachute1.addOrReplaceChild("bone70", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone70.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r51 = bone70.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r52 = bone70.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r53 = bone70.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r54 = bone70.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone71 = Parachute1.addOrReplaceChild("bone71", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r55 = bone71.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r56 = bone71.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r57 = bone71.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r58 = bone71.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r59 = bone71.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone72 = Parachute1.addOrReplaceChild("bone72", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r60 = bone72.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r61 = bone72.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r62 = bone72.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r63 = bone72.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r64 = bone72.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition Parachute2 = partdefinition.addOrReplaceChild("Parachute2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition bone11 = Parachute2.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r65 = bone11.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r66 = bone11.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r67 = bone11.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r68 = bone11.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r69 = bone11.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone12 = Parachute2.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r70 = bone12.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r71 = bone12.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r72 = bone12.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r73 = bone12.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r74 = bone12.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone13 = Parachute2.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r75 = bone13.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r76 = bone13.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r77 = bone13.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r78 = bone13.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r79 = bone13.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone14 = Parachute2.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r80 = bone14.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r81 = bone14.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r82 = bone14.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r83 = bone14.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r84 = bone14.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone15 = Parachute2.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r85 = bone15.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r86 = bone15.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r87 = bone15.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r88 = bone15.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r89 = bone15.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone16 = Parachute2.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r90 = bone16.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r91 = bone16.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r92 = bone16.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r93 = bone16.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r94 = bone16.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone17 = Parachute2.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r95 = bone17.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r96 = bone17.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r97 = bone17.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r98 = bone17.addOrReplaceChild("cube_r98",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r99 = bone17.addOrReplaceChild("cube_r99",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone18 = Parachute2.addOrReplaceChild("bone18", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r100 = bone18.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r101 = bone18.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r102 = bone18.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r103 = bone18.addOrReplaceChild("cube_r103",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r104 = bone18.addOrReplaceChild("cube_r104",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone19 = Parachute2.addOrReplaceChild("bone19", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r105 = bone19.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r106 = bone19.addOrReplaceChild("cube_r106",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r107 = bone19.addOrReplaceChild("cube_r107",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r108 = bone19.addOrReplaceChild("cube_r108",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r109 = bone19.addOrReplaceChild("cube_r109",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone20 = Parachute2.addOrReplaceChild("bone20", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r110 = bone20.addOrReplaceChild("cube_r110",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r111 = bone20.addOrReplaceChild("cube_r111",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r112 = bone20.addOrReplaceChild("cube_r112",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r113 = bone20.addOrReplaceChild("cube_r113",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r114 = bone20.addOrReplaceChild("cube_r114",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition Parachute3 = partdefinition.addOrReplaceChild("Parachute3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.7453F, 0.0F));

		PartDefinition bone21 = Parachute3.addOrReplaceChild("bone21", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r115 = bone21.addOrReplaceChild("cube_r115",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r116 = bone21.addOrReplaceChild("cube_r116",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r117 = bone21.addOrReplaceChild("cube_r117",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r118 = bone21.addOrReplaceChild("cube_r118",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r119 = bone21.addOrReplaceChild("cube_r119",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone22 = Parachute3.addOrReplaceChild("bone22", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r120 = bone22.addOrReplaceChild("cube_r120",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r121 = bone22.addOrReplaceChild("cube_r121",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r122 = bone22.addOrReplaceChild("cube_r122",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r123 = bone22.addOrReplaceChild("cube_r123",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r124 = bone22.addOrReplaceChild("cube_r124",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone23 = Parachute3.addOrReplaceChild("bone23", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r125 = bone23.addOrReplaceChild("cube_r125",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r126 = bone23.addOrReplaceChild("cube_r126",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r127 = bone23.addOrReplaceChild("cube_r127",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r128 = bone23.addOrReplaceChild("cube_r128",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r129 = bone23.addOrReplaceChild("cube_r129",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone24 = Parachute3.addOrReplaceChild("bone24", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r130 = bone24.addOrReplaceChild("cube_r130",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r131 = bone24.addOrReplaceChild("cube_r131",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r132 = bone24.addOrReplaceChild("cube_r132",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r133 = bone24.addOrReplaceChild("cube_r133",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r134 = bone24.addOrReplaceChild("cube_r134",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone25 = Parachute3.addOrReplaceChild("bone25", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r135 = bone25.addOrReplaceChild("cube_r135",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r136 = bone25.addOrReplaceChild("cube_r136",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r137 = bone25.addOrReplaceChild("cube_r137",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r138 = bone25.addOrReplaceChild("cube_r138",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r139 = bone25.addOrReplaceChild("cube_r139",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone26 = Parachute3.addOrReplaceChild("bone26", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r140 = bone26.addOrReplaceChild("cube_r140",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r141 = bone26.addOrReplaceChild("cube_r141",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r142 = bone26.addOrReplaceChild("cube_r142",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r143 = bone26.addOrReplaceChild("cube_r143",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r144 = bone26.addOrReplaceChild("cube_r144",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone27 = Parachute3.addOrReplaceChild("bone27", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r145 = bone27.addOrReplaceChild("cube_r145",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r146 = bone27.addOrReplaceChild("cube_r146",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r147 = bone27.addOrReplaceChild("cube_r147",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r148 = bone27.addOrReplaceChild("cube_r148",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r149 = bone27.addOrReplaceChild("cube_r149",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone28 = Parachute3.addOrReplaceChild("bone28", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r150 = bone28.addOrReplaceChild("cube_r150",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r151 = bone28.addOrReplaceChild("cube_r151",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r152 = bone28.addOrReplaceChild("cube_r152",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r153 = bone28.addOrReplaceChild("cube_r153",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r154 = bone28.addOrReplaceChild("cube_r154",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone29 = Parachute3.addOrReplaceChild("bone29", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r155 = bone29.addOrReplaceChild("cube_r155",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r156 = bone29.addOrReplaceChild("cube_r156",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r157 = bone29.addOrReplaceChild("cube_r157",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r158 = bone29.addOrReplaceChild("cube_r158",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r159 = bone29.addOrReplaceChild("cube_r159",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone30 = Parachute3.addOrReplaceChild("bone30", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r160 = bone30.addOrReplaceChild("cube_r160",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r161 = bone30.addOrReplaceChild("cube_r161",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r162 = bone30.addOrReplaceChild("cube_r162",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r163 = bone30.addOrReplaceChild("cube_r163",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r164 = bone30.addOrReplaceChild("cube_r164",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition Parachute4 = partdefinition.addOrReplaceChild("Parachute4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -2.618F, 0.0F));

		PartDefinition bone31 = Parachute4.addOrReplaceChild("bone31", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r165 = bone31.addOrReplaceChild("cube_r165",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r166 = bone31.addOrReplaceChild("cube_r166",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r167 = bone31.addOrReplaceChild("cube_r167",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r168 = bone31.addOrReplaceChild("cube_r168",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r169 = bone31.addOrReplaceChild("cube_r169",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone32 = Parachute4.addOrReplaceChild("bone32", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r170 = bone32.addOrReplaceChild("cube_r170",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r171 = bone32.addOrReplaceChild("cube_r171",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r172 = bone32.addOrReplaceChild("cube_r172",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r173 = bone32.addOrReplaceChild("cube_r173",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r174 = bone32.addOrReplaceChild("cube_r174",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone33 = Parachute4.addOrReplaceChild("bone33", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r175 = bone33.addOrReplaceChild("cube_r175",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r176 = bone33.addOrReplaceChild("cube_r176",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r177 = bone33.addOrReplaceChild("cube_r177",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r178 = bone33.addOrReplaceChild("cube_r178",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r179 = bone33.addOrReplaceChild("cube_r179",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone34 = Parachute4.addOrReplaceChild("bone34", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r180 = bone34.addOrReplaceChild("cube_r180",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r181 = bone34.addOrReplaceChild("cube_r181",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r182 = bone34.addOrReplaceChild("cube_r182",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r183 = bone34.addOrReplaceChild("cube_r183",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r184 = bone34.addOrReplaceChild("cube_r184",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone35 = Parachute4.addOrReplaceChild("bone35", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r185 = bone35.addOrReplaceChild("cube_r185",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r186 = bone35.addOrReplaceChild("cube_r186",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r187 = bone35.addOrReplaceChild("cube_r187",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r188 = bone35.addOrReplaceChild("cube_r188",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r189 = bone35.addOrReplaceChild("cube_r189",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone36 = Parachute4.addOrReplaceChild("bone36", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r190 = bone36.addOrReplaceChild("cube_r190",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r191 = bone36.addOrReplaceChild("cube_r191",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r192 = bone36.addOrReplaceChild("cube_r192",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r193 = bone36.addOrReplaceChild("cube_r193",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r194 = bone36.addOrReplaceChild("cube_r194",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone37 = Parachute4.addOrReplaceChild("bone37", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r195 = bone37.addOrReplaceChild("cube_r195",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r196 = bone37.addOrReplaceChild("cube_r196",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r197 = bone37.addOrReplaceChild("cube_r197",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r198 = bone37.addOrReplaceChild("cube_r198",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r199 = bone37.addOrReplaceChild("cube_r199",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone38 = Parachute4.addOrReplaceChild("bone38", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r200 = bone38.addOrReplaceChild("cube_r200",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r201 = bone38.addOrReplaceChild("cube_r201",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r202 = bone38.addOrReplaceChild("cube_r202",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r203 = bone38.addOrReplaceChild("cube_r203",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r204 = bone38.addOrReplaceChild("cube_r204",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone39 = Parachute4.addOrReplaceChild("bone39", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r205 = bone39.addOrReplaceChild("cube_r205",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r206 = bone39.addOrReplaceChild("cube_r206",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r207 = bone39.addOrReplaceChild("cube_r207",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r208 = bone39.addOrReplaceChild("cube_r208",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r209 = bone39.addOrReplaceChild("cube_r209",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone40 = Parachute4.addOrReplaceChild("bone40", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r210 = bone40.addOrReplaceChild("cube_r210",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r211 = bone40.addOrReplaceChild("cube_r211",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r212 = bone40.addOrReplaceChild("cube_r212",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r213 = bone40.addOrReplaceChild("cube_r213",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r214 = bone40.addOrReplaceChild("cube_r214",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition Parachute5 = partdefinition.addOrReplaceChild("Parachute5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 2.7925F, 0.0F));

		PartDefinition bone41 = Parachute5.addOrReplaceChild("bone41", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r215 = bone41.addOrReplaceChild("cube_r215",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r216 = bone41.addOrReplaceChild("cube_r216",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r217 = bone41.addOrReplaceChild("cube_r217",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r218 = bone41.addOrReplaceChild("cube_r218",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r219 = bone41.addOrReplaceChild("cube_r219",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone42 = Parachute5.addOrReplaceChild("bone42", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r220 = bone42.addOrReplaceChild("cube_r220",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r221 = bone42.addOrReplaceChild("cube_r221",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r222 = bone42.addOrReplaceChild("cube_r222",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r223 = bone42.addOrReplaceChild("cube_r223",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r224 = bone42.addOrReplaceChild("cube_r224",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone43 = Parachute5.addOrReplaceChild("bone43", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r225 = bone43.addOrReplaceChild("cube_r225",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r226 = bone43.addOrReplaceChild("cube_r226",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r227 = bone43.addOrReplaceChild("cube_r227",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r228 = bone43.addOrReplaceChild("cube_r228",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r229 = bone43.addOrReplaceChild("cube_r229",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone44 = Parachute5.addOrReplaceChild("bone44", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r230 = bone44.addOrReplaceChild("cube_r230",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r231 = bone44.addOrReplaceChild("cube_r231",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r232 = bone44.addOrReplaceChild("cube_r232",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r233 = bone44.addOrReplaceChild("cube_r233",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r234 = bone44.addOrReplaceChild("cube_r234",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone45 = Parachute5.addOrReplaceChild("bone45", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r235 = bone45.addOrReplaceChild("cube_r235",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r236 = bone45.addOrReplaceChild("cube_r236",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r237 = bone45.addOrReplaceChild("cube_r237",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r238 = bone45.addOrReplaceChild("cube_r238",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r239 = bone45.addOrReplaceChild("cube_r239",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone46 = Parachute5.addOrReplaceChild("bone46", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r240 = bone46.addOrReplaceChild("cube_r240",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r241 = bone46.addOrReplaceChild("cube_r241",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r242 = bone46.addOrReplaceChild("cube_r242",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r243 = bone46.addOrReplaceChild("cube_r243",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r244 = bone46.addOrReplaceChild("cube_r244",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone47 = Parachute5.addOrReplaceChild("bone47", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r245 = bone47.addOrReplaceChild("cube_r245",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r246 = bone47.addOrReplaceChild("cube_r246",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r247 = bone47.addOrReplaceChild("cube_r247",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r248 = bone47.addOrReplaceChild("cube_r248",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r249 = bone47.addOrReplaceChild("cube_r249",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone48 = Parachute5.addOrReplaceChild("bone48", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r250 = bone48.addOrReplaceChild("cube_r250",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r251 = bone48.addOrReplaceChild("cube_r251",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r252 = bone48.addOrReplaceChild("cube_r252",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r253 = bone48.addOrReplaceChild("cube_r253",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r254 = bone48.addOrReplaceChild("cube_r254",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone49 = Parachute5.addOrReplaceChild("bone49", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r255 = bone49.addOrReplaceChild("cube_r255",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r256 = bone49.addOrReplaceChild("cube_r256",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r257 = bone49.addOrReplaceChild("cube_r257",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r258 = bone49.addOrReplaceChild("cube_r258",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r259 = bone49.addOrReplaceChild("cube_r259",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone50 = Parachute5.addOrReplaceChild("bone50", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r260 = bone50.addOrReplaceChild("cube_r260",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r261 = bone50.addOrReplaceChild("cube_r261",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r262 = bone50.addOrReplaceChild("cube_r262",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r263 = bone50.addOrReplaceChild("cube_r263",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r264 = bone50.addOrReplaceChild("cube_r264",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition Parachute6 = partdefinition.addOrReplaceChild("Parachute6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.9199F, 0.0F));

		PartDefinition bone51 = Parachute6.addOrReplaceChild("bone51", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r265 = bone51.addOrReplaceChild("cube_r265",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r266 = bone51.addOrReplaceChild("cube_r266",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r267 = bone51.addOrReplaceChild("cube_r267",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r268 = bone51.addOrReplaceChild("cube_r268",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r269 = bone51.addOrReplaceChild("cube_r269",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone52 = Parachute6.addOrReplaceChild("bone52", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r270 = bone52.addOrReplaceChild("cube_r270",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r271 = bone52.addOrReplaceChild("cube_r271",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r272 = bone52.addOrReplaceChild("cube_r272",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r273 = bone52.addOrReplaceChild("cube_r273",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r274 = bone52.addOrReplaceChild("cube_r274",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone53 = Parachute6.addOrReplaceChild("bone53", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r275 = bone53.addOrReplaceChild("cube_r275",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r276 = bone53.addOrReplaceChild("cube_r276",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r277 = bone53.addOrReplaceChild("cube_r277",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r278 = bone53.addOrReplaceChild("cube_r278",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r279 = bone53.addOrReplaceChild("cube_r279",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone54 = Parachute6.addOrReplaceChild("bone54", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r280 = bone54.addOrReplaceChild("cube_r280",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r281 = bone54.addOrReplaceChild("cube_r281",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r282 = bone54.addOrReplaceChild("cube_r282",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r283 = bone54.addOrReplaceChild("cube_r283",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r284 = bone54.addOrReplaceChild("cube_r284",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone55 = Parachute6.addOrReplaceChild("bone55", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r285 = bone55.addOrReplaceChild("cube_r285",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r286 = bone55.addOrReplaceChild("cube_r286",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r287 = bone55.addOrReplaceChild("cube_r287",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r288 = bone55.addOrReplaceChild("cube_r288",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r289 = bone55.addOrReplaceChild("cube_r289",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone56 = Parachute6.addOrReplaceChild("bone56", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r290 = bone56.addOrReplaceChild("cube_r290",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r291 = bone56.addOrReplaceChild("cube_r291",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r292 = bone56.addOrReplaceChild("cube_r292",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r293 = bone56.addOrReplaceChild("cube_r293",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r294 = bone56.addOrReplaceChild("cube_r294",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone57 = Parachute6.addOrReplaceChild("bone57", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r295 = bone57.addOrReplaceChild("cube_r295",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r296 = bone57.addOrReplaceChild("cube_r296",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r297 = bone57.addOrReplaceChild("cube_r297",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r298 = bone57.addOrReplaceChild("cube_r298",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r299 = bone57.addOrReplaceChild("cube_r299",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone58 = Parachute6.addOrReplaceChild("bone58", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r300 = bone58.addOrReplaceChild("cube_r300",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r301 = bone58.addOrReplaceChild("cube_r301",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r302 = bone58.addOrReplaceChild("cube_r302",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r303 = bone58.addOrReplaceChild("cube_r303",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r304 = bone58.addOrReplaceChild("cube_r304",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone59 = Parachute6.addOrReplaceChild("bone59", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r305 = bone59.addOrReplaceChild("cube_r305",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r306 = bone59.addOrReplaceChild("cube_r306",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r307 = bone59.addOrReplaceChild("cube_r307",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r308 = bone59.addOrReplaceChild("cube_r308",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r309 = bone59.addOrReplaceChild("cube_r309",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone60 = Parachute6.addOrReplaceChild("bone60", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r310 = bone60.addOrReplaceChild("cube_r310",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r311 = bone60.addOrReplaceChild("cube_r311",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r312 = bone60.addOrReplaceChild("cube_r312",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r313 = bone60.addOrReplaceChild("cube_r313",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r314 = bone60.addOrReplaceChild("cube_r314",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition Parachute7 = partdefinition.addOrReplaceChild("Parachute7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone10 = Parachute7.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r315 = bone10.addOrReplaceChild("cube_r315",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r316 = bone10.addOrReplaceChild("cube_r316",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r317 = bone10.addOrReplaceChild("cube_r317",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r318 = bone10.addOrReplaceChild("cube_r318",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r319 = bone10.addOrReplaceChild("cube_r319",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone9 = Parachute7.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r320 = bone9.addOrReplaceChild("cube_r320",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r321 = bone9.addOrReplaceChild("cube_r321",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r322 = bone9.addOrReplaceChild("cube_r322",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r323 = bone9.addOrReplaceChild("cube_r323",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r324 = bone9.addOrReplaceChild("cube_r324",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone8 = Parachute7.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r325 = bone8.addOrReplaceChild("cube_r325",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r326 = bone8.addOrReplaceChild("cube_r326",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r327 = bone8.addOrReplaceChild("cube_r327",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r328 = bone8.addOrReplaceChild("cube_r328",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r329 = bone8.addOrReplaceChild("cube_r329",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone7 = Parachute7.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r330 = bone7.addOrReplaceChild("cube_r330",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r331 = bone7.addOrReplaceChild("cube_r331",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r332 = bone7.addOrReplaceChild("cube_r332",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r333 = bone7.addOrReplaceChild("cube_r333",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r334 = bone7.addOrReplaceChild("cube_r334",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone6 = Parachute7.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r335 = bone6.addOrReplaceChild("cube_r335",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r336 = bone6.addOrReplaceChild("cube_r336",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r337 = bone6.addOrReplaceChild("cube_r337",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r338 = bone6.addOrReplaceChild("cube_r338",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r339 = bone6.addOrReplaceChild("cube_r339",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone5 = Parachute7.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r340 = bone5.addOrReplaceChild("cube_r340",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r341 = bone5.addOrReplaceChild("cube_r341",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r342 = bone5.addOrReplaceChild("cube_r342",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r343 = bone5.addOrReplaceChild("cube_r343",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r344 = bone5.addOrReplaceChild("cube_r344",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone4 = Parachute7.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r345 = bone4.addOrReplaceChild("cube_r345",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r346 = bone4.addOrReplaceChild("cube_r346",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r347 = bone4.addOrReplaceChild("cube_r347",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r348 = bone4.addOrReplaceChild("cube_r348",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r349 = bone4.addOrReplaceChild("cube_r349",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone3 = Parachute7.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r350 = bone3.addOrReplaceChild("cube_r350",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r351 = bone3.addOrReplaceChild("cube_r351",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r352 = bone3.addOrReplaceChild("cube_r352",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r353 = bone3.addOrReplaceChild("cube_r353",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r354 = bone3.addOrReplaceChild("cube_r354",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone2 = Parachute7.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r355 = bone2.addOrReplaceChild("cube_r355",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 8.5F, -19.4545F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -71.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r356 = bone2.addOrReplaceChild("cube_r356",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 13.5548F, -15.213F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -72.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r357 = bone2.addOrReplaceChild("cube_r357",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 16.2198F, -14.0297F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -75.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r358 = bone2.addOrReplaceChild("cube_r358",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.7113F, -9.2993F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -76.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r359 = bone2.addOrReplaceChild("cube_r359",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, 17.9277F, -9.656F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bone = Parachute7.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r360 = bone.addOrReplaceChild("cube_r360",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7329F, -52.293F, -14.7329F, 1.0472F, -0.7854F, 0.0F));

		PartDefinition cube_r361 = bone.addOrReplaceChild("cube_r361",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2658F, -53.9553F, -13.2658F, 0.6981F, -0.7854F, 0.0F));

		PartDefinition cube_r362 = bone.addOrReplaceChild("cube_r362",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5763F, -56.3508F, -9.5763F, 0.4363F, -0.7854F, 0.0F));

		PartDefinition cube_r363 = bone.addOrReplaceChild("cube_r363",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5742F, -57.3141F, -5.5742F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r364 = bone.addOrReplaceChild("cube_r364",
				CubeListBuilder.create().texOffs(186, 217).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -58.0F, 0.0F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r365 = bb_main.addOrReplaceChild("cube_r365",
				CubeListBuilder.create().texOffs(0, 113).addBox(-0.5F, -44.5F, -0.5F, 1.0F, 45.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.2F, 0.0F, 0.4974F, 0.7854F, 0.0F));

		PartDefinition cube_r366 = bb_main.addOrReplaceChild("cube_r366",
				CubeListBuilder.create().texOffs(0, 113).addBox(-0.5F, -44.5F, -0.5F, 1.0F, 45.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.2F, 0.0F, 0.4974F, -0.7854F, 0.0F));

		PartDefinition cube_r367 = bb_main.addOrReplaceChild("cube_r367",
				CubeListBuilder.create().texOffs(0, 113).addBox(-0.5F, -44.5F, -0.5F, 1.0F, 45.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.2F, 0.0F, 0.4974F, -2.3562F, 0.0F));

		PartDefinition cube_r368 = bb_main.addOrReplaceChild("cube_r368",
				CubeListBuilder.create().texOffs(0, 113).addBox(-0.5F, -44.5F, -0.5F, 1.0F, 45.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.2F, 0.0F, 0.4974F, 2.3562F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cube.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mouth.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Parachute1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Parachute2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Parachute3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Parachute4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Parachute5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Parachute6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Parachute7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}