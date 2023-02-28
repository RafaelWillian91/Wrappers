package Wrappers.app1.app5;

public class WrapperApp5 {
    public static void main(String[] args) {

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Integer i3 = 10;
        Integer i4 = 10;
        Integer i5 = 1000;
        Integer i6 = 1000;

        System.out.println(i1 == i2);//false
        System.out.println(i2 == i4);//false
        System.out.println(i3 == i4);//true
        System.out.println(i5 == i6);//false da false pq tem um Limite de estouro do cache para comparacao

        //Para sempre ter certeza sobre igualdade use o equals e nao ==
        //Para usar o == extraia o objeto para um tipo primitivo
        System.out.println(i5.intValue() == i6.intValue());//true


    }
}
