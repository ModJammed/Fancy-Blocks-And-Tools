package common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class orezircon extends Block {

 String orezircon;
 
 public orezircon(int par1, String orezircon) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.orezircon = orezircon;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + orezircon);
 }

public int idDropped(int par1, Random par2Random, int par3)
{
    return common.mod_fancyblocks.zircon.itemID;
}
public int quantityDropped(Random par1Random)
{
    return 3;
}

}
