package project;

import java.util.ArrayList;

public class CourseLibrary {

  private static ArrayList<Course> courses;

  public static ArrayList<Course> loadCourses() {
    if (courses == null) {
      initializeCourses();
    }
    return courses;
  }

  private static void initializeCourses() {
    courses = new ArrayList<>();

    // Hasentree
    courses.add(
        new CourseImpl(
            "Hasentree",
            new int[]{4, 4, 3, 4, 5, 3, 5, 4, 4, 4, 4, 3, 5, 3, 4, 5, 3, 4},
            new int[]{1, 7, 17, 5, 13, 11, 9, 3, 15, 14, 4, 6, 8, 18, 12, 10, 16, 2},
            new int[]{5, 15, 17, 1, 7, 11, 9, 3, 13, 8, 6, 18, 12, 14, 10, 4, 16, 2},
            new Tee[]{
                new TeeImpl("1", 74.2, 142),
                new TeeImpl("2", 72.4, 135),
                new TeeImpl("3", 70.7, 128),
                new TeeImpl("4", 67.6, 121),
                new TeeImpl("5", 64.7, 115)}
        )
    );

    // Pebble Beach
    courses.add(
        new CourseImpl(
            "Pebble Beach",
            new int[]{4, 5, 4, 4, 3, 5, 3, 4, 4, 4, 4, 3, 4, 5, 4, 4, 3, 5},
            new int[]{8, 10, 12, 16, 14, 2, 18, 6, 4, 7, 5, 17, 9, 1, 13, 11, 15, 3},
            new int[]{8, 10, 12, 16, 14, 2, 18, 6, 4, 7, 5, 17, 9, 1, 13, 11, 15, 3},
            new Tee[]{
                new TeeImpl("Blue", 74.7, 143),
                new TeeImpl("Gold", 72.6, 136),
                new TeeImpl("White", 71.3, 132),
                new TeeImpl("Red", 71.8, 129)}
        )
    );

    // Tobacco Road
    courses.add(
        new CourseImpl(
            "Tobacco Road",
            new int[]{5, 4, 3, 5, 4, 3, 4, 3, 4, 4, 5, 4, 5, 3, 4, 4, 3, 4},
            new int[]{3, 11, 17, 9, 15, 13, 7, 5, 1, 6, 10, 14, 2, 8, 12, 16, 18, 4},
            new int[]{3, 11, 17, 9, 15, 13, 7, 5, 1, 6, 10, 14, 2, 8, 12, 16, 18, 4},
            new Tee[]{
                new TeeImpl("Ripper", 71.7, 144),
                new TeeImpl("Disc", 70.3, 135),
                new TeeImpl("Plow", 68.6, 129),
                new TeeImpl("Cultivator", 69.8, 126)}
        )
    );
  }

}
