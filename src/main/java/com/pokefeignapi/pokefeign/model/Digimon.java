package com.pokefeignapi.pokefeign.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Digimon extends Monster{

    private int size;

    public Digimon(String name, int id, int order, int size) {
        super(name, id, order);
        this.size = size;
    }
}
