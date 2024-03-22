package world.geoapi.philippines.model.dto;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class LocationReqDto {
    private Float lat;
    private Float lng;
}
