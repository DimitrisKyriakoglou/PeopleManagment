package com.example.crudGeeks.geeksTutorial.service;


import com.example.crudGeeks.geeksTutorial.entity.Geeks;
import java.util.List;

public interface GeeksService {

    //Save Geek
    Geeks saveGeek(Geeks geek);

   // Read Geek
    List<Geeks> fetchGeekList();

    //Update Geek
    Geeks updateGeek(Geeks geek , Long geekId);

    //Delete Geek
    void deleteGeekById(Long geekId);

}
