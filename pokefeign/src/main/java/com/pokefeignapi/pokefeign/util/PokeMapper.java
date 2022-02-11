package com.pokefeignapi.pokefeign.util;

import com.google.gson.Gson;
import com.pokefeignapi.pokefeign.feingnclient.PokemonFeignClient;
import com.pokefeignapi.pokefeign.model.Pokemon;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PokeMapper {

    private final PokemonFeignClient pokemonFeignClient;

    public Pokemon toPokemon(String name) {

       String pokeObj = pokemonFeignClient.getPokemon(name);
       Pokemon pokemon = new Gson().fromJson(pokeObj, Pokemon.class);
       return pokemon;
    }

}
