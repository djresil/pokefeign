package com.pokefeignapi.pokefeign.controller;


import com.pokefeignapi.pokefeign.enums.MonsterType;


import com.pokefeignapi.pokefeign.exception.ApiError;
import com.pokefeignapi.pokefeign.exception.NotFoundNameException;
import com.pokefeignapi.pokefeign.model.Monster;
import com.pokefeignapi.pokefeign.model.Pokemon;
import com.pokefeignapi.pokefeign.service.MonsterService;
import feign.FeignException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/monster")
@RequiredArgsConstructor

public class MonsterController {


    private final Map<MonsterType, MonsterService> service;


    @Operation(summary = "Obtener un Monstruo por medio de su nombre y su tipo ")
    @ApiResponses(value = {

            @ApiResponse(responseCode = "200", description = "Solicitud procesada con  éxito", content = {
                    @Content(mediaType = "application/json", schema = @Schema(hidden = true))}),
            @ApiResponse(responseCode = "404", description = "Nombre no encontrado", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))})
    })
    @GetMapping("/{name}")

    public ResponseEntity<Monster> getPokemon(@PathVariable("name") String name,
                                              @RequestParam("monstertype") MonsterType monsterType) throws NotFoundNameException {


        //  return servicesConfiguration.coso().get(monsterType).findByName(name);
        return new ResponseEntity<Monster>(service.get(monsterType).findByName(name), HttpStatus.OK);

    }
}
