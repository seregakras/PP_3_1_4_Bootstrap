package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;

@Service
public class RoleService extends GenericService<Role> {
    private final RoleRepository repository;

    public RoleService(RoleRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Role findByTitle(String title) {
        return repository.findByTitle(title);
    }
}
