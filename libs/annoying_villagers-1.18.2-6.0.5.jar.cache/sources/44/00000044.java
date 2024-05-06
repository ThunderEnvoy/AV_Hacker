package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/RightswordProcedure.class */
public class RightswordProcedure {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getPlayer().m_7655_()) {
            return;
        }
        execute(event, event.getWorld(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, Entity entity) {
        execute(null, world, entity);
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [pugilist_steve.procedures.RightswordProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v62, types: [pugilist_steve.procedures.RightswordProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, final Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity) entity;
            itemStack = _livEnt.m_21205_();
        } else {
            itemStack = ItemStack.f_41583_;
        }
        if (itemStack.m_41720_() instanceof SwordItem) {
            if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "epicfight mode battle @s");
            }
            new Object() { // from class: pugilist_steve.procedures.RightswordProcedure.1
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
                        _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "effect clear @s annoying_villagersbychentu:gedang");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 3);
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt2 = (LivingEntity) entity;
            itemStack2 = _livEnt2.m_21205_();
        } else {
            itemStack2 = ItemStack.f_41583_;
        }
        if (itemStack2.m_41720_() instanceof AxeItem) {
            if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "epicfight mode battle @s");
            }
            new Object() { // from class: pugilist_steve.procedures.RightswordProcedure.2
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
                        _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "effect clear @s annoying_villagersbychentu:gedang");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 2);
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt3 = (LivingEntity) entity;
            itemStack3 = _livEnt3.m_21205_();
        } else {
            itemStack3 = ItemStack.f_41583_;
        }
        if (itemStack3.m_41720_() instanceof TridentItem) {
            if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "effect clear @s annoying_villagersbychentu:gedang");
            }
            if (!entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
                entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "epicfight mode battle @s");
            }
        }
    }
}