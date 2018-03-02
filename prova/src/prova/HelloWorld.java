package prova;



import org.apache.log4j.Logger;

public class HelloWorld {
	
	final static Logger log = Logger.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
	
		
		
		//logger log=logger.getLogger(HelloWorld.class);
		
		log.warn("WARNING: " + "bla bla");
		log.error("ERROR: " + "bla bla");
		log.info("INFO: " + "bla bla");
		
	}
}