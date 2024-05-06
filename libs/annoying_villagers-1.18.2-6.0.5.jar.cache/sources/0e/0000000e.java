package pugilist_steve.procedures;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/BleedingProcedure.class */
public class BleedingProcedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingHurtEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().f_19853_, event.getEntity(), event.getSource().m_7639_());
        }
    }

    public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
        execute(null, world, entity, sourceentity);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.procedures.BleedingProcedure$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void execute(@Nullable Event event, LevelAccessor world, final Entity entity, Entity sourceentity) {
        int i;
        if (entity == null || sourceentity == null) {
            return;
        }
        if (entity instanceof Mob) {
            Mob _entity = (Mob) entity;
            if (sourceentity instanceof LivingEntity) {
                LivingEntity _ent = (LivingEntity) sourceentity;
                _entity.m_6710_(_ent);
            }
        }
        if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
            entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "effect give @s annoying_villagersbychentu:bleed 1 1 true");
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity) entity;
            if (_livEnt.m_21023_(MobEffects.f_19605_)) {
                i = _livEnt.m_21124_(MobEffects.f_19605_).m_19564_();
                if (i >= 2 && (entity instanceof LivingEntity)) {
                    LivingEntity _entity2 = (LivingEntity) entity;
                    _entity2.m_21195_(MobEffects.f_19605_);
                }
                if (!ForgeRegistries.ENTITIES.getKey(entity.m_6095_()).toString().equals("player_mobs:player_mob")) {
                    new Object() { // from class: pugilist_steve.procedures.BleedingProcedure.1
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        public void start(LevelAccessor world2, int waitTicks) {
                            this.waitTicks = waitTicks;
                            MinecraftForge.EVENT_BUS.register(this);
                            this.world = world2;
                        }

                        @SubscribeEvent
                        public void tick(TickEvent.ServerTickEvent event2) {
                            if (event2.phase == TickEvent.Phase.END) {
                                this.ticks++;
                                if (this.ticks >= this.waitTicks) {
                                    run();
                                }
                            }
                        }

                        private void run() {
                            if (Math.random() <= 0.03d) {
                                Entity _ent2 = entity;
                                if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                                    _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> e\"}]");
                                }
                            } else if (Math.random() <= 0.03d) {
                                Entity _ent3 = entity;
                                if (!_ent3.f_19853_.m_5776_() && _ent3.m_20194_() != null) {
                                    _ent3.m_20194_().m_129892_().m_82117_(_ent3.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> ?\"}]");
                                }
                            } else if (Math.random() <= 0.03d) {
                                Entity _ent4 = entity;
                                if (!_ent4.f_19853_.m_5776_() && _ent4.m_20194_() != null) {
                                    _ent4.m_20194_().m_129892_().m_82117_(_ent4.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> huh\"}]");
                                }
                            } else if (Math.random() <= 0.03d) {
                                Entity _ent5 = entity;
                                if (!_ent5.f_19853_.m_5776_() && _ent5.m_20194_() != null) {
                                    _ent5.m_20194_().m_129892_().m_82117_(_ent5.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> shit\"}]");
                                }
                            } else if (Math.random() <= 0.03d) {
                                Entity _ent6 = entity;
                                if (!_ent6.f_19853_.m_5776_() && _ent6.m_20194_() != null) {
                                    _ent6.m_20194_().m_129892_().m_82117_(_ent6.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> damn\"}]");
                                }
                            } else if (Math.random() <= 0.01d) {
                                Entity _ent7 = entity;
                                if (!_ent7.f_19853_.m_5776_() && _ent7.m_20194_() != null) {
                                    _ent7.m_20194_().m_129892_().m_82117_(_ent7.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> L\"}]");
                                }
                            } else if (Math.random() <= 0.01d) {
                                Entity _ent8 = entity;
                                if (!_ent8.f_19853_.m_5776_() && _ent8.m_20194_() != null) {
                                    _ent8.m_20194_().m_129892_().m_82117_(_ent8.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> lol\"}]");
                                }
                            } else if (Math.random() <= 0.01d) {
                                Entity _ent9 = entity;
                                if (!_ent9.f_19853_.m_5776_() && _ent9.m_20194_() != null) {
                                    _ent9.m_20194_().m_129892_().m_82117_(_ent9.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 甲要爆了\"}]");
                                }
                            } else if (Math.random() <= 0.01d) {
                                Entity _ent10 = entity;
                                if (!_ent10.f_19853_.m_5776_() && _ent10.m_20194_() != null) {
                                    _ent10.m_20194_().m_129892_().m_82117_(_ent10.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> Why?\"}]");
                                }
                            } else if (Math.random() <= 0.01d) {
                                Entity _ent11 = entity;
                                if (!_ent11.f_19853_.m_5776_() && _ent11.m_20194_() != null) {
                                    _ent11.m_20194_().m_129892_().m_82117_(_ent11.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 要死了\"}]");
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, Mth.m_14072_(new Random(), 50, 70));
                    return;
                }
                return;
            }
        }
        i = 0;
        if (i >= 2) {
            LivingEntity _entity22 = (LivingEntity) entity;
            _entity22.m_21195_(MobEffects.f_19605_);
        }
        if (!ForgeRegistries.ENTITIES.getKey(entity.m_6095_()).toString().equals("player_mobs:player_mob")) {
        }
    }
}