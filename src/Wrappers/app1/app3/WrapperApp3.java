package Wrappers.app1.app3;

public class WrapperApp3 {

    public static void main(String[] args) {


        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toHexString(30));
        System.out.println(Integer.toOctalString(50));

        System.out.println(Integer.valueOf("101001", 2));
        System.out.println(Integer.valueOf("32fc", 16));

        System.out.println(Integer.decode("0x32fc"));
        System.out.println("10");

    }

}
