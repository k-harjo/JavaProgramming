package app;

public class Gun implements WeaponInterface {
    @Override
    public void fireWeapon() {
        System.out.println("Gun fires with default power");
    }

    @Override
    public void fireWeapon(int power) {
        System.out.println("Gun fires with power: " + power);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("Gun activation: " + enable);
    }
}
