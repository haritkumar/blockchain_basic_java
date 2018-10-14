package com.blockchain.pojo;

import java.util.Date;

import com.blockchain.util.CommonUtil;

public class Block {

	public String hash;
	public String previousHash; 
	private String data; 
	private long timeStamp;
	private int nonce;
	
	public Block(String data,String previousHash ) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
	}
	
	public String calculateHash() {
		String calculatedhash = CommonUtil.applySha256( 
				previousHash +
				Long.toString(timeStamp) +
				Integer.toString(nonce) + 
				data 
				);
		return calculatedhash;
	}
	
	//Increases nonce value until hash target is reached.
	/*
	 * On the bitcoin network nodes share their blockchains and the longest valid chain is accepted by the network. 
	 * What’s to stop someone tampering with data in an old block then creating a whole new longer blockchain 
	 * and presenting that to the network ? Proof of work. The hashcash proof of work system means it takes considerable 
	 * time and computational power to create new blocks. Hence the attacker would need more computational power than the 
	 * rest of the peers combined.
	 * */
	public void mineBlock(int difficulty) {
		String target = CommonUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
		while(!hash.substring( 0, difficulty).equals(target)) {
			//System.out.println(hash.substring( 0, difficulty) +" : "+target);
			nonce ++;
			hash = calculateHash();
		}
		System.out.println("Block Mined!!! : " + hash);
	}
}
