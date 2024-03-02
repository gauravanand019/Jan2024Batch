package package1;

public class Assingnment3a {
	
      public Assingnment3a() {
    	  
    	  this (1,2,3);
    	  System.out.println(" Default Constractor");
      }
      public Assingnment3a(int a) {
    	  
    	  this();
    	  System.out.println("One parameterized Constructor");
      }
      public Assingnment3a(int b, int c) {
    	  
    	  this(1);
    	  System.out.println("Two Parameterized Constructor");
    	 }
      public Assingnment3a(int d,int e,int f) {
    	  
    	  System.out.println("Three parameterized Constructor");
      }
      public Assingnment3a(int g,int h,int i,int j) {
    	  
    	  this(1,2);
    	  System.out.println("Four parameterized Constructor");
      }
      public static void main(String[] args) {
    	  
    	  Assingnment3a obj = new Assingnment3a(1,2,3,4);
      }
}
