package proxyComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Division implements FSStructualUnit {
    private String divisionName;
    private List<FSStructualUnit> components = new ArrayList<>();

    public Division(String divisionName, FSStructualUnit... components) {
        setDivisionName(divisionName);
        add(components);
    }

    public void add(FSStructualUnit component) {
        components.add(component);
    }

    public void add(FSStructualUnit... components) {
        this.components.addAll(Arrays.asList(components));
    }

    @Override
    public void paySalary() {
        for (FSStructualUnit component : components) {
            component.paySalary();
        }
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    @Override
    public void signSafety() {
        System.out.println(divisionName + ": " + "Техника безопасности подписана");
    }
}
