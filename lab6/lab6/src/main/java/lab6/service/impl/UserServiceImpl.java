package lab6.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab6.entity.User;
import lab6.repository.UserRepository;
import lab6.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User read(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<User> read() {
        return repository.findAll();
    }

    @Override
    public void save(User entity) {
        repository.save(entity);

    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

}