package customizeProtocol;

public enum PackageType {

    REQUEST_PACK(1),
    RESPONSE_PACK(2);

    final int code;

    PackageType(int code) {
        this.code = code;
    }
}
