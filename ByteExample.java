package sec02.exam01;

public class ByteExample {
	public static void main(String[] args)
	{
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; // 컴파일 에러 ( -128 ~ 127 까지 표현 가능)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}

/* ---------------------------------------------------------------------------------
정수 - byte 타입 
1. 1byte로 표현되는 정수 저장
2. -2^7 ~ (2^7 - 1) 까지 저장 가능
3. 색상 정보 및 파일 또는 이미지 등의 이진 데이터를 처리할 때 주로 사용
--------------------------------------------------------------------------------- */
