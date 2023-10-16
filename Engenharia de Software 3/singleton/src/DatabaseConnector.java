public class DatabaseConnector {

    //atributo privado e estatico para a instancia
    private static DatabaseConnector INSTANCE;

    //construtor privado, com isso nao conseguimos instanciar a classe
    //ou seja, nao conseguimos usar o new fora da classe por ser privado
    private DatabaseConnector() {

    }

    //getter para INSTANCE - aqui decidimos se criamos ou nao uma nova instancia ou retornamos a instancia ja criada
    public static DatabaseConnector getInstance() {

        //a classe somente é instaciada se necessaria
        if(INSTANCE == null) {
            synchronized(DatabaseConnector.class) {
                INSTANCE = new DatabaseConnector();

            }
        }

        //a primeira vez que chamarmos o get, o instance sera null, e assim uma nova instancia sera criada
        //na segunda vez, o instance nao sera null. Logo, retornara a instancia criada anteriormente!

        return INSTANCE;
    }

    //quaisquer metodos necessarios para o singleton
    
    public void connect() {
        System.out.println("Conectando com o banco...");

    }

    public void disconnect() {
        System.out.println("Desconectando com o banco...");
    }
}
