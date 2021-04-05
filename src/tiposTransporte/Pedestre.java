package tiposTransporte;

public class Pedestre implements Transporte {
    @Override
    public String calculaRota() {
        return "Calculando a rota de Pedestre";
    }
}
