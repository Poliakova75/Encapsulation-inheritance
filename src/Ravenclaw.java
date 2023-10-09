public class Ravenclaw extends Hogwarts {
   String name;
   private   int intelligence;
   private int wisdom;
   private int wit;
   private int creativity;

   public Ravenclaw(int magicPower, int transgressionDistance, String name, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.name = name;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
   }

    public int getIntelligence() {
        return intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getWit() {
        return wit;
    }
    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
       return "Студент " +name +
              "\nСила магии " + getMagicPower() +
              "\nТрансгрессия " + getTransgressionDistance() +
              "\nУм: " + intelligence +
              "\nМудрость: " + wisdom +
              "\nОстроумие: " + wit +
              "\nТворчество: " + creativity;
   }

   public void compareStudents(Ravenclaw student2) {
      int Score1 = this.intelligence + this.wisdom + this.wit + this.creativity;
      int Score2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity();

      if (Score1 > Score2) {
            System.out.println(this.name + " лучший ученик факультета Когтевран");
      } else if (Score1 < Score2) {
            System.out.println(student2.name + " лучший ученик факультета Когтевран");
      } else {
            System.out.println("У обоих учеников одинаковая сумма свойств");
      }
   }
}
