import tiposTransporte.Transporte;

public class User {

    private String nome;
    private Transporte transporte;

    public User(String nome) {
        this.nome = nome;
    }

    public void mudaTransporte(Transporte newTransporte){
        if(newTransporte != null) {
            this.transporte = newTransporte;
            System.out.println(this.transporte.calculaRota());
        }
    }
}
