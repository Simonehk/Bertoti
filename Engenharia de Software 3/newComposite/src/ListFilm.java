public class ListFilm {
    ComponentFilm listFilm;

    public ListFilm(ComponentFilm newListFilm) {
        listFilm = newListFilm;
    }

    public void getListFilm(){
        listFilm.showInfo();
    }
}