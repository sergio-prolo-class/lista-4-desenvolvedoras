```mermaid
classDiagram
    direction LR

    class App {
        -garagem: Set~NaveEspacial~
        +main(args: String[]) void
    }

   class NaveEspacial {
        <<Abstract>>
        -id: int
        -velocidadeAtual: int
        -velocidadeMaxima: int
        -quantidadeMaximaTripulantes: int
        +acelerar(): void
        +frear(): void
        +pousar(): String
        +decolar(): String
        +getId(): int
        +getVelocidadeAtual(): int
        +getVelocidadeMaxima(): int
    }

    class Tripulada {
        <<Interface>>
        +controlarManual() String
    }

    class Blindada {
        <<Interface>>
        +ativarBlindagem() String
        +desativarBlindagem(): String
    }

    class Autonoma {
        <<Interface>>
        +ativarControleAutomatico() String
    }

  class NaveCargueira {
        -capacidadeMaximaCarga: int
        -cargaAtual: int
        -blindagemAtiva: boolean
        +carregar(peso: int): String
        +descarregar(peso: int): String
        +ativarBlindagem(): String
        +desativarBlindagem(): String
        +controlarManual(): String
    }

    class NaveMineradora {
        -energiaLaserMaxima: int
        -energiaLaserAtual: int
        +minerar(custo: int) String
        +controlarManual(): String
    }

    class NaveExploradora {
        -holofotes: boolean
        +ligarHolofotes() String
        +controlarManual(): String
        +ativarBlindagem(): String
        +desativarBlindagem(): String
    }

    class NaveSentinela {
        -radar: boolean
        +ligarRadar() String
        +ativarControleAutomatico(): String
    }

    %% Relacionamentos de Herança
    NaveEspacial <|-- NaveCargueira
    NaveEspacial <|-- NaveMineradora
    NaveEspacial <|-- NaveExploradora
    NaveEspacial <|-- NaveSentinela

    %% Relacionamentos de Implementação de Interface
    Tripulada <|.. NaveCargueira
    Tripulada <|.. NaveMineradora
    Tripulada <|.. NaveExploradora
    Blindada <|.. NaveCargueira
    Blindada <|.. NaveExploradora
    Autonoma <|.. NaveSentinela

    %% Relacionamento da App
    App o-- "1...*" NaveEspacial

```
