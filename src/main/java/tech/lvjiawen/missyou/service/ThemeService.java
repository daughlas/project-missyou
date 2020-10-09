package tech.lvjiawen.missyou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.lvjiawen.missyou.model.Theme;
import tech.lvjiawen.missyou.repository.ThemeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeService {
    @Autowired
    private ThemeRepository themeRepository;

    public List<Theme> findByNames(List<String> names) {
        return themeRepository.findByNames(names);
    }

    public Optional<Theme> findByName(String name) {
        return themeRepository.findByName(name);
    }
}
