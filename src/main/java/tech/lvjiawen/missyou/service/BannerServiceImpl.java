package tech.lvjiawen.missyou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.lvjiawen.missyou.model.Banner;
import tech.lvjiawen.missyou.repository.BannerRepository;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    public Banner getByName(String name) {
        Banner banner = bannerRepository.findOneByName(name);
        return banner;
    }
}
