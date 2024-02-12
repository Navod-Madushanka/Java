package com.Abstract_Factory_Pattern.Bank_Problem;

public class ICICI implements Bank{
    private final String BNAME;

    public ICICI() {
        BNAME = "ICICI Bank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
