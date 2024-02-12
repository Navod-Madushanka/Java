package Example_3;

public class BankOptions {
    private final Account saving;
    private final Account chaking;

    public BankOptions(){
        saving = new Saving();
        chaking = new Checking();
    }

    public void saveTransferring(){
        saving.transferring();
    }
    public void checkTransferring(){
        chaking.transferring();
    }
}
