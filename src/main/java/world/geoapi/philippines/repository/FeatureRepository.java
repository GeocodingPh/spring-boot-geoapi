package world.geoapi.philippines.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import world.geoapi.philippines.model.entity.Feature;

import java.util.List;

public interface FeatureRepository extends MongoRepository<Feature, String> {
    @Query("{ 'geometry': { $geoIntersects: { $geometry: { type: 'Point', coordinates: [ ?1, ?0 ] } } } }")
    List<Feature> findByCoordinate(Float lat, Float lng);

}
