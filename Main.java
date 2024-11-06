/**
 * Main class to test the FitnessTracker class.
 */
public class Main {

    public static void main(String[] args) {
        // Create an instance of FitnessTracker
        FitnessTracker tracker = new FitnessTracker();
        tracker.setName("Lebron James");
        tracker.setGoalSteps(5000);

        // Test adding steps
        tracker.addSteps(2000);
        System.out.println(tracker.toString());
        tracker.checkGoal();

        // Update heart rate
        tracker.updateHeartRate(80);
        System.out.println("Updated Heart Rate: " + tracker.getHeartRate());

        // Add more steps to reach goal
        tracker.addSteps(3000);
        System.out.println(tracker.toString());
        tracker.checkGoal();

        // Reset stats
        tracker.resetDailyStats();
        System.out.println("After reset:\n" + tracker.toString());

        // Use parameterized constructor
        FitnessTracker tracker2 = new FitnessTracker("Jane Smith", 4000, 0, 0, 75, 6000);
        tracker2.calculateDistance();
        tracker2.calculateCalories();
        System.out.println("New Tracker:\n" + tracker2.toString());
        tracker2.checkGoal();
    }
}