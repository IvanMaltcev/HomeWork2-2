public class Gryffindor extends Hogwarts {
    private final byte nobility;
    private final byte honor;
    private final byte bravery;

    public Gryffindor(String name, String surname) {
        super(name, surname);
        this.nobility = createRandomNumber();
        this.honor = createRandomNumber();
        this.bravery = createRandomNumber();
    }

    public byte getNobility() {
        return nobility;
    }

    public byte getHonor() {
        return honor;
    }

    public byte getBravery() {
        return bravery;
    }

    public int sumPropertyPoints() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return "Студент факультета Гриффиндор - " +
                super.toString() + "\n" +
                "Благородство: " + nobility + "\n" +
                "Честь: " + honor + "\n" +
                "Храбрость: " + bravery;
    }
}
