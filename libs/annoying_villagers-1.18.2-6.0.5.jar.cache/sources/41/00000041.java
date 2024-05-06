package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/PlayernpcjoingameProcedure.class */
public class PlayernpcjoingameProcedure {
    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent event) {
        execute(event, event.getWorld(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        float f;
        if (entity == null) {
            return;
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.m_6095_()).toString().equals("player_mobs:player_mob")) {
            if (!world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 64.0d, 64.0d, 64.0d), e -> {
                return true;
            }).isEmpty() && !entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"selector\":\"@s\",\"color\":\"yellow\"},{\"text\":\"加入了游戏\",\"color\":\"yellow\"}]");
            }
            if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "data merge entity @s {CanPickUpLoot: 1b}");
            }
            ((LivingEntity) entity).m_21051_(Attributes.f_22276_).m_22100_(20.0d);
            if (entity instanceof LivingEntity) {
                LivingEntity _entity = (LivingEntity) entity;
                if (!_entity.f_19853_.m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19613_, 9999999, 0, false, false));
                }
            }
        }
        if (entity.m_5825_() && (entity instanceof LivingEntity)) {
            LivingEntity _entity2 = (LivingEntity) entity;
            if (!_entity2.f_19853_.m_5776_()) {
                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19613_, 9999999, 0, false, false));
            }
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity) entity;
            f = _livEnt.m_21233_();
        } else {
            f = -1.0f;
        }
        if (f == 40.0f && (entity instanceof LivingEntity)) {
            LivingEntity _entity3 = (LivingEntity) entity;
            if (!_entity3.f_19853_.m_5776_()) {
                _entity3.m_7292_(new MobEffectInstance(MobEffects.f_19613_, 9999999, 0, false, false));
            }
        }
    }
}