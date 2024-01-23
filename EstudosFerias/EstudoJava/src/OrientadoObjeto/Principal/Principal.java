package OrientadoObjeto.Principal;


import OrientadoObjeto.Classes.Carro;

public class Principal {

    // (shitf + f6) para mudar o nome de todas as variaveis

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro impressora = new Carro();



        carro1.marca =  "Lamborghini";
        carro1.modelo = "Huracán STO";
        carro1.ano =2020 ;


        carro2.marca = "Ferrari" ;
        carro2.modelo = "250 GTO" ;
        carro2.ano = 1964;


        impressora.imprime(carro1);
        impressora.imprime(carro2);


    }
}
