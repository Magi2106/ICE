package com.example.ice.Datamons;

import com.example.ice.Datamon;

import java.util.Objects;

public class Fred2 implements Datamon {

    private String name;
    private int hp;
    private int BaseDamage;
    private String CreatureType;

    public Fred2(){
        this.name = "Fred2";
        this.hp = 250;
        this.BaseDamage = 7;
        this.CreatureType = "Drunk";
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
        return  "";
    }


}
