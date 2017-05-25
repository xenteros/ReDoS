package redos.service;

import org.springframework.stereotype.Service;
import redos.model.ValidationDTO;

/**
 * Created by agurgul on 20.04.2017.
 */
@Service
public class ClassNameService {

    private String regex = "^(([a-z])+.)+[A-Z][a-zA-Z]+$";
    private String regexAtomic = "^((?>([a-z])+.))+[A-Z][a-zA-Z]+$";
    private String regexPossessive = "^(([a-z])++.)++[A-Z][a-zA-Z]++$";

    public ValidationDTO validate(String name) {
        ValidationDTO validationDTO = new ValidationDTO();

        Long start = System.currentTimeMillis();
        boolean matches = name.matches(regex);
        Long end = System.currentTimeMillis();
        if (matches) {
            validationDTO.setMatches(true);
        } else {
            validationDTO.setMatches(false);
        }
        validationDTO.setRegex(regex);
        validationDTO.setValidatedString(name);
        validationDTO.setTime(end - start);


        return validationDTO;
    }

    public ValidationDTO validateAtomic(String name) {
        ValidationDTO validationDTO = new ValidationDTO();

        Long start = System.currentTimeMillis();
        boolean matches = name.matches(regexAtomic);
        Long end = System.currentTimeMillis();
        if (matches) {
            validationDTO.setMatches(true);
        } else {
            validationDTO.setMatches(false);
        }
        validationDTO.setRegex(regexAtomic);
        validationDTO.setValidatedString(name);
        validationDTO.setTime(end - start);


        return validationDTO;
    }

    public ValidationDTO validatePossessive(String name) {
        ValidationDTO validationDTO = new ValidationDTO();

        Long start = System.currentTimeMillis();
        boolean matches = name.matches(regexPossessive);
        Long end = System.currentTimeMillis();
        if (matches) {
            validationDTO.setMatches(true);
        } else {
            validationDTO.setMatches(false);
        }
        validationDTO.setRegex(regexPossessive);
        validationDTO.setValidatedString(name);
        validationDTO.setTime(end - start);

        return validationDTO;
    }
}
