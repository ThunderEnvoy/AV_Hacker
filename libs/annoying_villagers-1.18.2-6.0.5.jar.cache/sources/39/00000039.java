package pugilist_steve.procedures;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.Util;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/PlayernpcdeadProcedure.class */
public class PlayernpcdeadProcedure {
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().f_19853_, event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), event.getEntity(), event.getSource().m_7639_());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        execute(null, world, x, y, z, entity, sourceentity);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.procedures.PlayernpcdeadProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, final double x, final double y, final double z, final Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null && ForgeRegistries.ENTITIES.getKey(entity.m_6095_()).toString().equals("player_mobs:player_mob")) {
            if (!world.m_5776_() && world.m_142572_() != null) {
                world.m_142572_().m_6846_().m_11264_(new TextComponent(entity.m_5446_().getString() + "被" + sourceentity.m_5446_().getString() + "杀死了"), ChatType.SYSTEM, Util.f_137441_);
            }
            new Object() { // from class: pugilist_steve.procedures.PlayernpcdeadProcedure.1
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
                    ItemStack itemStack;
                    ItemStack itemStack2;
                    ItemStack itemStack3;
                    ItemStack itemStack4;
                    ItemStack itemStack5;
                    ItemStack itemStack6;
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.m_5776_()) {
                            double d = x;
                            double d2 = y + 1.0d;
                            double d3 = z;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor = entity;
                                itemStack6 = _entGetArmor.m_6844_(EquipmentSlot.FEET);
                            } else {
                                itemStack6 = ItemStack.f_41583_;
                            }
                            ItemEntity entityToSpawn = new ItemEntity(_level, d, d2, d3, itemStack6);
                            entityToSpawn.m_32010_(10);
                            _level.m_7967_(entityToSpawn);
                        }
                    }
                    Level level2 = this.world;
                    if (level2 instanceof Level) {
                        Level _level2 = level2;
                        if (!_level2.m_5776_()) {
                            double d4 = x;
                            double d5 = y + 1.0d;
                            double d6 = z;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor2 = entity;
                                itemStack5 = _entGetArmor2.m_6844_(EquipmentSlot.LEGS);
                            } else {
                                itemStack5 = ItemStack.f_41583_;
                            }
                            ItemEntity entityToSpawn2 = new ItemEntity(_level2, d4, d5, d6, itemStack5);
                            entityToSpawn2.m_32010_(10);
                            _level2.m_7967_(entityToSpawn2);
                        }
                    }
                    Level level3 = this.world;
                    if (level3 instanceof Level) {
                        Level _level3 = level3;
                        if (!_level3.m_5776_()) {
                            double d7 = x;
                            double d8 = y + 1.0d;
                            double d9 = z;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor3 = entity;
                                itemStack4 = _entGetArmor3.m_6844_(EquipmentSlot.CHEST);
                            } else {
                                itemStack4 = ItemStack.f_41583_;
                            }
                            ItemEntity entityToSpawn3 = new ItemEntity(_level3, d7, d8, d9, itemStack4);
                            entityToSpawn3.m_32010_(10);
                            _level3.m_7967_(entityToSpawn3);
                        }
                    }
                    Level level4 = this.world;
                    if (level4 instanceof Level) {
                        Level _level4 = level4;
                        if (!_level4.m_5776_()) {
                            double d10 = x;
                            double d11 = y + 1.0d;
                            double d12 = z;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor4 = entity;
                                itemStack3 = _entGetArmor4.m_6844_(EquipmentSlot.HEAD);
                            } else {
                                itemStack3 = ItemStack.f_41583_;
                            }
                            ItemEntity entityToSpawn4 = new ItemEntity(_level4, d10, d11, d12, itemStack3);
                            entityToSpawn4.m_32010_(10);
                            _level4.m_7967_(entityToSpawn4);
                        }
                    }
                    Level level5 = this.world;
                    if (level5 instanceof Level) {
                        Level _level5 = level5;
                        if (!_level5.m_5776_()) {
                            double d13 = x;
                            double d14 = y + 1.0d;
                            double d15 = z;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = entity;
                                itemStack2 = _livEnt.m_21205_();
                            } else {
                                itemStack2 = ItemStack.f_41583_;
                            }
                            ItemEntity entityToSpawn5 = new ItemEntity(_level5, d13, d14, d15, itemStack2);
                            entityToSpawn5.m_32010_(10);
                            _level5.m_7967_(entityToSpawn5);
                        }
                    }
                    Level level6 = this.world;
                    if (level6 instanceof Level) {
                        Level _level6 = level6;
                        if (!_level6.m_5776_()) {
                            double d16 = x;
                            double d17 = y + 1.0d;
                            double d18 = z;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt2 = entity;
                                itemStack = _livEnt2.m_21206_();
                            } else {
                                itemStack = ItemStack.f_41583_;
                            }
                            ItemEntity entityToSpawn6 = new ItemEntity(_level6, d16, d17, d18, itemStack);
                            entityToSpawn6.m_32010_(10);
                            _level6.m_7967_(entityToSpawn6);
                        }
                    }
                    Level level7 = this.world;
                    if (level7 instanceof Level) {
                        Level _level7 = level7;
                        if (!_level7.m_5776_()) {
                            ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Items.f_42503_));
                            entityToSpawn7.m_32010_(10);
                            _level7.m_7967_(entityToSpawn7);
                        }
                    }
                    Level level8 = this.world;
                    if (level8 instanceof Level) {
                        Level _level8 = level8;
                        if (!_level8.m_5776_()) {
                            ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Blocks.f_50705_));
                            entityToSpawn8.m_32010_(10);
                            _level8.m_7967_(entityToSpawn8);
                        }
                    }
                    Level level9 = this.world;
                    if (level9 instanceof Level) {
                        Level _level9 = level9;
                        if (!_level9.m_5776_()) {
                            ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(Blocks.f_50705_));
                            entityToSpawn9.m_32010_(10);
                            _level9.m_7967_(entityToSpawn9);
                        }
                    }
                    Level level10 = this.world;
                    if (level10 instanceof Level) {
                        Level _level10 = level10;
                        if (!_level10.m_5776_()) {
                            ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(Blocks.f_50091_));
                            entityToSpawn10.m_32010_(10);
                            _level10.m_7967_(entityToSpawn10);
                        }
                    }
                    Level level11 = this.world;
                    if (level11 instanceof Level) {
                        Level _level11 = level11;
                        if (!_level11.m_5776_()) {
                            ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.f_42411_));
                            entityToSpawn11.m_32010_(10);
                            _level11.m_7967_(entityToSpawn11);
                        }
                    }
                    Level level12 = this.world;
                    if (level12 instanceof Level) {
                        Level _level12 = level12;
                        if (!_level12.m_5776_()) {
                            ItemEntity entityToSpawn12 = new ItemEntity(_level12, x, y + 1.0d, z, new ItemStack(Items.f_42412_));
                            entityToSpawn12.m_32010_(10);
                            _level12.m_7967_(entityToSpawn12);
                        }
                    }
                    Level level13 = this.world;
                    if (level13 instanceof Level) {
                        Level _level13 = level13;
                        if (!_level13.m_5776_()) {
                            ItemEntity entityToSpawn13 = new ItemEntity(_level13, x, y + 1.0d, z, new ItemStack(Items.f_42412_));
                            entityToSpawn13.m_32010_(10);
                            _level13.m_7967_(entityToSpawn13);
                        }
                    }
                    Level level14 = this.world;
                    if (level14 instanceof Level) {
                        Level _level14 = level14;
                        if (!_level14.m_5776_()) {
                            ItemEntity entityToSpawn14 = new ItemEntity(_level14, x, y + 1.0d, z, new ItemStack(Items.f_42412_));
                            entityToSpawn14.m_32010_(10);
                            _level14.m_7967_(entityToSpawn14);
                        }
                    }
                    Level level15 = this.world;
                    if (level15 instanceof Level) {
                        Level _level15 = level15;
                        if (!_level15.m_5776_()) {
                            ItemEntity entityToSpawn15 = new ItemEntity(_level15, x, y + 1.0d, z, new ItemStack(Items.f_42412_));
                            entityToSpawn15.m_32010_(10);
                            _level15.m_7967_(entityToSpawn15);
                        }
                    }
                    Level level16 = this.world;
                    if (level16 instanceof Level) {
                        Level _level16 = level16;
                        if (!_level16.m_5776_()) {
                            ItemEntity entityToSpawn16 = new ItemEntity(_level16, x, y + 1.0d, z, new ItemStack(Items.f_42412_));
                            entityToSpawn16.m_32010_(10);
                            _level16.m_7967_(entityToSpawn16);
                        }
                    }
                    Level level17 = this.world;
                    if (level17 instanceof Level) {
                        Level _level17 = level17;
                        if (!_level17.m_5776_()) {
                            ItemEntity entityToSpawn17 = new ItemEntity(_level17, x, y + 1.0d, z, new ItemStack(Items.f_42412_));
                            entityToSpawn17.m_32010_(10);
                            _level17.m_7967_(entityToSpawn17);
                        }
                    }
                    Level level18 = this.world;
                    if (level18 instanceof Level) {
                        Level _level18 = level18;
                        if (!_level18.m_5776_()) {
                            ItemEntity entityToSpawn18 = new ItemEntity(_level18, x, y + 1.0d, z, new ItemStack(Items.f_42584_));
                            entityToSpawn18.m_32010_(10);
                            _level18.m_7967_(entityToSpawn18);
                        }
                    }
                    Level level19 = this.world;
                    if (level19 instanceof Level) {
                        Level _level19 = level19;
                        if (!_level19.m_5776_()) {
                            ItemEntity entityToSpawn19 = new ItemEntity(_level19, x, y + 1.0d, z, new ItemStack(Items.f_42584_));
                            entityToSpawn19.m_32010_(10);
                            _level19.m_7967_(entityToSpawn19);
                        }
                    }
                    Level level20 = this.world;
                    if (level20 instanceof Level) {
                        Level _level20 = level20;
                        if (!_level20.m_5776_()) {
                            ItemEntity entityToSpawn20 = new ItemEntity(_level20, x, y + 1.0d, z, new ItemStack(Items.f_42584_));
                            entityToSpawn20.m_32010_(10);
                            _level20.m_7967_(entityToSpawn20);
                        }
                    }
                    Level level21 = this.world;
                    if (level21 instanceof Level) {
                        Level _level21 = level21;
                        if (!_level21.m_5776_()) {
                            ItemEntity entityToSpawn21 = new ItemEntity(_level21, x, y + 1.0d, z, new ItemStack(Items.f_42584_));
                            entityToSpawn21.m_32010_(10);
                            _level21.m_7967_(entityToSpawn21);
                        }
                    }
                    Level level22 = this.world;
                    if (level22 instanceof Level) {
                        Level _level22 = level22;
                        if (!_level22.m_5776_()) {
                            ItemEntity entityToSpawn22 = new ItemEntity(_level22, x, y + 1.0d, z, new ItemStack(Items.f_42436_));
                            entityToSpawn22.m_32010_(10);
                            _level22.m_7967_(entityToSpawn22);
                        }
                    }
                    Level level23 = this.world;
                    if (level23 instanceof Level) {
                        Level _level23 = level23;
                        if (!_level23.m_5776_()) {
                            ItemEntity entityToSpawn23 = new ItemEntity(_level23, x, y + 1.0d, z, new ItemStack(Items.f_42436_));
                            entityToSpawn23.m_32010_(10);
                            _level23.m_7967_(entityToSpawn23);
                        }
                    }
                    Level level24 = this.world;
                    if (level24 instanceof Level) {
                        Level _level24 = level24;
                        if (!_level24.m_5776_()) {
                            ItemEntity entityToSpawn24 = new ItemEntity(_level24, x, y + 1.0d, z, new ItemStack(Items.f_42436_));
                            entityToSpawn24.m_32010_(10);
                            _level24.m_7967_(entityToSpawn24);
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 5);
            new C00302(entity).start(world, Mth.m_14072_(new Random(), 40, 80));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pugilist_steve.procedures.PlayernpcdeadProcedure$2 */
    /* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/PlayernpcdeadProcedure$2.class */
    public class C00302 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ Entity val$entity;

        C00302(Entity entity) {
            this.val$entity = entity;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
        }

        @SubscribeEvent
        public void tick(TickEvent.ServerTickEvent event) {
            if (event.phase == TickEvent.Phase.END) {
                this.ticks++;
                if (this.ticks >= this.waitTicks) {
                    run();
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v172, types: [pugilist_steve.procedures.PlayernpcdeadProcedure$2$2] */
        private void run() {
            if (Math.random() <= 0.05d) {
                Entity _ent = this.val$entity;
                if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                    _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> damn!\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent2 = this.val$entity;
                if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                    _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 润了\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent3 = this.val$entity;
                if (!_ent3.f_19853_.m_5776_() && _ent3.m_20194_() != null) {
                    _ent3.m_20194_().m_129892_().m_82117_(_ent3.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 被薄纱了ToT\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent4 = this.val$entity;
                if (!_ent4.f_19853_.m_5776_() && _ent4.m_20194_() != null) {
                    _ent4.m_20194_().m_129892_().m_82117_(_ent4.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> cao\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent5 = this.val$entity;
                if (!_ent5.f_19853_.m_5776_() && _ent5.m_20194_() != null) {
                    _ent5.m_20194_().m_129892_().m_82117_(_ent5.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 心态崩溃了\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent6 = this.val$entity;
                if (!_ent6.f_19853_.m_5776_() && _ent6.m_20194_() != null) {
                    _ent6.m_20194_().m_129892_().m_82117_(_ent6.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 难崩\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent7 = this.val$entity;
                if (!_ent7.f_19853_.m_5776_() && _ent7.m_20194_() != null) {
                    _ent7.m_20194_().m_129892_().m_82117_(_ent7.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> byd血量这么厚\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent8 = this.val$entity;
                if (!_ent8.f_19853_.m_5776_() && _ent8.m_20194_() != null) {
                    _ent8.m_20194_().m_129892_().m_82117_(_ent8.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 乐死\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent9 = this.val$entity;
                if (!_ent9.f_19853_.m_5776_() && _ent9.m_20194_() != null) {
                    _ent9.m_20194_().m_129892_().m_82117_(_ent9.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 打牛魔，润了\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent10 = this.val$entity;
                if (!_ent10.f_19853_.m_5776_() && _ent10.m_20194_() != null) {
                    _ent10.m_20194_().m_129892_().m_82117_(_ent10.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> ……\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent11 = this.val$entity;
                if (!_ent11.f_19853_.m_5776_() && _ent11.m_20194_() != null) {
                    _ent11.m_20194_().m_129892_().m_82117_(_ent11.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 玩单人去了\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent12 = this.val$entity;
                if (!_ent12.f_19853_.m_5776_() && _ent12.m_20194_() != null) {
                    _ent12.m_20194_().m_129892_().m_82117_(_ent12.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 不玩了，操\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent13 = this.val$entity;
                if (!_ent13.f_19853_.m_5776_() && _ent13.m_20194_() != null) {
                    _ent13.m_20194_().m_129892_().m_82117_(_ent13.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 又要重开……\"}]");
                }
            } else if (Math.random() <= 0.05d) {
                Entity _ent14 = this.val$entity;
                if (!_ent14.f_19853_.m_5776_() && _ent14.m_20194_() != null) {
                    _ent14.m_20194_().m_129892_().m_82117_(_ent14.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 别走，我叫人\"}]");
                }
                new C00311().start(this.world, 50);
            }
            new Object() { // from class: pugilist_steve.procedures.PlayernpcdeadProcedure.2.2
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                public void start(LevelAccessor world, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world;
                }

                @SubscribeEvent
                public void tick(TickEvent.ServerTickEvent event) {
                    if (event.phase == TickEvent.Phase.END) {
                        this.ticks++;
                        if (this.ticks >= this.waitTicks) {
                            run();
                        }
                    }
                }

                private void run() {
                    Entity _ent15 = C00302.this.val$entity;
                    if (!_ent15.f_19853_.m_5776_() && _ent15.m_20194_() != null) {
                        _ent15.m_20194_().m_129892_().m_82117_(_ent15.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"selector\":\"@s\",\"color\":\"yellow\"},{\"text\":\"退出了游戏\",\"color\":\"yellow\"}]");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(this.world, 20);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: pugilist_steve.procedures.PlayernpcdeadProcedure$2$1 */
        /* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/PlayernpcdeadProcedure$2$1.class */
        public class C00311 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C00311() {
            }

            public void start(LevelAccessor world, int waitTicks) {
                this.waitTicks = waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world;
            }

            @SubscribeEvent
            public void tick(TickEvent.ServerTickEvent event) {
                if (event.phase == TickEvent.Phase.END) {
                    this.ticks++;
                    if (this.ticks >= this.waitTicks) {
                        run();
                    }
                }
            }

            private void run() {
                Entity _ent = C00302.this.val$entity;
                if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                    _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "summon player_mobs:player_mob");
                }
                new C00321().start(this.world, 20);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: pugilist_steve.procedures.PlayernpcdeadProcedure$2$1$1 */
            /* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/PlayernpcdeadProcedure$2$1$1.class */
            public class C00321 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C00321() {
                }

                public void start(LevelAccessor world, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world;
                }

                @SubscribeEvent
                public void tick(TickEvent.ServerTickEvent event) {
                    if (event.phase == TickEvent.Phase.END) {
                        this.ticks++;
                        if (this.ticks >= this.waitTicks) {
                            run();
                        }
                    }
                }

                /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.procedures.PlayernpcdeadProcedure$2$1$1$1] */
                private void run() {
                    Entity _ent = C00302.this.val$entity;
                    if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                        _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "summon player_mobs:player_mob");
                    }
                    new Object() { // from class: pugilist_steve.procedures.PlayernpcdeadProcedure.2.1.1.1
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        public void start(LevelAccessor world, int waitTicks) {
                            this.waitTicks = waitTicks;
                            MinecraftForge.EVENT_BUS.register(this);
                            this.world = world;
                        }

                        @SubscribeEvent
                        public void tick(TickEvent.ServerTickEvent event) {
                            if (event.phase == TickEvent.Phase.END) {
                                this.ticks++;
                                if (this.ticks >= this.waitTicks) {
                                    run();
                                }
                            }
                        }

                        /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.procedures.PlayernpcdeadProcedure$2$1$1$1$1] */
                        private void run() {
                            Entity _ent2 = C00302.this.val$entity;
                            if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                                _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "summon player_mobs:player_mob");
                            }
                            new Object() { // from class: pugilist_steve.procedures.PlayernpcdeadProcedure.2.1.1.1.1
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                public void start(LevelAccessor world, int waitTicks) {
                                    this.waitTicks = waitTicks;
                                    MinecraftForge.EVENT_BUS.register(this);
                                    this.world = world;
                                }

                                @SubscribeEvent
                                public void tick(TickEvent.ServerTickEvent event) {
                                    if (event.phase == TickEvent.Phase.END) {
                                        this.ticks++;
                                        if (this.ticks >= this.waitTicks) {
                                            run();
                                        }
                                    }
                                }

                                private void run() {
                                    Entity _ent3 = C00302.this.val$entity;
                                    if (!_ent3.f_19853_.m_5776_() && _ent3.m_20194_() != null) {
                                        _ent3.m_20194_().m_129892_().m_82117_(_ent3.m_20203_().m_81324_().m_81325_(4), "tellraw @a [{\"text\":\"<\"},{\"selector\":\"@s\"},{\"text\":\"> 来了嗷，哥们\"}]");
                                    }
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(this.world, 20);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 20);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }
        }
    }
}