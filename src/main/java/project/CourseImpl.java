package project;

public class CourseImpl implements Course {

  private String name;
  private int[] par;
  private int[] men_handicap;
  private int[] women_handicap;
  private Tee[] tees;

  public CourseImpl(String name, int[] par, int[] men_handicap, int[] women_handicap, Tee[] tees) {
    this.name = name;
    this.par = par;
    this.men_handicap = men_handicap;
    this.women_handicap = women_handicap;
    this.tees = tees;
  }

  public String getName() {
    return name;
  }

  public int getTotalPar() {
    int total = 0;
    for (int i = 0; i < 18; i++) {
      total += par[i];
    }
    return total;
  }

  public int getFrontPar() {
    int total = 0;
    for (int i = 0; i < 9; i++) {
      total += par[i];
    }
    return total;
  }

  public int getBackPar() {
    int total = 0;
    for (int i = 9; i < 18; i++) {
      total += par[i];
    }
    return total;
  }

  public int getHolePar(int hole) {
    return par[hole];
  }

  public int getHoleHandicap(int hole, String gender) {
    if (gender.equals("male")) {
      return men_handicap[hole];
    } else {
      return women_handicap[hole];
    }
  }

  public Tee getTee(String name) {
    for (int i = 0; i < tees.length; i++) {
      if (tees[i].getName().equals("name")) {
        return tees[i];
      }
    }
    return tees[0];
  }

}
