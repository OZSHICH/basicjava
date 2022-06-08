package OoplabRed.OopLabRedEmpDate;

public class Emp {

    private String firstname;
    private String lastname;
    private Date birthdate;
    private Date emplodate;

    public Emp(String firstname, String lastname, Date birthdate, Date emplodate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.emplodate = emplodate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getEmplodate() {
        return emplodate;
    }

    public void setEmplodate(Date emplodate) {
        this.emplodate = emplodate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdate=" + birthdate +
                ", emplodate=" + emplodate +
                '}';
    }
}
