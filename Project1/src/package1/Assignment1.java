package package1;

public class Assignment1 {
 int rollno;
 int age;
 
 public void text1() {
	 System.out.println(" hi friends, most welcome to all of you");
 }
 public void text2() {
	 System.out.println(" Automation is so easy by precticing to code");
 }
 public static void main(String[] args) {
	 Assignment1 gaurav = new Assignment1();
	 gaurav.text1();
	 gaurav.text2();
	 gaurav.rollno=24;
	 gaurav.age=29;
	 
	 System.out.println("gaurav roll no is:" + gaurav.rollno);
	 System.out.println("gaurav age is:" + gaurav.age);
	
}
}