package pugilist_steve.procedures;

import java.util.Comparator;
import net.minecraft.client.Minecraft;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.entity.HerobrineEntity;
import pugilist_steve.init.AnnoyingVillagersModMobEffects;

/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/LeaveGetProcedure.class */
public class LeaveGetProcedure {
    /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.procedures.LeaveGetProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v31, types: [pugilist_steve.procedures.LeaveGetProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v43, types: [pugilist_steve.procedures.LeaveGetProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v60, types: [pugilist_steve.procedures.LeaveGetProcedure$2] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        int i;
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        if (entity == null) {
            return;
        }
        if (world.m_6907_().size() == 1) {
            if (new Object() { // from class: pugilist_steve.procedures.LeaveGetProcedure.1
                public boolean checkGamemode(Entity _ent) {
                    if (_ent instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer = (ServerPlayer) _ent;
                        return _serverPlayer.f_8941_.m_9290_() == GameType.SPECTATOR;
                    } else if (_ent.f_19853_.m_5776_() && (_ent instanceof Player)) {
                        Player _player = (Player) _ent;
                        return Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()).m_105325_() == GameType.SPECTATOR;
                    } else {
                        return false;
                    }
                }
            }.checkGamemode(entity)) {
                if (ForgeRegistries.ENTITIES.getKey(entity.m_20202_().m_6095_()).toString().equals("annoying_villagers:herobrine")) {
                    if (entity instanceof Player) {
                        Player _player = (Player) entity;
                        NonNullList nonNullList = _player.m_150109_().f_35975_;
                        LivingEntity m_20202_ = entity.m_20202_();
                        if (m_20202_ instanceof LivingEntity) {
                            LivingEntity _entGetArmor = m_20202_;
                            itemStack8 = _entGetArmor.m_6844_(EquipmentSlot.FEET);
                        } else {
                            itemStack8 = ItemStack.f_41583_;
                        }
                        nonNullList.set(0, itemStack8);
                        _player.m_150109_().m_6596_();
                    } else if (entity instanceof LivingEntity) {
                        LivingEntity _living = (LivingEntity) entity;
                        EquipmentSlot equipmentSlot = EquipmentSlot.FEET;
                        LivingEntity m_20202_2 = entity.m_20202_();
                        if (m_20202_2 instanceof LivingEntity) {
                            LivingEntity _entGetArmor2 = m_20202_2;
                            itemStack = _entGetArmor2.m_6844_(EquipmentSlot.FEET);
                        } else {
                            itemStack = ItemStack.f_41583_;
                        }
                        _living.m_8061_(equipmentSlot, itemStack);
                    }
                    if (entity instanceof Player) {
                        Player _player2 = (Player) entity;
                        NonNullList nonNullList2 = _player2.m_150109_().f_35975_;
                        LivingEntity m_20202_3 = entity.m_20202_();
                        if (m_20202_3 instanceof LivingEntity) {
                            LivingEntity _entGetArmor3 = m_20202_3;
                            itemStack7 = _entGetArmor3.m_6844_(EquipmentSlot.LEGS);
                        } else {
                            itemStack7 = ItemStack.f_41583_;
                        }
                        nonNullList2.set(1, itemStack7);
                        _player2.m_150109_().m_6596_();
                    } else if (entity instanceof LivingEntity) {
                        LivingEntity _living2 = (LivingEntity) entity;
                        EquipmentSlot equipmentSlot2 = EquipmentSlot.LEGS;
                        LivingEntity m_20202_4 = entity.m_20202_();
                        if (m_20202_4 instanceof LivingEntity) {
                            LivingEntity _entGetArmor4 = m_20202_4;
                            itemStack2 = _entGetArmor4.m_6844_(EquipmentSlot.LEGS);
                        } else {
                            itemStack2 = ItemStack.f_41583_;
                        }
                        _living2.m_8061_(equipmentSlot2, itemStack2);
                    }
                    if (entity instanceof Player) {
                        Player _player3 = (Player) entity;
                        NonNullList nonNullList3 = _player3.m_150109_().f_35975_;
                        LivingEntity m_20202_5 = entity.m_20202_();
                        if (m_20202_5 instanceof LivingEntity) {
                            LivingEntity _entGetArmor5 = m_20202_5;
                            itemStack6 = _entGetArmor5.m_6844_(EquipmentSlot.CHEST);
                        } else {
                            itemStack6 = ItemStack.f_41583_;
                        }
                        nonNullList3.set(2, itemStack6);
                        _player3.m_150109_().m_6596_();
                    } else if (entity instanceof LivingEntity) {
                        LivingEntity _living3 = (LivingEntity) entity;
                        EquipmentSlot equipmentSlot3 = EquipmentSlot.CHEST;
                        LivingEntity m_20202_6 = entity.m_20202_();
                        if (m_20202_6 instanceof LivingEntity) {
                            LivingEntity _entGetArmor6 = m_20202_6;
                            itemStack3 = _entGetArmor6.m_6844_(EquipmentSlot.CHEST);
                        } else {
                            itemStack3 = ItemStack.f_41583_;
                        }
                        _living3.m_8061_(equipmentSlot3, itemStack3);
                    }
                    if (entity instanceof Player) {
                        Player _player4 = (Player) entity;
                        NonNullList nonNullList4 = _player4.m_150109_().f_35975_;
                        LivingEntity m_20202_7 = entity.m_20202_();
                        if (m_20202_7 instanceof LivingEntity) {
                            LivingEntity _entGetArmor7 = m_20202_7;
                            itemStack5 = _entGetArmor7.m_6844_(EquipmentSlot.HEAD);
                        } else {
                            itemStack5 = ItemStack.f_41583_;
                        }
                        nonNullList4.set(3, itemStack5);
                        _player4.m_150109_().m_6596_();
                    } else if (entity instanceof LivingEntity) {
                        LivingEntity _living4 = (LivingEntity) entity;
                        EquipmentSlot equipmentSlot4 = EquipmentSlot.HEAD;
                        LivingEntity m_20202_8 = entity.m_20202_();
                        if (m_20202_8 instanceof LivingEntity) {
                            LivingEntity _entGetArmor8 = m_20202_8;
                            itemStack4 = _entGetArmor8.m_6844_(EquipmentSlot.HEAD);
                        } else {
                            itemStack4 = ItemStack.f_41583_;
                        }
                        _living4.m_8061_(equipmentSlot4, itemStack4);
                    }
                }
                if (entity instanceof LivingEntity) {
                    LivingEntity _entity = (LivingEntity) entity;
                    _entity.m_21195_((MobEffect) AnnoyingVillagersModMobEffects.HEROBRINE_EFFECT.get());
                }
                entity.m_8127_();
                new Object() { // from class: pugilist_steve.procedures.LeaveGetProcedure.2
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    public void start(LevelAccessor world2, int waitTicks) {
                        this.waitTicks = waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world2;
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

                    /* JADX WARN: Type inference failed for: r1v1, types: [pugilist_steve.procedures.LeaveGetProcedure$2$1] */
                    /* JADX WARN: Type inference failed for: r1v5, types: [pugilist_steve.procedures.LeaveGetProcedure$2$2] */
                    private void run() {
                        Entity _ent = (Entity) this.world.m_6443_(HerobrineEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.procedures.LeaveGetProcedure.2.1
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd -> {
                                    return _entcnd.m_20275_(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                            _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "effect clear @s annoying_villagersbychentu:gedang");
                        }
                        Entity _ent2 = (Entity) this.world.m_6443_(HerobrineEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e2 -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.procedures.LeaveGetProcedure.2.2
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd -> {
                                    return _entcnd.m_20275_(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                            _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "kill @s");
                        }
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity2 = entity;
                            _entity2.m_21195_((MobEffect) AnnoyingVillagersModMobEffects.HEROBRINE_EFFECT.get());
                        }
                        if (entity instanceof ServerPlayer) {
                            ServerPlayer _player5 = entity;
                            _player5.m_143403_(GameType.SURVIVAL);
                        }
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity3 = entity;
                            _entity3.m_21153_(5.0f);
                        }
                        Entity _ent3 = entity;
                        if (!_ent3.f_19853_.m_5776_() && _ent3.m_20194_() != null) {
                            _ent3.m_20194_().m_129892_().m_82117_(_ent3.m_20203_().m_81324_().m_81325_(4), "effect give @s annoying_villagersbychentu:fulu 5 1 true");
                        }
                        Entity _ent4 = entity;
                        if (!_ent4.f_19853_.m_5776_() && _ent4.m_20194_() != null) {
                            _ent4.m_20194_().m_129892_().m_82117_(_ent4.m_20203_().m_81324_().m_81325_(4), "title @s title {\"text\":\"已解脱\",\"color\":\"green\"}");
                        }
                        Entity _ent5 = entity;
                        if (!_ent5.f_19853_.m_5776_() && _ent5.m_20194_() != null) {
                            _ent5.m_20194_().m_129892_().m_82117_(_ent5.m_20203_().m_81324_().m_81325_(4), "titles refresh");
                        }
                        Entity _ent6 = entity;
                        if (!_ent6.f_19853_.m_5776_() && _ent6.m_20194_() != null) {
                            _ent6.m_20194_().m_129892_().m_82117_(_ent6.m_20203_().m_81324_().m_81325_(4), "titles remove @s titles:herobrine");
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 1);
                return;
            } else if (entity instanceof Player) {
                Player _player5 = (Player) entity;
                if (!_player5.f_19853_.m_5776_()) {
                    _player5.m_5661_(new TextComponent("该玩家未被附身"), false);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (entity instanceof Player) {
            Player _plr = (Player) entity;
            i = _plr.f_36078_;
        } else {
            i = 0;
        }
        if (i >= 10) {
            if (new Object() { // from class: pugilist_steve.procedures.LeaveGetProcedure.3
                public boolean checkGamemode(Entity _ent) {
                    if (_ent instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer = (ServerPlayer) _ent;
                        return _serverPlayer.f_8941_.m_9290_() == GameType.SPECTATOR;
                    } else if (_ent.f_19853_.m_5776_() && (_ent instanceof Player)) {
                        Player _player6 = (Player) _ent;
                        return Minecraft.m_91087_().m_91403_().m_104949_(_player6.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player6.m_36316_().getId()).m_105325_() == GameType.SPECTATOR;
                    } else {
                        return false;
                    }
                }
            }.checkGamemode(entity)) {
                if (entity instanceof LivingEntity) {
                    LivingEntity _entity2 = (LivingEntity) entity;
                    _entity2.m_21195_((MobEffect) AnnoyingVillagersModMobEffects.HEROBRINE_EFFECT.get());
                }
                if (entity instanceof Player) {
                    ((Player) entity).m_6749_(-9);
                }
                entity.m_8127_();
                new Object() { // from class: pugilist_steve.procedures.LeaveGetProcedure.4
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    public void start(LevelAccessor world2, int waitTicks) {
                        this.waitTicks = waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world2;
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

                    /* JADX WARN: Type inference failed for: r1v1, types: [pugilist_steve.procedures.LeaveGetProcedure$4$1] */
                    /* JADX WARN: Type inference failed for: r1v5, types: [pugilist_steve.procedures.LeaveGetProcedure$4$2] */
                    private void run() {
                        Entity _ent = (Entity) this.world.m_6443_(HerobrineEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.procedures.LeaveGetProcedure.4.1
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd -> {
                                    return _entcnd.m_20275_(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                            _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "effect clear @s annoying_villagersbychentu:gedang");
                        }
                        Entity _ent2 = (Entity) this.world.m_6443_(HerobrineEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e2 -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.procedures.LeaveGetProcedure.4.2
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd -> {
                                    return _entcnd.m_20275_(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                            _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "kill @s");
                        }
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity3 = entity;
                            _entity3.m_21195_((MobEffect) AnnoyingVillagersModMobEffects.HEROBRINE_EFFECT.get());
                        }
                        Entity _ent3 = entity;
                        if (!_ent3.f_19853_.m_5776_() && _ent3.m_20194_() != null) {
                            _ent3.m_20194_().m_129892_().m_82117_(_ent3.m_20203_().m_81324_().m_81325_(4), "titles remove @s titles:herobrine");
                        }
                        Entity _ent4 = entity;
                        if (!_ent4.f_19853_.m_5776_() && _ent4.m_20194_() != null) {
                            _ent4.m_20194_().m_129892_().m_82117_(_ent4.m_20203_().m_81324_().m_81325_(4), "titles refresh");
                        }
                        if (entity instanceof ServerPlayer) {
                            ServerPlayer _player6 = entity;
                            _player6.m_143403_(GameType.SURVIVAL);
                        }
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity4 = entity;
                            _entity4.m_21153_(5.0f);
                        }
                        Entity _ent5 = entity;
                        if (!_ent5.f_19853_.m_5776_() && _ent5.m_20194_() != null) {
                            _ent5.m_20194_().m_129892_().m_82117_(_ent5.m_20203_().m_81324_().m_81325_(4), "effect give @s annoying_villagersbychentu:fulu 5 1 true");
                        }
                        Entity _ent6 = entity;
                        if (!_ent6.f_19853_.m_5776_() && _ent6.m_20194_() != null) {
                            _ent6.m_20194_().m_129892_().m_82117_(_ent6.m_20203_().m_81324_().m_81325_(4), "title @s title {\"text\":\"已解脱\",\"color\":\"green\"}");
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 1);
            } else if (entity instanceof Player) {
                Player _player6 = (Player) entity;
                if (!_player6.f_19853_.m_5776_()) {
                    _player6.m_5661_(new TextComponent("该玩家未被附身"), false);
                }
            }
        } else if (entity instanceof Player) {
            Player _player7 = (Player) entity;
            if (!_player7.f_19853_.m_5776_()) {
                _player7.m_5661_(new TextComponent("多人游戏下经验等级小于10无法解脱"), false);
            }
        }
    }
}