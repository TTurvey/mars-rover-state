import java.util.Arrays;

public class Rover {
    public String execute(String commands) {
        char[] compass = {'N', 'E', 'S', 'W'};
        char direction = 'N';

        char[] moves = commands.toCharArray();

        for(char instruction : moves) {
            System.out.println(instruction);
            if (instruction == 'L') {
                direction = compass[CurrantIndexPosition(compass, direction) - 2];
                System.out.println(direction);
            }
            if (instruction == 'R') {
                System.out.println("Before " + direction);
                direction = compass[CurrantIndexPosition(compass, direction) + 1];
                System.out.println("After " + direction);
            }
        }

        return "0:0:" + direction;

    }

    private static int CurrantIndexPosition(char[] compass, char direction) {
        return Arrays.asList(compass).indexOf(direction) + 1;
    }
}
