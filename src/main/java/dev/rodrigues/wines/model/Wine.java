package dev.rodrigues.wines.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;


@Document(collection = "wines")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wine {
    @Id
    private ObjectId id;
    private String winery;
    private String wine;
    private String location;
    private String image;
    private String imdbId;
    @DocumentReference
    private List<Review> reviewIds;

    public Wine(String winery, String wine, String location, String image, String imdbId) {
        this.winery = winery;
        this.wine = wine;
        this.location = location;
        this.image = image;
        this.imdbId = imdbId;
    }
}
