public class Problem02_BankAccount {
    static class Account {
        private String owner;
        private double balance;
        Account(String owner, double initial){
            this.owner = owner;
            this.balance = Math.max(0, initial);
        }
        public void deposit(double amt){
            if(amt > 0) balance += amt;
        }
        public boolean withdraw(double amt){
            if(amt > 0 && amt <= balance){
                balance -= amt;
                return true;
            }
            return false;
        }
        public double getBalance(){
            return balance;
        }
        public String toString(){
            return owner + ": " + balance;
        }
    }
    public static void main(String[] args){
        Account a = new Account("Priya", 500);
        a.deposit(300);
        boolean ok = a.withdraw(200);
        System.out.println(a + " withdrawal ok=" + ok);
    }
}