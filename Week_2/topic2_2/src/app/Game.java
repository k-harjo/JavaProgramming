package app;

public class Game {
    public static void main(String[] args) {
        Weapon bomb = new Bomb();
        Weapon gun = new Gun();

        bomb.fireWeapon(10);
        gun.fireWeapon(20);
    }
}
