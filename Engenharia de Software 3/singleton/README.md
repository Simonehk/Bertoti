## Singleton

<h1 align="center">
  <img src="/Engenharia%20de%20Software%203/singleton/singleton.png">
</h1>

Garantir que uma classe tenha somente uma instância no programa e fornecer um ponto de acesso global para a mesma.

Somente uma instância?
Geralmente, usado para acesso a recursos compartilhados, como acesso à base de dados, interfaces gráficas, sistema de arquivos, logger etc.

Ponto de acesso global?
Usado para substituir variáveis globais, como em casos de uso de objetos de configuração da aplicação como um todos
Ex.:
Arquivos do tipo config que exportam um objeto para ser utilizado em toda a aplicação.

Vantagem: com o Singleton é possível proteger a instância com encapsulamento evitando que outro código sobrescreva seu valor.

Aplicabilidade:
Use o Singleton quando uma classe necessita ter somente uma instância disponível em todo o seu programa;
Use o Singleton quando perceber que está usando variáveis globais para manter partes importantes do programa, como variáveis de configuração que são usadas por toda a aplicação.

Termos:
lazy instiation > só ocorre a instanciação uma vez e quando for necessário.

Curiosidade:
Em uma entrevista, Erich Gamma mencionou que este seria o único padrão que ele removeria casso fosse lançar uma nova edição do livro.







