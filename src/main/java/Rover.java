public class Rover {
    public String execute(String commands) {
        char[] Compass = {'N', 'E', 'S', 'W'};
        char direction = 'N';

        direction = Compass[commands.length() % 4];

        return "0:0:" + direction;

    }
}
