package world.geoapi.philippines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.geoapi.philippines.model.dto.LocationReqDto;
import world.geoapi.philippines.service.FeatureService;

@RestController
@RequestMapping("/api")
public class FeatureController {

    @Autowired
    FeatureService featureService;

    @GetMapping("/findByCoord")
    public ResponseEntity<?> findByCoordinate(@ModelAttribute LocationReqDto req) {
        var dto = featureService.findByCoordinate(req.getLat(), req.getLng());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

}
