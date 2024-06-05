package LLD.ChessValidator.entities;

public enum PieceType {
    N("NULL"),
    W("W"),
    B("B"),
    WP("WP"),
    WB("WB"),
    WR("WR"),
    WN("WN"),
    WQ("WQ"),
    WK("WK"),
    BP("BP"),
    BB("BB"),
    BR("BR"),
    BN("BN"),
    BQ("BQ"),
    BK("BK");

    private final String value;

    PieceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
