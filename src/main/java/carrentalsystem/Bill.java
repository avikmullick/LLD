package carrentalsystem;

public class Bill {
    private Reservation rev;
    private int amount;

    public Reservation getRev() {
        return rev;
    }

    public void setRev(Reservation rev) {
        this.rev = rev;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
