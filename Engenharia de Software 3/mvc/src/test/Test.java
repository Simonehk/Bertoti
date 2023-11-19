package test;

import controller.TypeStudent;
import view.View;
import model.Film;
import model.Catalogy;

public class Test {

    public static void main(String[] args) {

        System.out.println("===  Ingresso para o filme  ===");

        Catalogy c = new Catalogy();
        c.addFilm("Interestelar", 2014);
        c.addFilm("O Predestinado", 2014);

        View v = new View();
        c.registerObserver(v);

        TypeStudent tmi = new TypeStudent();
        v.setI(tmi);
        tmi.setV(v);

        c.searchFilm("Interestelar");

    }

}
