public class GeneralStaff extends MilitaryObject {

    private int generals;
    private int secretPapers;

    public GeneralStaff(int generals, int secretPapers) {
        this.generals = generals;
        this.secretPapers = secretPapers;
    }

    public int getGenerals() {
        return generals;
    }

    public void setGenerals(int generals) {
        this.generals = generals;
    }

    public int getSecretPapers() {
        return secretPapers;
    }

    public void setSecretPapers(int secretPapers) {
        this.secretPapers = secretPapers;
    }

    @Override
    public void accept(Spy spy) {
        spy.visit(this);
    }

    @Override
    public String toString() {
        return "GeneralStaff{" +
                "generals=" + generals +
                ", secretPapers=" + secretPapers +
                '}';
    }
}
