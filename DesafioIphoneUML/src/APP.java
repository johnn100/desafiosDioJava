import sistema.Iphone;
import sistema.Ipod;
import sistema.Internet;

public class APP {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();
        Ipod iPod = new Ipod();
        Internet safari = new Internet();

        System.out.println("--------------- Funcões do telefone ---------------");
        iPhone.ligar(999999999);
        iPhone.setEstaLigado(false);
        iPhone.setEstaTocando(true);
        iPhone.atender();
        iPhone.iniciarCorreioVoz(973593749);

        System.out.println("\n--------------- Funções do iPod ---------------");
        iPod.tocar();
        iPod.selecionarMusica("Gopel Music");
        iPod.tocar();
        iPod.pausar();

        System.out.println("\n--------------- Funções do Safari ---------------");
        safari.exibirPagina("https://www.google.com.br");
        safari.adicionarNovaAba();
        safari.atualizarPagina();
    }
}