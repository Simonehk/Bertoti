public class Film implements ComponentFilm{
    String nameFilm;
    int yearRelease;

    public Film(String newNameFilm, int newYearRelease){

        nameFilm = newNameFilm;
        yearRelease = newYearRelease;

    }

    public String getNameFilm() {
        return nameFilm;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void showInfo() {
        System.out.println(getNameFilm() + " foi filmado em " + getYearRelease());

    }
}

