package sec01.exam02;

public class VariableScopeExample {
	public static void main(String[] args)
	{
		int v1 = 15;
		if(v1 > 10)
		{
			int v2 = v1 - 10;
		}
		
		//int v3 = v1 + v2 + 5; // v2는 if문 안에 선언되어있기 때문에 사용불가
		int _v2 = v1 - 10;
		int v3 = v1 + _v2 + 5; // 선언된 블록 내에서만 사용가능
		
		System.out.println(v3);
	}
}

/* ---------------------------------------------------------------------------------
- 변수는 메소드 블록 내 어디에서든 선언할 수 있지만, 변수 사용은 제한됨
- 변수는 선언된 블록 내에서만 사용 가능
--------------------------------------------------------------------------------- */
