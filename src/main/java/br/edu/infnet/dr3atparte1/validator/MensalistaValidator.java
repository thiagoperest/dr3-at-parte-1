package br.edu.infnet.dr3atparte1.validator;

import br.edu.infnet.dr3atparte1.dto.MensalistaRequestDto;
import br.edu.infnet.dr3atparte1.exception.MensalistaValidationException;

public class MensalistaValidator {

    public static void validate(MensalistaRequestDto request) {
        validateRequiredFields(request);

        validateMatricula(request.getMatricula());

        validateSalario(request.getSalario());

        validateNome(request.getNome());

        validateCargo(request.getCargo());
    }

    private static void validateRequiredFields(MensalistaRequestDto request) {
        if (request.getMatricula() == null || request.getMatricula().trim().isEmpty()) {
            throw new MensalistaValidationException("Matrícula é obrigatória!");
        }

        if (request.getNome() == null || request.getNome().trim().isEmpty()) {
            throw new MensalistaValidationException("Nome é obrigatório!");
        }

        if (request.getCargo() == null || request.getCargo().trim().isEmpty()) {
            throw new MensalistaValidationException("Cargo é obrigatório!");
        }

        if (request.getSalario() == null) {
            throw new MensalistaValidationException("Salário é obrigatório!");
        }
    }

    // Validação do formato da matrícula
    private static void validateMatricula(String matricula) {
        if (!matricula.matches("^M\\d{3}$")) {
            throw new MensalistaValidationException("Matrícula deve ser no formato M000!");
        }
    }

    private static void validateSalario(Double salario) {
        if (salario <= 0) {
            throw new MensalistaValidationException("Salário deve ser maior que zero!");
        }
    }

    private static void validateNome(String nome) {
        if (nome.trim().length() < 2) {
            throw new MensalistaValidationException("Nome deve ter pelo menos 2 caracteres!");
        }

        if (nome.trim().length() > 100) {
            throw new MensalistaValidationException("Nome não pode ter mais de 100 caracteres!");
        }
    }

    private static void validateCargo(String cargo) {
        if (cargo.trim().length() < 2) {
            throw new MensalistaValidationException("Cargo deve ter pelo menos 2 caracteres!");
        }

        if (cargo.trim().length() > 50) {
            throw new MensalistaValidationException("Cargo não pode ter mais de 50 caracteres!");
        }
    }
}
