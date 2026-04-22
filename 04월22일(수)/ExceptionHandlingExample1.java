public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result = 0;
		try {
			result = data.length();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("항상 난 실행되는 문장이예요");
		}
		System.out.println("문자수: " + result);

	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
