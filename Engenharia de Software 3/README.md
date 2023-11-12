<h1>
Engenharia de Software 3 
</h1>

<p>Aqui você encontrará alguns dos principais Padrões de Projeto discutidos ao longo das aulas do Prof. ScM. Giuliano Bertoti.
O material base encontra-se no site <strong> <a href="https://refactoring.guru"> REFACTORING GURU  </a></strong> 🆓.</p>
  
<p align="center">⚠️Os códigos dos padrões de projeto serão exemplificados em linguagem <strong> JAVA </strong>.⚠️
</p>

<p align="center">
<a href="https://github.com/Simonehk/Bertoti/tree/main/Engenharia%20de%20Software%203/strategy"> Strategy </a>• <a href="https://github.com/Simonehk/Bertoti/tree/main/Engenharia%20de%20Software%203/observer"> Observer </a>• <a href="https://github.com/Simonehk/Bertoti/tree/main/Engenharia%20de%20Software%203/composite"> Composite </a> • <a href="https://github.com/Simonehk/Bertoti/tree/main/Engenharia%20de%20Software%203/facade"> Facade </a>  • <a href="https://github.com/Simonehk/Bertoti/tree/main/Engenharia%20de%20Software%203/singleton"> Singleton </a>  • <a href="https://github.com/Simonehk/Bertoti/tree/main/Engenharia%20de%20Software%203/mvc"> MVC </a><br>
<br>👍 <em><strong> Para cada caso apresentaremos um diagrama UML e o respectivo código exemplo </strong> </em>👍
</p>

<h2>
💻 Pré-requistos
</h2>

- [x] Conhecer a sintaxe Java
- [x] Noção acerca do Paradigma de Programação Orientada a Objeto

<h2> 📂 Conteúdo </h2>

| Padrão           | Definição                                          | O que resolve                                        | Anti-padrão                                  | Exemplo                                       |
|------------------|----------------------------------------------------|------------------------------------------------------|---------------------------------------------|-----------------------------------------------|
| **Strategy**     | Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. | Permite que o cliente escolha o algoritmo a ser usado dinamicamente. | Herança | Imagine que você tem que chegar ao aeroporto. Você pode pegar um ônibus, pedir um táxi etc. Essas são suas estratégias de transporte. Você pode escolher uma das estratégias dependendo de fatores como orçamento ou restrições de tempo. |
| **Observer**     | Define uma dependência um para muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. | Espera ocupada | Acoplamento direto entre observador e observado (alto acoplamento). | Implementação de um sistema de notificação em um chat. |
| **Composite**    | Compor objetos em estruturas de árvore para representar hierarquias parte-todo. | Permite tratar objetos individuais e composições de objetos de maneira uniforme. | Herança e alto acoplamento. | Sistema de representação de elementos gráficos, onde um elemento pode ser uma forma simples ou uma composição complexa. |
| **Facade**       | Fornecer uma interface unificada para um conjunto de interfaces em um subsistema ou qualquer conjunto complexo de classes. | Simplifica a complexidade do sistema, fornecendo uma interface única e fácil de usar. | Complexidade desnecessária e alto acoplamento. | Interface simplificada para um subsistema complexo, como uma biblioteca gráfica. |
| **Singleton**    | Garante a existência de apenas uma instância de uma classe e fornece um ponto global de acesso a ela. | O padrão Singleton visa resolver o problema de garantir que uma classe tenha apenas uma instância e fornecer um ponto global de acesso a essa instância. Isso é útil em situações em que é necessário controlar estritamente o número de instâncias de uma classe, como em configurações únicas, gerenciamento de recursos compartilhados ou para evitar conflitos em operações concorrentes. O Singleton também facilita o acesso global a essa instância, simplificando o gerenciamento de recursos e promovendo a coesão no design do software. | Múltiplas instâncias | Gerenciamento de configurações globais em um aplicativo. |



⭐️  Simonehk.


------------



