package pugilist_steve.procedures;

import javax.annotation.Nullable;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/EnderPearlLandingProcedure.class */
public class EnderPearlLandingProcedure {
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
        if (itemStack.m_41720_() == Items.f_42409_) {
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt2 = (LivingEntity) entity;
                itemStack2 = _livEnt2.m_21206_();
            } else {
                itemStack2 = ItemStack.f_41583_;
            }
            if (itemStack2.m_41720_() == Blocks.f_50077_.m_5456_()) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel) world;
                    Mob primedTnt = new PrimedTnt(EntityType.f_20515_, _level);
                    primedTnt.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0f, 0.0f);
                    if (primedTnt instanceof Mob) {
                        Mob _mobToSpawn = primedTnt;
                        _mobToSpawn.m_6518_(_level, world.m_6436_(primedTnt.m_142538_()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.m_7967_(primedTnt);
                }
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    ItemStack _stktoremove = new ItemStack(Blocks.f_50077_);
                    _player.m_150109_().m_36022_(p -> {
                        return _stktoremove.m_41720_() == p.m_41720_();
                    }, 1, _player.f_36095_.m_39730_());
                }
            }
        }
    }
}