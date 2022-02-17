package com.pokefeignapi.pokefeign.service;

import com.pokefeignapi.pokefeign.enums.MonsterType;
import com.pokefeignapi.pokefeign.exception.NotFoundNameException;
import com.pokefeignapi.pokefeign.model.Monster;

import java.util.Map;


public interface MonsterService <T extends Monster>{


    T findByName(String name) throws NotFoundNameException;

    MonsterType getMonsterType();


}
