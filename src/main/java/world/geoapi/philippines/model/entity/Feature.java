package world.geoapi.philippines.model.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Data
@Document(collection = "ph")
public class Feature {

    @Id
    private ObjectId objectId;
    private String type;
    private Geometry geometry;
    private ObjectId id;
    private Properties properties;

    @Data
    public static class Geometry {
        private String type;
        private List<?> coordinates;
    }

    @Data
    public static class Properties {
        @Field("adm1_psgc")
        private Double adm1Psgc;
        @Field("adm2_psgc")
        private Double adm2Psgc;
        @Field("adm3_psgc")
        private Double adm3Psgc;
        @Field("adm4_psgc")
        private Double adm4Psgc;
        @Field("adm1_en")
        private String adm1En;
        @Field("adm2_en")
        private String adm2En;
        @Field("adm3_en")
        private String adm3En;
        @Field("adm4_en")
        private String adm4En;
        @Field("geo_level")
        private String geoLevel;
        @Field("len_crs")
        private Double lenCrs;
        @Field("area_crs")
        private Double areaCrs;
        @Field("len_km")
        private Double lenKm;
        @Field("area_km2")
        private Double areaKm2;
    }
}
