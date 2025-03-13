package org.gestaoprojetos.app.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.HashSet;

@Data
@Entity
@NoArgsConstructor
public class Projetos {

    @Id
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String descricao;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Atividades> atividades = new HashSet<>();
}
