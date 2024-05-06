package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/RespawnProcedure.class */
public class RespawnProcedure {
    @SubscribeEvent
    public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
        execute(event, event.getPlayer());
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity != null && !entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
            entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "attribute @s epicfight:staminar base set 100");
        }
    }
}