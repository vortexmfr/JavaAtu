package Herencia.inheritance;

import java.util.Date;

public class Human {
    private String name;
    private int age;
    private double weight;
    private double high;
    private Date nacimiento;

    public Human(String name, int age, double weight, double high, Date nacimiento) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.high = high;
        this.nacimiento = nacimiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void showProperties() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.weight);
        System.out.println(this.high);
        System.out.println(this.nacimiento);
    }

        public void showClass() {
            System.out.println("Soy clase Humano");
        }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", high=" + high +
                ", nacimiento=" + nacimiento +
                '}';
    }
}
