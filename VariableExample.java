package sec01.exam01;

public class VariableExample {
	public static void main(String[] args)
	{
		int value = 10; // 변수 선언과 동시에 초기화, 초기화하지 않으면 메모리 생성되지 않음
		int result = value + 10;
		
		System.out.println(result);
	}
}

/* ---------------------------------------------------------------------------------
- 변수 이름 작성 규칙
	- 첫번째 글자는 문자이거나 '$', '_'만 가능, 숫자로 시작할 수 없음
	- 영어 대소문자 구분
	- 첫문자는 영어 소문자로 시작, 다른 단어가 붙는 경우 첫문자 대문자
	- 문자수 제한 없음
	- 자바 예약어 사용 불가
- 변수에 값을 저장할 때 대입연산자 (=) 사용, 우측의 값을 좌측 변수에 저장한다는 의미
- 변수는 초기화가 되어야 읽을 수 있음, 초기화되지 않으면 메모리 생성 안됨
- 소스 코드 내에서 직접 입력된 값을 리터럴이라고 부름 
	- 정수 리터럴 : byte, char, short, int, long 타입에 저장 가능
	- 실수 리터럴 : float, double 타입에 저장 가능
	- 문자 리터럴 : char 타입에 저장 가능
	- 문자열 리터럴 : String 타입에 저장 가능
	- 논리 리터럴 : boolean 타입에 저장 가능
--------------------------------------------------------------------------------- */