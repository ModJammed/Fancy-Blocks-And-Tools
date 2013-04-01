package common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class itemamethystspade extends ItemSpade {

	String itemamethystspade;
	
	public itemamethystspade(int i, EnumToolMaterial enumToolMaterial, String itemamethystspade)
	{
	super(i, enumToolMaterial);
	setCreativeTab(CreativeTabs.tabTools);
	this.itemamethystspade = itemamethystspade;
	}
	public void updateIcons(IconRegister iconRegister) {
	iconIndex = iconRegister.registerIcon("fancyblocks:" + itemamethystspade);}
	  

}
