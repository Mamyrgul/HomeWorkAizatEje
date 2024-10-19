//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  Account деген класс тузунуз ,анын сөзсүз double
        balance деген полясы болот жана сиз  каалагандай
        поле кошсонуз болот
        Томонку методдор болуусу керек:
        checkBalance -   балансты текшеруу,
                deposit() -  баланска акча кошот ,
        withdrawal() -  баланстан акча алат
        transaction() -  бир account тан экинчи account ка акча
        которуу методору болсун.
                main методдон  2-3 account тузуп ар кандай
        операцияларды жасаныз*/
        System.out.println("You have 2 account");
        Account account=new Account(3200);
        Account account1 = new Account(15400);
        account.checkBalance();
        account1.checkBalance();
        account1.translation(account,10000);
        account1.checkBalance();
        account.checkBalance();
        account.deposit(400);
        account.checkBalance();
        account1.take(2000);
        account1.checkBalance();
        System.out.println("The end: ");
        account.checkBalance();
        account1.checkBalance();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Charge in your phone:");

        account.checkCharge(48);

    }
}