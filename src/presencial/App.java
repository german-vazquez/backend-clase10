package presencial;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static final Logger logger=Logger.getLogger(App.class); //entre parentesis debo poner el nombre de mi clase
    private List<Integer> listaEnteros;
    public App(){
        listaEnteros=new ArrayList<>();
    }
    public void agregarEnteros(Integer numero){
        listaEnteros.add(numero);
        if(listaEnteros.size()>5){
            //usamos el logger
            logger.fatal("la lista tiene más de 5 elementos. Elementos totales: " + listaEnteros.size());

        }
    }
}
