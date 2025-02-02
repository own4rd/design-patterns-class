# Composite Pattern - Carrinho de Compras

Este projeto implementa o Composite Pattern em Java para modelar um Carrinho de Compras. O padrão Composite permite tratar objetos individuais e composições de objetos de maneira uniforme. O projeto contém uma interface comum para diferentes tipos de itens, como produtos e sub-carrinhos.

## Estrutura do Padrão

### Component
A interface ItemCarrinho define a operação calcularPreco(), que deve ser implementada por todos os itens do carrinho.

### Leaf
A classe Produto é uma implementação concreta de ItemCarrinho, representando um produto individual no carrinho de compras.

### Composite
A classe CarrinhoDeCompras é uma implementação de ItemCarrinho, mas ela pode conter tanto objetos Produto quanto outros objetos CarrinhoDeCompras (sub-carrinhos), permitindo formar uma estrutura hierárquica.


#### Compilar
```shell   
javac *.java
```

#### Executar
```shell   
java Main
```

### Vantagens do Padrão Composite
- Facilidade de expansão: Você pode adicionar facilmente novos tipos de itens (por exemplo, tipos diferentes de promoções) sem mudar a estrutura existente.
- Uniformidade: O código que manipula os itens do carrinho não precisa se preocupar se está lidando com um produto simples ou um carrinho de compras, simplificando a lógica.
- Manutenção: A adição de sub-carrinhos ou novos itens é feita sem a necessidade de alterar o comportamento existente.
