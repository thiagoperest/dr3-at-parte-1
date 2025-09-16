package br.edu.infnet.dr3atparte1.service;

import br.edu.infnet.dr3atparte1.dto.EchoRequestDto;
import br.edu.infnet.dr3atparte1.dto.EchoResponseDto;

public class EchoService {
    public EchoResponseDto generateEchoResponse(EchoRequestDto request) {
        return new EchoResponseDto(request.getMensagem());
    }
}
