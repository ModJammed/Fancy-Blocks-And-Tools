package common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class itemamethystaxe extends ItemAxe {

	String itemamethystaxe;
	
	public itemamethystaxe(int i, EnumToolMaterial enumToolMaterial, String itemamethystaxe)
	{
	super(i, enumToolMaterial);
	setCreativeTab(CreativeTabs.tabTools);
	this.itemamethystaxe = itemamethystaxe;
	}
	public void updateIcons(IconRegister iconRegister) {
	iconIndex = iconRegister.registerIcon("fancyblocks:" + itemamethystaxe);}
	  

}
