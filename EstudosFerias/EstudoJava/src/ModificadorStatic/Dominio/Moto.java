package ModificadorStatic.Dominio;

public class Moto {

    private String marca ;

    private String modelo;
    private int velocidadeMax;

    private static  int velocidadeLimite = 190;
    //static deixa o valor(ou metodo) fixo, faz ele fazer parte da clase e n do obj
    //se colocar lembrar de alterar o get,set para static tmb

    //só as {} significa um inicializador
    {

    }

    public Moto(String marca, String modelo, int velocidadeMax) {
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
        this.modelo = modelo;

    }

    public  void imprime(){
        System.out.println("------------------------------");
        System.out.println("nome: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("Velocidade Maxima eh: " + this.velocidadeMax);
        System.out.println("Velocidade Maxima eh: " + this.velocidadeLimite);
        System.out.println("------------------------------");

    }

    public static void setVelocidadeLimite(int velocidadeLimite){

        Moto.velocidadeLimite = velocidadeLimite;
    }

    public static int getVelocidadeLimite(){
        return Moto.velocidadeLimite;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }


}
