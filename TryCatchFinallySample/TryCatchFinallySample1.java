import java.util.logging.*;

public class TryCatchFinallySample1{
    public static void main(String[] args){
        Logger logger = Logger.getLogger(TryCatchFinallySample.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        try{
            logger.warning("try");
            int num = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            logger.severe("catch");
        }finally{
            logger.info("finally");
        }
    }
}