package package1;

public class Assingnment3b {

	 public void X1() {
		 System.out.println("default Method");
	 }
	 public void X2(int a) {
		 System.out.println("One Parameterized Method");
	 }
	 public void X3(int a,int b) {
		 this.X4(1, 2, 3);
		 this.X5(1, 2, 3, 4);
		 this.X1();
		 this.X2(1);
		 System.out.println("Two Parameterized Method");
	 }
	 public void X4 (int a,int b,int c) {
		 System.out.println("Three Paramiterized Method");
	 }
	 public void X5(int a,int b, int c, int d) {
		 System.out.println("Four Paramiterized Method");
	 }
	 
	  public static void main(String[] args) {
    	  Assingnment3b obj = new Assingnment3b();
    	  obj.X3(1,2);
      }
}
