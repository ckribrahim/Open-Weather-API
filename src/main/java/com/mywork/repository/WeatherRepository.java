package com.mywork.repository;


import com.mywork.model.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeatherRepository  extends JpaRepository<WeatherEntity, String> {

    //Select * from entity where requestedCityName order by updateTime desc limit 1
    Optional<WeatherEntity> findFirstByRequestedCityNameOrderByUpdatedTimeDesc(String city);
}
