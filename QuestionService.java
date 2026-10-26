import java.util.Scanner;

public class QuestionService {
  Question[] questions =new Question[5];
  String selection[] = new String[5];

  public QuestionService()
  {
    questions[0]=new Question(1,"What is the capital of France?","Berlin","Madrid","Paris","Rome","Paris");
    questions[1]=new Question(2,"What is the largest planet in our solar system?","Earth","Jupiter","Mars","Saturn","Jupiter");
    questions[2]=new Question(3,"What is the chemical symbol for gold?","Au","Ag","Fe","Hg","Au");
    questions[3]=new Question(4,"Who wrote the play 'Romeo and Juliet'?","William Shakespeare","Charles Dickens","Jane Austen","Mark Twain","William Shakespeare");
    questions[4]=new Question(5,"What is the smallest prime number?","0","1","2","3","2");

  }

  public void playQuiz() {
    for (int i = 0; i < questions.length; i++) {
      System.out.println("Question No." + questions[i].getId());
      System.out.println(questions[i].getQuestion());
      System.out.println("Options:");
      System.out.println("1. " + questions[i].getOpt1());
      System.out.println("2. " + questions[i].getOpt2());
      System.out.println("3. " + questions[i].getOpt3());
      System.out.println("4. " + questions[i].getOpt4());
      System.out.println();

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your answer (1-4): ");
      selection[i] = sc.nextLine();
      System.out.println("you selected: " + selection[i]);

      String selectedAnswer = "";
        if (selection[i].equals("1")) {
            selectedAnswer = questions[i].getOpt1();
        }
        else if (selection[i].equals("2")) {
            selectedAnswer = questions[i].getOpt2();
        }
        else if (selection[i].equals("3")) {
            selectedAnswer = questions[i].getOpt3();
        }
        else if (selection[i].equals("4")) {
            selectedAnswer = questions[i].getOpt4();
        }


     if (selectedAnswer.equals(questions[i].getAnswer())) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer. The correct answer is: " + questions[i].getAnswer());
        }
        System.out.println();

    }
  }

  public void printScore() {
     int score=0;
     for(int i=0; i<questions.length;i++)
     {
        Question q= questions[i];
        String actualAnswer= q.getAnswer();
        String userSelection= selection[i];
                    if (userSelection.equals("1") &&
                    actualAnswer.equals(q.getOpt1())) {
                score++;
            }
            else if (userSelection.equals("2") &&
                    actualAnswer.equals(q.getOpt2())) {
                score++;
            }
            else if (userSelection.equals("3") &&
                    actualAnswer.equals(q.getOpt3())) {
                score++;
            }
            else if (userSelection.equals("4") &&
                    actualAnswer.equals(q.getOpt4())) {
                score++;
            }

     }

     System.out.println("Your score is: " + score + " out of " + questions.length);
  }
}
