package com.mycity.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycity.persistence.model.NewLocationToken;
import com.mycity.persistence.model.UserLocation;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}
