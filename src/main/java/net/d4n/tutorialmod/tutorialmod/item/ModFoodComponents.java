package net.d4n.tutorialmod.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent BANANO = new FoodComponent
            .Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,200),0.80f).build();
    public static final FoodComponent Garnet = new FoodComponent
            .Builder()
            .nutrition(1)
            .saturationModifier(0.20f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,200),0.70f).build();

}
