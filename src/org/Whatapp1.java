package org;

public class Whatapp1 {
void sendMessage() {
	
	System.out.println("single trick supported");
	
}
}
 class Whatapp2 extends Whatapp1{
	 @Override
	void sendMessage() {
		 super.sendMessage();
		System.out.println("double trick supported");
		
	}
	void call() {
	   
		System.out.println("call supported");
	}
}
 class Whatapp3 extends Whatapp2{
	 @Override
	 void sendMessage() {
		 super.sendMessage();
		 System.out.println("supporting blue tick");
	 }
	 void call() {
		 super.call();
		 System.out.println("video call suppoted");
	 }
	 void payment() {
		 System.out.println("payment can be done");
	 }
 }
