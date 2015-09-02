package lt.roadrulestest.test.user;

public class UserDetailErrors {
    private Boolean wrongUsername;
    private Boolean wrongName;
    private Boolean wrongSurname;
    private Boolean wrongEmail;
    private Boolean passwordMatch;
    
    public UserDetailErrors () {
        this.wrongUsername = false;
        this.wrongName = false;
        this.wrongSurname = false;
        this.wrongEmail = false;
        this.passwordMatch = true;
    }

    public Boolean getWrongUsername() {
        return wrongUsername;
    }

    public void setWrongUsername(Boolean wrongUsername) {
        this.wrongUsername = wrongUsername;
    }

    public Boolean getWrongName() {
        return wrongName;
    }

    public void setWrongName(Boolean wrongName) {
        this.wrongName = wrongName;
    }

    public Boolean getWrongSurname() {
        return wrongSurname;
    }

    public void setWrongSurname(Boolean wrongSurname) {
        this.wrongSurname = wrongSurname;
    }

    public Boolean getWrongEmail() {
        return wrongEmail;
    }

    public void setWrongEmail(Boolean wrongEmail) {
        this.wrongEmail = wrongEmail;
    }

    public Boolean getPasswordMatch() {
        return passwordMatch;
    }

    public void setPasswordMatch(Boolean passwordMatch) {
        this.passwordMatch = passwordMatch;
    }
}
