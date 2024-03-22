package world.geoapi.philippines.service;

import world.geoapi.philippines.model.dto.LocationResDto;
import world.geoapi.philippines.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class FeatureService {

    @Autowired
    FeatureRepository featureRepo;

    public LocationResDto findByCoordinate(@RequestParam Float lat, @RequestParam Float lng) {
        return LocationResDto.fromFeatures(featureRepo.findByCoordinate(lat, lng));
    }

}
