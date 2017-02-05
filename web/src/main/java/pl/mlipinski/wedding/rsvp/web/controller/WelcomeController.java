package pl.mlipinski.wedding.rsvp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mlipinski on 04.02.17.
 */
@Controller
public class WelcomeController {

    @Autowired
    AuthenticationTrustResolver authenticationTrustResolver;

    @RequestMapping("/welcome")
    public String welcomePage(){
        if (isCurrentAuthenticationAnonymous()) {
            return "welcome";
        } else {
            return "redirect:/user-rsvp";
        }
    }

    /**
     * This method returns true if users is already authenticated [logged-in], else false.
     */
    private boolean isCurrentAuthenticationAnonymous() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authenticationTrustResolver.isAnonymous(authentication);
    }
}
