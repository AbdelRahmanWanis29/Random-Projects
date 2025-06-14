// Exam 24 Continued

public class ActivityTracker {

    int ActiveCalories;
    int ExerciseMinutes;
    int StandingHours;
    int MoveGoal;
    int ExerciseGoal;
    int StandGoal;

    public ActivityTracker(int MoveGoal, int ExerciseGoal, int StandGoal) {

        this.MoveGoal = MoveGoal;
        this.ExerciseGoal = ExerciseGoal;
        this.StandGoal = StandGoal;

    }

    public void addActivity(int activecalories, int exminutes, int sthours) {

        this.ActiveCalories = activecalories;
        this.ExerciseMinutes = exminutes;
        this.StandingHours = sthours;

    }

    public void setGoals(int MGoal, int EGoal, int SGoal) {

        this.MoveGoal = MGoal;
        this.ExerciseGoal = EGoal;
        this.StandGoal = SGoal;

    }

    public void getProgress() {

        double cals = (this.ActiveCalories / this.MoveGoal) * 100;
        double exc = (this.ExerciseMinutes / this.ExerciseGoal) * 100;
        double std = (this.StandingHours / this.StandGoal) * 100;

        System.out.println("Calories Progress: " + cals);
        System.out.println("Exercise Progress: " + exc);
        System.out.println("Standing Progress: " + std);

    }

    public static boolean CompletedGoals(ActivityTracker x) {

        if (x.ActiveCalories >= x.MoveGoal && x.ExerciseMinutes >= x.ExerciseGoal && x.StandingHours >= x.StandGoal) {
            return true;
        } else {
            return false;
        }

    }

    public String toString() {
        return ("You achieved " + this.ActiveCalories + "/" + this.MoveGoal + " KCAL " + this.ExerciseMinutes + "/"
                + this.ExerciseGoal + " Minutes " + this.StandingHours + "/" + this.StandGoal + " Hours today!");
    }

}
