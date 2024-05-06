public class HogwartsBook {

    private final Hogwarts[] studentsOfGryffindor = new Gryffindor[3];
    private final Hogwarts[] studentsOfSlytherin = new Slytherin[3];
    private final Hogwarts[] studentsOfHufflepuff = new Hufflepuff[3];
    private final Hogwarts[] studentsOfRavenclaw = new Ravenclaw[3];

    public void addStudent(Hogwarts student) {
        for (int i = 0; i < studentsOfGryffindor.length; i++) {
            if (student.getClass().equals(Gryffindor.class) && studentsOfGryffindor[i] == null) {
                studentsOfGryffindor[i] = student;
                break;
            } else if (student.getClass().equals(Slytherin.class) && studentsOfSlytherin[i] == null) {
                studentsOfSlytherin[i] = student;
                break;
            } else if (student.getClass().equals(Hufflepuff.class) && studentsOfHufflepuff[i] == null) {
                studentsOfHufflepuff[i] = student;
                break;
            } else if (student.getClass().equals(Ravenclaw.class) && studentsOfRavenclaw[i] == null) {
                studentsOfRavenclaw[i] = student;
                break;
            }
            if (i == 2) {
                throw new RuntimeException("Мест больше нет!");
            }
        }
    }

    private Hogwarts getStudentByName(String name) {
        for (int i = 0; i < studentsOfGryffindor.length; i++) {
            if (studentsOfGryffindor[i].getName().equals(name)) {
                return studentsOfGryffindor[i];
            } else if (studentsOfSlytherin[i].getName().equals(name)) {
                return studentsOfSlytherin[i];
            } else if (studentsOfHufflepuff[i].getName().equals(name)) {
                return studentsOfHufflepuff[i];
            } else if (studentsOfRavenclaw[i].getName().equals(name)) {
                return studentsOfRavenclaw[i];
            }
        }
        throw new IllegalArgumentException("Студента с таким именем нет!");
    }

    public void printStudentDescription(String name) {
        System.out.println(getStudentByName(name));
    }

    public void compareTwoStudentsAtFaculty(String name1, String name2) {
        Hogwarts student1 = getStudentByName(name1);
        Hogwarts student2 = getStudentByName(name2);
        if (!student1.getClass().equals(student2.getClass())) {
            System.out.println("Студенты из разных факультетов!");
            return;
        }
        if (student1.getClass().equals(Gryffindor.class)) {
            if (((Gryffindor) student1).sumPropertyPoints() > ((Gryffindor) student2).sumPropertyPoints()) {
                System.out.println(name1 + " лучший Гриффиндорец, чем " + name2 + "!");
            } else if (((Gryffindor) student1).sumPropertyPoints() < ((Gryffindor) student2).sumPropertyPoints()) {
                System.out.println(name2 + " лучший Гриффиндорец, чем " + name1 + "!");
            } else {
                System.out.println("У " + name1 + " и " + name2 + " одинаковый результат!");
            }
        } else if (student1.getClass().equals(Hufflepuff.class)) {
            if (((Hufflepuff) student1).sumPropertyPoints() > ((Hufflepuff) student2).sumPropertyPoints()) {
                System.out.println(name1 + " лучший Пуффендуец, чем " + name2 + "!");
            } else if (((Hufflepuff) student1).sumPropertyPoints() < ((Hufflepuff) student2).sumPropertyPoints()) {
                System.out.println(name2 + " лучший Пуффендуец, чем " + name1 + "!");
            } else {
                System.out.println("У " + name1 + " и " + name2 + " одинаковый результат!");
            }
        } else if (student1.getClass().equals(Ravenclaw.class)) {
            if (((Ravenclaw) student1).sumPropertyPoints() > ((Ravenclaw) student2).sumPropertyPoints()) {
                System.out.println(name1 + " лучший Когтевранец, чем " + name2 + "!");
            } else if (((Ravenclaw) student1).sumPropertyPoints() < ((Ravenclaw) student2).sumPropertyPoints()) {
                System.out.println(name2 + " лучший Когтевранец, чем " + name1 + "!");
            } else {
                System.out.println("У " + name1 + " и " + name2 + " одинаковый результат!");
            }
        } else if (student1.getClass().equals(Slytherin.class)) {
            if (((Slytherin) student1).sumPropertyPoints() > ((Slytherin) student2).sumPropertyPoints()) {
                System.out.println(name1 + " лучший Слизеринец, чем " + name2 + "!");
            } else if (((Slytherin) student1).sumPropertyPoints() < ((Slytherin) student2).sumPropertyPoints()) {
                System.out.println(name2 + " лучший Слизеринец, чем " + name1 + "!");
            } else {
                System.out.println("У " + name1 + " и " + name2 + " одинаковый результат!");
            }
        }
    }

    public void compareTwoStudentsByMagicPower(String name1, String name2) {
        Hogwarts student1 = getStudentByName(name1);
        Hogwarts student2 = getStudentByName(name2);
        if (student1.calculationTotalMagicPower() > student2.calculationTotalMagicPower()) {
            System.out.println(student1.getName() + " " + student1.getSurname() +
                    " обладает бОльшей мощностью магии, чем " + student2.getName() + " " + student2.getSurname());
        } else if (student1.calculationTotalMagicPower() < student2.calculationTotalMagicPower()) {
            System.out.println(student2.getName() + " " + student2.getSurname() +
                    " обладает бОльшей мощностью магии, чем " + student1.getName() + " " + student1.getSurname());
        } else {
            System.out.println("У " + student1.getName() + " " + student1.getSurname() +
                    " и " + student2.getName() + " " + student2.getSurname() + "  равная мощность магии!");
        }
    }
}
