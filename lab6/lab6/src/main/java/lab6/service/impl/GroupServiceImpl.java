package lab6.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab6.entity.Group;
import lab6.repository.GroupRepository;
import lab6.service.GroupService;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository repository;

    @Override
    public Group read(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Group> read() {
        return repository.findAll();
    }

    @Override
    public void save(Group entity) {
        repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public Group readByName(String name) {
        return repository.findByName(name);
    }

}
