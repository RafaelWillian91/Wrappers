package Wrappers.app1.WrappersExercises01;
class Main2 implements WrapperApp7{


    @Override
    public Integer execute(Integer n1, Integer n2) throws RuntimeException {
//        if(n1 == null || n2 ==null){
//            throw new RuntimeException("Valores não podem ser nulos");
//        }
//        return n1 + n2;
        return (n1 == null ? 0 : n1) + (n2 == null ? 0 : n2);
    }
}
public class Main {

    public static void main(String[] args) {

           Integer a = Integer.valueOf(90);
           a = null;
           Integer b = Integer.valueOf(20);

           WrapperApp7 w1 = new Main2();

            try {
                System.out.println(w1.execute(a, b));
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }


    }


}


