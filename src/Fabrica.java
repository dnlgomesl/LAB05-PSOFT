import tiposTransporte.*;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {

    private static Map<Integer, Transporte> transportes;

    public static Transporte selecionaTransporte(int idTransporte) {
        inciaMap();
        Transporte transporte = null;
        if(transportes.containsKey(idTransporte)){
            transporte = transportes.get(idTransporte);
        }
        return transporte;
    }

    private static void inciaMap() {
        transportes = new HashMap<>();
        transportes.put(1, new Pedestre());
        transportes.put(2, new Carro());
        transportes.put(3, new Ônibus());
        transportes.put(4, new Metrô());
    }

    public static void tiposTransportes(){
        System.out.println("(1) Pedestre\n\r(2)Carro\n\r(3)Ônibus\n\r(4)Metrô");
    }
}
