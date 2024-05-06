package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.init.AnnoyingVillagersModMobEffects;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/TanfanProcedure.class */
public class TanfanProcedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().f_19853_, event.getEntity(), event.getSource().m_7639_(), event.getAmount());
        }
    }

    public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
        execute(null, world, entity, sourceentity, amount);
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [pugilist_steve.procedures.TanfanProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, final Entity sourceentity, double amount) {
        ItemStack itemStack;
        float f;
        if (entity == null || sourceentity == null) {
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
                sourceentity.m_20194_().m_129892_().m_82117_(sourceentity.m_20203_().m_81324_().m_81325_(4), "effect give @s annoying_villagersbychentu:gedang 2 1 true");
            }
            new Object() { // from class: pugilist_steve.procedures.TanfanProcedure.1
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
            }.start(world, (int) (1.5d * amount));
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.m_6095_()).toString().equals("minecraft:player") && ForgeRegistries.ENTITIES.getKey(sourceentity.m_6095_()).toString().equals("annoying_villagers:herobrine")) {
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt2 = (LivingEntity) entity;
                f = _livEnt2.m_21223_();
            } else {
                f = -1.0f;
            }
            if (f > 5.0f || !(entity instanceof LivingEntity)) {
                return;
            }
            LivingEntity _entity = (LivingEntity) entity;
            if (!_entity.f_19853_.m_5776_()) {
                _entity.m_7292_(new MobEffectInstance((MobEffect) AnnoyingVillagersModMobEffects.HEROBRINE_EFFECT.get(), 9999999, 0, false, false));
            }
        }
    }
}