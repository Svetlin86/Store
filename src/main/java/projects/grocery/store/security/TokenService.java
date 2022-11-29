package projects.grocery.store.security;

import projects.grocery.store.model.User;

public interface TokenService {
    String generateToken(User user);

    UserPrincipal parseToken(String token);
}
