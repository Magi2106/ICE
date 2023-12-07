package com.example.ice;

public interface Datamon {
    String getName();
    int getHP();
    void setHP(int hp);
    int getBaseDamage();
    String getCreatureType();
    int Damagebuff(Datamon target);
    int takedamage(int damage);
    String meet();
}
