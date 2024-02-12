package com.Abstract_Factory_Pattern.Bank_Problem;

public class SBI implements Bank{
    private final String BNAME;

    public SBI() {
        BNAME = "SBI Bank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
