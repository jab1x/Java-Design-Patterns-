public class SecretAgent implements Spy {

    private final String name;

    public SecretAgent(String name) {
        this.name = name;
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        System.out.println("[" + name + " - SecretAgent] Spying on GeneralStaff...");
        int stolen = generalStaff.getSecretPapers();
        if (stolen > 0) {
            System.out.println("[" + name + "] Stole " + stolen + " secret papers!");
            generalStaff.setSecretPapers(0);
        } else {
            System.out.println("[" + name + "] No secret papers left to steal.");
        }
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        System.out.println("[" + name + " - SecretAgent] Spying on MilitaryBase...");
        // SecretAgent може зібрати інформацію, але не знищує особовий склад чи техніку
        System.out.println("[" + name + "] Collected intel: officers="
            + militaryBase.getOfficers()
            + ", soldiers=" + militaryBase.getSoldiers()
            + ", jeeps=" + militaryBase.getJeeps()
            + ", tanks=" + militaryBase.getTanks());
    }
}
