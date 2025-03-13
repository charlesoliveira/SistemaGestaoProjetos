package org.gestaoprojetos.app.domain.interfaces;

import org.gestaoprojetos.app.domain.entities.Projetos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjetosDataProvider extends JpaRepository<Projetos, Long> {
}
