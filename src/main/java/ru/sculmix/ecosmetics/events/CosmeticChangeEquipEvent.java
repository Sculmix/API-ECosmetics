package ru.sculmix.ecosmetics.events;

import ru.sculmix.ecosmetics.api.Cosmetic;
import ru.sculmix.ecosmetics.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 *  Event called when a player changes their cosmetic
 */
public class CosmeticChangeEquipEvent extends PlayerEvent implements Cancellable {

    public CosmeticChangeEquipEvent(Player player, Cosmetic oldCosmetic, Cosmetic newCosmetic) {
        super(player);
        throw new MCNotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new MCNotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw new MCNotInstalledException();
    }

    @Override
    public boolean isCancelled() {
        throw new MCNotInstalledException();
    }

    @Override
    public void setCancelled(boolean cancel) {
        throw new MCNotInstalledException();
    }

    public Cosmetic getOldCosmetic() {
        throw new MCNotInstalledException();
    }

    public Cosmetic getNewCosmetic() {
        throw new MCNotInstalledException();
    }
}
