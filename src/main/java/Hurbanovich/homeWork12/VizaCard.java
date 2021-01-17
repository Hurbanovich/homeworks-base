package homeWork12;

public class VizaCard {
    private int accountStatus;
    private long counter=0;

    public VizaCard(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }
}
