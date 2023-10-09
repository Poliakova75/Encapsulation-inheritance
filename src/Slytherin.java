public class Slytherin extends Hogwarts {
    String name;
   private int cunningness;
   private int determination;
   private int ambition;
   private int resourcefulness;
   private int thirstForPower;

   public Slytherin(int magicPower, int transgressionDistance, String name, int cunningness, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.name = name;
        this.cunningness = cunningness;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
   }
    public int getCunningness() {
        return cunningness;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
   public String toString (){
       return "Студент " + name +
              "\nСила магии " + getMagicPower() +
              "\nТрансгрессия " + getTransgressionDistance() +
              "\nХитрость - " + cunningness +
              "\nРешительность -" + determination +
              "\nАмбициозность -" + ambition +
              "\nНаходчивость -" + resourcefulness +
              "\nЖажда власти -" + thirstForPower;
   }

   public void compareStudents(Slytherin student2) {
      int Score1 = this.cunningness + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;
      int Score2 = student2.getCunningness() + student2.getAmbition() + student2.getResourcefulness() + student2.getDetermination() + student2.getThirstForPower();

      if (Score1 > Score2) {
            System.out.println(this.name + " лучший ученик факультета Слизерин");
      } else if (Score1 < Score2) {
            System.out.println(student2.name + " лучший ученик факультета Слизерин");
      } else {
            System.out.println("У обоих учеников одинаковая сумма свойств");
      }
   }
}


