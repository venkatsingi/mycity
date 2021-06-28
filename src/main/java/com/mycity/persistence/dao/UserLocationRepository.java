package com.mycity.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycity.persistence.model.User;
import com.mycity.persistence.model.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
