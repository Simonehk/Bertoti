public class CreateListFilm {
    public static void main(String[] args){
        ComponentFilm allFilm = new CategoryFilm("List", "all film available");

        ComponentFilm comercialFilm = new CategoryFilm
                ("comercial", "e.g. hollywood");


        ComponentFilm artFilm = new CategoryFilm
            ("\nArt Film", "e.g. independent film.\n");

        allFilm.add(comercialFilm);

        comercialFilm.add(new Film("The Dark Knight", 2008));
        comercialFilm.add(new Film("Interstellar", 2014));


        comercialFilm.add(artFilm);

        artFilm.add(new Film("Frida", 2002));
        artFilm.add(new Film("Big Eyes", 2014));


        ListFilm listfilm = new ListFilm(allFilm);

        listfilm.getListFilm();



    }
}