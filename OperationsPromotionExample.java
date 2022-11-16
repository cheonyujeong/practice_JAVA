package sec02.exam13;

public class OperationsPromotionExample {
	public static void main(String[] args) 
	{
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 정수/정수 = 정수
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0; // 정수/실수리터럴 = 실수
		System.out.println(doubleValue);
	}
}

/* --------------------------------------------------------------------------------------------------------
연산식에서 자동 타입 변환
- 서로 다른 타입의 피연산자가 있을 경우 두 피연산자 중 크기가 큰 타입으로 자동 변환된 후 연산을 수행
- 자바는 정수 연산일 경우, int 타입이 기본
	- 크기가 4byte 보다 작은 byte, char, short 타입은 int 타입으로 변환된 후 연산 수행
- 피연산자 중 하나가 long 타입이면 다른 피연산자도 long 타입으로 자동 타입 변환되고 연산 결과도 long 타입
- 피연산자 중 실수리터럴이나 double 타입이 있으면 다른 피연산자도 double 타입으로 자동 타입 변환되어 연산되고 연산 결과도 double 타입
--------------------------------------------------------------------------------------------------------- */
