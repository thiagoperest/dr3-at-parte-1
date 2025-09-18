package br.edu.infnet.dr3atparte1.service;

import br.edu.infnet.dr3atparte1.dto.MensalistaResponseDto;
import br.edu.infnet.dr3atparte1.model.Mensalista;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MensalistaService {

    // Mock
    private List<Mensalista> getMensalistasData() {
        return Arrays.asList(
                new Mensalista(1L, "M001", "João Silva", "Desenvolvedor de Software", 5000.0),
                new Mensalista(2L, "M002", "Maria Santos", "Analista de Negócio", 4500.0),
                new Mensalista(3L, "M003", "Pedro Oliveira", "Gerente de Projeto", 7000.0)
        );
    }

    public List<MensalistaResponseDto> getAllMensalistas() {
        List<Mensalista> mensalistas = getMensalistasData();

        return mensalistas.stream()
                .map(m -> new MensalistaResponseDto(m.getId(), m.getMatricula(), m.getNome(), m.getCargo(), m.getSalario()))
                .collect(Collectors.toList());
    }

    public MensalistaResponseDto getMensalistaByMatricula(String matricula) {
        Optional<Mensalista> mensalista = getMensalistasData().stream()
                .filter(m -> m.getMatricula().equals(matricula))
                .findFirst();

        if (mensalista.isPresent()) {
            Mensalista m = mensalista.get();
            return new MensalistaResponseDto(m.getId(), m.getMatricula(), m.getNome(), m.getCargo(), m.getSalario());
        }
        
        return null;
    }
}
