package tech.lvjiawen.missyou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.lvjiawen.missyou.model.Spu;
import tech.lvjiawen.missyou.repository.SpuRepository;

import java.util.List;

@Service
public class SpuService {
    @Autowired
    SpuRepository spuRepository;

    public Spu getSpu(Long id) {
        return this.spuRepository.findOneById(id);
    }

    public List<Spu> getLatestPagingSpu() {
        return this.spuRepository.findAll();
    }

}
