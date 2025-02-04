package ir.soheil.enums;

public enum ResponseModelStatus {
    SUCCESS(0, "موفق"),
    WARNING(1, "اخطار"),
    ERROR(2, "خطا");

    private final int status;
    private final String faMessage;

    ResponseModelStatus(int status, String faMessage) {
        this.status = status;
        this.faMessage = faMessage;
    }

    public int getStatus() {
        return status;
    }

    public String getFaMessage() {
        return faMessage;
    }
}
