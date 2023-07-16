package com.masai.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Store_location;
@Repository
public interface Store_locationRepo extends JpaRepository<Store_location, Integer> {

}
