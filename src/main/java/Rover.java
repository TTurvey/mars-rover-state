import java.util.Arrays;

public class Rover {
    public String execute(String commands) {
        char[] clockwiseCompass = {'N', 'E', 'S', 'W'};
        char[] antiClockwiseCompass = {'W', 'S', 'E', 'N'};

        char currentDirection = 'N';

        char[] moves = commands.toCharArray();

        char newDirection;

        for(char move : moves) {
            System.out.println(move);
            if (move == 'L') {
                newDirection = turn(antiClockwiseCompass, currentDirection);
                currentDirection = newDirection;
            }
            if (move == 'R') {
                newDirection = turn(clockwiseCompass, currentDirection);
                currentDirection = newDirection;
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
