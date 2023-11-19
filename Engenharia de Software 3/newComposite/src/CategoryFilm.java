import java.util.ArrayList;
import java.util.Iterator;

public class CategoryFilm implements ComponentFilm {

    ArrayList componentsFilm = new ArrayList();

    String nameCategory;
    String descriptionCategory;

    public CategoryFilm(String newNameCategory, String newDescriptionCategory) {
        nameCategory = newNameCategory;
        descriptionCategory = newDescriptionCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public String getDescriptionCategory() {
        return descriptionCategory;
    }

    public void add(ComponentFilm newComponentFilm) {
        componentsFilm.add(newComponentFilm);
    }

    public void remove(ComponentFilm newComponentFilm) {
        componentsFilm.remove(newComponentFilm);
    }

  

    public ComponentFilm getComponent(int componentIndex) {
        return (ComponentFilm) componentsFilm.get(componentIndex);

    }

    public void showInfo() {
        System.out.println(getNameCategory() + " " +
                getDescriptionCategory() + "\n");

        Iterator filmIterator = componentsFilm.iterator();


        while(filmIterator.hasNext()){
            ComponentFilm infoFilm = (ComponentFilm) filmIterator.next();
            infoFilm.showInfo();

        }
    }

}