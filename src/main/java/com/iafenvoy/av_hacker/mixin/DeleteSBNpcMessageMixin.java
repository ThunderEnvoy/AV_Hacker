package com.iafenvoy.av_hacker.mixin;

import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pugilist_steve.procedures.NPCSAYProcedure;

//这里面全是脏话
@Mixin(NPCSAYProcedure.class)
public class DeleteSBNpcMessageMixin {
    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDD)V", at = @At("HEAD"), cancellable = true, remap = false)
    private static void onExecute(Event event, LevelAccessor world, double x, double y, double z, CallbackInfo ci) {
        ci.cancel();
    }
}
