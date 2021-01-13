package proxyComposite;

public class FSStructualUnitProxy implements FSStructualUnit {
    private FSStructualUnit unit;

    FSStructualUnitProxy(FSStructualUnit unit) {
        this.unit = unit;
    }

    @Override
    public void paySalary() {
        System.out.println("Зарплата выплачена!");
        unit.paySalary();
    }

    @Override
    public void signSafety() {
        unit.signSafety();
        System.out.println("Техника безопаности подписана!");
    }
}
