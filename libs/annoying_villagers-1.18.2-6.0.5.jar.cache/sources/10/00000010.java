package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/BoomlitProcedure.class */
public class BoomlitProcedure {
    @SubscribeEvent
    public static void onExplode(ExplosionEvent.Detonate event) {
        execute(event, event.getWorld(), event.getExplosion().getPosition().f_82479_, event.getExplosion().getPosition().f_82480_, event.getExplosion().getPosition().f_82481_);
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        execute(null, world, x, y, z);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel) world;
            _level.m_142572_().m_129892_().m_82117_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", new TextComponent(""), _level.m_142572_(), (Entity) null).m_81324_(), "particle epicfight:ground_slam ~ ~-3 ~ 0 0 0 2 90");
        }
    }
}