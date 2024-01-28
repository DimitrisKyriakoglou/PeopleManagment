package com.example.crudGeeks.geeksTutorial.repository;

import com.example.crudGeeks.geeksTutorial.entity.Geeks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeeksRepository extends CrudRepository<Geeks,Long> {
}
