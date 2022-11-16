package sec02.exam12;

public class FromIntToDouble {
	public static void main(String[] args) 
	{
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}

/* --------------------------------------------------
강제 타입 변환
- int 값을 안전하게 실수 타입으로 변환시키려면 double 타입 사용
--------------------------------------------------- */