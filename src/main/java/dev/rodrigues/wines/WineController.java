package dev.rodrigues.wines;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/wines")
public class WineController {

    @Autowired
    private WineService wineService;

    @GetMapping
    public ResponseEntity<List<Wine>> getAllWines() {
        return new ResponseEntity<List<Wine>>(wineService.allWines(), HttpStatus.OK);
    }
}
