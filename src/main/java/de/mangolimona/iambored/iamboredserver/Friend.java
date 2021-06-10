package de.mangolimona.iambored.iamboredserver;

public class Friend {
    private final String IDENTITY;

    Friend(String id) {
        this.IDENTITY = id;
    }

    protected String getIDENTITY() {
        return IDENTITY.toUpperCase();
    }

    @Override
    public String toString() {
        return "Friend{" +
                "IDENTITY='" + IDENTITY + '\'' +
                '}';
    }
}
