package redos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redos.model.ValidationDTO;
import redos.service.ClassNameService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by agurgul on 20.04.2017.
 */
@RestController
@RequestMapping("/api")
public class ClassNameController {

    @Autowired
    ClassNameService classNameService;

    @RequestMapping(value = "/class-name/greedy/", method = GET)
    public ValidationDTO validate(@RequestParam("name") String name) {
        return classNameService.validate(name);
    }

    @RequestMapping(value = "/class-name/possessive/", method = GET)
    public ValidationDTO validatePossessive(@RequestParam("name") String name) {
        return classNameService.validatePossessive(name);
    }

    @RequestMapping(value = "/class-name/atomic/", method = GET)
    public ValidationDTO validateAtomic(@RequestParam("name") String name) {
        return classNameService.validateAtomic(name);
    }

}
