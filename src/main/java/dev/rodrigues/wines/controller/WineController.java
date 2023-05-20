package dev.rodrigues.wines.controller;

import dev.rodrigues.wines.model.Wine;
import dev.rodrigues.wines.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/wines")
public class WineController {

    @Autowired
    private WineService wineService;

    @GetMapping
    public ResponseEntity<List<Wine>> getAllWines() {
        return new ResponseEntity<>(wineService.allWines(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<ResponseEntity<String>> getSingleWine(@PathVariable String imdbId) {
       return ResponseEntity.ok(wineService.singleWine(imdbId));
    }

    @PostMapping
    public Wine saveWine(@RequestBody Wine wine) {
        return wineService.createWine(wine.getWinery(),wine.getWine(),wine.getLocation(),wine.getImage(),wine.getImdbId());
    }

    @DeleteMapping("/{imdbId}")
    public ResponseEntity<String> deleteWineById (@PathVariable String imdbId) {
            wineService.deleteWine(imdbId);
        return ResponseEntity.ok("Review " + imdbId + " deleted successfully");
    }
}
