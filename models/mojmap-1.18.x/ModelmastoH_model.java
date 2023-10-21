// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelmastoH_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Head;

	public ModelmastoH_model(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Casque = Head.addOrReplaceChild("Casque", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Cagoule = Casque.addOrReplaceChild("Cagoule",
				CubeListBuilder.create().texOffs(27, 6)
						.addBox(-4.5F, -1.3F, -4.575F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-4.4F, -1.4F, -4.375F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-4.6F, -1.4F, -4.475F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Cagoule
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(8, 0).addBox(-4.1F, -4.75F, -5.375F, 8.0F, 6.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Visiere = Casque.addOrReplaceChild("Visiere",
				CubeListBuilder.create().texOffs(66, 17)
						.addBox(-2.0211F, -0.25F, -5.3226F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 65)
						.addBox(-0.9962F, -5.8624F, -5.6919F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Visiere.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(75, 67).addBox(-3.0F, -3.75F, -5.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5358F, -2.1124F, -0.7981F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r3 = Visiere.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(75, 69).addBox(1.0F, -3.75F, -5.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5358F, -2.1124F, -0.7981F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r4 = Visiere.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(77, 50).addBox(1.0F, -3.75F, -5.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6285F, -2.1124F, -0.9468F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r5 = Visiere.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(52, 77).addBox(-3.0F, -3.75F, -5.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6285F, -2.1124F, -0.9468F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r6 = Visiere.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(25, 37).addBox(-3.0F, -3.75F, -5.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.505F, -1.3881F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r7 = Visiere.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(34, 49).addBox(2.0F, -3.75F, -5.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.505F, -1.3881F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r8 = Visiere.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(75, 42).addBox(2.0F, -0.75F, -5.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6219F, 1.502F, -0.4637F, 0.0844F, -0.1002F, -0.7024F));

		PartDefinition cube_r9 = Visiere.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(85, 65).addBox(2.0F, -0.75F, -5.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5796F, 1.1991F, -0.6219F, 0.045F, -0.123F, -0.3518F));

		PartDefinition cube_r10 = Visiere.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(77, 63).addBox(-4.0F, -0.75F, -5.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6219F, 1.502F, -0.4637F, 0.0844F, 0.1002F, 0.7024F));

		PartDefinition cube_r11 = Visiere.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(86, 0).addBox(-3.0F, -0.75F, -5.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5796F, 1.1991F, -0.6219F, 0.045F, 0.123F, 0.3518F));

		PartDefinition Blockcasque = Casque.addOrReplaceChild("Blockcasque", CubeListBuilder.create().texOffs(27, 17)
				.addBox(-4.5F, -8.6F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Blockcasque.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(25, 3).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.8929F, 4.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Blockcasque.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(86, 50).addBox(2.75F, -8.25F, 13.4F, 9.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1795F, -0.8628F, -9.7828F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Blockcasque.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(55, 65).addBox(3.5F, -8.25F, 8.4F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.4122F, 0.0F, -5.0947F, -0.0869F, -0.7816F, 0.1231F));

		PartDefinition cube_r15 = Blockcasque
				.addOrReplaceChild("cube_r15",
						CubeListBuilder.create().texOffs(23, 49).addBox(3.5F, -8.25F, -4.6F, 1.0F, 7.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r16 = Blockcasque.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(32, 85).addBox(3.5F, -9.25F, 8.4F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.1174F, 1.4582F, -0.3896F, 0.5468F, -0.5956F, -0.8262F));

		PartDefinition cube_r17 = Blockcasque.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(36, 85).addBox(-4.5F, -9.25F, 8.4F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1174F, 1.4582F, -0.3896F, 0.5468F, 0.5956F, 0.8262F));

		PartDefinition cube_r18 = Blockcasque.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(49, 67).addBox(-4.5F, -8.25F, 8.4F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4122F, 0.0F, -5.0947F, -0.0869F, 0.7816F, -0.1231F));

		PartDefinition cube_r19 = Blockcasque.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(27, 27).addBox(-4.5F, -9.5F, -3.6F, 9.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4155F, -6.1536F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Blockcasque
				.addOrReplaceChild("cube_r20",
						CubeListBuilder.create().texOffs(25, 0).addBox(-5.0F, -8.5F, -3.6F, 10.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Blockcasque.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(66, 44).addBox(3.5F, -9.25F, -4.6F, 1.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9986F, 1.3785F, 0.1F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r22 = Blockcasque.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(44, 67).addBox(-4.5F, -9.25F, -4.6F, 1.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9986F, 1.3785F, 0.1F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r23 = Blockcasque
				.addOrReplaceChild("cube_r23",
						CubeListBuilder.create().texOffs(43, 49).addBox(-4.5F, -8.25F, -4.6F, 1.0F, 7.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}