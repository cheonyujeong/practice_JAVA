package sec02.exam11;

public class FromIntToFloat {
	public static void main(String[] args) 
	{
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}

/* ----------------------------------------------------------------------------------------
강제 타입 변환
- int 값을 float 값으로 변환할 때 정밀도 손실 발생 -> float 값을 다시 int 값으로 변환하면 원래 int 값 얻지 못함
- int 값을 안전하게 실수 타입으로 변환시키려면 double 타입 사용
----------------------------------------------------------------------------------------- */