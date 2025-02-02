import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompras implements ItemCarrinho {
    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(ItemCarrinho item) {
        itens.add(item);
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularPreco();
        }
        return total;
    }
}