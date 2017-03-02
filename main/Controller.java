package com.game.src.main;

import java.awt.Graphics;
import java.util.LinkedList;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityD;

public class Controller {
	
	private LinkedList<EntityA> ea = new LinkedList<EntityA>();
	private LinkedList<EntityB> eb = new LinkedList<EntityB>();
	private LinkedList<EntityC> ec = new LinkedList<EntityC>();
	private LinkedList<EntityD> ed = new LinkedList<EntityD>();
	
	EntityA enta;
	EntityB entb;
	EntityC entc;
	EntityD entd;
	Game game;
	
	public Controller(Game game){
		this.game = game;
	}
	
	public void tick(){	
		for (int i = 0; i < ea.size(); i++){
			enta = ea.get(i);
			
			enta.tick();
		}
		
		for (int i = 0; i < eb.size(); i++){
			entb = eb.get(i);
			
			entb.tick();
		}
		for (int i = 0; i < ec.size(); i++){
			entc = ec.get(i);
			
			entc.tick();
		}
		for (int i = 0; i < ed.size(); i++){
			entd = ed.get(i);
			
			entd.tick();
		}
		
	}
	
	public void render(Graphics g) {
		for (int i = 0; i < ea.size(); i++){
			enta = ea.get(i);
			
			enta.render(g);
		}
		for (int i = 0; i < eb.size(); i++){
			entb = eb.get(i);
			
			entb.render(g);
		}
		for (int i = 0; i < ec.size(); i++){
			entc = ec.get(i);
			
			entc.render(g);
		}
		for (int i = 0; i < ed.size(); i++){
			entd = ed.get(i);
			
			entd.render(g);
		}
	}
	
	public void addEntity(EntityA block){
		ea.add(block);
	}
	public void removeEntity(EntityA block){
		ea.remove(block);
	}
	public void addEntity(EntityB block){
		eb.add(block);
	}
	public void removeEntity(EntityB block){
		eb.remove(block);
	}
	public void addEntity(EntityC block){
		ec.add(block);
	}
	public void removeEntity(EntityC block){
		ec.remove(block);
	}
	public void addEntity(EntityD block){
		ed.add(block);
	}
	public void removeEntity(EntityD block){
		ed.remove(block);
	}
	
	public LinkedList<EntityA> getEntityA(){
		return ea;
	}
	public LinkedList<EntityB> getEntityB(){
		return eb;
	}
	public LinkedList<EntityC> getEntityC(){
		return ec;
	}
	public LinkedList<EntityD> getEntityD(){
		return ed;
	}
}
