public class Ravenclaw extends Hogwarts {
    private final byte intellect;
    private final byte wisdom;
    private final byte wit;
    private final byte creation;

    public Ravenclaw(String name, String surname) {
        super(name, surname);
        this.intellect = createRandomNumber();
        this.wisdom = createRandomNumber();
        this.wit = createRandomNumber();
        this.creation = createRandomNumber();
    }

    public byte getIntellect() {
        return intellect;
    }

    public byte getWisdom() {
        return wisdom;
    }

    public byte getWit() {
        return wit;
    }

    public byte getCreation() {
        return creation;
    }

    public int sumPropertyPoints() {
        return intellect + wisdom + wit + creation;
    }

    @Override
    public String toString() {
        return "Студент факультета Когтевран - " +
                super.toString() + "\n" +
                "Ум: " + intellect + "\n" +
                "Мудрость: " + wisdom + "\n" +
                "Остроумие: " + wit + "\n" +
                "Творчество: " + creation;
    }
}
