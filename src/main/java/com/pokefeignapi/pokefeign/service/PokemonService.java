package com.pokefeignapi.pokefeign.service;

import com.pokefeignapi.pokefeign.configuration.ServicesConfiguration;
import com.pokefeignapi.pokefeign.enums.MonsterType;
import com.pokefeignapi.pokefeign.feingnclient.PokemonFeignClient;
import com.pokefeignapi.pokefeign.model.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
@RequiredArgsConstructor
public class PokemonService  implements   MonsterService <Pokemon>{

    private final PokemonFeignClient pokemonFeignClient;



     @Override
    public Pokemon findByName(String name) {
        return   pokemonFeignClient.getPokemon(name);
    }

    @Override
    public MonsterType getMonsterType() {

    return    MonsterType.POKEMON;
    }

}
