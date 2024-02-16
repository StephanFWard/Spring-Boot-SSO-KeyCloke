package com.example.springbootssocloak.controller;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/profile")
    public String getUserProfile(@AuthenticationPrincipal KeycloakPrincipal<KeycloakAuthenticationToken> principal) {
        String username = principal != null ? principal.getKeycloakSecurityContext().getIdToken().getPreferredUsername()
                : "Unknown";
        logger.info("User profile accessed for user: {}", username);
        return "Welcome, " + username;
    }
}
