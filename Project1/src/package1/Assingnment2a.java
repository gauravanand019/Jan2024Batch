package package1;
//AssignmentA- output should be ((((10+2)+2)-2)*2)/2)

public class Assingnment2a {

	public int sum(int a, int b) {
		
		int result=a+b;
		return result;
}
	public int sub(int c, int d) {
		int result1=c-d;
		return result1;
	}
	public int multi(int e, int f) {
		int result2=e*f;
		return result2;
	}
	public int div(int g, int h) {
		int result3=g/h;
		return result3;
		
	}
	public static void main(String[] args) {
		Assingnment2a calculation = new Assingnment2a();
		int sum1=calculation.sum(10,2);
		int sum2=calculation.sum(sum1,2);
		int sub=calculation.sub(sum2, 2);
		int multi=calculation.multi(sub, 2);
		int div=calculation.div(multi, 2);
		System.out.println("final result of exprassion ((((10+2)+2)-2)*2)/2) is " + div);
	}
}
		