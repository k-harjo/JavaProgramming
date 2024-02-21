package app;

public class Bomb implements WeaponInterface {
    @Override
    public void fireWeapon() {
        System.out.println("Bomb fires with default power");
    }

    @Override
    public void fireWeapon(int power) {
        System.out.println("Bomb fires with power: " + power);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("Bomb activation: " + enable);
    }
}