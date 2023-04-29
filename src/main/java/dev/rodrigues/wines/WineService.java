package dev.rodrigues.wines;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WineService {
    @Autowired
    private WineRepository wineRepository;
    public List<Wine> allWines(){
       return wineRepository.findAll();
    }
}
