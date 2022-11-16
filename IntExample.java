package sec02.exam04;

public class IntExample {
	public static void main(String[] args) 
	{
		int var1 = 10;
		int var2 = 012; // 8진수
		int var3 = 0xA; // 16진수
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}

/* ---------------------------------------------------------------------------------
정수 - short 타입 
1. 2byte로 표현되는 정수 저장
2. -2^15 ~ (2^15 - 1) 까지 저장 가능
정수 - int 타입 
1. 4byte로 표현되는 정수 저장
2. -2^31 ~ (2^31 - 1) 까지 저장 가능
---------------------------------------------------------------------------------- */
