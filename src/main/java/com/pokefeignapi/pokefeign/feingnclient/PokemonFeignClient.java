package com.pokefeignapi.pokefeign.feingnclient;

import com.pokefeignapi.pokefeign.exception.NotFoundNameException;
import com.pokefeignapi.pokefeign.model.Pokemon;
import feign.FeignException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name= "pokeapi", url = "https://pokeapi.co/api/v2")

public interface PokemonFeignClient {

    @GetMapping("/pokemon/{name}")
    Pokemon getPokemon(@PathVariable("name")String name) throws NotFoundNameException;

}
