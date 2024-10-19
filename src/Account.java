public class Account {
 private double balance;
private int charge;
 public Account (){}

    public Account(double balance){
     this.balance=balance;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void checkBalance(){
        System.out.println("In your account have "+balance+" balance");
    }
    public void deposit(double add){
     if (add>0){
         balance+=add;
         System.out.println("You add in your account "+add+ " balance");
     }
    }
    public void take(double mines){
     if (mines>0 && mines<=balance){
         balance-=mines;
         System.out.println("You take in your account "+mines+" balance");
     }else {
         System.out.println("You can't send money");
     }
    }
    public void translation(Account otherAcc, double translation){
     if (translation>0 && translation<=balance){
         balance-=translation;
         otherAcc.balance+=translation;
         System.out.println("You send "+translation+" money to another account");
     }
    }
    public  void checkCharge(int check){
     if (check>=0 && check<15){
         charge=check;
         System.out.println("You need to charge your phone: "+check);
     } else if (check>15 && check<90){
         charge=check;
            System.out.println("You have enough charge:"+check);
        }else if (check==100){
         charge=check;
            System.out.println("Your phone is fully charged:"+check);
        }else {
            System.out.println("Error");
        }
    }


}
