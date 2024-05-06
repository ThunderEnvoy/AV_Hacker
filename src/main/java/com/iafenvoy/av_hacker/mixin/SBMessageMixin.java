package com.iafenvoy.av_hacker.mixin;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pugilist_steve.procedures.BlackListProcedure;

//干掉初始消息
@Mixin(BlackListProcedure.class)
public class SBMessageMixin {
    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void onExecute(Event event, LevelAccessor world, double x, double y, double z, Entity entity, CallbackInfo ci) {
        ci.cancel();
    }
}
