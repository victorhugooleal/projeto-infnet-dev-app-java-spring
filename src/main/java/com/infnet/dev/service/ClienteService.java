package com.infnet.dev.service;

import com.infnet.dev.model.Cliente;
import com.infnet.dev.model.Pedido;
import com.infnet.dev.repository.ClienteRepository;
import com.infnet.dev.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

}
