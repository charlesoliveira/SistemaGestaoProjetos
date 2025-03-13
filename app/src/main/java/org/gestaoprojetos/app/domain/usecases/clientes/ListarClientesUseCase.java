package org.gestaoprojetos.app.domain.usecases.clientes;

import lombok.Builder;
import org.gestaoprojetos.app.domain.interfaces.IClientesDataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Builder
public class ListarClientesUseCase {

    @Autowired
    @Qualifier("IClientesDataProvider")
    private IClientesDataProvider iClientesDataProvider;
}
