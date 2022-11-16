package sec02.exam05;

public class LongExample {
	public static void main(String[] args) 
	{
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; // int 범위 초과 값으로 'L' 붙여줘야 함
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}

/* ---------------------------------------------------------------------------------
정수 - long 타입 
1. 8byte로 표현되는 정수 저장
2. -2^63 ~ (2^63 - 1) 까지 저장 가능
3. long 타입의 변수를 초기화할때 정수값 뒤에 소문자 'l' 또는 대문자 'L' 사용 가능
4. int 타입의 저장 범위를 넘어서는 큰 정수는 반드시 소문자 'l' 또는 대문자 'L'을 붙여야 함!! 
---------------------------------------------------------------------------------- */