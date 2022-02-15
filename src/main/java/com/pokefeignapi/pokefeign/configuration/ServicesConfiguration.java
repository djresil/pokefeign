package com.pokefeignapi.pokefeign.configuration;

import com.pokefeignapi.pokefeign.enums.MonsterType;
import com.pokefeignapi.pokefeign.service.MonsterService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
@RequiredArgsConstructor
public class ServicesConfiguration {


    @Bean
    public Map<MonsterType, MonsterService> getServicies( List<MonsterService> monsterServiceList) {

      /*  Map<MonsterType, MonsterService> m = new HashMap<>();
        for (MonsterService ms : monsterServiceList) {
            m.put(ms.getMonsterType(), ms);
        }
        return m;
        */
        return monsterServiceList.stream().collect(Collectors.toMap(MonsterService::getMonsterType, Function.identity()));
    }


    public List monsterServiceList(){
        Class<MonsterService> monsterServiceClass = MonsterService.class;
        Method[] m = monsterServiceClass.getMethods();
        return Arrays.stream(m).collect(Collectors.toList());
    }

    @Bean
    public Map<MonsterType, MonsterService> coso(){
       return getServicies(monsterServiceList());
    }

}
