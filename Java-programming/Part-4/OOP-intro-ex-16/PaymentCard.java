
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        double isNeg = this.balance - 2.60;
        if (isNeg >= 0) {
            this.balance = isNeg;
        }
    }
    
    public void eatHeartily(){
        double isNeg = this.balance - 4.60;
        if (isNeg >= 0) {
            this.balance = isNeg;
        }
    }
    
    public void addMoney(double amount) {
        double isTooMuch = this.balance + amount;
        if (isTooMuch > 150) {
            this.balance = 150;
        } else {
            this.balance += amount;
        }
    }
    
}
