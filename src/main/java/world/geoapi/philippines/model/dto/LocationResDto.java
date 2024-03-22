package world.geoapi.philippines.model.dto;

import lombok.Builder;
import lombok.Getter;
import world.geoapi.philippines.model.entity.Feature;

import java.util.List;


@Getter
@Builder
public class LocationResDto {
    /**
     * Geo Level 0 : Country
     */
    private String level0;
    /**
     * Geo Level 1 : Region (Reg)
     */
    private String level1;
    /**
     * Geo Level 2 : Province (Prov) / District (Dist)
     */
    private String level2;
    /**
     * Geo Level 3 : Municipality (Mun) / Cities (City)
     */
    private String level3;
    /**
     * Geo Level 4 : Barangays (Bgy) / Sub-Municipalities
     */
    private String level4;

    public static LocationResDto fromFeatures(List<Feature> features) {
        var builder = LocationResDto.builder();
        if(!features.isEmpty()){
            builder.level0("Philippines (the)");
        }
        for (Feature f : features) {
            var props = f.getProperties();
            if (props.getAdm1En() != null) {
                builder.level1(props.getAdm1En());
            } else if (props.getAdm2En() != null) {
                builder.level2(props.getAdm2En());
            } else if (props.getAdm3En() != null) {
                builder.level3(props.getAdm3En());
            } else if (props.getAdm4En() != null) {
                builder.level4(props.getAdm4En());
            }
        }
        return builder.build();
    }
}
