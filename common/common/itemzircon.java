package common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class itemzircon extends Item {

 String itemzircon;

 public itemzircon(int id, String itemzircon) {
  super(id);
  setCreativeTab(CreativeTabs.tabMaterials);
  this.itemzircon = itemzircon;
 }


 public void updateIcons(IconRegister iconRegister) {
  iconIndex = iconRegister.registerIcon("fancyblocks:" + itemzircon);
 }

}
