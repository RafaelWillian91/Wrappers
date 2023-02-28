package Wrappers.app1.app6;

public class WrapperApp6 {

    public static void main(String[] args) {

        //A grande vantagem é que a classe Wrapper aceita null como parametro.
        Person p1 = new Person(32, null);//null representa AUSENCIA de VALOR
       // System.out.println(p1.getWeight() + 10); //Cuidado com cenários do tipo. Null nao soma com tipo primitivo
        System.out.println(p1.toString());

    }

}
