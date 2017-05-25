package redos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redos.model.ValidationDTO;
import redos.service.RegistrationService;

/**
 * Created by agurgul on 24.05.2017.
 */

@RestController
@RequestMapping("/api/register")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "/contains", method = RequestMethod.GET)
    public ValidationDTO validate(@RequestParam("password") String password, @RequestParam("username") String username) {
        return registrationService.contains(username, password);
    }

    @RequestMapping(value = "/matches", method = RequestMethod.GET)
    public ValidationDTO validateMatches(@RequestParam("password") String password, @RequestParam("username") String username) {
        return registrationService.matches(username, password);
    }

    @RequestMapping(value = "/email/greedy", method = RequestMethod.GET)
    public ValidationDTO validateEmail(@RequestParam("email") String email) {
        return registrationService.emailGreedy(email);
    }

    @RequestMapping(value = "/email/possessive", method = RequestMethod.GET)
    public ValidationDTO validateEmailPossesive(@RequestParam("email") String email) {
        return registrationService.emailPossessive(email);
    }

}
