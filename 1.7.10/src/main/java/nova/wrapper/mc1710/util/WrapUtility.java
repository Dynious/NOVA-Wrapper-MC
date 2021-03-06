package nova.wrapper.mc1710.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import nova.core.entity.component.Player;
import nova.wrapper.mc1710.wrapper.item.ItemConverter;

import java.util.Optional;

/**
 * Wrap utility methods.
 * @author Calclavia
 */
public class WrapUtility {

	public static Optional<Player> getNovaPlayer(EntityPlayer player) {
		// TODO: implement
		return Optional.empty();
	}

	public static String getItemID(net.minecraft.item.Item item, int meta) {
		if (item.getHasSubtypes()) {
			return Item.itemRegistry.getNameForObject(item) + ":" + meta;
		} else {
			return Item.itemRegistry.getNameForObject(item);
		}
	}

	public EntityPlayer getMCPlayer(Optional<Player> player) {
		return null;
	}
}
