package package1;
//Assignment2b-output should be ((((10/2)-2)+2)-2)/2)

public class Assingnment2b {
	
public float div(float a, float b) {
		
		float X=a/b;
		return X;
	}
public float sum(float a, float b) {
	
	float Y=a+b;
	return Y;
}
public float sub(float a, float b) {
	
	float Z=a-b;
	return Z;
}
 public static void main (String[]arg) {
	 
	 Assingnment2b output = new Assingnment2b();
	 float result1=output.div(10, 2);
	 float result2=output.sub(result1, 2);
	 float result3=output.sum(result2, 2);
	 float result4=output.sub(result3,2);
	 float result5=output.div(result4, 2);
	  System.out.println("result of Expration ((((10/2)-2)+2)-2)/2) is " + result5 );
}
}