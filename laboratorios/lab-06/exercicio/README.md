# Lab 06 - Jogo de Veículos.

![exercicioDiagrama.png](exercicioDiagrama.png)


## Diagrama de Classe: 

```mermaid
classDiagram
    class Veiculo {
        <<abstract>>
        - id : int
        - velocidadeAtual : int
        - velocidadeMaxima : int
        + frear() boolean*
        + acelerar() boolean*
    }
    
    class Anfibio {
        <<interface>>
        + preencherLastro() boolean
        + esvaziarLastro() boolean
    }
    
    class Conversivel {
        <<interface>>
        + abrirCapota() boolean
        + fecharCapota() boolean
    }
    
    class Tracao {
        <<interface>>
        + ativarTracao() boolean
        + desativarTracao() boolean
    }
    
    class FerrariPortofino {
        - estabilidade : boolean
        - capota : boolean
        + ativarEstabilidade () boolean
        + desativarEstabilidade () boolean
    }
    
    class ChevroletS10 {
        - tracao : boolean
        - cacamba : boolean
        + abrirCacamba() boolean
        + fecharCacamba() boolean
    }
    
    class WaterCarPanther {
        - tracao : boolean
        - rodas : boolean
        - capota : boolean
        - miniGeladeira : int
        - capacidadeLastro : int
        - capacidadeMxmLastro : int
        + definirTemperatura() boolean
    }
    
    class EModelo {
        <<enumeration>>
        PEQUENO,
        MEDIO,
        GRANDE
    }
    
    Veiculo <|-- FerrariPortofino
    Veiculo <|-- ChevroletS10
    Veiculo <|-- WaterCarPanther
    
    FerrariPortofino ..|> Conversivel
    
    ChevroletS10 ..|> Tracao
    
    WaterCarPanther o--> EModelo
    WaterCarPanther ..|> Anfibio
    WaterCarPanther ..|> Conversivel
    WaterCarPanther ..|> Tracao

```
## Implementação do Lab:
> [Código em Java](app/src/main/java/ads/poo)