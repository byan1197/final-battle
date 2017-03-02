package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.main.classes.EntityB;

public class Player2 extends GameObject implements EntityB {

public int facingp2 = -1; //left
 
 private boolean jumpingP2;
 private boolean hasChosen = false;
 
 private double x, y;
 private double velX = 0;
 private double velY = 0;
 
 public boolean punchP2 = false;
 public boolean kickP2 = false;
 public boolean specialP2 = false; 
 public boolean strafeP2 = false;
 public boolean inActionP2 = false;
 
 Texture tex = Game.getInstance();
 
 private Animation playerWalk, playerWalkLeft, playerJump, playerJumpLeft, playerStillLeft, playerStill; //movements
 private Animation playerPunch, playerPunchLeft, playerKick, playerKickLeft, playerSpecial, playerSpecialLeft; //attacks
 
 public Player2(double x, double y) {
	 super (x, y);
  this.x = x;
  this.y = y;
  
  if (!hasChosen){
	  
	  
	  
   if (Game.ChoiceP2 == Game.CHOICEP2.SAADP2) {
       System.out.println("Player 2 has chosen Saad"); 
       playerWalk = new Animation(
      2, tex.saad[0], tex.saad[1], tex.saad[2], tex.saad[3], tex.saad[4], tex.saad[5], tex.saad[6]
        );
    playerWalkLeft = new Animation(
      2,tex.saad[7], tex.saad[8], tex.saad[9], tex.saad[10], tex.saad[11], tex.saad[12]
        );
    playerJump = new Animation(
      15, tex.saad_jump[0], tex.saad_jump[1], tex.saad_jump[2], tex.saad_jump[3], tex.saad_jump[4], tex.saad_jump[4], tex.saad_jump[4], tex.saad_jump[4], tex.saad_jump[5],
      tex.saad_jump[6], tex.saad_jump[7], tex.saad_jump[8]  
      );
    playerJumpLeft = new Animation(
      15, tex.saad_jump[9], tex.saad_jump[10], tex.saad_jump[11], tex.saad_jump[12], tex.saad_jump[12], tex.saad_jump[12], tex.saad_jump[12], tex.saad_jump[13],
      tex.saad_jump[14], tex.saad_jump[15], tex.saad_jump[16], tex.saad_jump[17]
        );
    playerStillLeft = new Animation (1, tex.saad[0]);
    playerStill = new Animation (1, tex.saad[7]);
    
    playerPunch = new Animation (
      2, tex.saad_punch[0], tex.saad_punch[1], tex.saad_punch[2], tex.saad_punch[3], tex.saad_punch[4], tex.saad_punch[5], tex.saad_punch[6], tex.saad_punch[7],
      tex.saad_punch[8]
      );
    playerPunchLeft = new Animation (
      2, tex.saad_punch[9], tex.saad_punch[10], tex.saad_punch[11], tex.saad_punch[12], tex.saad_punch[13], tex.saad_punch[14], tex.saad_punch[15], tex.saad_punch[16],
       tex.saad_punch[17]
      );
    playerKick = new Animation (
      2, tex.saad_kick[0], tex.saad_kick[1], tex.saad_kick[2], tex.saad_kick[3], tex.saad_kick[4], tex.saad_kick[5], tex.saad_kick[6], tex.saad_kick[7], tex.saad_kick[8]
      );
    playerKickLeft = new Animation (
      2, tex.saad_kick[9], tex.saad_kick[10], tex.saad_kick[11], tex.saad_kick[12], tex.saad_kick[13], tex.saad_kick[14], tex.saad_kick[15], tex.saad_kick[16], 
      tex.saad_kick[17]
      );
    playerSpecial = new Animation (
      2, tex.saad_special[0], tex.saad_special[1], tex.saad_special[2], tex.saad_special[3], tex.saad_special[4], tex.saad_special[5], tex.saad_special[6],
      tex.saad_special[7], tex.saad_special[8]
      );
    playerSpecialLeft= new Animation (
      2, tex.saad_special[9], tex.saad_special[10], tex.saad_special[11], tex.saad_special[12], tex.saad_special[13], tex.saad_special[14], tex.saad_special[15],
      tex.saad_special[16], tex.saad_special[17]
      ); 
   }
   
   
   ///BOND FRAMES
   else if (Game.ChoiceP2 == Game.CHOICEP2.BONDP2) {
    System.out.println("Player 2 has chosen Bond");
    playerWalk = new Animation(
         2, tex.bond[0], tex.bond[1], tex.bond[2], tex.bond[3], tex.bond[4], tex.bond[5], tex.bond[6]
    	       );
    playerWalkLeft = new Animation(
    	 2, tex.bond[7], tex.bond[8], tex.bond[9], tex.bond[10], tex.bond[11], tex.bond[12], tex.bond[13]
    	       );
    playerJump = new Animation(
      15, tex.bond_jump[0], tex.bond_jump[1], tex.bond_jump[2], tex.bond_jump[3], tex.bond_jump[4], tex.bond_jump[4], tex.bond_jump[4], 
      tex.bond_jump[4], tex.bond_jump[5], tex.bond_jump[6]
        );
    playerJumpLeft = new Animation(
      15, tex.bond_jump[7], tex.bond_jump[8], tex.bond_jump[9], tex.bond_jump[10], tex.bond_jump[11], tex.bond_jump[12], tex.bond_jump[13]
        ); 
    playerStillLeft = new Animation (1, tex.bond[0]);
    playerStill = new Animation (1, tex.bond[7]);
    
    playerPunch = new Animation (
      2, tex.bond_punch[0], tex.bond_punch[1], tex.bond_punch[2], tex.bond_punch[3], tex.bond_punch[4], tex.bond_punch[5], 
      tex.bond_punch[6], tex.bond_punch[7]
        );
    playerPunchLeft = new Animation (
      2, tex.bond_punch[8], tex.bond_punch[9], tex.bond_punch[10], tex.bond_punch[11], tex.bond_punch[12], tex.bond_punch[13], 
      tex.bond_punch[14], tex.bond_punch[15]
      );
    playerKick = new Animation (
      2, tex.bond_kick[0], tex.bond_kick[1], tex.bond_kick[2], tex.bond_kick[3], tex.bond_kick[4], tex.bond_kick[5], tex.bond_kick[6]
      );
    playerKickLeft = new Animation (
      2, tex.bond_kick[7], tex.bond_kick[8], tex.bond_kick[9], tex.bond_kick[10], tex.bond_kick[11], tex.bond_kick[12]
      );
    playerSpecial = new Animation (
      3, tex.bond_special[0], tex.bond_special[1] , tex.bond_special[2] , tex.bond_special[3] , tex.bond_special[4] , 
      tex.bond_special[5] , tex.bond_special[6] , tex.bond_special[7]  
      );
    playerSpecialLeft= new Animation (
      3, tex.bond_special[8], tex.bond_special[9], tex.bond_special[10], tex.bond_special[11], tex.bond_special[12],
      tex.bond_special[13], tex.bond_special[14], tex.bond_special[15]
      );
   }
   hasChosen = true;
  }
 }
 
 public void init(){  
 }
 
 
 public void tick(){
  x+= velX;
  y+= velY;
  if (y <= 340) {
   velY ++;
   jumpingP2= true;
  }
  if (x <= 0) {x=0;}
  if (x >= 725) {x=725;}
  if (y >= 370) {
   y=370;
   jumpingP2 = false;
  }
  if (y <= 0) {y=0;}
  if (velX <0){
   facingp2 = -1;
  }
  else if (velX > 0){facingp2 = 1;}
  
  playerWalk.runAnimation();
  playerWalkLeft.runAnimation();
  playerJump.runAnimation();
  playerJumpLeft.runAnimation();
  playerStill.runAnimation();
  playerStillLeft.runAnimation();
  playerPunch.runAnimation();
  playerPunchLeft.runAnimation();
  playerKick.runAnimation();
  playerKickLeft.runAnimation();
  playerSpecial.runAnimation();
  playerSpecialLeft.runAnimation();
 }
 
 public void render(Graphics g){
  if (jumpingP2 && facingp2 == 1) {
   playerJump.drawAnimation(g, (int)x, (int)y);  
  }

  else if (jumpingP2 && facingp2 == -1) {
   playerJumpLeft.drawAnimation(g, (int)x, (int)y);
  }
  else if (jumpingP2 && facingp2 == 1 && specialP2) {
   playerSpecial.drawAnimation(g, (int)x, (int)y);
  }
  else if (jumpingP2 && facingp2 == -1 && specialP2) {
   playerSpecialLeft.drawAnimation(g, (int)x, (int)y);
  }
  else {
   if (!inActionP2 && velX < 0){ //left
    playerWalkLeft.drawAnimation(g, (int)x, (int)y);
   }
   else if (!inActionP2 && velX > 0){
    playerWalk.drawAnimation(g, (int)x, (int)y);
   }
   else if (kickP2 && facingp2 == 1){
    playerKick.drawAnimation(g, (int)x, (int)y);
   }
   else if (kickP2 && facingp2 == -1){
    playerKickLeft.drawAnimation(g, (int)x, (int)y);
   }
   else if (punchP2 && facingp2 == 1){
	   playerPunch.drawAnimation(g, (int)x, (int)y);
	   if (playerPunch.playedOnce) {
		   punchP2 = false;
		   playerStillLeft.drawAnimation(g, (int)x, (int)y);
	   }
   }
   else if (punchP2 && facingp2 == -1){
	   playerPunchLeft.drawAnimation(g, (int)x, (int)y);
	   if (playerPunchLeft.playedOnce) {
		   playerStill.drawAnimation(g, (int)x, (int)y);
		   punchP2 = false;
	   }
   }
   else if (specialP2 && facingp2 == 1){
    playerSpecial.drawAnimation(g, (int)x, (int)y);
	   if (playerSpecial.playedOnce) {
		   playerStillLeft.drawAnimation(g, (int)x, (int)y);//facing = 1
		   specialP2 = false;
	   }
   }
   else if (specialP2 && facingp2 == -1){
    playerSpecialLeft.drawAnimation(g, (int)x, (int)y);
	   if (playerSpecialLeft.playedOnce) {
		   playerStill.drawAnimation(g, (int)x, (int)y);
		   specialP2 = false;
	   }
   }
   else {
    if (facingp2 == -1) {
     playerStill.drawAnimation(g, (int)x, (int)y);
    }
    else if (facingp2 == 1){
     playerStillLeft.drawAnimation(g, (int)x, (int)y);
    }
   }
  }
 }
 
 public double getX(){
  return x;
 }
 public double getY(){
  return y;
 }
	public Rectangle getBounds(){
		return new Rectangle ((int)x+10, (int)y,80, 150);
	}
 public boolean isJumpingp2(){
  return jumpingP2;
 }
 public void setX(double x){
  this.x = x;
 }
 public void setY(double y){
  this.y = y;
 }
 public void setVelX(double velX){
  this.velX = velX;
 }
 public void setVelYp2(double velY){
  this.velY = velY;
 }

 
}
