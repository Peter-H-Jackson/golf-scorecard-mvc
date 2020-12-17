package project;

public interface Course {

  String getName();

  int getTotalPar();

  int getFrontPar();

  int getBackPar();

  int getHolePar(int hole);

  int getHoleHandicap(int hole, String gender);

  Tee getTee(String name);

}
