package com.infnet.dev.service;

import com.infnet.dev.model.Pedido;
import com.infnet.dev.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    // Salvar um pedido
    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Listar todos os pedidos
    public List<Pedido> listarTodosPedidos() {
        return pedidoRepository.findAll();
    }

    // Buscar um pedido por ID
    public Optional<Pedido> buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    // Verificar se um pedido existe
    public boolean existePedido(Long id) {
        return pedidoRepository.existsById(id);
    }

    // Deletar um pedido
    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}