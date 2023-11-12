## Strategy, Composite, Observer

<h1 align="center">
  <img src="/Engenharia%20de%20Software%203/mvc/mvc.png">
</h1>
<h3>🔺TaskModel (Model):</h3>
    <p><strong>Atributos:</strong></p>
    <ul>
        <li>tasks: Uma lista de objetos do tipo TaskComponent, que representa as tarefas no modelo.</li>
        <li>observers: Uma lista de objetos do tipo TaskObserver, que são notificados sobre mudanças no modelo.</li>
    </ul>
    <p><strong>Métodos:</strong></p>
    <ul>
        <li>addTask(task: TaskComponent): Adiciona uma tarefa ao modelo.</li>
        <li>getTasks(): List<TaskComponent>: Retorna a lista de tarefas.</li>
        <li>addObserver(observer: TaskObserver): Adiciona um observador ao modelo.</li>
        <li>notifyObservers(): Notifica todos os observadores sobre mudanças no modelo.</li>
    </ul>

<h3>🔺TaskController (Controller):</h3>
    <p><strong>Atributos:</strong></p>
    <ul>
        <li>model: Referência ao objeto TaskModel.</li>
        <li>view: Referência ao objeto TaskView.</li>
    </ul>
    <p><strong>Métodos:</strong></p>
    <ul>
        <li>addTask(task: TaskComponent): Adiciona uma tarefa ao modelo.</li>
        <li>updateView(): Atualiza a visualização com as tarefas atuais do modelo.</li>
    </ul>
    
<h3>🔺TaskView (View):</h3>
    <p><strong>Métodos:</strong></p>
    <ul>
        <li>displayTasks(tasks: List<TaskComponent>): Exibe as tarefas na view.</li>
    </ul>
  
<h3>🔺TaskListObserver (Observer):</h3>
    <p><strong>Atributo:</strong></p>
    <ul>
        <li>controller: Referência ao objeto TaskController.</li>
    </ul>
    <p><strong>Método:</strong></p>
    <ul>
        <li>update(): Atualiza a visualização no controlador.</li>
    </ul>
    
<h3>🔺TaskObserver (Interface):</h3>
    <p><strong>Método:</strong></p>
    <ul>
        <li>update(): Método a ser implementado pelos observadores para lidar com atualizações.</li>
    </ul>
    
<h3>🔺TaskComponent (Component):</h3>
    <p><strong>Método:</strong></p>
    <ul>
        <li>getDescription(): String: Método para obter a descrição da tarefa.</li>
    </ul>
    
<h3>🔺Task (Leaf):</h3>
    <p><strong>Atributo:</strong></p>
    <ul>
        <li>description: Descrição da tarefa.</li>
    </ul>
    <p><strong>Método:</strong></p>
    <ul>
        <li>getDescription(): String: Retorna a descrição da tarefa.</li>
    </ul>
    
<h3>🔺 TaskList (Composite):</h3>
    <p><strong>Atributo:</strong></p>
    <ul>
        <li>tasks: Uma lista de objetos do tipo TaskComponent.</li>
    </ul>
    <p><strong>Métodos:</strong></p>
    <ul>
        <li>addTask(task: TaskComponent): Adiciona uma tarefa à lista de tarefas.</li>
        <li>getDescription(): String: Retorna a descrição da lista de tarefas.</li>
    </ul>

<p>
🔹 Padrão Observer serve para notificar a View sobre mudanças no Model. <br>
🔹 Padrão Composite serve para tratar as tarefas individuais e as listas de tarefas de maneira uniforme.  <br>
🔹 Controller age como intermediário entre Model e View, gerenciando as interações e atualizações.  <br>
🔹 Observer (TaskListObserver) permite que a View seja notificada sempre que o Modelo é modificado.  <br>
</p>   
