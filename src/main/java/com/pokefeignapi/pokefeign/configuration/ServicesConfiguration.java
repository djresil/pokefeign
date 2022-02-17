package com.pokefeignapi.pokefeign.configuration;

import com.pokefeignapi.pokefeign.enums.MonsterType;
import com.pokefeignapi.pokefeign.exception.CustomErrorDecoder;
import com.pokefeignapi.pokefeign.service.MonsterService;
import feign.codec.DecodeException;
import feign.codec.ErrorDecoder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
public class ServicesConfiguration {


    @Bean
    public Map<MonsterType, MonsterService> getServicies(List<MonsterService> monsterServiceList) {

      /*  Map<MonsterType, MonsterService> m = new HashMap<>();
        for (MonsterService ms : monsterServiceList) {
            m.put(ms.getMonsterType(), ms);
        }
        return m;
        */
        return monsterServiceList.stream().collect(Collectors.toMap(MonsterService::getMonsterType, Function.identity()));
    }

    @Bean
    public ErrorDecoder errorDecoder(){
        return new CustomErrorDecoder();
    }

}
