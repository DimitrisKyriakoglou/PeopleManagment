package com.example.crudGeeks.geeksTutorial.serviceImpl;

import com.example.crudGeeks.geeksTutorial.entity.Geeks;
import com.example.crudGeeks.geeksTutorial.repository.GeeksRepository;

import com.example.crudGeeks.geeksTutorial.service.GeeksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeekServiceImpl implements GeeksService {


    @Autowired
    private GeeksRepository geekRepository;

    @Override
    public Geeks saveGeek(Geeks geek){
        return geekRepository.save(geek);
    }

    @Override
    public List<Geeks> fetchGeekList() {
        return (List<Geeks>) geekRepository.findAll();
    }

    @Override
    public Geeks updateGeek(Geeks geek, Long geekId) {
        Geeks geekDb=geekRepository.findById(geekId).get();
        geekDb.setName(geek.getName());
        geekDb.setLevel(geek.getLevel());
        return geekRepository.save(geekDb);
    }

    @Override
    public void deleteGeekById(Long geekId) {
        geekRepository.deleteById(geekId);

    }


}




