package common;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Fancyblocks", name = "FancyBlocks", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_fancyblocks {

  @SidedProxy(clientSide = "common.ClientProxy", serverSide = "common.CommonProxy")
  public static CommonProxy proxy;
 //Block declaration
   public static Block lapisbrick;
   public static Block lapisbrickch;
   public static Block goldbrick;
   public static Block goldbrickch;
   public static Block diamondbrick;
   public static Block diamondbrickch;
   public static Block oreflarite;
   public static Block oreamethyst;
   public static Block orekyanite;
   public static Block orezircon;
   public static Item flarite;
   public static Item amethyst;
   public static Item kyanite;
   public static Item zircon;
   public static Block blockflarite;
   public static Block flaritebrick;
   public static Block flaritebrickch;
   public static Block blockamethyst;
   public static Block amethystbrick;
   public static Block amethystbrickch;
   public static Block blockkyanite;
   public static Block kyanitebrick;
   public static Block kyanitebrickch;
   public static Block blockzircon;
   public static Block zirconbrick;
   public static Block zirconbrickch;
   public static Block glassred;
   public static Block glassblack;
   public static Block glasscyan;
   public static Block glassyellow;
   public static Block glassgreen;
   public static Block glasslime;
   public static Block glassmagenta;
   public static Block glasspurple;
   public static Block glasspink;
   public static Block glassblue;
   public static Block glassgrey;
   public static Block glassltgrey;
   public static Block glassorange;
   public static Block glassltblue;
   public static Block glassbrown;
   public static Item amethystpick;
   public static Item amethystaxe;
   public static Item amethystspade;
   public static EnumToolMaterial Amethystpick = EnumHelper.addToolMaterial("Amethyst", 2, 1000, 6.0F, 1, 10);
   public static EnumToolMaterial Amethystaxe = EnumHelper.addToolMaterial("Amethyst", 0, 1000, 6.0F, 1, 10);
   public static EnumToolMaterial Amethystspade = EnumHelper.addToolMaterial("Amethyst", 1, 1000, 6.0F, 1, 10);
   
   @PreInit
 public void preLoad(FMLPreInitializationEvent event) 
  {
	  
  }
//Put block stuff here
  @Init
 public void load(FMLInitializationEvent event) 
  {

	  proxy.registerRenderThings();
//lapisbrick
	  lapisbrick = new lapisbrick(1000, "lapisBrick").setUnlocalizedName("lapisBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(lapisbrick, "lapisBrick");
	  LanguageRegistry.addName(lapisbrick, "Lapis Brick");
	  GameRegistry.addRecipe(new ItemStack(lapisbrick,5), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', new ItemStack(Item.dyePowder, 1, 4)
			    });
//lapisbrickch
	  lapisbrickch = new lapisbrickch(1024, "lapisBrickch").setUnlocalizedName("lapisBrickch").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(lapisbrickch, "lapisBrickch");
	  LanguageRegistry.addName(lapisbrickch, "Chizzled Lapis Brick");
	  GameRegistry.addRecipe(new ItemStack(lapisbrickch,4), new Object[]
			    {
			     "XX","XX", 'X', common.mod_fancyblocks.lapisbrick
			    });
//goldbrick
	  goldbrick = new goldbrick(1001, "goldBrick").setUnlocalizedName("goldBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(goldbrick, "goldBrick");
	  LanguageRegistry.addName(goldbrick, "Gold Brick");
	  GameRegistry.addRecipe(new ItemStack(goldbrick,5), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', Item.ingotGold
			    });
//goldbrickch
	  goldbrickch = new goldbrickch(1025, "goldbrickch").setUnlocalizedName("goldbrickch").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(goldbrickch, "goldbrickch");
	  LanguageRegistry.addName(goldbrickch, "Chizzled Gold Brick");
	  GameRegistry.addRecipe(new ItemStack(goldbrickch,4), new Object[]
			    {
			     "XX","XX", 'X', common.mod_fancyblocks.goldbrick
			    });
//diamondbrick
	  diamondbrick = new diamondbrick(1002, "diamondBrick").setUnlocalizedName("diamondBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(diamondbrick, "diamondBrick");
	  LanguageRegistry.addName(diamondbrick, "Diamond Brick");
	  GameRegistry.addRecipe(new ItemStack(diamondbrick,5), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', Item.diamond
			    });
//diamondbrickch
	  diamondbrickch = new  diamondbrickch(1026, "diamondbrickch").setUnlocalizedName("diamondbrickch").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(diamondbrickch, "diamondbrickch");
	  LanguageRegistry.addName(diamondbrickch, "Chizzled Diamond Brick");
	  GameRegistry.addRecipe(new ItemStack(diamondbrickch,4), new Object[]
			    {
			     "XX","XX", 'X', common.mod_fancyblocks.diamondbrick
			    });
//oreflarite
	  oreflarite = new oreflarite(1003, "oreflarite").setUnlocalizedName("oreflarite").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(oreflarite, "oreflarite");
	  LanguageRegistry.addName(oreflarite, "Flarite Ore");
	  GameRegistry.registerWorldGenerator(new oreflariteworldgen());
//oreamethyst
	  oreamethyst = new oreamethyst(1004, "oreamethyst").setUnlocalizedName("oreamethyst").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(oreamethyst, "oreamethyst");
	  LanguageRegistry.addName(oreamethyst, "Amethyst Ore");
	  GameRegistry.registerWorldGenerator(new oreamethystworldgen());
//orekyanite
	  orekyanite = new orekyanite(1029, "orekyanite").setUnlocalizedName("orekyanite").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(orekyanite, "orekyanite");
	  LanguageRegistry.addName(orekyanite, "Kyanite Ore");
	  GameRegistry.registerWorldGenerator(new orekyaniteworldgen());
//orezircon
	  orezircon = new orezircon(1030, "orezircon").setUnlocalizedName("orezircon").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(orezircon, "orezircon");
	  LanguageRegistry.addName(orezircon, "Zircon Ore");
	  GameRegistry.registerWorldGenerator(new orezirconworldgen());
//flarite
	  flarite = new itemflarite(5500, "flarite").setUnlocalizedName("flarite");
	  GameRegistry.registerItem(flarite, "flarite");
	  LanguageRegistry.addName(flarite, "Flarite");
//amethyst
	  amethyst = new itemamethyst(5501, "amethyst").setUnlocalizedName("amethyst");
	  GameRegistry.registerItem(amethyst, "amethyst");
	  LanguageRegistry.addName(amethyst, "Amethyst");
//amethystpick
	  amethystpick = new itemamethystpick(5504, Amethystpick, "itemamethystpick").setUnlocalizedName("amethystpick");
	  GameRegistry.registerItem(amethystpick, "amethystpick");
	  LanguageRegistry.addName(amethystpick, "Amethyst Pickaxe");
	  GameRegistry.addRecipe(new ItemStack(amethystpick,1), new Object[]
			    {
			     "XXX"," Y "," Y ", 'X', common.mod_fancyblocks.amethyst, 'Y', Item.stick
			    });
//amethystaxe
	  amethystaxe = new itemamethystaxe(5505, Amethystaxe, "itemamethystaxe").setUnlocalizedName("amethystpickaxe");
	  GameRegistry.registerItem(amethystaxe, "amethystaxe");
	  LanguageRegistry.addName(amethystaxe, "Amethyst Axe");
	  GameRegistry.addRecipe(new ItemStack(amethystaxe,1), new Object[]
			    {
			     " XX"," YX"," Y ", 'X', common.mod_fancyblocks.amethyst, 'Y', Item.stick
			    });
//amethystspade
	  amethystspade = new itemamethystspade(5506, Amethystspade, "itemamethystspade").setUnlocalizedName("amethystpickaxe");
	  GameRegistry.registerItem(amethystspade, "amethystspade");
	  LanguageRegistry.addName(amethystspade, "Amethyst Shovel");
	  GameRegistry.addRecipe(new ItemStack(amethystspade,1), new Object[]
			    {
			     " X "," Y "," Y ", 'X', common.mod_fancyblocks.amethyst, 'Y', Item.stick
			    });
//kyanite
	  kyanite = new itemkyanite(5502, "kyanite").setUnlocalizedName("kyanite");
	  GameRegistry.registerItem(kyanite, "kyanite");
	  LanguageRegistry.addName(kyanite, "Kyanite");
//zircon
	  zircon = new itemzircon(5503, "zircon").setUnlocalizedName("zircon");
	  GameRegistry.registerItem(zircon, "zircon");
	  LanguageRegistry.addName(zircon, "Zircon");
//blockflarite
	  blockflarite = new blockflarite(1005, "blockflarite").setUnlocalizedName("blockflarite").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(blockflarite, "blockflarite");
	  LanguageRegistry.addName(blockflarite, "Flarite Block");
	  GameRegistry.addRecipe(new ItemStack(blockflarite,1), new Object[]
			    {
			     "XXX","XXX","XXX", 'X', common.mod_fancyblocks.flarite
			    });
//flaritebrick
	  flaritebrick = new flaritebrick(1006, "flariteBrick").setUnlocalizedName("flariteBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(flaritebrick, "flariteBrick");
	  LanguageRegistry.addName(flaritebrick, "Flarite Brick");
	  GameRegistry.addRecipe(new ItemStack(flaritebrick,5), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', common.mod_fancyblocks.flarite
			    });
//flaritebrickch
	  flaritebrickch = new  flaritebrickch(1027, "flaritebrickch").setUnlocalizedName("flaritebrickch").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(flaritebrickch, "flaritebrickch");
	  LanguageRegistry.addName(flaritebrickch, "Chizzled Flarite Brick");
	  GameRegistry.addRecipe(new ItemStack(flaritebrickch,4), new Object[]
			    {
			     "XX","XX", 'X', common.mod_fancyblocks.flaritebrick
			    });
//amethystblock
	  blockamethyst = new blockamethyst(1007, "blockamethyst").setUnlocalizedName("blockamethyst").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(blockamethyst, "blockamethyst");
	  LanguageRegistry.addName(blockamethyst, "Amethyst Block");
	  GameRegistry.addRecipe(new ItemStack(blockamethyst,1), new Object[]
			    {
			     "XXX","XXX","XXX", 'X', common.mod_fancyblocks.amethyst
			    });
//amethystbrick
	  amethystbrick = new amethystbrick(1008, "amethystBrick").setUnlocalizedName("amethystBrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(amethystbrick, "amethystBrick");
	  LanguageRegistry.addName(amethystbrick, "Amethyst Brick");
	  GameRegistry.addRecipe(new ItemStack(amethystbrick,5), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', common.mod_fancyblocks.amethyst
			    });
//amethystbrickch
	  amethystbrickch = new  amethystbrickch(1028, "amethystbrickch").setUnlocalizedName("amethystbrickch").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(amethystbrickch, "amethystbrickch");
	  LanguageRegistry.addName(amethystbrickch, "Chizzled Amethyst Brick");
	  GameRegistry.addRecipe(new ItemStack(amethystbrickch,4), new Object[]
			    {
			     "XX","XX", 'X', common.mod_fancyblocks.amethystbrick
			    });
//blockyanite
	  blockkyanite = new blockkyanite(1031, "blockkyanite").setUnlocalizedName("blockkyanite").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(blockkyanite, "blockkyanite");
	  LanguageRegistry.addName(blockkyanite, "Kyanite Block");
	  GameRegistry.addRecipe(new ItemStack(blockkyanite,1), new Object[]
			    {
			     "XXX","XXX","XXX", 'X', common.mod_fancyblocks.kyanite
			    });
//kyanitebrick
	  kyanitebrick = new kyanitebrick(1032, "kyanitebrick").setUnlocalizedName("kyanitebrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(kyanitebrick, "kyanitebrick");
	  LanguageRegistry.addName(kyanitebrick, "Kyanite Brick");
	  GameRegistry.addRecipe(new ItemStack(kyanitebrick,5), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', common.mod_fancyblocks.kyanite
			    });
//kyanitebrickch
	  kyanitebrickch = new  kyanitebrickch(1033, "kyanitebrickch").setUnlocalizedName("kyanitebrickch").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(kyanitebrickch, "kyanitebrickch");
	  LanguageRegistry.addName(kyanitebrickch, "Chizzled Kyanite Brick");
	  GameRegistry.addRecipe(new ItemStack(kyanitebrickch,4), new Object[]
			    {
			     "XX","XX", 'X', common.mod_fancyblocks.kyanitebrick
			    });
//blockzircon
	  blockzircon = new blockzircon(1034, "blockzircon").setUnlocalizedName("blockzircon").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(blockzircon, "blockzircon");
	  LanguageRegistry.addName(blockzircon, "Zircon Block");
	  GameRegistry.addRecipe(new ItemStack(blockzircon,1), new Object[]
			    {
			     "XXX","XXX","XXX", 'X', common.mod_fancyblocks.zircon
			    });
//zirconbrick
	  zirconbrick = new kyanitebrick(1035, "zirconbrick").setUnlocalizedName("zirconbrick").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(zirconbrick, "zirconbrick");
	  LanguageRegistry.addName(zirconbrick, "Zircon Brick");
	  GameRegistry.addRecipe(new ItemStack(zirconbrick,5), new Object[]
			    {
			     "XYX","YXY","XYX", 'X', Block.stoneBrick, 'Y', common.mod_fancyblocks.zircon
			    });
//zirconbrickch
	  zirconbrickch = new  zirconbrickch(1036, "zirconbrickch").setUnlocalizedName("zirconbrickch").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(zirconbrickch, "zirconbrickch");
	  LanguageRegistry.addName(zirconbrickch, "Chizzled Zircon Brick");
	  GameRegistry.addRecipe(new ItemStack(zirconbrickch,4), new Object[]
			    {
			     "XX","XX", 'X', common.mod_fancyblocks.zirconbrick
			    });
//glassred
	  glassred = new glassred(1009, "glassred").setUnlocalizedName("glassred").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassred, "glassred");
	  LanguageRegistry.addName(glassred, "Red Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassred,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 1)
			    });  
//glassblack
	  glassblack = new glassblack(1010, "glassblack").setUnlocalizedName("glassblack").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassblack, "glassblack");
	  LanguageRegistry.addName(glassblack, "Black Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassblack,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 0)
			    });
//glasscyan
	  glasscyan = new glasscyan(1011, "glasscyan").setUnlocalizedName("glasscyan").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glasscyan, "glasscyan");
	  LanguageRegistry.addName(glasscyan, "Cyan Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glasscyan,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 6)
			    });
//glassyellow
	  glassyellow = new glassyellow(1012, "glassyellow").setUnlocalizedName("glassyellow").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassyellow, "glassyellow");
	  LanguageRegistry.addName(glassyellow, "Yellow Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassyellow,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 11)
			    });
//glassgreen
	  glassgreen = new glassgreen(1023, "glassgreen").setUnlocalizedName("glassgreen").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassgreen, "glassgreen");
	  LanguageRegistry.addName(glassgreen, "Green Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassgreen,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 2)
			    });
//glasslime
	  glasslime = new glasslime(1013, "glasslime").setUnlocalizedName("glasslime").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glasslime, "glasslime");
	  LanguageRegistry.addName(glasslime, "Lime Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glasslime,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 10)
			    });
//glassmagenta
	  glassmagenta = new glassmagenta(1014, "glassmagenta").setUnlocalizedName("glassmagenta").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassmagenta, "glassmagenta");
	  LanguageRegistry.addName(glassmagenta, "Magenta Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassmagenta,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 13)
			    });
//glasspurple
	  glasspurple = new glasspurple(1015, "glasspurple").setUnlocalizedName("glasspurple").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glasspurple, "glasspurple");
	  LanguageRegistry.addName(glasspurple, "Purple Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glasspurple,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 5)
			    });
//glasspink
	  glasspink = new glasspink(1016, "glasspink").setUnlocalizedName("glasspink").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glasspink, "glasspink");
	  LanguageRegistry.addName(glasspink, "Pink Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glasspink,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 9)
			    });
//glassblue
	  glassblue = new glassblue(1017, "glassblue").setUnlocalizedName("glassblue").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassblue, "glassblue");
	  LanguageRegistry.addName(glassblue, "Blue Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassblue,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 4)
			    });
//glassgrey
	  glassgrey = new glassgrey(1018, "glassgrey").setUnlocalizedName("glassgrey").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassgrey, "glassgrey");
	  LanguageRegistry.addName(glassgrey, "Grey Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassgrey,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 8)
			    });
//glassltgrey
	  glassltgrey = new glassltgrey(1019, "glassltgrey").setUnlocalizedName("glassltgrey").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassltgrey, "glassltgrey");
	  LanguageRegistry.addName(glassltgrey, "LightGrey Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassltgrey,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 7)
			    });
//glassorange
	  glassorange = new glassorange(1020, "glassorange").setUnlocalizedName("glassorange").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassorange, "glassorange");
	  LanguageRegistry.addName(glassorange, "Orange Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassorange,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 14)
			    });
//glassltblue
	  glassltblue = new glassltblue(1021, "glassltblue").setUnlocalizedName("glassltblue").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassltblue, "glassltblue");
	  LanguageRegistry.addName(glassltblue, "LightBlue Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassltblue,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 12)
			    });
//glassbrown
	  glassbrown = new glassbrown(1022, "glassbrown").setUnlocalizedName("glassbrown").setHardness(3.0F).setResistance(10.0F);
	  GameRegistry.registerBlock(glassbrown, "glassbrown");
	  LanguageRegistry.addName(glassbrown, "Brown Stained Glass");
	  GameRegistry.addRecipe(new ItemStack(glassbrown,8), new Object[]
			    {
			     "XXX","XYX","XXX", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 3)
			    });
	  

  }

  @PostInit
 public void modsLoaded(FMLPostInitializationEvent event)
  {

  }
 
}

