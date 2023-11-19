package model;

public class Film {

    private String title;
    private int year;

    public Film(String t, int a){
        title = t;
        year = a;
    }

    public String getTitle(){
        return title;
    }

    public int getYear(){
        return year;
    }

    public boolean matches(Film f){
        if(!title.equals(f.title)) return false;
        if(year!=f.year) return false;
        return true;
    }

}