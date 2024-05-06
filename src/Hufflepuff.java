public class Hufflepuff extends Hogwarts {
    private final byte hardWork;
    private final byte loyalty;
    private final byte honesty;

    public Hufflepuff(String name, String surname) {
        super(name, surname);
        this.hardWork = createRandomNumber();
        this.loyalty = createRandomNumber();
        this.honesty = createRandomNumber();
    }

    public byte getHardWork() {
        return hardWork;
    }

    public byte getLoyalty() {
        return loyalty;
    }

    public byte getHonesty() {
        return honesty;
    }

    public int sumPropertyPoints() {
        return hardWork + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Студент факультета Пуффендуй - " +
                super.toString() + "\n" +
                "Трудолюбие: " + hardWork + "\n" +
                "Верность: " + loyalty + "\n" +
                "Честность: " + honesty;
    }
}
