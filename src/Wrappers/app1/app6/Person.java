package Wrappers.app1.app6;
public class Person {

        private final int age;
        private final double weight;

    public Person(Integer age, Double weight) {
        this.age = age;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
