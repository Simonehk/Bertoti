package model;
import java.util.List;
import java.util.LinkedList;
import view.Observer;

public class Catalogy implements Subject {

    private List<Film> films;
    private List<Observer> observers;

    public Catalogy(){
        films = new LinkedList<>();
        observers = new LinkedList<>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void notifyObservers(List find){
        for(Observer o : observers){
            o.update(find);
        }
    }

    public void addFilm(Film f){
        films.add(f);
    }

    public void searchFilm(Film f){
        List<Film> find = new LinkedList<>();
        for(Film filmCatalogy : films){
            if(filmCatalogy.matches(f)) {
                find.add(filmCatalogy);
            }
        }
        notifyObservers(find);
    }

    // Facade Methods

    public void addFilm(String title, int year){
        Film film = new Film(title, year);
        addFilm(film);
    }

    public void searchFilm(String title){
        Film film = new Film(title, 0); // O ano é ignorado na busca por título
        searchFilm(film);
    }
}