package org.gestaoprojetos.app.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Atividades {

    @Id
    private Long id;

    @NonNull
    private String descricao;

    private LocalDateTime dataPrevisao;

    private LocalDateTime dataEntrega;
}
