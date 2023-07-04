public class Wilder {
    private String firstName;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstName = firstname;
        this.aware = aware;
    }

    // getters :
    public String getFirstName() {
        return this.firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    // setters :
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // WhoAmI
    public String whoAmI() {
        return ("Je m'appelle " + firstName + " et " + (aware ? "je suis" : "je ne suis pas") + " aware.");
    }
}
