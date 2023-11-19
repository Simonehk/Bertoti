package controller;

import model.Catalogy;
import view.View;

public class TypeNonStudent implements Tickets {

    private View v;
    private Catalogy c;

    public void setV(View view) {
        v = view;
    }
    
    public void ticketing() {
        v.printInfoFilm();
    }
}

