package project;

public class TeeImpl implements Tee {

  private String name;
  private double rating;
  private double slope;

  public TeeImpl(String name, double rating, double slope) {
    this.name = name;
    this.rating = rating;
    this.slope = slope;
  }

  public String getName() {
    return name;
  }

  public double getRating() {
    return rating;
  }

  public double getSlope() {
    return slope;
  }

}
