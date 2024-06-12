# Gerenciador de Compras com Limite de Cartão

## Descrição

Este projeto é um simples gerenciador de compras que permite ao usuário controlar suas despesas com base no limite de um cartão de crédito. O programa solicita ao usuário o limite do cartão, permite a entrada de várias compras (com descrição e valor) e verifica se a compra pode ser realizada com base no saldo restante. Se o valor da compra for maior que o saldo restante, uma mensagem de erro é exibida. Ao final, o programa lista todas as compras realizadas e o saldo restante do limite do cartão.

## Funcionalidades
- Solicitar o limite do cartão de crédito do usuário.    Registrar compras com descrição e valor.
- Verificar se o saldo restante permite a realização da compra.
- Exibir uma lista de compras realizadas.
- Exibir o saldo restante do limite do cartão.
- Opção para o usuário continuar adicionando compras ou encerrar o programa.

## Requisitos
- Java 8 ou superior.

## Como Executar
- Clone o repositório ou baixe os arquivos.
- Compile o código Java:

```
javac Principal.java
```

## Execute o programa:
```
java Principal
```

- Siga as instruções exibidas no console.

## Exemplo de Uso
- O programa solicitará o limite do cartão:

```
Digite o limite do seu cartão: 1000.00
```

- O programa permitirá que você adicione descrições e valores de compra:

```
Digite a descrição da compra: Mesa
Digite o valor da compra: 200.00
Compra realizada com sucesso!
```

- Você pode continuar adicionando compras ou sair:

```
Digite 0 para sair e 1 para continuar: 1
Digite a descrição da compra: Cadeira
Digite o valor da compra: 150.00
Compra realizada com sucesso!
```

- Ao sair, o programa exibirá todas as compras realizadas e o saldo restante:
```
Digite 0 para sair e 1 para continuar: 0

Compras realizadas:
Mesa - R$ 200.0
Cadeira - R$ 150.0
Saldo restante: R$ 650.00
```

## Estrutura do Código

### Classe Principal (Principal)
- public static void main(String[] args): Método principal que executa o programa.    Scanner scanner: Objeto para ler a entrada do usuário.
- ArrayList<Compra> listaDeCompras: Lista para armazenar as compras realizadas.
- Loop while (true): Loop principal que permite ao usuário continuar adicionando compras ou sair do programa.
- Verificações de saldo e adição de compras à lista.
- Exibição da lista de compras e do saldo restante ao final do programa.

### Classe Compra
- Compra(String descricao, double valor): Construtor para inicializar a compra com descrição e valor.
- toString(): Método para retornar a representação em string de uma compra.

## Observações
- Certifique-se de ter o Java instalado e configurado em seu sistema antes de compilar e executar o programa.
- Este projeto é um exemplo simples e pode ser expandido para incluir funcionalidades adicionais, como persistência de dados ou interface gráfica.

## Contribuição

Sinta-se à vontade para fazer um fork deste repositório e enviar pull requests com melhorias ou correções.

## Licença

Este projeto é de domínio público e pode ser utilizado livremente.
