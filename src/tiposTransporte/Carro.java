package tiposTransporte;

public class Carro implements Transporte {
    @Override
    public String calculaRota() {
        return "Calculando a rota de Carro";
    }
}
