package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pugilist_steve.init.AnnoyingVillagersModMobEffects;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/EffectLeftGameProcedure.class */
public class EffectLeftGameProcedure {
    @SubscribeEvent
    public static void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
        execute(event, event.getPlayer());
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity != null && (entity instanceof LivingEntity)) {
            LivingEntity _livEnt = (LivingEntity) entity;
            if (_livEnt.m_21023_((MobEffect) AnnoyingVillagersModMobEffects.HEROBRINE_EFFECT.get())) {
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    _player.m_6749_(11);
                }
                if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                    entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "leave @s");
                }
                if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                    entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "kill @s");
                }
            }
        }
    }
}