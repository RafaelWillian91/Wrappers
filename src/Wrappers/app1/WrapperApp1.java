package Wrappers.app1;

public class WrapperApp1 {


    public static void main(String[] args) {

        int a = 10;
        Integer f = Integer.valueOf(a);//Funciona de forma otimizada!
        Integer o = Integer.valueOf("23");
        System.out.println(f);
        System.out.println(o);

        //Retornando outro tipo com a classe Wrapper
        double h = f.doubleValue();
        System.out.println(h);
        Double b4 = Double.parseDouble("2.5");
        System.out.println(b4);


       // Integer d = new Integer(10);

        Double d1 = Double.valueOf(10.4);
        System.out.println(d1);

    }

}
