package projects.grocery.store.security;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserPrincipal {

    private Long id;

    private String username;

    private boolean isAdmin;
}
