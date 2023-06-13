public class EncerrarPedidoTarefa implements PedidoTarefa {
    private Pedido pedido;

    public EncerrarPedidoTarefa(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.fecharPedido();
    }

    public void cancelar() {
        this.pedido.separarPedido();
    }
}
