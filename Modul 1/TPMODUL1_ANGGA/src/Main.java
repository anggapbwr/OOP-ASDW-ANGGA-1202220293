import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Account akun1 = new Account();
        akun1.setName("Angga_SI4605");
        akun1.setAccountNumber(1202220293);
        akun1.setBalance(9888000);

        Account akun2 = new Account();
        akun2.setName("Ajung_SI4605");
        akun2.setAccountNumber(1202226969);
        akun2.setBalance(2777000);

        Account akun3 = new Account();
        akun3.setName("Alvaro_SI4605");
        akun3.setAccountNumber(1202221188);
        akun3.setBalance(7222000);

        Bank bank = new Bank();
        bank.addAccount(akun1);
        bank.addAccount(akun2);
        bank.addAccount(akun3);

        System.out.println("Saldo "+ akun1.getName()+": " + akun1.getBalance());
        System.out.println("Saldo "+ akun2.getName()+": " + akun2.getBalance());
        System.out.println("Saldo "+ akun3.getName()+": " + akun3.getBalance());

        akun1.deposit(100000.0);
        akun2.withdraw(50000.0);

        System.out.println("\nSaldo "+ akun1.getName()+" setelah deposit: " + akun1.getBalance());
        System.out.println("\nSaldo "+ akun2.getName()+" setelah withdraw: " + akun2.getBalance());

        bank.removeAccount(1202220293);

        ArrayList<Account> allAccounts = bank.getAllAccounts();
        System.out.println("\nDaftar akun Bank : ");
        for (Account account : allAccounts) {
            System.out.println("Nama: "+ account.getName()+", Nomor: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }
    }
}
