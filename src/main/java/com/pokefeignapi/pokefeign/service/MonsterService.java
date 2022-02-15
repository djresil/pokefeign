package com.pokefeignapi.pokefeign.service;

import com.pokefeignapi.pokefeign.enums.MonsterType;
import com.pokefeignapi.pokefeign.model.Monster;

public interface MonsterService <T extends Monster>{

    T findByName(String name);

    MonsterType getMonsterType();
}
