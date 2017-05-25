package redos.model;

/**
 * Created by agurgul on 20.04.2017.
 */
public class ValidationDTO {

    private String validatedString;
    private String regex;
    private Boolean matches;
    private Long time;

    public ValidationDTO() {
    }

    public ValidationDTO(String validatedString, String regex, Boolean matches) {
        this.validatedString = validatedString;
        this.regex = regex;
        this.matches = matches;
    }

    public String getValidatedString() {
        return validatedString;
    }

    public void setValidatedString(String validatedString) {
        this.validatedString = validatedString;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public Boolean getMatches() {
        return matches;
    }

    public void setMatches(Boolean matches) {
        this.matches = matches;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
