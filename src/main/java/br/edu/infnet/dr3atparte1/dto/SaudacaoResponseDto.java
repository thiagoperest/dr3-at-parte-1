package br.edu.infnet.dr3atparte1.dto;

public class SaudacaoResponseDto {

    private String mensagem;

    public SaudacaoResponseDto() {
    }

    public SaudacaoResponseDto(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "SaudacaoResponseDto{" +
                "mensagem='" + mensagem + '\'' +
                '}';
    }
}