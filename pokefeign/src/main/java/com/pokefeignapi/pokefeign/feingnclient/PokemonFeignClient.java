package com.pokefeignapi.pokefeign.feingnclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name= "pokeapi", url = "https://pokeapi.co/api/v2")

public interface PokemonFeignClient {

    @GetMapping("/pokemon/{name}")
    String getPokemon(@PathVariable("name")String name);

}
