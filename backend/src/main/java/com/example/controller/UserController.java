import org.keycloak.KeycloakPrincipal;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/profile")
    public String getUserProfile(@AuthenticationPrincipal KeycloakPrincipal<KeycloakAuthenticationToken> principal) {
        return "Welcome, " + principal.getKeycloakSecurityContext().getIdToken().getPreferredUsername();
    }
}
