package com.infnet.dev.repository;

import com.infnet.dev.model.Eletronico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EletronicoRepository extends JpaRepository<Eletronico, Long> {
    List<Eletronico> findByMarca(String marca);

}
