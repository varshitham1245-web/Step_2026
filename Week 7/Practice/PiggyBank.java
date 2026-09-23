public class PiggyBank {
    public final String id;
    private double savings;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }

    public void deposit(double amount) {
        this.savings += amount;
        System.out.println("Deposited: " + amount + ". Current savings: " + this.savings);
    }

    public void withdraw(double amount) {
        if (amount > this.savings) {
            System.out.println("Withdrawal of " + amount + " rejected: Insufficient funds. Savings stays " + this.savings);
        } else {
            this.savings -= amount;
            System.out.println("Withdrew: " + amount + ". Current savings: " + this.savings);
        }
    }

    public double getSavings() {
        return this.savings;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        System.out.println("Initial savings: " + pb.getSavings());
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);
        System.out.println("Final savings: " + pb.getSavings());
    }
}
