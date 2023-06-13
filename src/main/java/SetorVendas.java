import java.util.ArrayList;
import java.util.List;

public class SetorVendas {
    private List<PedidoTarefa> pedidos = new ArrayList<PedidoTarefa>();

    public void executarTarefa(PedidoTarefa pedido) {
        this.pedidos.add(pedido);
        pedido.executar();
    }

    public void cancelarUltimaTarefa() {
        if (pedidos.size() != 0) {
            PedidoTarefa pedido = this.pedidos.get(this.pedidos.size() - 1);
            pedido.cancelar();
            this.pedidos.remove(this.pedidos.size() - 1);
        }
    }
}
