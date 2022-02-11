package com.pokefeignapi.pokefeign.controller;

import com.pokefeignapi.pokefeign.util.PokeMapper;

import com.pokefeignapi.pokefeign.model.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
@RequiredArgsConstructor
public class PokemonContoller  {

    private final PokeMapper pokeMapper;

    @GetMapping("/{name}")
    public Pokemon getPokemon(@PathVariable("name") String name) {
        return pokeMapper.toPokemon(name);
    }
}
