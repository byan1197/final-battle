package com.game.src.main;

import java.util.LinkedList;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityD;

public class Physics {
	public static boolean Collision(EntityA enta, LinkedList<EntityB> entb){
		
		for (int i = 0; i < entb.size(); i++){
			
			if (enta.getBounds().intersects(entb.get(i).getBounds())){
				return true;
			}
		}
		
		return false;
	}
	public static boolean Collision(EntityB entb, LinkedList<EntityA> enta){
		
		for (int i = 0; i < enta.size(); i++){
			
			if (entb.getBounds().intersects(enta.get(i).getBounds())) {
				return true;
			}
		}
		
		return false;
	}
	public static boolean Collision1(EntityA enta, LinkedList<EntityC> entc){
		
		for (int i = 0; i < entc.size(); i++){
			
			if (enta.getBounds().intersects(entc.get(i).getBounds())){
				return true;
			}
		}
		
		return false;
	}
	public static boolean Collision1(EntityC entc, LinkedList<EntityA> enta){
		
		for (int i = 0; i < enta.size(); i++){
			
			if (entc.getBounds().intersects(enta.get(i).getBounds())){
				return true;
			}
		}
		
		return false;
	}
	public static boolean Collision2(EntityB entb, LinkedList<EntityC> entc){
		
		for (int i = 0; i < entc.size(); i++){
			
			if (entb.getBounds().intersects(entc.get(i).getBounds())){			
				return true;
				}

		}
		
		return false;
	}
	public static boolean Collision2(EntityC entc, LinkedList<EntityB> entb){
		
		for (int i = 0; i < entb.size(); i++){
			
			if (entc.getBounds().intersects(entb.get(i).getBounds())){
				return true;
			}
		}
		
		return false;
	}
	public static boolean Collision3(EntityB entb, LinkedList<EntityD> entd){
		
		for (int i = 0; i < entd.size(); i++){
			
			if (entb.getBounds().intersects(entd.get(i).getBounds())){			
				return true;
				}

		}
		
		return false;
	}
	public static boolean Collision3(EntityD entd, LinkedList<EntityB> entb){
		
		for (int i = 0; i < entb.size(); i++){
			
			if (entd.getBounds().intersects(entb.get(i).getBounds())){
				return true;
			}
		}
		
		return false;
	}
	public static boolean Collision4(EntityD entd, LinkedList<EntityA> enta){
		
		for (int i = 0; i < enta.size(); i++){
			
			if (entd.getBounds().intersects(enta.get(i).getBounds())){
				return true;
			}
		}
		
		return false;
	}
	public static boolean Collision4(EntityA enta, LinkedList<EntityD> entd){
		
		for (int i = 0; i < entd.size(); i++){
			
			if (enta.getBounds().intersects(entd.get(i).getBounds())){			
				return true;
				}

		}
		
		return false;
	}

	
}
