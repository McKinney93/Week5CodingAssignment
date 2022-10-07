
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
		StringBuilder logResult = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			logResult.append(log.charAt(i) + " ");
		}
		System.out.println(logResult.toString());
	}

	@Override
	public void error(String error) {
		
		StringBuilder errorResult = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			errorResult.append(error.charAt(i) + " ");
		}
		System.out.println("ERROR: " + errorResult.toString());
	}

}
