package common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class itemkyanite extends Item {

 String itemkyanite;

 public itemkyanite(int id, String itemkyanite) {
  super(id);
  setCreativeTab(CreativeTabs.tabMaterials);
  this.itemkyanite = itemkyanite;
 }


 public void updateIcons(IconRegister iconRegister) {
  iconIndex = iconRegister.registerIcon("fancyblocks:" + itemkyanite);
 }

}
