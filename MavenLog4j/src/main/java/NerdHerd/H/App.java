package NerdHerd.H;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;

public class App {
	
	final static Logger log = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
	
		
		
		//logger log=logger.getLogger(HelloWorld.class);
		
		log.warn("WARNING: " + "bla bla");
		log.error("ERROR: " + "bla bla");
		log.info("INFO: " + "bla bla");
		
	}
}
