package org.gestaoprojetos.app.domain.interfaces;

import org.gestaoprojetos.app.domain.entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientesDataProvider extends JpaRepository<Clientes, Long> {
}
