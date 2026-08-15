# Leitura de arquivo

>Desenvolva um aplicativo Java que leia uma matriz, gerada pelo exercício anterior,
a partir de um arquivo texto e por meio do redirecionamento de entrada (uso do operador <). 
>>Para cada casa da matriz em que não houver um asterisco, você deverá registrar o total de asteriscos
presentes nas casas adjacentes. 
>>>Se não houverem asteriscos, então pode manter o caractere ponto
(.) na referida casa. 
>>>>Por fim, imprima a matriz resultante na tela.


## Solução: [App.java](app/src/main/java/ads/poo/App.java)

### Formas de executar o programa pelo terminal:
**Deverá estar na pasta do lab-02**
- Windows: **cmd /c ".\exercicio-05\gradlew -p exercicio-05 run -q < matriz.txt"**

**Poderá estar no arquivo do exercicio-05:**
- Linux: **./gradlew run -q < ../matriz.txt**