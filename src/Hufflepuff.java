public class Hufflepuff extends Hogwarts {
    String name;
   private int diligence;
   private int loyalty;
   private   int honesty;

  public Hufflepuff(int magicPower, int transgressionDistance, String name, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.name = name;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
  }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
  public String toString() {
       return  "Студент " + name +
               "\nСила магии " + getMagicPower() +
               "\nТрансгрессия " + getTransgressionDistance() +
               "\nТрудолюбие -" + diligence +
               "\nВерность -" + loyalty +
               "\nЧестность: " + honesty;
  }

  public void compareStudents(Hufflepuff student2) {
        int Score1 = this.diligence + this.loyalty + this.honesty;
        int Score2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();

        if (Score1 > Score2) {
            System.out.println(this.name + " лучший ученик факультета Пуффендуй");
        } else if (Score1 < Score2) {
            System.out.println(student2.name + " лучший ученик факультета Пуффендуй");
        } else {
            System.out.println("У обоих учеников одинаковая сумма свойств");
        }
    }
}


