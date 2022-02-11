package com.pokefeignapi.pokefeign.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pokemon {

    private int id;

    private String name;

    private int order;

    private int height;

}
