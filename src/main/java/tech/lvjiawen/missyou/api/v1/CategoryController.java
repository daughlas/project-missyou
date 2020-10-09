package tech.lvjiawen.missyou.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.lvjiawen.missyou.exception.http.NotFoundException;
import tech.lvjiawen.missyou.model.Category;
import tech.lvjiawen.missyou.model.GridCategory;
import tech.lvjiawen.missyou.repository.GridCategoryRepository;
import tech.lvjiawen.missyou.service.CategoryService;
import tech.lvjiawen.missyou.service.GridCategoryService;
import tech.lvjiawen.missyou.vo.CategoriesAllVO;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private GridCategoryService gridCategoryService;

    @GetMapping("/all")
    public CategoriesAllVO getAll() {
        Map<Integer, List<Category>> categories = categoryService.getAll();
        return new CategoriesAllVO(categories);
    }

    @GetMapping("grid/all")
    public List<GridCategory> getGridCategoryList() {
        List<GridCategory> gridCategoryList = gridCategoryService.getGridCategoryList();
        if (gridCategoryList.isEmpty()) {
            throw new NotFoundException(30009);
        }
        return gridCategoryList;
    }

}
