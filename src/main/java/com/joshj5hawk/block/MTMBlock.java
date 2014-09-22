package com.joshj5hawk.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import com.joshj5hawk.itemblock.ItemBlockGemOres;
import com.joshj5hawk.itemblock.ItemBlockIngotOres;
import com.joshj5hawk.itemblock.ItemBlockSlipperPlanks;
import com.joshj5hawk.lib.Strings;
import com.joshj5hawk.main.MoreToMinecraft;

import cpw.mods.fml.common.registry.GameRegistry;

public class MTMBlock 
{
	public static Block blockSlipperyPlanks;
	public static Block blockObsidianGlass;
	public static Block blockIngotOres;
	public static Block blockGemOres;
	
	
	
	public static void initBlocks()
	{
		/*Wood Planks
		 * Oak - Done
		 * Spruce
		 * Birch
		 * Jungle
		 * Acacia
		 * Dark Oak*/
		blockSlipperyPlanks = new BlockSlipperyPlanks(Material.wood).setBlockName("blockSlipperyPlanks").setBlockTextureName(Strings.modid + ":blockSlipperyPlanks").setHardness(2.5F);
		blockObsidianGlass = new BlockObsidianGlass(Material.glass, false).setBlockName("blockObsidianGlass").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft).setResistance(600000.0F).setHardness(0.3F);
		blockIngotOres = new BlockIngotOres(Material.rock).setBlockName("blockIngotOres");
		blockGemOres = new BlockGemOres(Material.rock).setBlockName("blockGemOres");
		
		registerBlocks();
	}
	
	public static void registerBlocks()
	{
		GameRegistry.registerBlock(blockSlipperyPlanks, ItemBlockSlipperPlanks.class, "blockSlipperyPlanks");
		GameRegistry.registerBlock(blockObsidianGlass, "blockObsidianGlass");
		GameRegistry.registerBlock(blockIngotOres, ItemBlockIngotOres.class, "blockIngotOres");
		GameRegistry.registerBlock(blockGemOres, ItemBlockGemOres.class, "blockGemOres");
		
	}
	
}