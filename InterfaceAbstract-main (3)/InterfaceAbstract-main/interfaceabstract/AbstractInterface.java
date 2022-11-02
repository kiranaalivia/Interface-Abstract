
package interfaceabstract;

public class AbstractInterface {

    public static void main(String[] args) {
        Acc acc1 = new Acc("Lendy Elhadi", "12345", 1000);

        acc1.deposit(1000);
        acc1.deposit(1000);
        acc1.print();

        CreditAcc acc2 = new CreditAcc("Norman Normandy", "54545", 1000);

        acc2.print();

        System.out.println("\n\n");
        BankAccAbstract[] listAll = new BankAccAbstract[5];
        listAll[0] = acc1;
        listAll[1] = acc2;
        listAll[2] = acc1;
        listAll[3] = acc2;
        listAll[4] = acc1;

        for (BankAccAbstract acc : listAll)
            if (acc instanceof Acc)
                System.out.println("akun tabungan");
            else
                System.out.println("akun kredit");
    }

}
