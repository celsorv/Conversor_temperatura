public class Celsius extends Comunicacao {

    @Override
    public void mensagemTemperatura(int graus) {
        mensagem(String.format("Equivalência em Fahrenheit: %d graus\n", graus));
    }

    @Override
    public void mensagemAguardaDados() {
        System.out.println("Informe temperatura em Celsius   (999 = Encerrar)");
    }

}
