package com.xworkz.corejava.variables;

public class VariablesExample {
 
	  
	    static int m=100;//static variable  
	      void method()  
	    {    
	    	int n=90;//local variable    
	       System.out.println(n);
	    
	    }  
	      
	    public static void main(String args[])  
	    {  
	        int data=50;//instance variable    
	    System.out.println(m);
	    System.out.println(data);
	/*VariablesExample var=new VariablesExample();
	var.method();*/
	
	 new VariablesExample().method(); //abounded object  means using without holing the varible to call methods.
	
	       
	    }  
	    
	//end of class   
}


