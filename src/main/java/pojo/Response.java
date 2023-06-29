package pojo;

public enum Response {

    SUCCESS(200, "OK"),
    FAIL(500, "NOT OK");

    private final Integer value;

    private final String reason;

    Response(Integer value, String reason){
        this.value = value;
        this.reason = reason;
    }

    public Integer getValue() {
        return value;
    }

    public String getReason() {
        return reason;
    }
}
