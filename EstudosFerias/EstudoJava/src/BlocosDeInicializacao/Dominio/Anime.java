package BlocosDeInicializacao.Dominio;

public class Anime {

    //1-alocado espço na memoria(criar classe)
    //2 - atributos
    //3 - blocos de inicialização
    //4 - construtores
    private String nome;

    private int[] episodios;

    //bloco de inicialização
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;

        }
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        System.out.println(episodios);
        for (int episodio: this.episodios){
            System.out.print(episodio + "");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
