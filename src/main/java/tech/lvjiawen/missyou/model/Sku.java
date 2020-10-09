package tech.lvjiawen.missyou.model;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;
import tech.lvjiawen.missyou.util.GenericAndJSON;
import tech.lvjiawen.missyou.util.ListAndJSON;
import tech.lvjiawen.missyou.util.MapAndJSON;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Entity
@Getter
@Setter
@Where(clause = "delete_time is null and online = 1")
public class Sku {
    @Id
    private Long id;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private Boolean online;
    private String img;
    private String title;
    private Long spuId;
    private Long categoryId;
    private Long rootCategoryId;

    private String code;
    private Long stock;


//    @Convert(converter = ListAndJSON.class)
    private String specs;

    public List<Spec> getSpecs() {
        if (this.specs == null) {
            return Collections.emptyList();
        }
        return GenericAndJSON.jsonToObject(this.specs, new TypeReference<List<Spec>>() {});
    }

    public void setSpecs(String specs) {
        if (specs.isEmpty()) {
            return;
        }
        this.specs = GenericAndJSON.objectToJSON(specs);
    }
}
