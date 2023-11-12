

<h1 align="center">
  <img src="/Engenharia%20de%20Software%203/singleton/singleton.png">
</h1>

No exemplo acima, temos a classe **DatabaseConnector** que declara o método estático **getInstance** e esse por sua vez, retorna a mesma instância de sua própria classe.

## 📑 Singleton

Garantir que uma classe tenha **somente uma instância** no programa e fornecer **um ponto de acesso global** para a mesma.<br>

**Somente uma instância**<br>
Geralmente, usado para acesso a recursos compartilhados, como acesso à base de dados, interfaces gráficas, sistema de arquivos, logger etc.<br>

**Ponto de acesso global**<br>
Usado para substituir variáveis globais, como em casos de uso de objetos de configuração da aplicação como um todos.<br>
Ex.:<br>
Arquivos do tipo config que exportam um objeto para ser utilizado em toda a aplicação.<br>

**🔺Vantagem**<br>
Com o Singleton é possível proteger a instância com encapsulamento evitando que outro código sobrescreva seu valor.<br>

**Aplicabilidade**<br>
Use o Singleton quando uma classe necessita ter somente uma instância disponível em todo o seu programa;<br>
Use o Singleton quando perceber que está usando variáveis globais para manter partes importantes do programa, como variáveis de configuração que são usadas por toda a aplicação.<br>

**Termos**<br>
*lazy instiation* = só ocorre a instanciação uma vez e quando for necessário.<br>

**Curiosidade**<br>
Em uma entrevista, Erich Gamma mencionou que este seria o único padrão que ele removeria casso fosse lançar uma nova edição do livro.<br>

🦖Simonehk.







