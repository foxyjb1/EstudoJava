package ModificadorStatic.Test;

import ModificadorStatic.Dominio.Anime;
import ModificadorStatic.Dominio.Moto;


public class CarroTest01 {
    public static void main(String[] args) {

        Moto moto1 = new Moto("yamaha","YZF R1",300);
        Moto moto2 = new Moto("Harley","Sportster S",220);
        Moto moto3 = new Moto("susuki","GSX-1.300R Hayabusa",310);

        moto1.imprime();
        moto2.imprime();
        moto3.imprime();

        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        Anime anime3 = new Anime();
    }
}
