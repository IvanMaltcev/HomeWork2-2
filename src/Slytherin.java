public class Slytherin extends Hogwarts {
    private final byte cunning;
    private final byte resolve;
    private final byte ambition;
    private final byte resourcefulness;
    private final byte lustForPower;

    public Slytherin(String name, String surname) {
        super(name, surname);
        this.cunning = createRandomNumber();
        this.resolve = createRandomNumber();
        this.ambition = createRandomNumber();
        this.resourcefulness = createRandomNumber();
        this.lustForPower = createRandomNumber();
    }

    public byte getCunning() {
        return cunning;
    }

    public byte getResolve() {
        return resolve;
    }

    public byte getAmbition() {
        return ambition;
    }

    public byte getResourcefulness() {
        return resourcefulness;
    }

    public byte getLustForPower() {
        return lustForPower;
    }

    public int sumPropertyPoints() {
        return cunning + resolve + ambition + resourcefulness + lustForPower;
    }

    @Override
    public String toString() {
        return "Студент факультета Слизерин - " +
                super.toString() + "\n" +
                "Хитрость: " + cunning + "\n" +
                "Решительность: " + resolve + "\n" +
                "Амбициозность: " + ambition + "\n" +
                "Находчивость: " + resourcefulness + "\n" +
                "Жажда власти: " + lustForPower;
    }
}
