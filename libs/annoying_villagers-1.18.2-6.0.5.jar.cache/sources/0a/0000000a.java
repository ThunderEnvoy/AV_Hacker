package pugilist_steve.procedures;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/BlackListProcedure.class */
public class BlackListProcedure {
    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        execute(event, event.getPlayer().f_19853_, event.getPlayer().m_20185_(), event.getPlayer().m_20186_(), event.getPlayer().m_20189_(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    /* JADX WARN: Type inference failed for: r0v109, types: [pugilist_steve.procedures.BlackListProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v20, types: [pugilist_steve.procedures.BlackListProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.procedures.BlackListProcedure$3] */
    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, final Entity entity) {
        int i;
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = (List) world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(30.0d), e -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.m_20238_(_center);
        })).collect(Collectors.toList());
        for (final Entity entityiterator : _entfound) {
            if (ForgeRegistries.ENTITIES.getKey(entityiterator.m_6095_()).toString().equals("player_mobs:player_mob")) {
                new Object() { // from class: pugilist_steve.procedures.BlackListProcedure.1
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
                        if (Math.random() <= 0.37d) {
                            Entity _ent = entityiterator;
                            if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                                _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> Welcome !\"}]");
                            }
                        } else if (Math.random() <= 0.37d) {
                            Entity _ent2 = entityiterator;
                            if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                                _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 欢迎！\"}]");
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, Mth.m_14072_(new Random(), 60, 90));
            }
        }
        if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
            entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "attribute @s epicfight:staminar base set 100");
        }
        if (entity instanceof Player) {
            Player _plr = (Player) entity;
            i = _plr.f_36078_;
        } else {
            i = 0;
        }
        if (i <= 1) {
            if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "epicfight skill add @s guard epicfight:guard");
            }
            if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "epicfight skill add @s guard epicfight:parrying");
            }
            if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "epicfight skill add @s dodge epicfight:step");
            }
            if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "epicfight skill add @s passive1 epicfight:technician");
            }
        }
        new Object() { // from class: pugilist_steve.procedures.BlackListProcedure.2
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
                Entity _ent = entity;
                if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                    _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "playsound annoying_villagersbychentu:andnow voice @s");
                }
                Entity _ent2 = entity;
                if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                    _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "playsound annoying_villagersbychentu:fog music @s");
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        new Object() { // from class: pugilist_steve.procedures.BlackListProcedure.3
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
                Entity _ent = entity;
                if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                    _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "title @s title {\"text\":\"作者:Pugilist_Steve\",\"color\":\"green\"}");
                }
                Entity _ent2 = entity;
                if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                    _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "execute as @s run execute if entity @s run title @s actionbar {\"text\":\"作者:Pugilist_Steve 平台:Bilibili\",\"italic\":true,\"color\":\"green\"}");
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 30);
        if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
            entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "tellraw @s {\"text\":\"作者:@Pugilist_Steve (拳史)\",\"color\":\"red\"}");
        }
        if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
            entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "tellraw @s {\"text\":\"平台:哔哩哔哩 (B站)\",\"color\":\"green\"}");
        }
        if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
            entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "tellraw @s {\"text\":\"如要发布关于此整合包的视频，务必标注原作者及平台!\",\"color\":\"yellow\"},");
        }
    }
}