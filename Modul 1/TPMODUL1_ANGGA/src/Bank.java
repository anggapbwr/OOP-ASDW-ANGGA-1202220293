import java.util.ArrayList;

public class Bank {
        private ArrayList<Account> akun = new ArrayList<Account>();

        public void addAccount(Account account) {
            akun.add(account);

        }

        public void removeAccount(int accountNumber) {
            for (int i = 0; i < akun.size(); i++) {
                if (akun.get(i).getAccountNumber() == accountNumber) {
                System.out.println("\nAkun "+akun.get(i).getName()+" Sukses Hapus!");
                akun.remove(i);
                break;
            }
        }
    }

        public Account geAccount(int accountNumber) {
            for (Account account : akun) {
                if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public ArrayList<Account> getAllAccounts() {
        return akun;
    }
}

