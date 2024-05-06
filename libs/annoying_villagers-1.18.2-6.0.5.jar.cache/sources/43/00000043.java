package pugilist_steve.procedures;

import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
/* loaded from: annoying_villagers-1.18.2-6.0.5.jar:pugilist_steve/procedures/RightefProcedure.class */
public class RightefProcedure {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getPlayer().m_7655_()) {
            return;
        }
        execute(event, event.getPlayer());
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        if (entity == null) {
            return;
        }
        Enchantment enchantment = Enchantments.f_44958_;
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity) entity;
            itemStack = _livEnt.m_21205_();
        } else {
            itemStack = ItemStack.f_41583_;
        }
        if (EnchantmentHelper.m_44843_(enchantment, itemStack) != 0 && !entity.f_19853_.m_5776_() && entity.m_20194_() != null) {
            entity.m_20194_().m_129892_().m_82117_(entity.m_20203_().m_81324_().m_81325_(4), "effect give @s annoying_villagersbychentu:electify 4 0 true");
        }
        Enchantment enchantment2 = Enchantments.f_44981_;
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt2 = (LivingEntity) entity;
            itemStack2 = _livEnt2.m_21205_();
        } else {
            itemStack2 = ItemStack.f_41583_;
        }
        if (EnchantmentHelper.m_44843_(enchantment2, itemStack2) != 0) {
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt3 = (LivingEntity) entity;
                itemStack6 = _livEnt3.m_21205_();
            } else {
                itemStack6 = ItemStack.f_41583_;
            }
            Map<Enchantment, Integer> _enchantments = EnchantmentHelper.m_44831_(itemStack6);
            if (_enchantments.containsKey(Enchantments.f_44981_)) {
                _enchantments.remove(Enchantments.f_44981_);
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt4 = (LivingEntity) entity;
                    itemStack7 = _livEnt4.m_21205_();
                } else {
                    itemStack7 = ItemStack.f_41583_;
                }
                EnchantmentHelper.m_44865_(_enchantments, itemStack7);
                return;
            }
            return;
        }
        Enchantment enchantment3 = Enchantments.f_44981_;
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt5 = (LivingEntity) entity;
            itemStack3 = _livEnt5.m_21206_();
        } else {
            itemStack3 = ItemStack.f_41583_;
        }
        if (EnchantmentHelper.m_44843_(enchantment3, itemStack3) != 0) {
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt6 = (LivingEntity) entity;
                itemStack4 = _livEnt6.m_21206_();
            } else {
                itemStack4 = ItemStack.f_41583_;
            }
            Map<Enchantment, Integer> _enchantments2 = EnchantmentHelper.m_44831_(itemStack4);
            if (_enchantments2.containsKey(Enchantments.f_44981_)) {
                _enchantments2.remove(Enchantments.f_44981_);
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt7 = (LivingEntity) entity;
                    itemStack5 = _livEnt7.m_21206_();
                } else {
                    itemStack5 = ItemStack.f_41583_;
                }
                EnchantmentHelper.m_44865_(_enchantments2, itemStack5);
            }
        }
    }
}