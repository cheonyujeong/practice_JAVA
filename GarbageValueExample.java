package sec02.exam02;

public class GarbageValueExample {
	public static void main(String[] args)
	{
		byte var1 = 125;
		int var2 = 125;
		
		for(int i=0; i<5; i++)
		{
			var1++;
			var2++;
			
			System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2); // var1 값이 127을 넘으면 최소값인 -128부터 다시 반복됨
		}
	}
}

/* -------------------------------------------------------------------------------------
- 변수의 저장할 수 있는 값의 범위를 초과해서 값이 저장될 수 없는 경우 쓰레기 값이 변수에 저장됨, 최소값부터 다시 반복됨
------------------------------------------------------------------------------------- */