import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри Поттер", 90, 90, 7, 7, 8);
        Griffindor hermioneGranger = new Griffindor("Гермиона Грейнджер", 95, 92, 9, 8, 8);
        Griffindor ronWeasley = new Griffindor("Рон Уизли", 85, 85, 3, 6, 5);

        Slytherin dracoMalfoy = new Slytherin(90, 85, "Драко Малфой", 9, 7, 9, 5, 10);
        Slytherin gregoryGoyle = new Slytherin(80, 75, "Грегори Гойл", 7, 8, 8, 6, 7);
        Slytherin grahamMontague = new Slytherin(82, 70, "Грэхэм Монтегю", 8, 6, 5, 6, 7);

        Hufflepuff zachariasSmith = new Hufflepuff(80, 80, "Захария Смит", 9, 7, 5);
        Hufflepuff cedricDiggory = new Hufflepuff(85, 80, "Седрик Диггори", 7, 5, 8);
        Hufflepuff justinFinchFletchly = new Hufflepuff(84, 71, "Джастин Финч-Флетчли", 6, 6, 7);

        Ravenclaw zhouChang = new Ravenclaw(89, 91, "Чжоу Чанг", 10, 8, 8, 9);
        Ravenclaw padmaPatil = new Ravenclaw(93, 77, "Падма Патил", 11, 9, 9, 8);
        Ravenclaw marcusBelby = new Ravenclaw(86, 95, "Маркус Белби", 8, 8, 6, 7);

        System.out.println(harryPotter);
        System.out.println();
        System.out.println(hermioneGranger);
        System.out.println();
        System.out.println(ronWeasley);
        System.out.println();
        System.out.println(dracoMalfoy);
        System.out.println();
        System.out.println(gregoryGoyle);
        System.out.println();
        System.out.println(grahamMontague);
        System.out.println();
        System.out.println(zachariasSmith);
        System.out.println();
        System.out.println(cedricDiggory);
        System.out.println();
        System.out.println(justinFinchFletchly);
        System.out.println();
        System.out.println(zhouChang);
        System.out.println();
        System.out.println(padmaPatil);
        System.out.println();
        System.out.println(marcusBelby);
        System.out.println();

        harryPotter.compareStudents(hermioneGranger);
        System.out.println();
        dracoMalfoy.compareStudents(grahamMontague);
        System.out.println();
        cedricDiggory.compareStudents(zachariasSmith);
        System.out.println();
        zhouChang.compareStudents(padmaPatil);
        System.out.println();
        harryPotter.totalCompareStudents(dracoMalfoy);
    }
}