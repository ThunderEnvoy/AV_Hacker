package pugilist_steve.procedures;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/NPCSAYProcedure.class */
public class NPCSAYProcedure {
    @SubscribeEvent
    public static void onChat(ServerChatEvent event) {
        execute(event, event.getPlayer().f_19853_, event.getPlayer().m_20185_(), event.getPlayer().m_20186_(), event.getPlayer().m_20189_());
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        execute(null, world, x, y, z);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.procedures.NPCSAYProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = (List) world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(35.0d), e -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.m_20238_(_center);
        })).collect(Collectors.toList());
        for (final Entity entityiterator : _entfound) {
            if (ForgeRegistries.ENTITIES.getKey(entityiterator.m_6095_()).toString().equals("player_mobs:player_mob") && world.m_6907_().size() <= 22) {
                new Object() { // from class: pugilist_steve.procedures.NPCSAYProcedure.1
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

                    /* JADX WARN: Type inference failed for: r0v259, types: [pugilist_steve.procedures.NPCSAYProcedure$1$1] */
                    private void run() {
                        if (Math.random() <= 0.07d) {
                            Entity _ent = entityiterator;
                            if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                                _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> e\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent2 = entityiterator;
                            if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                                _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> a\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent3 = entityiterator;
                            if (!_ent3.f_19853_.m_5776_() && _ent3.m_20194_() != null) {
                                _ent3.m_20194_().m_129892_().m_82117_(_ent3.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 6\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent4 = entityiterator;
                            if (!_ent4.f_19853_.m_5776_() && _ent4.m_20194_() != null) {
                                _ent4.m_20194_().m_129892_().m_82117_(_ent4.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> cao\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent5 = entityiterator;
                            if (!_ent5.f_19853_.m_5776_() && _ent5.m_20194_() != null) {
                                _ent5.m_20194_().m_129892_().m_82117_(_ent5.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 你呢?\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent6 = entityiterator;
                            if (!_ent6.f_19853_.m_5776_() && _ent6.m_20194_() != null) {
                                _ent6.m_20194_().m_129892_().m_82117_(_ent6.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> or PvP boss\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent7 = entityiterator;
                            if (!_ent7.f_19853_.m_5776_() && _ent7.m_20194_() != null) {
                                _ent7.m_20194_().m_129892_().m_82117_(_ent7.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 谁?\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent8 = entityiterator;
                            if (!_ent8.f_19853_.m_5776_() && _ent8.m_20194_() != null) {
                                _ent8.m_20194_().m_129892_().m_82117_(_ent8.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> damn\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent9 = entityiterator;
                            if (!_ent9.f_19853_.m_5776_() && _ent9.m_20194_() != null) {
                                _ent9.m_20194_().m_129892_().m_82117_(_ent9.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> lol\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent10 = entityiterator;
                            if (!_ent10.f_19853_.m_5776_() && _ent10.m_20194_() != null) {
                                _ent10.m_20194_().m_129892_().m_82117_(_ent10.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> PvP?\"}]");
                            }
                            new Object() { // from class: pugilist_steve.procedures.NPCSAYProcedure.1.1
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
                                    Entity _ent11 = entityiterator;
                                    if (!_ent11.f_19853_.m_5776_() && _ent11.m_20194_() != null) {
                                        _ent11.m_20194_().m_129892_().m_82117_(_ent11.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> or PvP Boss\"}]");
                                    }
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(this.world, Mth.m_14072_(new Random(), 50, 80));
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent11 = entityiterator;
                            if (!_ent11.f_19853_.m_5776_() && _ent11.m_20194_() != null) {
                                _ent11.m_20194_().m_129892_().m_82117_(_ent11.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> hh\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent12 = entityiterator;
                            if (!_ent12.f_19853_.m_5776_() && _ent12.m_20194_() != null) {
                                _ent12.m_20194_().m_129892_().m_82117_(_ent12.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> huh?\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent13 = entityiterator;
                            if (!_ent13.f_19853_.m_5776_() && _ent13.m_20194_() != null) {
                                _ent13.m_20194_().m_129892_().m_82117_(_ent13.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> me?\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent14 = entityiterator;
                            if (!_ent14.f_19853_.m_5776_() && _ent14.m_20194_() != null) {
                                _ent14.m_20194_().m_129892_().m_82117_(_ent14.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> ohhh\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent15 = entityiterator;
                            if (!_ent15.f_19853_.m_5776_() && _ent15.m_20194_() != null) {
                                _ent15.m_20194_().m_129892_().m_82117_(_ent15.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 被薄纱了\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent16 = entityiterator;
                            if (!_ent16.f_19853_.m_5776_() && _ent16.m_20194_() != null) {
                                _ent16.m_20194_().m_129892_().m_82117_(_ent16.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> no\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent17 = entityiterator;
                            if (!_ent17.f_19853_.m_5776_() && _ent17.m_20194_() != null) {
                                _ent17.m_20194_().m_129892_().m_82117_(_ent17.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> ?\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent18 = entityiterator;
                            if (!_ent18.f_19853_.m_5776_() && _ent18.m_20194_() != null) {
                                _ent18.m_20194_().m_129892_().m_82117_(_ent18.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 我是萌新，求带\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent19 = entityiterator;
                            if (!_ent19.f_19853_.m_5776_() && _ent19.m_20194_() != null) {
                                _ent19.m_20194_().m_129892_().m_82117_(_ent19.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> yep\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent20 = entityiterator;
                            if (!_ent20.f_19853_.m_5776_() && _ent20.m_20194_() != null) {
                                _ent20.m_20194_().m_129892_().m_82117_(_ent20.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 难崩\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent21 = entityiterator;
                            if (!_ent21.f_19853_.m_5776_() && _ent21.m_20194_() != null) {
                                _ent21.m_20194_().m_129892_().m_82117_(_ent21.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 不是，哥们 :o\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent22 = entityiterator;
                            if (!_ent22.f_19853_.m_5776_() && _ent22.m_20194_() != null) {
                                _ent22.m_20194_().m_129892_().m_82117_(_ent22.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 什么意思？\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent23 = entityiterator;
                            if (!_ent23.f_19853_.m_5776_() && _ent23.m_20194_() != null) {
                                _ent23.m_20194_().m_129892_().m_82117_(_ent23.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 你们是怎么玩的？\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent24 = entityiterator;
                            if (!_ent24.f_19853_.m_5776_() && _ent24.m_20194_() != null) {
                                _ent24.m_20194_().m_129892_().m_82117_(_ent24.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 有大佬吗？\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent25 = entityiterator;
                            if (!_ent25.f_19853_.m_5776_() && _ent25.m_20194_() != null) {
                                _ent25.m_20194_().m_129892_().m_82117_(_ent25.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 草\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent26 = entityiterator;
                            if (!_ent26.f_19853_.m_5776_() && _ent26.m_20194_() != null) {
                                _ent26.m_20194_().m_129892_().m_82117_(_ent26.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> wc\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent27 = entityiterator;
                            if (!_ent27.f_19853_.m_5776_() && _ent27.m_20194_() != null) {
                                _ent27.m_20194_().m_129892_().m_82117_(_ent27.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> M3, damn\"}]");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent28 = entityiterator;
                            if (!_ent28.f_19853_.m_5776_() && _ent28.m_20194_() != null) {
                                _ent28.m_20194_().m_129892_().m_82117_(_ent28.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 兄弟，你好香\"}]");
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, Mth.m_14072_(new Random(), 25, 90));
            }
        }
    }
}