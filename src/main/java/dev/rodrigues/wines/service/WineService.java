package dev.rodrigues.wines.service;

import dev.rodrigues.wines.model.Wine;
import dev.rodrigues.wines.repository.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WineService {
    @Autowired
    private WineRepository wineRepository;
    public List<Wine> allWines(){
       return wineRepository.findAll();
    }
    public ResponseEntity<String> singleWine(String imdbId) {
        Optional<Wine> optionalWine = wineRepository.findWineByImdbId(imdbId);
        if (optionalWine.isPresent()) {
            Wine wine = optionalWine.get();
            return ResponseEntity.ok(wine.toString());
        }
       else {
         return ResponseEntity.notFound().build();
        }
    }
    
    public Wine createWine(String winery, String wine, String location, String image, String imdbId) {
        Wine wineObject = new Wine(winery, wine, location, image,imdbId);
        Wine createdWine = wineRepository.insert(wineObject);
        return createdWine;
    }
    public ResponseEntity<String> deleteWine(String imdbId) {
        wineRepository.deleteByImdbId(imdbId);
        return ResponseEntity.ok("Wine " + imdbId + " deleted successfully!");
    }
}
