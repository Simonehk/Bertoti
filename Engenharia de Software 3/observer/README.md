<h1>Observer Pattern 🔎 </h1>

O **Observer Pattern** estabelece uma dependência de um-para-muitos entre os objetos/entidades. Logo, quando um objeto muda o seu estado **(Subject)**, os demais objetos dependentes **(Observers ou Listeners)** serão notificados e automaticamente atualizados.
Este _design_ _pattern_ garante um baixo acoplamento no sistema. Pois:
1) O único conhecimento que o **Subject** tem sobre os **Observers** é que este implementa alguma interface; 
2) É possível adicinar quantos **Observers** forem necessários, sem que haja necessidade de modificar o **Subject**;
3) É possível reutilizar de forma independente os **Subjects** e os **Observers**.

Aplicaremos o padrão Observer em um algoritmo para simular a compra e a venda de ações.

Utilizaremos o RSI(índice de força relativa), que é um indicador amplamente utilizado no mercado financeiro. O RSI é calculado da seguinte forma:

RSI = 100 - (100 / (1 + RS))

Onde:
RS (Relative Strength) é a média das últimas n variações positivas de preços dividida pela média das últimas n variações negativas de preços. 
"n" geralmente é um período de 14 dias, mas pode ser ajustado de acordo com as preferências do analista.

O resultado é um número que varia de 0 a 100. 
O RSI é frequentemente representado em um gráfico em uma **escala de 0 a 100**, com níveis-chave em 70 e 30. 

Algumas interpretações comuns do RSI:
**Overbought** (Sobrecomprado): Quando o RSI está acima de 70, isso geralmente indica que o ativo pode estar sobrecomprado, o que significa que seu preço pode ter subido muito rapidamente e uma reversão de tendência para baixo pode estar próxima. 

**Oversold** (Sobrevendido): Quando o RSI está abaixo de 30, isso geralmente indica que o ativo pode estar sobrevendido, o que significa que seu preço pode ter caído muito rapidamente e uma reversão de tendência para cima pode estar próxima. 

O algoritmo gerará números randômicos e quando o mesmo for maior que 70 o usuário será notificado com **Overbought**. Caso o número seja menor que 30, a mensagem imprimida no console será **Oversold**.

<h2>
 Diagrama UML
</h2>

<h1 align="center">
  <img src="/Engenharia%20de%20Software%203/observer/observer.png">
</h1>

👾 Simonehk.









