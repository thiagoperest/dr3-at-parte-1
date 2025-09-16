package br.edu.infnet.dr3atparte1.service;

import br.edu.infnet.dr3atparte1.dto.StatusResponseDto;

import java.time.Instant;

public class StatusService {
    public StatusResponseDto generateStatusResponse() {
        String currentTimestamp = Instant.now().toString();

        return new StatusResponseDto("ok", currentTimestamp);
    }
}
