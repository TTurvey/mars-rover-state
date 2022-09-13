public class Rover {
    public String execute(String commands) {
        char[] compass = {'N', 'E', 'S', 'W'};
        char direction = 'N';

        if (commands.contains("R")) {
            direction = compass[commands.length() % 4];
        }
        if (commands.contains("L")) {
            direction = compass[compass.length - (commands.length() % 4)];
        }

        return "0:0:" + direction;

    }
}
