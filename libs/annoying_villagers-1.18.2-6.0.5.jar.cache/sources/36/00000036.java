package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/ParryProcedure.class */
public class ParryProcedure {
    @SubscribeEvent
    public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
        if (event.getHand() != event.getPlayer().m_7655_()) {
            return;
        }
        execute(event, event.getWorld(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, Entity sourceentity) {
        execute(null, world, sourceentity);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.procedures.ParryProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v46, types: [pugilist_steve.procedures.ParryProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, final Entity sourceentity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (sourceentity == null) {
            return;
        }
        if (sourceentity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity) sourceentity;
            itemStack = _livEnt.m_21205_();
        } else {
            itemStack = ItemStack.f_41583_;
        }
        if (itemStack.m_41720_() instanceof SwordItem) {
            if (!sourceentity.f_19853_.m_5776_() && sourceentity.m_20194_() != null) {
                sourceentity.m_20194_().m_129892_().m_82117_(sourceentity.m_20203_().m_81324_().m_81325_(4), "epicfight mode battle @s");
            }
            if (!sourceentity.f_19853_.m_5776_() && sourceentity.m_20194_() != null) {
                sourceentity.m_20194_().m_129892_().m_82117_(sourceentity.m_20203_().m_81324_().m_81325_(4), "effect give @s annoying_villagersbychentu:gedang 1 1 true");
            }
            new Object() { // from class: pugilist_steve.procedures.ParryProcedure.1
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
                    Entity _ent = sourceentity;
                    if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                        _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "effect clear @s annoying_villagersbychentu:gedang");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 5);
            return;
        }
        if (sourceentity instanceof LivingEntity) {
            LivingEntity _livEnt2 = (LivingEntity) sourceentity;
            itemStack2 = _livEnt2.m_21205_();
        } else {
            itemStack2 = ItemStack.f_41583_;
        }
        if (itemStack2.m_41720_() instanceof AxeItem) {
            if (!sourceentity.f_19853_.m_5776_() && sourceentity.m_20194_() != null) {
                sourceentity.m_20194_().m_129892_().m_82117_(sourceentity.m_20203_().m_81324_().m_81325_(4), "epicfight mode battle @s");
            }
            if (!sourceentity.f_19853_.m_5776_() && sourceentity.m_20194_() != null) {
                sourceentity.m_20194_().m_129892_().m_82117_(sourceentity.m_20203_().m_81324_().m_81325_(4), "effect give @s annoying_villagersbychentu:gedang 1 1 true");
            }
            new Object() { // from class: pugilist_steve.procedures.ParryProcedure.2
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
                    Entity _ent = sourceentity;
                    if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
                        _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "effect clear @s annoying_villagersbychentu:gedang");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 5);
        }
    }
}