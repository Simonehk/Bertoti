package view;

import java.util.List;

import model.Film;

import controller.Tickets;

public class View implements Observer{

    private Tickets tickets;
    private List listFilms;

    public void setI(Tickets tickets){
        tickets = tickets;
    }

    public void update(List l){
        listFilms = l;
        tickets.ticketing();

    }

    public void printInfoFilm(){
        if(!listFilms.isEmpty()){
            for(Object j: listFilms){
                Film f = (Film)j;
                System.out.println(f.getTitle()+" "+f.getYear());
            }
        }

    }

    public void printTypeStudent(){
        System.out.println("\nTipo: meia");
        System.out.println("CPF do portador: xxx.xxx.xxx-xx");
    }

}
