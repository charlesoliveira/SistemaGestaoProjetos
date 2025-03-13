package org.gestaoprojetos.app.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Clientes {

    @Id
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String razaoSocial;

    @NonNull
    private String email;

    @OneToMany
    @JoinColumn(name = "projeto_id")
    private Set<Projetos> projeto = new HashSet<>();
}
