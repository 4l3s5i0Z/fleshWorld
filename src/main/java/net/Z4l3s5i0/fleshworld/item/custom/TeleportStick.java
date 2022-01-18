package net.Z4l3s5i0.fleshworld.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class TeleportStick extends Item {
    private static int duration = 5;
    private static int posX = 0;
    private static int posY = 0;
    private static int posZ = 0;
    private Player player;

    public TeleportStick(Properties properties) {
        super(properties.setNoRepair().defaultDurability(duration));
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            int tempX = positionClicked.getX(), tempY = positionClicked.getY(), tempZ = positionClicked.getZ();
            if (posX == tempX && posY == tempY && posZ == tempZ) {
            } else if (posX == 0 && posY == 0 && posZ == 0) {
                updatePosAndPlayer(positionClicked, pContext.getPlayer());
                player.sendMessage(new TranslatableComponent("item.fleshworld.teleport_stick.setpos"), player.getUUID());
            } else {
                player.moveTo(posX, posY + 1, posZ);
                player.sendMessage(new TranslatableComponent(posX + " " + posY + " " + posZ), player.getUUID());
                player.sendMessage(new TranslatableComponent("item.fleshworld.teleport_stick.teleported"), player.getUUID());
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }
    private void updatePosAndPlayer(BlockPos positionClicked, Player player) {
        this.posX = positionClicked.getX();
        this.posY = positionClicked.getY();
        this.posZ = positionClicked.getZ();
        this.player = player;
    }
}
