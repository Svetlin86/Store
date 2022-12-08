package projects.grocery.store.service.implementation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import projects.grocery.store.model.Role;
import projects.grocery.store.repo.RoleRepo;
import projects.grocery.store.service.RoleService;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {
    private final RoleRepo roleRepo;

    @Override
    public Role getRole(String role) {
        return roleRepo.findByName(String.valueOf(role));
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }
}
