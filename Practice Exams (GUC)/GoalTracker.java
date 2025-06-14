// Exam 24 Continued

public class GoalTracker {

    int[] goals;
    ActivityTracker[] DailyActivities;

    public GoalTracker(int MvGoal, int ExGoal, int StGoal) {

        this.goals[0] = MvGoal;
        this.goals[1] = ExGoal;
        this.goals[2] = StGoal;
        for (int i = 0; i < this.DailyActivities.length; i++) {
            this.DailyActivities[i].setGoals(MvGoal, ExGoal, StGoal);
        }

    }

    public GoalTracker(int[] goals, ActivityTracker[] DailyActivities) {

        for (int j = 0; j < goals.length; j++) {
            this.goals[j] = goals[j];
        }
        for (int i = 0; i < DailyActivities.length; i++) {
            this.DailyActivities[i].setGoals(DailyActivities[i].MoveGoal, DailyActivities[i].ExerciseGoal,
                    DailyActivities[i].StandGoal);
            this.DailyActivities[i].addActivity(DailyActivities[i].ActiveCalories, DailyActivities[i].ExerciseMinutes,
                    DailyActivities[i].StandingHours);
        }
    }

    public void RecordDailyActivity(int day, int move, int exercise, int stand) {
        this.DailyActivities[day].addActivity(move, exercise, stand);
    }

    public int GetOverallCompletionRate() {
        int count = 0;
        for (int i = 0; i < this.DailyActivities.length; i++) {
            if (ActivityTracker.CompletedGoals(this.DailyActivities[i]) == true) {
                count += 1;
            }
        }
        return count;
    }

    public int BestDay() {
        double best = 0.0;
        int index = -1;
        double percentage;
        for (int i = 0; i < this.DailyActivities.length; i++) {
            percentage = this.DailyActivities[i].ActiveCalories / this.DailyActivities[i].MoveGoal;
            if (percentage >= best) {
                best = percentage;
                index = i;
            }
        }
        return index;
    }

}
