public class Hogwarts {
    String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public void totalCompareStudents(Hogwarts student2) {
        int totalScore1 = this.magicPower + this.transgressionDistance;
        int totalScore2 = student2.getMagicPower() + student2.getTransgressionDistance();
        if (totalScore1 > totalScore2) {
            System.out.println(this.name + " сильнее в магии");
        } else if (totalScore1 < totalScore2) {
            System.out.println(student2 + " сильнее в магии");
        } else {
            System.out.println("У обоих учеников одинаковая сила магии");
        }

        if (this.transgressionDistance > student2.transgressionDistance) {
            System.out.println(this.name + " может пройти большее расстояние трансгрессии");
        } else if (this.transgressionDistance < student2.transgressionDistance) {
            System.out.println(student2 + " может пройти большее расстояние трансгрессии");
        } else {
            System.out.println("У обоих учеников одинаковое расстояние трансгрессии");
        }
    }
}





