package com.blockchain;

import com.blockchain.pojo.Block;
import com.blockchain.pojo.BootCoin;
import com.blockchain.util.CommonUtil;

public class Test {

	public static void main(String[] args) {
		System.out.println("Trying to Mine block 1... ");
		BootCoin.addBlock(new Block("Hi im the first block", "0"));
		
		System.out.println("Trying to Mine block 2... ");
		BootCoin.addBlock(new Block("Yo im the second block",BootCoin.blockchain.get(BootCoin.blockchain.size()-1).hash));
		
		System.out.println("Trying to Mine block 3... ");
		BootCoin.addBlock(new Block("Hey im the third block",BootCoin.blockchain.get(BootCoin.blockchain.size()-1).hash));	
		
		System.out.println("\nBlockchain is Valid: " + BootCoin.isChainValid());
		
		String blockchainJson = CommonUtil.getJson(BootCoin.blockchain);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson);
	}
}
