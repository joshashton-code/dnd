package dnd.species;

public class Dwarf implements Race {
    private final int speed = 25;
    private final int maxAge = 350;
    private String[] traits;
    private String[] skills;
    private String[] languages;
    private String[] proficiencies;

    public Dwarf() {
        this.languages = new String[]{"Common", "Dwarvish"};
        this.skills = new String[]{};
    }

    @Override
    public String getRace() { return this.getClass().getSimpleName(); }

    @Override
    public int maxAge() { return maxAge; }

    @Override
    public int getSpeed() { return speed; }

    @Override
    public String[] getTraits() { return traits; }

    @Override
    public String[] getSkills() { return skills; }

    @Override
    public String[] getLanguages() { return languages; }

    @Override
    public String[] getProficiencies() { return proficiencies; }

    @Override
    public int[] getASI() { return new int[]{2, 2}; }

    @Override
    public String toString() { return this.getClass().getSimpleName(); }
}
