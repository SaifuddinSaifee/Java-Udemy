package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        System.out.println("Player Health: " + player.health);
        int damage = 10;
        System.out.println(player.name +" took a damage of "+ damage);
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

        System.out.println("Player Health: " + player.health);
        damage = 12;
        System.out.println(player.name +" took a damage of "+ damage);
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Saif", 1111, "Sword");
        System.out.println("Initial Health is " + player1.getHealth());
    }
}
