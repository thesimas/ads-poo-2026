# Exercício 2

![Exercicio.png](Exercicio.png)

## Diagrama de classe

````mermaid
classDiagram
    class Coordenada {
        - x : int
        - y : int
    }
    
    class Geometrica {
        <<abstract>>
        - cor : String
        - raio : double
        + desenhar() String
    }

    Geometrica --> Coordenada
````