package br.edu.infnet.dr3atparte1.dto;

public class StatusResponseDto {

    private String status;
    private String timestamp;

    public StatusResponseDto() {
    }

    public StatusResponseDto(String status, String timestamp) {
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "StatusResponseDto{" +
                "status='" + status + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
