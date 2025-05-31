public class Saboteur implements Spy {

    private final String name;

    public Saboteur(String name) {
        this.name = name;
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        System.out.println("[" + name + " - Saboteur] Attacking GeneralStaff...");
        // Знищує секретні папери та знешкоджує генералів 
        int papers = generalStaff.getSecretPapers();
        int gens = generalStaff.getGenerals();

        if (papers > 0 || gens > 0) {
            System.out.println("[" + name + "] Destroyed " + papers + " secret papers and incapacitated " + gens + " generals!");
            generalStaff.setSecretPapers(0);
            generalStaff.setGenerals(0);
        } else {
            System.out.println("[" + name + "] Nothing left to destroy in GeneralStaff.");
        }
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        System.out.println("[" + name + " - Saboteur] Attacking MilitaryBase...");
        int off = militaryBase.getOfficers();
        int sold = militaryBase.getSoldiers();
        int jps = militaryBase.getJeeps();
        int tks = militaryBase.getTanks();

        if (off + sold + jps + tks > 0) {
            System.out.println("[" + name + "] Neutralized " + off +
                " officers, " + sold + " soldiers, destroyed " +
                jps + " jeeps and " + tks + " tanks!");
            militaryBase.setOfficers(0);
            militaryBase.setSoldiers(0);
            militaryBase.setJeeps(0);
            militaryBase.setTanks(0);
        } else {
            System.out.println("[" + name + "] MilitaryBase is already deserted.");
        }
    }
}
