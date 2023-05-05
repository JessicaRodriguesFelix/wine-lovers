package dev.rodrigues.wines;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WineRepository extends MongoRepository<Wine, ObjectId> {
    Optional<Wine> findWineByImdbId(String imdbId);
}
