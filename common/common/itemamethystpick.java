package common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class itemamethystpick extends ItemPickaxe {

	String itemamethystpick;
	
	public itemamethystpick(int i, EnumToolMaterial enumToolMaterial, String itemamethystpick)
	{
	super(i, enumToolMaterial);
	setCreativeTab(CreativeTabs.tabTools);
	this.itemamethystpick = itemamethystpick;
	}
	public void updateIcons(IconRegister iconRegister) {
	iconIndex = iconRegister.registerIcon("fancyblocks:" + itemamethystpick);}
	  

}




