package com.pokefeignapi.pokefeign.controller;


import com.pokefeignapi.pokefeign.enums.MonsterType;


import com.pokefeignapi.pokefeign.model.Monster;
import com.pokefeignapi.pokefeign.service.MonsterService;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/monster")
@RequiredArgsConstructor

public class MonsterController {



    private final Map<MonsterType, MonsterService> service;


    @GetMapping("/{name}")
    public Monster getPokemon(@PathVariable("name") String name,
                              @RequestParam("monstertype") MonsterType monsterType) {


        //  return servicesConfiguration.coso().get(monsterType).findByName(name);
        return service.get(monsterType).findByName(name);

    }
}
