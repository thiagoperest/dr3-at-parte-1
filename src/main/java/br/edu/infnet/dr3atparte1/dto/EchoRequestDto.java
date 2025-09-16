package br.edu.infnet.dr3atparte1.dto;

public class EchoRequestDto {

    private String mensagem;

    public EchoRequestDto() {
    }

    public EchoRequestDto(String mensagem) {
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
        return "EchoRequestDto{" +
                "mensagem='" + mensagem + '\'' +
                '}';
    }
}
