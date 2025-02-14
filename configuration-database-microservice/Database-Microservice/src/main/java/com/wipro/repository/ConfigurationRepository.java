package com.wipro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.entity.*;

public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {
 List<Configuration> findByDeviceId(String deviceId);
}