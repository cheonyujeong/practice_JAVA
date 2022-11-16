package sec02.exam09;

public class CastingExample {
	public static void main(String[] args) 
	{
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}
}

/* ---------------------------------------------------------------------------------
강제 타입 변환 : 큰 타입을 작은 타입 단위로 쪼개고 끝 한부분만 작은 타입으로 변환
- 캐스팅 연산자 () 를 사용
- 원래 값 보존되지 않음
- 실수 타입은 정수 타입으로 자동 변환되지 않기 떄문에 강제 타입 변환 사용, 소수점 이하 버림
--------------------------------------------------------------------------------- */