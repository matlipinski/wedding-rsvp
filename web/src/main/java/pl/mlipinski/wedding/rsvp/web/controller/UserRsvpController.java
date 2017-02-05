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
public class UserRsvpController {

    @Autowired
    AuthenticationTrustResolver authenticationTrustResolver;

    @RequestMapping("/user-rsvp")
    public String welcomePage() {
        return "user-rsvp";
    }
}
