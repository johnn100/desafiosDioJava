package sistema;

import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    private String musicaSelecionada = "";
    private Boolean estaTocando = false;

    public String getMusicaSelecionada() {
        return musicaSelecionada;
    }

    public Boolean getEstaTocando() {
        return estaTocando;
    }

    public void setMusicaSelecionada(String musicaSelecionada) {
        this.musicaSelecionada = musicaSelecionada;
    }

    public void setEstaTocando(Boolean estaTocando) {
        this.estaTocando = estaTocando;
    }

    public void tocar() {
        if (!musicaSelecionada.isEmpty()) {
            System.out.println("Tocando a música " + this.musicaSelecionada);
        } else {
            System.out.println("Error: Nenhuma música selecionada!");
        }
    }

    public void pausar() {
        System.out.println("Reprodução de áudio pausada...");
    }

    public void selecionarMusica(String musica) {
        this.musicaSelecionada = musica;
        System.out.println("Música selecionada: " + musica);
    }
}