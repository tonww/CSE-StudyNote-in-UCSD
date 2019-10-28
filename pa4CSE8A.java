import java.util.Scanner;
public class pa4CSE8A {

	public static void main(String[] args) {
    	
	  
    boolean[] answer = multipleChoice();	
	
	for (int i = 0; i < answer.length; i++) {
		
    System.out.println(answer[i]);
      }
	
	}


    public static boolean[] multipleChoice() {
    	
        System.out.println("Who is \"the prince's jester\"?");
        System.out.println("a. Hamlet");
        System.out.println("b. Mercutio");
        System.out.println("c. Benedick");
    	
    	System.out.println("Enter your answer: ");
    	Scanner answer = new Scanner(System.in);
    	String answerQ6 = answer.next();
    	
        
    	
    	boolean[] mcAnswers= new boolean[5];
    	
    	if (answerQ6.equals ("a") ){
    		mcAnswers[0] = false;	
    	}
    	
    	else if (answerQ6.equals("b") ){
    		mcAnswers[0] = false;
     	}
    	
    	else if (answerQ6.equals ("c") ){
    		mcAnswers[0] = true;
     	}
    	else  {
    		System.out.println("Your answer is invalid!");
     	}
    	
    	 System.out.println("Traitor and Brutus's \"friend\"");
         System.out.println("a. Iago");
         System.out.println("b. Cassius");
         System.out.println("c. Benvolio");
     	
     	System.out.println("Enter your answer: ");
     	
     	
     	String answerQ7 = answer.next();
     	
     	if (answerQ7.equals ("a") ){
     		mcAnswers[1] = false;	
     	}
     	
     	else if (answerQ7.equals("b") ){
     		mcAnswers[1] = true;
      	}
     	
     	else if (answerQ7.equals ("c") ){
     		mcAnswers[1] = false;
      	}
     	else  {
     		System.out.println("Your answer is invalid!");
     	}
    	
   	 System.out.println("My name is Juliet ...");
     System.out.println("a. Welles");
     System.out.println("b. Capulet");
     System.out.println("c. Montague");
 	
 	System.out.println("Enter your answer: ");
 	
 	
 	String answerQ8 = answer.next();
 	
 	if (answerQ8.equals ("a") ){
 		mcAnswers[2] = false;	
 	}
 	
 	else if (answerQ8.equals("b") ){
 		mcAnswers[2] = true;
  	}
 	
 	else if (answerQ8.equals ("c") ){
 		mcAnswers[2] = false;
  	}
 	else  {
 		System.out.println("Your answer is invalid!");
  	}	
    	
	 System.out.println("Who doubted Will's being Will?");
     System.out.println("a. Francis Bacon");
     System.out.println("b. Mark Twain");
     System.out.println("c. Christopher Marlowe");
 	
 	System.out.println("Enter your answer: ");
 	
 	
 	String answerQ9 = answer.next();
 	
 	if (answerQ9.equals ("a") ){
 		mcAnswers[3] = false;	
 	}
 	
 	else if (answerQ9.equals("b") ){
 		mcAnswers[3] = true;
  	}
 	
 	else if (answerQ9.equals ("c") ){
 		mcAnswers[3] = false;
  	}
 	else  {
 		System.out.println("Your answer is invalid!");
 	}
 	
 	 System.out.println("Macbeth is ...");
     System.out.println("a. Irish");
     System.out.println("b. Welles");
     System.out.println("c. Scottish");
 	
 	System.out.println("Enter your answer: ");
 	
 	     
	String answerQ10 = answer.next();
 	
 	if (answerQ10.equals ("a") ){
 		mcAnswers[4] = false;	
 	}
 	
 	else if (answerQ10.equals("b") ){
 		mcAnswers[4] = false;
  	}
 	
 	else if (answerQ10.equals ("c") ){
 		mcAnswers[4] = true;
  	}
 	else  {
 		System.out.println("Your answer is invalid!");
  	}
 	
    	return mcAnswers;
    	
    }
    
    
    
}