/**
 * The FitnessTracker class simulates a fitness tracker that records a user's
 * steps, calculates distance, calories burned, and monitors heart rate.
 */
public class FitnessTracker {

    // Public constants
    public static final double KILOMETERS_PER_STEP = 0.000762;
    public static final double CALORIES_PER_STEP = 0.04;

    // Private properties
    private String name;
    private int dailySteps;
    private double distanceWalked;
    private double caloriesBurned;
    private int heartRate;
    private int goalSteps;

    // Default constructor
    public FitnessTracker() {
        this.name = "";
        this.dailySteps = 0;
        this.distanceWalked = 0.0;
        this.caloriesBurned = 0.0;
        this.heartRate = 0;
        this.goalSteps = 0;
    }

    // Parameterized constructor
    public FitnessTracker(String name, int dailySteps, double distanceWalked,
                          double caloriesBurned, int heartRate, int goalSteps) {
        this.name = name;
        this.dailySteps = dailySteps;
        this.distanceWalked = distanceWalked;
        this.caloriesBurned = caloriesBurned;
        this.heartRate = heartRate;
        this.goalSteps = goalSteps;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
        calculateDistance();
        calculateCalories();
    }

    public double getDistanceWalked() {
        return distanceWalked;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getGoalSteps() {
        return goalSteps;
    }

    public void setGoalSteps(int goalSteps) {
        this.goalSteps = goalSteps;
    }

    // Methods

    /**
     * Adds the specified number of steps to the daily step count.
     * @param steps Number of steps to add
     */
    public void addSteps(int steps) {
        this.dailySteps += steps;
        calculateDistance();
        calculateCalories();
    }

    /**
     * Calculates and updates the distance walked based on daily steps.
     */
    public void calculateDistance() {
        this.distanceWalked = this.dailySteps * KILOMETERS_PER_STEP;
    }

    /**
     * Calculates and updates the calories burned based on daily steps.
     */
    public void calculateCalories() {
        this.caloriesBurned = this.dailySteps * CALORIES_PER_STEP;
    }

    /**
     * Updates the heart rate to the specified value.
     * @param newHeartRate New heart rate
     */
    public void updateHeartRate(int newHeartRate) {
        this.heartRate = newHeartRate;
    }

    /**
     * Resets daily steps, distance walked, and calories burned to zero.
     */
    public void resetDailyStats() {
        this.dailySteps = 0;
        this.distanceWalked = 0.0;
        this.caloriesBurned = 0.0;
    }

    /**
     * Checks if the daily step goal has been met and prints a congratulatory message if true.
     */
    public void checkGoal() {
        if (this.dailySteps >= this.goalSteps) {
            System.out.println("Congratulations, " + this.name + "! You've reached your daily step goal of " + this.goalSteps + " steps!");
        }
    }

    /**
     * Returns a summary of the user's daily stats as a string.
     * @return Daily stats summary
     */
    @Override
    public String toString() {
        return "User: " + name + "\n" +
                "Steps Taken: " + dailySteps + "\n" +
                "Distance Walked: " + distanceWalked + " km\n" +
                "Calories Burned: " + caloriesBurned + "\n" +
                "Current Heart Rate: " + heartRate + " bpm";
    }
}
