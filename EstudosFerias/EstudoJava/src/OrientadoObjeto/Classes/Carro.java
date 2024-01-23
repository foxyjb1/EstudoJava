package OrientadoObjeto.Classes;

public class Carro {

    public String marca;
    public String modelo;
    public int ano;

    public void imprime (Carro carro){
        System.out.println("-------------");
        System.out.println(carro.marca + " " + carro.modelo + " " + carro.ano);
    }

}
