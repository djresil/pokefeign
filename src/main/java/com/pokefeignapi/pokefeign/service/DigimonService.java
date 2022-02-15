package com.pokefeignapi.pokefeign.service;


import com.pokefeignapi.pokefeign.enums.MonsterType;
import com.pokefeignapi.pokefeign.model.Digimon;
import com.pokefeignapi.pokefeign.model.Monster;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DigimonService implements MonsterService <Digimon> {


    @Override
    public Digimon findByName(String name) {
        Digimon digimon = new Digimon("agumon", 1,1,10);
        Digimon digimon2 = new Digimon("angemon", 2,3,20);
        List<Digimon> digimonList = new ArrayList<>();
        digimonList.add(digimon);
        digimonList.add(digimon2);

       Map<String, Digimon> digimap = digimonList.stream().collect(Collectors.toMap(Digimon::getName, Function.identity()));

        return  digimap.get( name);
    }

    @Override
    public MonsterType getMonsterType() {
        return MonsterType.DIGIMON;
    }
}
