public class Main {
    public static void main(String[] args) {
        Griffindor studentGriff1 = new Griffindor("Гарри","Поттер",
                10,20,10,40,13);
        Griffindor studentGriff2 = new Griffindor("Гермиона","Грейнджер",
                15,10,5,90,10);
        Griffindor studentGriff3 = new Griffindor("Гермиона","Грейнджер",
                15,10,5,90,10);

        Hufflepuff studentHuff1 = new Hufflepuff("Захария","Смит",
                10,20,10,40,13);
        Hufflepuff studentHuff2 = new Hufflepuff("Седрик","Диггори",
                15,10,5,90,10);
        Hufflepuff studentHuff3 = new Hufflepuff("Джастин","Финч",
                15,10,5,90,10);

        Ravenclaw studentRav1 = new Ravenclaw("Чжоу","Чанг",
                10,20,10,40,13,12);
        Ravenclaw studentRav2 = new Ravenclaw("Падма","Патил",
                15,10,5,90,10,13);
        Ravenclaw studentRav3 = new Ravenclaw("Маркус","Белби",
                15,10,5,90,10,14);

        Slytherin studentSly1 = new Slytherin("Драко","Малфой",
                10,20,10,40,13,45,99);
        Slytherin studentSly2 = new Slytherin("Грэхэм","Монтегю",
                15,10,5,90,10,31,12);
        Slytherin studentSly3 = new Slytherin("Грегори","Гойл",
                15,10,5,90,10,22,47);

        System.out.println(studentGriff3);
        System.out.println();
        System.out.println(studentHuff1);
        System.out.println();
        System.out.println(studentRav1);
        System.out.println();
        System.out.println(studentSly1);
        System.out.println();

        System.out.println(studentGriff1.compareChar(studentGriff2));
        System.out.println(studentRav3.compareChar(studentRav2));
        System.out.println(studentHuff2.compareChar(studentHuff3));
        System.out.println(studentSly2.compareChar(studentSly1));
        System.out.println(studentGriff1.compare(studentSly3));
    }
}