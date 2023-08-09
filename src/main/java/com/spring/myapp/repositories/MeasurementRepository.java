package com.spring.myapp.repositories;

import com.spring.myapp.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
