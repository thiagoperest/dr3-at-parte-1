package br.edu.infnet.dr3atparte1.dto;

public class HelloResponseDto {

    private String message;

    public HelloResponseDto() {
    }

    public HelloResponseDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloResponseDto{" +
                "message='" + message + '\'' +
                '}';
    }
}
