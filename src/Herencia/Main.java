package Herencia;

import Herencia.abstraction.A;
import Herencia.abstraction.B;
import Herencia.abstraction.C;
import Herencia.inheritance.Human;
import Herencia.inheritance.Police;

import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main (String[] args) throws IOException {

        Human human = new Human("Manuel", 23, 45, 170, new Date());
        Police police = new Police("Paco", 26, 100, 180, new Date(), 10010, 12, "Detective");


        System.out.println(police.getName() + " "+ police.getHigh());

        police.setName("Jorge");
        System.out.println(police.getName());

        Human human2 = police;
        System.out.println(human.getName());
        System.out.println(human2.getName());


        Human human3 = new Police("Paco3", 23, 120, 180, new Date(), 12021, 9, "Inspector");
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human.toString());

        human.showProperties();
        human.showClass();
        human2.showProperties();
        human2.showClass();
        human3.showProperties();
        human3.showClass();

        Police policia2 = (Police) human3;
        policia2.setId(1234);
        policia2.setName("Lucia");
        System.out.println(policia2.getRange() + "  "+  policia2.getName());
        policia2.showProperties();

        //--->>> THIS THROWS EXCEPTION Human cant be cast like Police.  <<<<<-----
        //Police police3 = (Police) new Human("Alvaro", 29, 71.00, 150.0, new Date());
        //police3.showProperties();

        System.out.println("******************** ABSTRACTION ******************************");

        A implementation = new B();
        System.out.println(((B) implementation).multiplicavalor(2));
        System.out.println(((B) implementation).suma(3,5));

        A implementacion2 = new C();
        System.out.println(((C) implementacion2).multiplicavalor(2));
        System.out.println(((C) implementacion2).suma(3,5));
        System.out.println(((C) implementacion2).multiplica(3,5));
    }
}

