package tech.lvjiawen.missyou.vo;

import lombok.Getter;
import lombok.Setter;
import tech.lvjiawen.missyou.model.Category;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
public class CategoriesAllVO {
    private List<CategoryPureVO> roots;
    private List<CategoryPureVO> subs;

    public CategoriesAllVO(Map<Integer, List<Category>> map) {
        this.roots = map.get(1).stream()
                .map(category -> {
                    return new CategoryPureVO(category);
                })
                .collect(Collectors.toList());
        this.subs = map.get(2).stream()
                .map(category -> {
                    return new CategoryPureVO(category);
                })
                .collect(Collectors.toList());
    }
}
