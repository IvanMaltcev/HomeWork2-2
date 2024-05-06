public class Main {
    public static void main(String[] args) {

        HogwartsBook hogwartsBook = new HogwartsBook();
        hogwartsBook.addStudent(new Gryffindor("Гарри", "Поттер"));
        hogwartsBook.addStudent(new Gryffindor("Гермиона", "Грейнджер"));
        hogwartsBook.addStudent(new Gryffindor("Рон", "Уизли"));

        hogwartsBook.addStudent(new Slytherin("Драко", "Малфой"));
        hogwartsBook.addStudent(new Slytherin("Грэхэм", "Монтегю"));
        hogwartsBook.addStudent(new Slytherin("Грегори", "Гойл"));

        hogwartsBook.addStudent(new Hufflepuff("Захария", "Смит"));
        hogwartsBook.addStudent(new Hufflepuff("Седрик", "Диггори"));
        hogwartsBook.addStudent(new Hufflepuff("Джастин", "Финч-Флетчли"));

        hogwartsBook.addStudent(new Ravenclaw("Чжоу", "Чанг"));
        hogwartsBook.addStudent(new Ravenclaw("Падма", "Патил"));
        hogwartsBook.addStudent(new Ravenclaw("Маркус", "Белби"));

        hogwartsBook.printStudentDescription("Гермиона");
        hogwartsBook.printStudentDescription("Рон");

        hogwartsBook.compareTwoStudentsAtFaculty("Гермиона", "Рон");
        hogwartsBook.compareTwoStudentsByMagicPower("Драко", "Захария");

    }
}