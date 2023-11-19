public interface ComponentFilm {
    default void add(ComponentFilm componentFilm){
        throw new UnsupportedOperationException();
    }

    //REMOVENDO COMPONENTS
    private void remove(ComponentFilm newComponentFilm){
        throw new UnsupportedOperationException();
    }

    //PEGANDO COMPONENTS
    private ComponentFilm getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }

    //RETORNA NOME 
    private String getNameFilm(){
        throw new UnsupportedOperationException();
    }

    //RETORNA O ANO
    private int getYearRelease(){
        throw new UnsupportedOperationException();
    }

    default void showInfo(){
        throw new UnsupportedOperationException();
    }
}