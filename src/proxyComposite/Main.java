package proxyComposite;

public class Main {
    public static void main(String[] args) {

        Division department = new Division("Департамент");
        Division smp = new Division("SMP");
        Division fsAcademy = new Division("FS Academy");
        Division orgs = new Division("Команда организаторов");

        orgs.add(
                new Employee("Вася", 1000, "Команда организаторов"),
                new Employee("Федя", 1200, "Команда организаторов"),
                new Employee("Петя", 1450, "Команда организаторов")
        );
        fsAcademy.add(
                new Employee("Алексей", 2000, "FS Academy"),
                orgs
        );
        smp.add(
                new Employee("Марина", 500, "SMP"),
                fsAcademy
        );
        department.add(
                new Employee("Денис", 10000, "Департамент"),
                smp
        );

        FSStructualUnit proxy = new FSStructualUnitProxy(department);

        proxy.paySalary();

    }
}
