package org;

public class Sports {
	


	    String getName(){
	        return " Generic Sports";
	    }
	  
	    void getNumberOfTeamMembers(){
	        System.out.println( "Each team has n players in" + getName() );
	    }
	
}
	class Soccer extends Sports{
	    @Override
	    String getName(){
	        return " Soccer Class";
	    }
	    @Override
	      void getNumberOfTeamMembers(){
	          System.out.println("Each team has 11 palyers in "+getName());
	      }
	    // Write your overridden getNumberOfTeamMembers method here
      

	}

