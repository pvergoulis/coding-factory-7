package gr.aueb.cf.ch20.enums;

public enum AccountType {
    DEPOSIT("DP"), // ordinal number 0
    SAVINGS("SA"), // ordinal number 1
    CURRENT("CU") ;  // ordinal number 2


    private final String code;

    AccountType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
