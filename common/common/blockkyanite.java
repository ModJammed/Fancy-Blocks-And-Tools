package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class blockkyanite extends Block {

 String blockkyanite;
 
 public blockkyanite(int par1, String blockkyanite) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.blockkyanite = blockkyanite;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + blockkyanite);
 }
}