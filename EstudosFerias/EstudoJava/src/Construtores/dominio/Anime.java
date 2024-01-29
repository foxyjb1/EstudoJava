package Construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    private  String estudio;




    public Anime(String nome,String tipo , int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime (String nome , String tipo , int episodios, String genero,String estudio){
        this(nome ,tipo ,episodios , genero );
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do Construtor sem argumentos");
    }

//    public void init(String nome,String tipo ,int episodios){
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//    }
//    public void init(String nome,String tipo ,int episodios, String genero){
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//        this.genero = genero;
//    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodios);
        System.out.println(genero);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
