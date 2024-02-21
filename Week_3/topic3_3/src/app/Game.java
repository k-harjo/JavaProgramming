package app;

public class Game {
    public static void main(String[] args) {
        // Create an array to hold weapons
        WeaponInterface[] weapons = new WeaponInterface[2];

        // Initialize array elements with different weapons
        weapons[0] = new Bomb();
        weapons[1] = new Gun();

        // Loop over the weapons array and call the fireWeapon() helper method for each weapon
        for (WeaponInterface weapon : weapons) {
            fireWeapon(weapon);
        }
    }

    // Private helper method to activate and fire a weapon
    private static void fireWeapon(WeaponInterface weapon) {
        weapon.activate(true);
        weapon.fireWeapon(10); // You can pass the desired power here
    }
}




