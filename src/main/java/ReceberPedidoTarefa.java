public class ReceberPedidoTarefa implements PedidoTarefa {
    private Pedido pedido;

    public ReceberPedidoTarefa(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.abrirPedido();
    }

    public void cancelar() {
        this.pedido.fecharPedido();
    }
}
