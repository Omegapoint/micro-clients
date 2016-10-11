package se.omegapoint.micro.client.controller.shows;

public class AccessResponse {

    public boolean allowed;
    public String message;

    public AccessResponse() {
    }

    public AccessResponse(boolean allowed, String message) {
        this.allowed = allowed;
        this.message = message;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
