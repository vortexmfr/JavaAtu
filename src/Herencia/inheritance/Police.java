package Herencia.inheritance;

import Herencia.inheritance.Human;

import java.util.Date;

public class Police extends Human {
    private long id;
    private int experience;
    private String range;

    //Bloque inicializador
    {
        id = 12;
        experience = 0;
        range = "novato";

        showProperties();
    }

    public Police(String name, int age, double weight, double high, Date nacimiento, long id, int experience, String range) {
        super(name, age, weight, high, nacimiento);
        this.id = id;
        this.experience = experience;
        this.range = range;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public void showProperties() {
        System.out.println(this.getName());
        System.out.println(this.id);
        System.out.println(this.range);
        System.out.println(this.experience);

    }

    public void showClass() {
        System.out.println("Soy clase Policia");
    }

    @Override
    public String toString() {
        return "Police{" +
                "id=" + id +
                ", experience=" + experience +
                ", range='" + range + '\'' +
                '}';
    }


}
