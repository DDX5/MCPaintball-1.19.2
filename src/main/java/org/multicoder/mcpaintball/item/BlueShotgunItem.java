package org.multicoder.mcpaintball.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.multicoder.mcpaintball.entity.BluePaintballArrowEntity;
import org.multicoder.mcpaintball.init.soundinit;
import org.multicoder.mcpaintball.util.config.MCPaintballConfig;

public class BlueShotgunItem extends Item
{

    public BlueShotgunItem()
    {
        super(new Properties().tab(CreativeModeTab.TAB_MISC));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        if(level.isClientSide())
        {
            player.playSound(soundinit.SINGLE_SHOT.get(),1.0f,1.0f);
        }
        else
        {
            AbstractArrow AAE1 = new BluePaintballArrowEntity(level,player);
            AbstractArrow AAE2 = new BluePaintballArrowEntity(level,player);
            AbstractArrow AAE3 = new BluePaintballArrowEntity(level,player);
            AAE1.shootFromRotation(player,(player.getXRot() + 1.0f),player.getYRot(),0.0f,3.0f, MCPaintballConfig.SHOTGUN_INACCURACY.get().floatValue());
            AAE2.shootFromRotation(player,player.getXRot(),player.getYRot(),0.0f,3.0f,MCPaintballConfig.SHOTGUN_INACCURACY.get().floatValue());
            AAE3.shootFromRotation(player,(player.getXRot() - 1.0f),player.getYRot(),0.0f,3.0f,MCPaintballConfig.SHOTGUN_INACCURACY.get().floatValue());
            level.addFreshEntity(AAE1);
            level.addFreshEntity(AAE2);
            level.addFreshEntity(AAE3);
            player.getCooldowns().addCooldown(player.getItemInHand(hand).getItem(),25);
        }
        return InteractionResultHolder.pass(player.getItemInHand(hand));
    }
}
