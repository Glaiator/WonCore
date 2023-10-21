// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcaisse_de_larguage_sans_parachute<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "caisse_de_larguage_sans_parachute"), "main");
	private final ModelPart cube;
	private final ModelPart eye0;
	private final ModelPart eye1;
	private final ModelPart mouth;

	public Modelcaisse_de_larguage_sans_parachute(ModelPart root) {
		this.cube = root.getChild("cube");
		this.eye0 = root.getChild("eye0");
		this.eye1 = root.getChild("eye1");
		this.mouth = root.getChild("mouth");
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
	}
}