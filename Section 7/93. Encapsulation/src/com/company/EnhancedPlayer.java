package com.company;

public class EnhancedPlayer {

    private String name;
    private int HP = 100;
    private String weapon;

    public EnhancedPlayer(String name, int HP, String weapon) {
        this.name = name;
        if (HP > 0 && HP <= 100) {
            this.HP = HP;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage){
        this.HP = this.HP - damage;
        if(this.HP <=0){
            System.out.println("The Player Knocked out");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return HP;
    }

    public String getWeapon() {
        return weapon;
    }
}
