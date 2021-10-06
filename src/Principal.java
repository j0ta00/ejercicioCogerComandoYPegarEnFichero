import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        redirigirProceso();

    }
    public static void redirigirProceso(){
        ProcessBuilder pb = new ProcessBuilder("cmd");//para que salga en la consola
        pb.inheritIO();//inicia el proceso
        pb.redirectInput(new File("comandos.txt"));//redirecciona el proceso hacia el fichero
        pb.redirectOutput(new File("contenidoComandos.txt"));//redirecciona la salida a un fichero nuevo
        Process proceso;//declaro el proceso
        try{
            proceso=pb.start();//crea e inicia el proceso
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
