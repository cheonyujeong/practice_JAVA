package sec02.exam06;

public class FloatDoubleExample {
	public static void main(String[] args) 
	{
		double var1 = 3.14;
		//float var2 = 3.14;
		float var3 = 3.14F;
		
		// 정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		// 지수 값 사용
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);
	}
}

/* ---------------------------------------------------------------------------------------------
실수 - float, double 타입 
- float : 부호비트(1bit) + 지수(8bit) + 가수 (23bit) = 4byte
- double : 부호비트(1bit) + 지수(11bit) + 가수 (52bit) = 8byte
- double이 float 보다 정밀한 값 저장 가능
- 자바는 실수 리터럴의 기본 타입을 double로 간주
- 실수 리터럴을 float에 저장하려면 리터럴 뒤에 'f' 또는 'F' 붙여야 함
- 정수 리터럴에 10의 지수를 나타내는 E 또는 e를 포함하고 있으면 정수 타입 변수에 저장할 수 없고, 실수 타입에 저장해야 함!!
---------------------------------------------------------------------------------------------- */
