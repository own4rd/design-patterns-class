public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);
        Produto produto3 = new Produto("Tênis", 150.0);
        Produto produto4 = new Produto("Telefone", 20.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(produto1);
        carrinho.adicionarItem(produto2);

        CarrinhoDeCompras subCarrinho = new CarrinhoDeCompras();
        subCarrinho.adicionarItem(produto3);
        subCarrinho.adicionarItem(produto4);

        carrinho.adicionarItem(subCarrinho);

        System.out.println("Preço total do carrinho: R$" + carrinho.calcularPreco());
    }
}
