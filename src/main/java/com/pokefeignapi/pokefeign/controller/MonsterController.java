package com.pokefeignapi.pokefeign.controller;

import com.pokefeignapi.pokefeign.configuration.ServicesConfiguration;
import com.pokefeignapi.pokefeign.enums.MonsterType;


import com.pokefeignapi.pokefeign.model.Monster;
import com.pokefeignapi.pokefeign.service.MonsterService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;



import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/monster")
@RequiredArgsConstructor
public class MonsterController {

    private final ServicesConfiguration servicesConfiguration;



    @GetMapping("/{name}")
    public Monster getPokemon(@PathVariable("name") String name,
                              @RequestParam("monstertype") MonsterType monsterType) {


        System.out.println(servicesConfiguration.coso());
        return servicesConfiguration.coso().get(monsterType).findByName(name);
    }
}
