package com.example.crudGeeks.geeksTutorial.controller;


import com.example.crudGeeks.geeksTutorial.entity.Geeks;
import com.example.crudGeeks.geeksTutorial.service.GeeksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GeeksController {

    @Autowired
    private GeeksService geekService;

    //Read
    @GetMapping("/geeks")
    public List<Geeks> geeksList(){
        return geekService.fetchGeekList();
    }

    //create
    @PostMapping("/geeks")
    public Geeks saveGeek( @RequestBody Geeks geek){
        return geekService.saveGeek(geek);
    }
    //Update
    @PutMapping("/geeks/{id}")
    public Geeks updateGeek(@RequestBody Geeks geek, @PathVariable("id") Long geekId){
        return geekService.updateGeek(geek,geekId);
    }

    //Delete
    @DeleteMapping
    public String deleteGeekById(@PathVariable Long geekid){
        geekService.deleteGeekById(geekid);

        return "Deleted successfully";
    }

}
