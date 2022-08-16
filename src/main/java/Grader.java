public class Grader {


    public int determineLetterGrade (int numberGrade){
        if(numberGrade < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        else if(numberGrade < 60){
            return 1;
        }
        else if(numberGrade < 70){
            return 2;
        }
        else if(numberGrade < 80){
            return 3;
        }
        else if(numberGrade < 90) {
            return 4;
        }
        else {
            return 5;
        }
    }
}
