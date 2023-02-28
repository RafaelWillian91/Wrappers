package Wrappers.app1.app4;

public class WrapperApp4 {

    public static void main(String[] args) {

        Integer a = Integer.valueOf(10);//Colocando o valor 10 em um objeto do tipo Integer e retornando a referencia de memoria
        a++;

        //Com AutoBoxing
        Integer b = 19;//Tipo primitivos nao retornam para estancias de Classes, mas aqui está ocorrendo o AutoBoxing, por isso funciona.
        b++;
        System.out.println(b);

        //Sem autoBoxing
        Integer nAb = Integer.valueOf(20);
        int rf =  nAb.intValue();
        rf++;
        nAb = Integer.valueOf(rf);
        System.out.println(nAb);
    }

}
