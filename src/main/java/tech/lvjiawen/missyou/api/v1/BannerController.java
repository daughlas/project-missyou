package tech.lvjiawen.missyou.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import tech.lvjiawen.missyou.core.interceptors.ScopeLevel;
import tech.lvjiawen.missyou.exception.http.NotFoundException;
import tech.lvjiawen.missyou.model.Banner;
import tech.lvjiawen.missyou.service.BannerService;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping("/name/{name}")
    @ScopeLevel()
    public Banner getByName(@PathVariable String name) {
        Banner banner = bannerService.getByName(name);
        if (banner == null) {
            throw new NotFoundException(30005);
        }
        return banner;
    }
}
