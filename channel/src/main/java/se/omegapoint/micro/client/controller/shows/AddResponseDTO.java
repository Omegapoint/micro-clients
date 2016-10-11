package se.omegapoint.micro.client.controller.shows;

public class AddResponseDTO {
    public boolean success;
    public String message;


    public AddResponseDTO() {
    }

    public AddResponseDTO(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
