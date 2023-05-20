package dev.rodrigues.wines.repository;

import dev.rodrigues.wines.model.Wine;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@PropertySource("classpath:application.properties")
public interface WineRepository extends MongoRepository<Wine, ObjectId> {
    Optional<Wine> findWineByImdbId(String imdbId);

    void deleteByImdbId(String imdbId);
}
