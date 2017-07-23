package src.fourth_edition.polymorphism;

/**
 * Created by lbuthman on 5/17/17.
 */

class AlterStatus {
    public void readStatus() {}
}

class DangerStatus extends AlterStatus {
    public void readStatus() {System.out.println("Danger, attack imminent.");}
}

class NormalStatus extends AlterStatus {
    public void readStatus() {System.out.println("Status reading normal.");}
}

class WarningStatus extends AlterStatus {
    public void readStatus() {System.out.println("Warning, approaching asteroid field.");}
}

class Starship {
    AlterStatus status = new NormalStatus();
    public void statusUpdate() {status.readStatus();}
    public void warning() {status = new WarningStatus();}
    public void danger() {status = new DangerStatus();}
    public void normal() {status = new NormalStatus();}
}

public class Ex16Transmorgify {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.statusUpdate();
        starship.warning();
        starship.statusUpdate();
        starship.danger();
        starship.statusUpdate();
        starship.normal();
        starship.statusUpdate();
    }
}
