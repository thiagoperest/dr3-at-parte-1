package br.edu.infnet.dr3atparte1.service;

import br.edu.infnet.dr3atparte1.dto.MensalistaResponseDto;
import br.edu.infnet.dr3atparte1.model.Mensalista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MensalistaService {
    public List<MensalistaResponseDto> getAllMensalistas() {
        // Mock
        List<Mensalista> mensalistas = Arrays.asList(
                new Mensalista(1L, "João Silva", "Desenvolvedor de Software", 5000.0),
                new Mensalista(2L, "Maria Santos", "Analista de Negócio", 4500.0),
                new Mensalista(3L, "Pedro Oliveira", "Gerente de Projeto", 7000.0)
        );

        return mensalistas.stream()
                .map(m -> new MensalistaResponseDto(m.getId(), m.getNome(), m.getCargo(), m.getSalario()))
                .collect(Collectors.toList());
    }
}
