
public class App {

	public static void main(String[] args) {

		Logger logger = new AsteriskLogger();
		
		logger.log("Biotechnology");
		logger.error("Genetics");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("Schanuzer");
		logger2.error("Parakeets");
		
	}

}
