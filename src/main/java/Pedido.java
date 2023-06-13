public class Pedido {
    private String nomeItem;
    private int qtd;
    private String situacao;

    public Pedido(String nomeItem, int qtd) {
        this.nomeItem = nomeItem;
        this.qtd = qtd;
    }

    public String getSituacaoPedido() {
        return situacao;
    }

    public void abrirPedido() {
        this.situacao = "Pedido aberto";
    }

    public void separarPedido() {
        this.situacao = "Pedido separado";
    }

    public void fecharPedido() {
        this.situacao = "Pedido encerrado";
    }
}
