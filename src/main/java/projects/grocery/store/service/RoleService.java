package projects.grocery.store.service;

import projects.grocery.store.model.Role;
public interface RoleService {
    Role getRole(String role);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
}
