public class Griffindor extends Hogwarts {
    String name;
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Студент " + name +
               "\nСила магии " + getMagicPower() +
               "\nТрансгрессия " + getTransgressionDistance() +
               "\nБлагородство " + nobility +
               "\nЧесть " + honor +
               "\nХрабрость " + bravery;
    }
    public void compareStudents(Griffindor student2) {
       int Score1 = this.nobility + this.honor + this.bravery;
       int Score2 = student2.getNobility() + student2.getHonor() + student2.getBravery();

       if (Score1 > Score2) {
            System.out.println( this.name + " лучший ученик факультета Гриффиндор");
       } else if (Score1 < Score2) {
           System.out.println(student2.name +  " лучший ученик факультета Гриффиндор");
       } else {
            System.out.println("У обоих учеников одинаковая сумма свойств");
       }
    }
}