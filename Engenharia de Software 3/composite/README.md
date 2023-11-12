## Composite

<h1 align="center">
  <img src="/Engenharia%20de%20Software%203/composite/compositeUml.png">
</h1>

⛏️O padrão Composite fornece a você com dois tipos básicos de elementos que compartilham uma interface comum: folhas simples e containers complexos. Um container pode ser composto tanto de folhas quanto de outros containers. Isso permite a você construir uma estrutura de objetos recursiva aninhada que se assemelha a uma árvore.

<h1 align="center">
  <img src="/Engenharia%20de%20Software%203/composite/composite.png">
</h1>


Compor objetos em estruturas de árvore para representar hierarquias parte/todo. Composite permite aos clientes tratarem de maneira uniforme objetos individuais e composições de objetos.

Faz mais sentido em estruturas que podem ser tratadas de forma hierarquica - classe dentro de classe. Além disso, posso chamar um mesmo método tanto na estrutura quanto num objeto só.

💎Composite prioriza a composição ao invés de herança.

💎Todos os elementos definidos pelo padrão Composite compartilham de uma interface comum. Usando essa interface o cliente não precisa se preocupar com a classe concreta dos objetos com os quais está trabalhando.





