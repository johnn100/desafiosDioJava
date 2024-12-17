package sistema;

import interfaces.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico {
    private boolean estaLigado = true;
    private boolean estaTocando = true;

    public boolean EstaLigado() {
        return estaLigado;
    }

    public boolean EstaTocando() {
        return estaTocando;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public void setEstaTocando(boolean estaTocando) {
        this.estaTocando = estaTocando;
    }

    public void ligar(Integer num) {
        if (estaLigado) {
            System.out.println("Ligando para o números " + num);
        } else {
            System.out.println("Error: telefone desligado!");
        }
    }

    public void atender() {
        if (estaTocando) {
            System.out.println("Atendendo ligação...");
            this.estaTocando = false;
        } else {
            System.out.println("Error: Ligação perdida!");
        }
    }

    public void iniciarCorreioVoz(Integer num) {
        if (estaLigado) {
            System.out.println("Iniciando correio de voz com o número " + num);
        } else {
            System.out.println("Erro: Telefone desligado");
        }
    }
}