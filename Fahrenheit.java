public class Fahrenheit extends Comunicacao {

    @Override
    public void mensagemTemperatura(int graus) {
        mensagem(String.format("Equivalência em Celsius: %d graus\n", graus));
    }

    @Override
    public void mensagemAguardaDados() {
        System.out.println("Informe temperatura em Fahrenheit   (999 = Encerrar)");
    }

}
