package ss8_clean_code_refactoring.exersice;

public class TennisGame {
    public static String getScore(int score1, int score2) {
        String result = "";
        if (score1 == score2) {
            samePoint(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            overPoint(score1, score2);
        } else {
            underPoint(score1, score2);
        }
        return result;
    }

    public static String underPoint(int score1, int score2) {
        String result = "";
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = score1;
            } else {
                result = "";
                tempScore = score2;
            }
            switch (tempScore) {
                case 0:
                    result = "Love";
                    break;
                case 1:
                    result = "Fifteen";
                    break;
                case 2:
                    result = "Thirty";
                    break;
                case 3:
                    result = "Forty";
                    break;
            }
        }
        return result;
    }


    public static String samePoint(int score1) {
        String result = "";
        switch (score1) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;
        }
        return result;
    }

    public static String overPoint(int score1, int score2) {
        String result = "";
        int subtraction = score1 - score2;
        if (subtraction == 1) {
            result = "Advantage player1";
        } else if (subtraction == -1) {
            result = "Advantage player2";
        } else if (subtraction >= 2) {
            result = "Win player 1";
        } else {
            result = "Win player 2";
        }
        return result;
    }

}


