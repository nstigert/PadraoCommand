import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VendasTest {
    SetorVendas setorVendas;
    Pedido pedido;

    @BeforeEach
    void setUp() {
        setorVendas = new SetorVendas();
        pedido = new Pedido ("Ração", 1);
    }

    @Test
    void deveAbrirPedido() {
        PedidoTarefa aberturaPedido = new ReceberPedidoTarefa(pedido);
        setorVendas.executarTarefa(aberturaPedido);

        assertEquals("Pedido aberto", pedido.getSituacaoPedido());
    }

    @Test
    void deveSepararPedido() {
        PedidoTarefa separarPedido = new SepararPedidoTarefa(pedido);
        setorVendas.executarTarefa(separarPedido);

        assertEquals("Pedido separado", pedido.getSituacaoPedido());
    }

    @Test
    void deveEncerrarPedido() {
        PedidoTarefa encerrarPedido = new EncerrarPedidoTarefa(pedido);
        setorVendas.executarTarefa(encerrarPedido);

        assertEquals("Pedido encerrado", pedido.getSituacaoPedido());
    }

    @Test
    void deveCancelarAberturaPedido() {
        PedidoTarefa aberturaPedido = new ReceberPedidoTarefa(pedido);

        setorVendas.executarTarefa(aberturaPedido);

        setorVendas.cancelarUltimaTarefa();

        assertEquals("Pedido encerrado", pedido.getSituacaoPedido());
    }

    @Test
    void deveCancelarSeparaçãoPedido() {
        PedidoTarefa aberturaPedido = new ReceberPedidoTarefa(pedido);
        PedidoTarefa separarPedido = new SepararPedidoTarefa(pedido);

        setorVendas.executarTarefa(aberturaPedido);
        setorVendas.executarTarefa(separarPedido);

        setorVendas.cancelarUltimaTarefa();

        assertEquals("Pedido encerrado", pedido.getSituacaoPedido());
    }

    @Test
    void deveCancelarFechamentoPedido() {
        PedidoTarefa aberturaPedido = new ReceberPedidoTarefa(pedido);
        PedidoTarefa separarPedido = new SepararPedidoTarefa(pedido);
        PedidoTarefa encerrarPedido = new EncerrarPedidoTarefa(pedido);

        setorVendas.executarTarefa(aberturaPedido);
        setorVendas.executarTarefa(separarPedido);
        setorVendas.executarTarefa(encerrarPedido);

        setorVendas.cancelarUltimaTarefa();

        assertEquals("Pedido separado", pedido.getSituacaoPedido());
    }

}