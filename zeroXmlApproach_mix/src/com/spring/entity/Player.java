package com.spring.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("play")
@Scope("prototype")
public class Player {
	private int pId;
	private String pName;
	private int pRank;
	
	public Player() {
		
	}

	public Player(int pId, String pName, int pRank) {
		this.pId = pId;
		this.pName = pName;
		this.pRank = pRank;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpRank() {
		return pRank;
	}

	public void setpRank(int pRank) {
		this.pRank = pRank;
	}

	@Override
	public String toString() {
		return "Player [pId=" + pId + ", pName=" + pName + ", pRank=" + pRank + "]";
	}
	
}
