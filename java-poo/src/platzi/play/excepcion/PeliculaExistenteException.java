package platzi.play.excepcion;

public class PeliculaExistenteException extends RuntimeException{
    public PeliculaExistenteException(String titulo){
        super("El Contenido "+titulo+" ya existe.");
    }
}
