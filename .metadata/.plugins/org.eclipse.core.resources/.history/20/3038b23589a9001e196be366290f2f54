package com.spring.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.entity.Player;

@Configuration
@ComponentScan("com.spring.entity")
public class ZeroXmlApproachMix {
	
	@Bean(name = "play1")
	@Scope("prototype")
	public Player play1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player Id : ");
		int pId = sc.nextInt();
		System.out.println("Enter Player Name : ");
		String pName = sc.nextLine();
		pName = sc.nextLine();
		System.out.println("Enter Player Rank : ");
		int pRank = sc.nextInt();
		
		Player pl = new Player(pId, pName, pRank);
		return pl;
	}
	
	@Bean(name = "play2")
	@Scope("prototype")
	public Player play2() {
		Player p1 = new Player();
		p1.setpId(131);
		p1.setpName("Rushi Khanna");
		p1.setpRank(43);
		
		return p1;
	}
}
