
package net.mcreator.woncore.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.woncore.init.WoncoreModItems;
import net.mcreator.woncore.init.WoncoreModFluids;
import net.mcreator.woncore.init.WoncoreModBlocks;

public abstract class MercuryFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(WoncoreModFluids.MERCURY, WoncoreModFluids.FLOWING_MERCURY,
			FluidAttributes.builder(new ResourceLocation("woncore:blocks/mercuryliquid"), new ResourceLocation("woncore:blocks/mercury_flow"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))))
			.explosionResistance(100f)

			.tickRate(15)

			.bucket(WoncoreModItems.MERCURY_BUCKET).block(() -> (LiquidBlock) WoncoreModBlocks.MERCURY.get());

	private MercuryFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(0.2);
	}

	public static class Source extends MercuryFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MercuryFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
