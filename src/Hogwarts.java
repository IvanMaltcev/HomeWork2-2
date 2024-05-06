public class Hogwarts {
    private final String name;
    private final String surname;
    private byte powerOfMagic;
    private byte transgressionDistance;

    public Hogwarts(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = createRandomNumber();
        this.transgressionDistance = createRandomNumber();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public byte getPowerOfMagic() {
        return powerOfMagic;
    }

    public byte getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setPowerOfMagic(byte powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setTransgressionDistance(byte transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public int calculationTotalMagicPower() {
        return powerOfMagic + transgressionDistance;
    }

    @Override
    public String toString() {
        return name + " " + surname + "\n" +
                "Качества студента: \n" +
                "Сила магии: " + powerOfMagic + "\n" +
                "Расстояние трансгрессии: " + transgressionDistance;
    }

    protected byte createRandomNumber() {
        return (byte) (Math.random() * 100);
    }
}
