package sec02.exam03;

public class CharExample {
	public static void main(String[] args) 
	{
		char c1 = 'A';
		char c2 = 65; // 10진수
		char c3 = '\u0041'; // 16진수 (유니코드 + 16진수 값)
		
		char c4 = '가'; 
		char c5 = 44032; // 10진수
		char c6 = '\uac00'; // 16진수
		
		int uniCode = c1;
		
		String name = "홍길동";
		
		char c = ' '; // char 초기화 시 공백 넣어야 함
		String str = ""; // String 초기화는 공백 안넣어도 됨
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		System.out.println(name);
	}
}

/* ---------------------------------------------------------------------------------
정수 - char 타입 
1. 자바는 모든 문자를 유니코드로 처리
2. 부호 없는 정수값 저장 (음수값 없음)
3. 0 ~ 2^16 까지 저장 가능
4. 작은 따옴표 안의 문자 또는 정수 값 저장
5. 문자열 저장은 String
   -> String은 클래스 타입, String 변수는 참조 변수 
   -> String 객체가 생성되고, String 변수는 String 객체의 번지를 참조 
--------------------------------------------------------------------------------- */
