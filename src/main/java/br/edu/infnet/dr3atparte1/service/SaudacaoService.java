package br.edu.infnet.dr3atparte1.service;

import br.edu.infnet.dr3atparte1.dto.SaudacaoResponseDto;

public class SaudacaoService {
    public SaudacaoResponseDto generateSaudacaoResponse(String nome) {
        String mensagem = "Olá, " + nome + "!";
        return new SaudacaoResponseDto(mensagem);
    }
}