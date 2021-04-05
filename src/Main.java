public class Main {
    public static void main(String[] args) {
        User user = new User("Daniel");
        user.mudaTransporte(Fabrica.selecionaTransporte(1));
        user.mudaTransporte(Fabrica.selecionaTransporte(2));
        user.mudaTransporte(Fabrica.selecionaTransporte(3));
        user.mudaTransporte(Fabrica.selecionaTransporte(4));
        // não é pra retornar nada
        user.mudaTransporte(Fabrica.selecionaTransporte(46));
        user.mudaTransporte(Fabrica.selecionaTransporte(1));
        user.mudaTransporte(Fabrica.selecionaTransporte(2));
    }
}
