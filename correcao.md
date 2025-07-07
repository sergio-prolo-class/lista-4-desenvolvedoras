# Correção

## Diagrama

- dois pontos (:) duplicados nos métodos
- classes abstratas geralmente possuem métodos abstratos
  - em UML, métodos abstratos são representados usando itálico
  - vendo o diagrama de vocês, devo assumir que não existem métodos abstratos em NaveEspacial
- apesar de estar tudo correto, a diagramação está complicada de ler
  - muitas linhas cruzadas, ou atrás dos blocos de classe
  - eu sei que Mermaid não oferece muita liberdade...
  - ... mas o meu exemplo possui a mesma estrutura, mas é legível!
  - se vocês não conseguem entregar um produto de qualidade com essa tecnologia, aconselho usar outra que dê mais liberdade

## Implementação

- App
  - em nenhum lugar é indicado que polimorfismo é usado, com comentário, como exigido pelo documento da lista
  - nave instanceof Blindada não é testado
    - assim, os métodos 'ativar/desativarBlindagem' da NaveExploradora não são executados
  - faltou dar print em nave.frear()
- NaveEspacial
  - realmente, não existem métodos abstratos! não usual.
  - o construtor dessa classe lança exceções para cuidar das velocidades e tripulantes...
    - ... mas essas exceções nunca são tratadas!
    - não é a melhor solução possível.
- Naves Concretas
  - todas as suas naves concretas têm os valores de velocidade máxima e tripulantes definidas de forma literal
    - essa não era minha expectativa com o documento... mas talvez eu poderia ter deixado mais claro
    - 'A quantidade máxima de tripulantes de cada nave é definida em sua construção'
      - vocês fazem isso, mas toda nave de um tipo sempre tem o mesmo valor
      - eu quis dizer que cada objeto teria um valor definido na sua construção, podendo variar entre objetos

## Nota

8 ou 9... dependendo de uma conversa em sala hoje (07/07)