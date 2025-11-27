package firstpackage;

public class LogicalOperators {
    public static void main(String[] args) {
        // and : &&
        // or : ||
        boolean wantToWatchAMovie = false, haveTime = false, haveMoney = false;
        boolean canWatchMovieInCinema = wantToWatchAMovie && haveTime && haveMoney;
        System.out.println("we watch a movie in cinema: " + canWatchMovieInCinema);

        boolean iEnjoyLearning = false, iEnjoyProblemSolving = false;
        boolean iCanLearnJava = iEnjoyLearning || iEnjoyProblemSolving;
        System.out.println("I can learn java: " + iCanLearnJava);

        // AND -> if all statements are true ONLY then the result is True
        // OR  -> if all statements are false ONLY then the result is False


    }
}
