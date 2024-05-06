package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/FireworkuseProcedure.class */
public class FireworkuseProcedure {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getHand() != event.getPlayer().m_7655_()) {
            return;
        }
        execute(event, event.getWorld(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [pugilist_steve.procedures.FireworkuseProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity != null && !entity.m_6144_()) {
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity) entity;
                itemStack = _livEnt.m_21205_();
            } else {
                itemStack = ItemStack.f_41583_;
            }
            if (itemStack.m_41720_() == Items.f_42688_) {
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt2 = (LivingEntity) entity;
                    if (_livEnt2.m_21023_(MobEffects.f_19621_)) {
                        if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                            entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "1");
                            return;
                        }
                        return;
                    }
                }
                if (entity instanceof LivingEntity) {
                    LivingEntity _entity = (LivingEntity) entity;
                    if (!_entity.f_19853_.m_5776_()) {
                        _entity.m_7292_(new MobEffectInstance(MobEffects.f_19621_, 250, 1, false, false));
                    }
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).m_21011_(InteractionHand.MAIN_HAND, true);
                }
                if (entity instanceof Player) {
                    ItemCooldowns m_36335_ = ((Player) entity).m_36335_();
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt3 = (LivingEntity) entity;
                        itemStack2 = _livEnt3.m_21205_();
                    } else {
                        itemStack2 = ItemStack.f_41583_;
                    }
                    m_36335_.m_41524_(itemStack2.m_41720_(), 250);
                }
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    ItemStack _stktoremove = new ItemStack(Items.f_42688_);
                    _player.m_150109_().m_36022_(p -> {
                        return _stktoremove.m_41720_() == p.m_41720_();
                    }, 1, _player.f_36095_.m_39730_());
                }
                if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                    entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "/summon firework_rocket ~ ~10 ~ {LifeTime:10,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:3,Colors:[0],Flicker:1}]}},display:{Name:\"Black Creeper Firework\"}}}");
                }
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).m_8767_(ParticleTypes.f_123815_, x, y, z, 40, 0.0d, 3.0d, 0.0d, 1.0d);
                }
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                    } else {
                        _level.m_7785_(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.launch")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                    }
                }
                new Object() { // from class: pugilist_steve.procedures.FireworkuseProcedure.1
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
                        Level level = this.world;
                        if (level instanceof Level) {
                            Level _level2 = level;
                            if (!_level2.m_5776_()) {
                                _level2.m_5594_((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                            } else {
                                _level2.m_7785_(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                            }
                        }
                        if (Math.random() <= 0.6d) {
                            if (!this.world.m_5776_() && this.world.m_142572_() != null) {
                                this.world.m_142572_().m_6846_().m_11264_(new TextComponent("<村民侦察兵> What the matter?"), ChatType.SYSTEM, Util.f_137441_);
                            }
                            Entity _ent = entity;
                            if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                                _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing ^ ^5 ^10");
                            }
                            Entity _ent2 = entity;
                            if (!_ent2.f_19853_.m_5776_() && _ent2.m_20194_() != null) {
                                _ent2.m_20194_().m_129892_().m_82117_(_ent2.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing ^10 ^5 ^5");
                            }
                            Entity _ent3 = entity;
                            if (!_ent3.f_19853_.m_5776_() && _ent3.m_20194_() != null) {
                                _ent3.m_20194_().m_129892_().m_82117_(_ent3.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:lan_cun_qi ^10 ^5 ^20");
                            }
                        } else if (Math.random() <= 0.1d) {
                            if (!this.world.m_5776_() && this.world.m_142572_() != null) {
                                this.world.m_142572_().m_6846_().m_11264_(new TextComponent("<村民蓝骑兵> What the matter?"), ChatType.SYSTEM, Util.f_137441_);
                            }
                            Entity _ent4 = entity;
                            if (!_ent4.f_19853_.m_5776_() && _ent4.m_20194_() != null) {
                                _ent4.m_20194_().m_129892_().m_82117_(_ent4.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:lan_cun_qi ^10 ^5 ^20");
                            }
                            Entity _ent5 = entity;
                            if (!_ent5.f_19853_.m_5776_() && _ent5.m_20194_() != null) {
                                _ent5.m_20194_().m_129892_().m_82117_(_ent5.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:lan_cun_qi ^5 ^5 ^20");
                            }
                            Entity _ent6 = entity;
                            if (!_ent6.f_19853_.m_5776_() && _ent6.m_20194_() != null) {
                                _ent6.m_20194_().m_129892_().m_82117_(_ent6.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing ^ ^5 ^10");
                            }
                        } else if (Math.random() <= 0.1d) {
                            if (!this.world.m_5776_() && this.world.m_142572_() != null) {
                                this.world.m_142572_().m_6846_().m_11264_(new TextComponent("<村民紫骑兵> What the matter?"), ChatType.SYSTEM, Util.f_137441_);
                            }
                            Entity _ent7 = entity;
                            if (!_ent7.f_19853_.m_5776_() && _ent7.m_20194_() != null) {
                                _ent7.m_20194_().m_129892_().m_82117_(_ent7.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:zi_cun_qi ^5 ^5 ^20");
                            }
                            Entity _ent8 = entity;
                            if (!_ent8.f_19853_.m_5776_() && _ent8.m_20194_() != null) {
                                _ent8.m_20194_().m_129892_().m_82117_(_ent8.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:zi_cun_qi ^10 ^5 ^20");
                            }
                        } else if (Math.random() <= 0.1d) {
                            if (!this.world.m_5776_() && this.world.m_142572_() != null) {
                                this.world.m_142572_().m_6846_().m_11264_(new TextComponent("<村民红骑兵> What the matter?"), ChatType.SYSTEM, Util.f_137441_);
                            }
                            Entity _ent9 = entity;
                            if (!_ent9.f_19853_.m_5776_() && _ent9.m_20194_() != null) {
                                _ent9.m_20194_().m_129892_().m_82117_(_ent9.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:hong_cun_qi ^10 ^5 ^20");
                            }
                            Entity _ent10 = entity;
                            if (!_ent10.f_19853_.m_5776_() && _ent10.m_20194_() != null) {
                                _ent10.m_20194_().m_129892_().m_82117_(_ent10.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:hong_cun_qi ^5 ^5 ^20");
                            }
                            Entity _ent11 = entity;
                            if (!_ent11.f_19853_.m_5776_() && _ent11.m_20194_() != null) {
                                _ent11.m_20194_().m_129892_().m_82117_(_ent11.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing ^ ^5 ^10");
                            }
                        } else {
                            if (!this.world.m_5776_() && this.world.m_142572_() != null) {
                                this.world.m_142572_().m_6846_().m_11264_(new TextComponent("<村民绿骑兵> What the matter?"), ChatType.SYSTEM, Util.f_137441_);
                            }
                            Entity _ent12 = entity;
                            if (!_ent12.f_19853_.m_5776_() && _ent12.m_20194_() != null) {
                                _ent12.m_20194_().m_129892_().m_82117_(_ent12.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing ^ ^5 ^10");
                            }
                            Entity _ent13 = entity;
                            if (!_ent13.f_19853_.m_5776_() && _ent13.m_20194_() != null) {
                                _ent13.m_20194_().m_129892_().m_82117_(_ent13.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:lan_cun_qi ^10 ^5 ^20");
                            }
                            Entity _ent14 = entity;
                            if (!_ent14.f_19853_.m_5776_() && _ent14.m_20194_() != null) {
                                _ent14.m_20194_().m_129892_().m_82117_(_ent14.m_20203_().m_81324_().m_81325_(4), "/summon annoying_villagersbychentu:lu_cun_qi ^5 ^5 ^20");
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 50);
            }
        }
    }
}