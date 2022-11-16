package sec02.exam08;

public class PromotionExample {
	public static void main(String[] args) 
	{
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue); // byte -> int
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 = " + intValue); // char -> int
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue); // int -> long
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue); // int -> double
	}
}

/* ---------------------------------------------------------------------------------
자동 타입 변환 : 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될 때 발생
- byte < short < int < long < float < double
- 자동 타입 변환이 발생되면 이전의 값과 변환 이후의 값은 동일하다. 즉, 손실 없이 그대로 보존
- 정수 타입이 실수 타입으로 변환된 이후 값은 .0 이 붙음
- char는 음수 값 저장 불가, 음수가 저장될 수 있는 byte 타입을 char 타입으로 자동 변환 불가 
--------------------------------------------------------------------------------- */
