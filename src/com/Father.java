package com;

;

public class Father {
  void bike() {
	  System.out.println("old fashioed Fathers bike");
  }
}
class Son extends Father{
	@Override
	void bike() {
		
     System.out.println("newly modified son bike");
	}
}
