# Controle de Fluxo - Desafio

Este é o projeto **Controle de Fluxo - Desafio** que foi desenvolvido para exercitar os conceitos de controle de fluxo apresentados no módulo correspondente.

## Descrição

O sistema recebe dois números inteiros via terminal e realiza a impressão no console dos números incrementados. O número de interações (for) é calculado com base nos dois números fornecidos.

- Se o primeiro número for maior que o segundo número, uma exceção personalizada `ParametrosInvalidosException` será lançada com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".
- Caso contrário, os números serão incrementados e impressos no console.

## Funcionalidades Adicionais

Além das funcionalidades descritas acima, o projeto foi expandido com as seguintes adições:

1. **Menu de Contagem Múltipla**: Foi implementado um menu adicional onde você pode realizar a contagem várias vezes, fornecendo diferentes conjuntos de números.

2. **Opção de Sair**: No menu de contagem múltipla, foi adicionada uma opção para sair do programa.

## Como executar

1. Clone este repositório para a sua máquina.
2. Abra o terminal e navegue até o diretório do projeto.
3. Compile o projeto: `javac Contador.java`
4. Execute o programa: `java Contador`

## Estrutura do Projeto

- `Contador.java`: Classe principal que contém a lógica para contar e imprimir os números.
- `ParametrosInvalidosException.java`: Classe de exceção personalizada para lidar com parâmetros inválidos.

## Como Contribuir

Este é um projeto de desafio para praticar os conceitos de controle de fluxo. No entanto, se você encontrar bugs, tiver sugestões de melhoria ou quiser contribuir de alguma forma, fique à vontade para abrir uma *issue* ou enviar uma *pull request*.

## Autor

Arthur Henrique

