package com.example.ice;

public class Jonas implements Datamon{
private String name;
private double hp;
private int BaseDamage;
private String CreatureType;


    Jonas(){
        this.name = "Jonas";
        this.hp = 50;
        this.BaseDamage = 3;
        this.CreatureType = "Spaghetti";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHP() {
        return hp;
    }

    @Override
    public void setHP(int hp) {
    this.hp = hp;
    }

    @Override
    public double getBaseDamage() {
        return BaseDamage;
    }

    @Override
    public String getCreatureType() {
        return CreatureType;
    }

    @Override
    public double Damagebuff(Datamon target) {
     return 0;
    }

    @Override
    public double takedamage(double damage) {
        return hp-= damage;
    }

    @Override
    public String introduction() {
        return "A giant monster apears from the dista..... oh wait its just tiny jonas";
    }


    public void BulkUp(Datamon target){
        double damageDealt = 0;
        target.takedamage(damageDealt); // but nothing happend
    }


}
