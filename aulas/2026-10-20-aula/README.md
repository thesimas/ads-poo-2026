# Exericicios de diagrama de classes - Herança

## Diagramas para um Sistema de Informação: 

### Sistema Acadêmico

```mermaid
classDiagram
    class Pessoa {
        <<abstract>>
        - id : int
        - nome : String
        - cpf : String
        + consultarNotas() boolean
    }
    
    class Aluno {
        - matricula : ArrayList~Matricula~
    }
    
    class Professor {
        - salario : double
        + lancarNota(Aluno aluno) boolean
    }
    
    class Coordenador {
    }
    
    class Diretor {
        + expulsar(Aluno aluno) boolean
    }
    
    class Matricula {
        - id : int
    }
    
    class Curso {
        - nome : String
    }
    direction LR
    Aluno *--> Matricula
    Matricula o--> Curso
    Curso o--> Professor
    Pessoa <|-- Aluno
    Pessoa <|-- Professor
    Professor <|-- Coordenador
    Pessoa <|-- Diretor
```

### Biblioteca

```mermaid
classDiagram
    
    class Produto {
        <<abstract>>
        - id : int
        - titulo : string
        - ano : LocalDate
        - valor : double
        - conservacao : EConservacao
        + updateConservacao() boolean
    }
    
    class Livro {
        - isbn : int
    }
    
    class EConservacao {
        <<enumeration>>
        OTIMO,
        BOM,
        USADO,
        VELHO
    }
    
    class Periodico {
        - issn : String
    }
        
    
    class Revista {
        - segmento : String
    }
    
    class Jornal {
        - editor : String
    }
    
    class Gibi {
        - ilustrador : String
    }
    
    Produto <|-- Livro
    Produto <|-- Periodico
    Periodico <|-- Gibi
    Periodico <|-- Jornal
    Periodico <|-- Revista
    Produto --> EConservacao
```

## Diagrama para um Sistema de jogo: 

### Simulador de Transportes

```mermaid
classDiagram
    class Transporte {
        <<abstract>>
        - numTripulantes : int
        + desembargar(Tripulante tripulante) boolean
    }
    
    class Areo {
        - alturaMaxima : int
    }
    
    class Terrestre {}
        
    class Maritimo {
        
    }
    
    class Carro {
        
    }
```