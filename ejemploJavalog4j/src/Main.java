import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    final Level VERBOSE= Level.forName("VERBOSE",150);//DECLARO UN TIPO DE LEVEL,  150 VALOR DEL MENSAJE, PUEDO CREAR MIS PROPIOS MENSAJES
    private  static final Logger logger= LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Main app= new Main();//crea la app
        if(logger.isErrorEnabled())//se le pregunta si esta habilitado el logger para funcionar
        logger.error("esto es un error");
        logger.info("Entering application");
        logger.debug("esto e debug Logging!");
        logger.log(app.VERBOSE,"a verbose message");
    }


}
