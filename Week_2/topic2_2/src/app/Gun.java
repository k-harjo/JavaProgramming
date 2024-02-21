package app;

public class Gun extends Weapon {
    @Override
    public void fireWeapon(int power) {
        System.out.println("Gun fires with power: " + power);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("Gun activation: " + enable);
    }
}
