package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/ImpactAttackProcedure.class */
public class ImpactAttackProcedure {
    @SubscribeEvent
    public static void onPlayerCriticalHit(CriticalHitEvent event) {
        execute(event, event.getPlayer().f_19853_, event.getPlayer().m_20185_(), event.getPlayer().m_20186_(), event.getPlayer().m_20189_(), event.getTarget());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && world.m_8055_(new BlockPos(x, y - 1.0d, z)).m_60815_() && !entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
            entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "particle minecraft:block " + ForgeRegistries.BLOCKS.getKey(world.m_8055_(new BlockPos(x, y - 1.0d, z)).m_60734_()).toString() + " ~ ~ ~ 0.3 0.1 0.3 0.1 40");
        }
    }
}