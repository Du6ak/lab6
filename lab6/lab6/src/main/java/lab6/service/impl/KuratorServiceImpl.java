package lab6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab6.entity.Kurator;
import lab6.repository.KuratorRepository;
import lab6.service.KuratorService;

@Service
public class KuratorServiceImpl implements KuratorService {

    @Autowired
    private KuratorRepository repository;

    @Override
    public Kurator read(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Kurator> read() {
        return repository.findAll();
    }

    @Override
    public void save(Kurator entity) {
        repository.save(entity);

    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public Kurator readByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Kurator readByphone(String phone) {
        return repository.findByphone(phone);
    }

}