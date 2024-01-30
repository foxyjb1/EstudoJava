package ModificadorStatic.Dominio;

public class Anime {
    //0 - blocos de inicialização e executado quando aJVM carregar classe
    //1 - alocado espço na memoria(criar classe)
    //2 - atributos
    //3 - blocos de inicialização
    //4 - construtores
    private String nome;

    private static int[] episodios;

    //bloco de inicialização
    //static inicializa ele somente 1 vez
    static {
        System.out.println("1 - Dentro do bloco de inicialização statico");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;

        }
    }

//    static {
//        System.out.println("2 - bloco de inicialização statico");
//
//    }
//
//    static {
//        System.out.println("3 - bloco de inicialização statico");
//
//    }
//
//    {
//        System.out.println("4 - bloco de inicialização nao estatico");
//    }


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
