package com.example.ice.Datamons;

import com.example.ice.Datamon;

public class Jonas implements Datamon {
private String name;
private int hp;
private int BaseDamage;
private String CreatureType;


    public Jonas(){
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
    public int getHP() {
        return hp;
    }

    @Override
    public void setHP(int hp) {
    this.hp = hp;
    }

    @Override
    public int getBaseDamage() {
        return BaseDamage;
    }

    @Override
    public String getCreatureType() {
        return CreatureType;
    }

    @Override
    public int DamageBuff(Datamon target) {
     return BaseDamage;
    }

    @Override
    public String introduction() {
        return "A giant monster apears from the dista..... oh wait its just tiny jonas";
    }
}
