package redos.service;

import org.springframework.stereotype.Service;
import redos.model.ValidationDTO;

/**
 * Created by agurgul on 24.05.2017.
 */
@Service
public class RegistrationService {

    private final String emailGreedy = "^([a-zA-Z0-9])(([\\-.]|[_]+)?([a-zA-Z0-9]+))*(@){1}[a-z0-9]+[.]{1}(([a-z]{2,3})|([a-z]{2,3}[.]{1}[a-z]{2,3}))$";
    private final String emailPossessive = "^([a-zA-Z0-9])(([\\-.]|[_]+)?([a-zA-Z0-9]++))*(@){1}[a-z0-9]+[.]{1}(([a-z]{2,3})|([a-z]{2,3}[.]{1}[a-z]{2,3}))$";

    public ValidationDTO contains(String user, String password) {
        ValidationDTO validationDTO = new ValidationDTO();

        Long start = System.currentTimeMillis();
        boolean matches = password.contains(user);
        Long end = System.currentTimeMillis();
        validationDTO.setTime(end - start);
        validationDTO.setMatches(matches);
        validationDTO.setRegex("contains");
        validationDTO.setValidatedString(password + ".contains(" + user + ")");
        return validationDTO;
    }

    public ValidationDTO matches(String user, String password) {
        ValidationDTO validationDTO = new ValidationDTO();

        Long start = System.currentTimeMillis();
        boolean matches = password.matches(".*"+user+".*");
        Long end = System.currentTimeMillis();
        validationDTO.setTime(end - start);
        validationDTO.setMatches(matches);
        validationDTO.setRegex(user);
        validationDTO.setValidatedString(password + ".matches(" + validationDTO.getRegex() + ")");
        return validationDTO;
    }


    public ValidationDTO emailGreedy(String email) {
        ValidationDTO validationDTO = new ValidationDTO();

        Long start = System.currentTimeMillis();
        boolean matches = email.matches(emailGreedy);
        Long end = System.currentTimeMillis();
        validationDTO.setTime(end - start);
        validationDTO.setMatches(matches);
        validationDTO.setRegex(emailGreedy);
        validationDTO.setValidatedString(email);
        return validationDTO;
    }

    public ValidationDTO emailPossessive(String email) {
        ValidationDTO validationDTO = new ValidationDTO();

        Long start = System.currentTimeMillis();
        boolean matches = email.matches(emailPossessive);
        Long end = System.currentTimeMillis();
        validationDTO.setTime(end - start);
        validationDTO.setMatches(matches);
        validationDTO.setRegex(emailPossessive);
        validationDTO.setValidatedString(email);
        return validationDTO;
    }
}
