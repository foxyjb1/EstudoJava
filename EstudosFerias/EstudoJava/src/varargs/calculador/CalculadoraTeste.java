package varargs.calculador;

public class CalculadoraTeste {


    public void somaVarArgs(int... numeros){
        int soma =  0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}//varArgs e tipo de vetor mais simplicado ao en vez de fazer
//de criar uma variavel vc coloca os "..."
