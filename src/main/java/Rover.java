import java.util.Arrays;

public class Rover {
    public String execute(String commands) {
        char[] clockwiseCompass = {'N', 'E', 'S', 'W'};
        char[] antiClockwiseCompass = {'W', 'S', 'E', 'N'};
        char currentDirection = 'N';

        char[] moves = commands.toCharArray();

        for(char move : moves) {
            if (move == 'L') {
                currentDirection = turn(antiClockwiseCompass, currentDirection);
            }
            if (move == 'R') {
                currentDirection = turn(clockwiseCompass, currentDirection);
            }
        }

        return "0:0:" + currentDirection;

    }

    private static char turn(char[] compass, char currentDirection) {
        int currentDirectionIndex = new String(compass).indexOf(currentDirection);
        int newDirectionIndex = (currentDirectionIndex + 1) % 4;

        return compass[newDirectionIndex];
    }

}
