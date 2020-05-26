# Métodos Avançados de Programação
## UNIESP Faculdades

## Professora

Drª Alana Morais (alanamm.prof@gmail.com)

## Aluno

Lucas Gabriel de Sousa Maciel.

## Padrão Comportamental:

Chain of Responsibility.

## Chain of Responsibility
É notório que à Chain of Responsibility ele é um padrão GOF, e sua principal função é evitar uma dependência entre um objetos. Tendo em vista um conjunto de série de objetos, como um objeto receptores e um objeto solicitante, isso é onde cada objetos de solicitação possui uma lógica interna, que separa quais são os tipos de objetos receptores que podem ser manipulados. Com isso é um padrão que utiliza a ideia de baixo acoplamento por permitir que outros objetos da cadeia tenham a oportunidade de tratar uma solicitação.

## Problema:
É evidente que quando está trabalhando em POO Programação orientada a objetos temos que tentar ao máximo preservar os objetos com um baixo acoplamento de informações, e fazendo com que falhas sejam evitada. Como função representa um encadeamento de objetos para realizar o processamento de uma série de requisições diferentes. Assim como uma solicitação pode ser tratada por mais de um objeto, essa solicitação poderá ser emitida entre vários objetos e o receptor não é necessário ser especificado explicitamente.

