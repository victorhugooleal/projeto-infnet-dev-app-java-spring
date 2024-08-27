package com.infnet.dev.repository;

import com.infnet.dev.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatus(String status);

    List<Pedido> findByClienteId(Long clienteId);
}
