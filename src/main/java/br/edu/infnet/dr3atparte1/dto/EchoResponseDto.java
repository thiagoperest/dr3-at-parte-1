package br.edu.infnet.dr3atparte1.dto;

public class EchoResponseDto {

    private String mensagem;

    public EchoResponseDto() {
    }

    public EchoResponseDto(String mensagem) {
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
        return "EchoResponseDto{" +
                "mensagem='" + mensagem + '\'' +
                '}';
    }
}
