public abstract class Comunicacao {

    public abstract void mensagemTemperatura(int graus);
    public abstract void mensagemAguardaDados();

    protected static void mensagem(String mensagem) {
        System.out.println("\u001B[33m" + mensagem + "\u001B[39m");
    }

}
