package pugilist_steve.procedures;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/FishingrodProcedure.class */
public class FishingrodProcedure {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getPlayer().m_7655_()) {
            return;
        }
        execute(event, event.getWorld(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [pugilist_steve.procedures.FishingrodProcedure$1] */
    /* JADX WARN: Type inference failed for: r2v10, types: [pugilist_steve.procedures.FishingrodProcedure$2] */
    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity) entity;
            itemStack = _livEnt.m_21205_();
        } else {
            itemStack = ItemStack.f_41583_;
        }
        if (itemStack.m_41720_() == Items.f_42523_) {
            if (entity.m_6144_()) {
                entity.m_20260_(true);
            } else if (!world.m_6443_(FishingHook.class, AABB.m_165882_(new Vec3(x, y, z), 70.0d, 70.0d, 70.0d), e -> {
                return true;
            }).isEmpty() && ((Entity) world.m_6443_(FishingHook.class, AABB.m_165882_(new Vec3(x, y, z), 70.0d, 70.0d, 70.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.procedures.FishingrodProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.m_20275_(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null)).m_20096_()) {
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = (List) world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(35.0d), e3 -> {
                    return true;
                }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.m_20238_(_center);
                })).collect(Collectors.toList());
                for (Entity entityiterator : _entfound) {
                    if (entityiterator == ((Entity) world.m_6443_(FishingHook.class, AABB.m_165882_(new Vec3(x, y, z), 70.0d, 70.0d, 70.0d), e4 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.procedures.FishingrodProcedure.2
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd2 -> {
                                return _entcnd2.m_20275_(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null))) {
                        entityiterator.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(entity.m_20185_(), entity.m_20186_(), entity.m_20189_()));
                        entity.m_20256_(new Vec3(0.0d, 0.6d, 0.0d));
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity = (LivingEntity) entity;
                            if (!_entity.f_19853_.m_5776_()) {
                                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19620_, 5, 2, false, false));
                            }
                        }
                        entity.m_20256_(new Vec3(entityiterator.m_20154_().f_82479_ * (-1.5d), entityiterator.m_20154_().f_82480_ * (-1.5d), entityiterator.m_20154_().f_82481_ * (-1.5d)));
                        if (entity instanceof Player) {
                            Player _player = (Player) entity;
                            ItemCooldowns m_36335_ = _player.m_36335_();
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt2 = (LivingEntity) entity;
                                itemStack2 = _livEnt2.m_21205_();
                            } else {
                                itemStack2 = ItemStack.f_41583_;
                            }
                            m_36335_.m_41524_(itemStack2.m_41720_(), 20);
                        }
                    }
                }
            }
        }
    }
}