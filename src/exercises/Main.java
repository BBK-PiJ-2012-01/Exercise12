package exercises;

import common.BadInput;
import common.Exercise;
import common.ExerciseChooser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 13:25
 */
public class Main {
    public static void main(String[] args) throws BadInput {
        List<Exercise> exercises = new ArrayList<Exercise>();

        //exercises.add(new

        ExerciseChooser ech = new ExerciseChooser(exercises);
        ech.run();

    }
}
