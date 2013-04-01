package common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class orekyanite extends Block {

 String orekyanite;
 
 public orekyanite(int par1, String orekyanite) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.orekyanite = orekyanite;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + orekyanite);
 }

public int idDropped(int par1, Random par2Random, int par3)
{
    return common.mod_fancyblocks.kyanite.itemID;
}
public int quantityDropped(Random par1Random)
{
    return 3;
}

}

