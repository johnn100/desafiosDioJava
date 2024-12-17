package sistema;

import interfaces.NavegadorInternet;

public class Internet implements NavegadorInternet {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    public void atualizarPagina() {
        System.out.println("Atualizano a visualização da página");
    }
}
