
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		System.out.println();
	}

	
	@Override
	public void error(String error) {
		for (int i = 0; i < error.length() + 13; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("***Error: " + error + "***");
		
		for (int i = 0; i < error.length() + 13; i++) {
			System.out.print("*");
		}
			System.out.println();
		
	}
	
}
