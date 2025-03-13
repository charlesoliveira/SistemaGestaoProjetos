package org.gestaoprojetos.app.domain.interfaces;

import org.gestaoprojetos.app.domain.entities.Atividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAtividadesDataProvider extends JpaRepository<Atividades, Long> {
}
