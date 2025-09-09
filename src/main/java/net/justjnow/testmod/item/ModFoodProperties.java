package net.justjnow.testmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties MYSTIC_STEW = new FoodProperties.Builder().nutrition(1)
            .saturationModifier(1.5F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 6000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.JUMP, 6000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 6000, 0), 1.0F)
            .usingConvertsTo(Items.BOWL)
            .alwaysEdible()
            .build();
}
