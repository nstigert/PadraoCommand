public class SepararPedidoTarefa implements PedidoTarefa {
    private Pedido pedido;

    public SepararPedidoTarefa(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.separarPedido();
    }

    public void cancelar() {
        this.pedido.fecharPedido();
    }
}
