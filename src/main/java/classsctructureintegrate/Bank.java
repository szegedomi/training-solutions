package classsctructureintegrate;

public class Bank {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("10073217-12000098-67341590", "John Doe", 100000);
        BankAccount bankAccount2 = new BankAccount("10073217-12000098-67341599", "Jack Doe", 98000);

        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        bankAccount1.deposit(1000);
        bankAccount2.withdraw(1000);

        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        bankAccount1.transfer(bankAccount2, 2000);

        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());



    }

}
