public class Main {
    protected static final int[][] STUDENTS_MARKS = {
            {8, 9, 5},
            {2, 7, 4},
            {2, 3}};


    public static double findAverageMark(int [] studentMarks){
        int markSum = 0;
        int markAmount = 0;
        for(int mark : studentMarks){
            markSum += mark;
            markAmount += 1;
        }
        return (double) markSum /markAmount;
    }

    public static String classifyAverageMark(double averageMark){
        return (averageMark < 4.5) ? "Negative" : "Positive";
    }

    public static void main(String[] args) {
        int i = 0;
        for(int[] row : STUDENTS_MARKS){
            System.out.println(findAverageMark(STUDENTS_MARKS[i]));
            System.out.println(classifyAverageMark(findAverageMark(STUDENTS_MARKS[i])));
            i++;
        }

    }
}