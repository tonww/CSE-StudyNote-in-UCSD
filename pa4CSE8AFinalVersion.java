import java.util.Scanner;
public class pa4CSE8AFinalVersion {
	
	
public static void main(String[] args) {
    	
		boolean[] answerTrueOrFlase = TrueorFalse();
	    boolean[] answerMultipleChoice = multipleChoice();	
		
	    boolean[] finalAnswer = new boolean[10];	
		
		for(int i = 0; i < answerTrueOrFlase.length; i++) {
			finalAnswer[i] = answerTrueOrFlase[i];
		   }
		  
		for (int j = 0; j < answerMultipleChoice.length; j++) {
		    finalAnswer[j+5] = answerMultipleChoice[j];
           }
		
		int correctCount = 0;

		for (int k = 0; k < finalAnswer.length; k++)	{
			
			if (finalAnswer[k] == true) {
				correctCount++;
				int m = k + 1;
				System.out.println("You got question number " + m +" correct!" );
			}
			else {
				int n = k + 1;
			    System.out.println("You got question number " + n +" wrong!" );
			}
		   }
		if (correctCount >= 6) {
		    System.out.println("You score " + correctCount +"/10. Congratulations! You know much about Shakespear!");
		   }
		else {
		    System.out.println("You score " + correctCount +"/10. You need to learn more about Shakespear!");
		   }
		}

      
		public static boolean[] TrueorFalse() {
			
			boolean[] torfAnswers= new boolean[5];
			
			System.out.println("\"green-eyed monster\" means jealousy.");
			
			System.out.println("Enter your answer: True/False");
			Scanner torfAnswer = new Scanner(System.in);
			boolean answerQ1 = torfAnswer.nextBoolean();
			
			if(answerQ1 == true) {
				System.out.println(torfAnswers[0] = true);
				System.out.println("You are right!");
				}
			
			else if(answerQ1 == false) {
				System.out.println(torfAnswers[0] = false);
				System.out.println("You are wrong!");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	} 
		
			
			System.out.println("Polonius is Ophelia's father.");
			
			System.out.println("Enter your answer: True/False");
			boolean answerQ2 = torfAnswer.nextBoolean();
			
			if(answerQ2 == true) {
				System.out.println(torfAnswers[1] = true);
				System.out.println("You are right!");
				}
			
			else if(answerQ2 == false) {
				System.out.println(torfAnswers[1] = false);
				System.out.println("You are wrong!");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	} 
		
		
			System.out.println("Elseneur is in Denmark.");
			
			System.out.println("Enter your answer: True/False");
			boolean answerQ3 = torfAnswer.nextBoolean();
			
			if(answerQ3 == false) {
				System.out.println(torfAnswers[2] = true);
				System.out.println("You are right! Elseneur is in Scotland.");
				}
			
			else if(answerQ3 == true) {
				System.out.println(torfAnswers[2] = false);
				System.out.println("You are wrong! Elseneru is in Scotland.");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	} 
			
			
			System.out.println("The Globe was re-built by the Virgin Queen.");
			
			System.out.println("Enter your answer: True/False");
			boolean answerQ4 = torfAnswer.nextBoolean();
			
			if(answerQ4 == false) {
				System.out.println(torfAnswers[3] = true);
				System.out.println("You are right! The Globe was rebuilt by an American actor.");
				}
			
			else if(answerQ4 == true) {
				System.out.println(torfAnswers[3] = false);
				System.out.println("You are wrong! The Globe was rebuilt by an American actor.");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	} 
		
		
			System.out.println("Benvolio is Romeo's dynamic friend.");
			
			System.out.println("Enter your answer: True/False");
			boolean answerQ5 = torfAnswer.nextBoolean();
			
			if(answerQ5 == false) {
				System.out.println(torfAnswers[4] = true);
				System.out.println("You are right! The Globe was rebuilt by an American actor.");
				}
			
			else if(answerQ5 == true) {
				System.out.println(torfAnswers[4] = false);
				System.out.println("You are wrong! The Globe was rebuilt by an American actor.");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	}  
			
			return torfAnswers;
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
	    		System.out.println(mcAnswers[0] = false);
	    		System.out.println("The correct answer is c");
	    	}
	    	
	    	else if (answerQ6.equals("b") ){
	    		System.out.println(mcAnswers[0] = false);
	    		System.out.println("The correct answer is c");
	     	}
	    	
	    	else if (answerQ6.equals ("c") ){
	    		System.out.println(mcAnswers[0] = true);
	    		System.out.println("You are right!");
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
	     		System.out.println(mcAnswers[1] = false);
	     		System.out.println("The correct answer is b");
	     	}
	     	
	     	else if (answerQ7.equals("b") ){
	     		System.out.println(mcAnswers[1] = true);
	     		System.out.println("You are right!");
	      	}
	     	
	     	else if (answerQ7.equals ("c") ){
	     		System.out.println(mcAnswers[1] = false);
	     		System.out.println("The correct answer is b");
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
	 		System.out.println(mcAnswers[2] = false);
	 		System.out.println("The correct answer is b");
	 	}
	 	
	 	else if (answerQ8.equals("b") ){
	 		System.out.println(mcAnswers[2] = true);
	 		System.out.println("You are right!");
	  	}
	 	
	 	else if (answerQ8.equals ("c") ){
	 		System.out.println(mcAnswers[2] = false);
	 		System.out.println("The correct answer is b");
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
	 		System.out.println(mcAnswers[3] = false);
	 		System.out.println("The correct answer is b");
	 	}
	 	
	 	else if (answerQ9.equals("b") ){
	 		System.out.println(mcAnswers[3] = true);
	 		System.out.println("You are right!");
	  	}
	 	
	 	else if (answerQ9.equals ("c") ){
	 		System.out.println(mcAnswers[3] = false);
	 		System.out.println("The correct answer is b");
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
	 		System.out.println(mcAnswers[4] = false);
	 		System.out.println("The correct answer is c");
	 	}
	 	
	 	else if (answerQ10.equals("b") ){
	 		System.out.println(mcAnswers[4] = false);
	 		System.out.println("The correct answer is c");
	  	}
	 	
	 	else if (answerQ10.equals ("c") ){
	 		System.out.println(mcAnswers[4] = true);
	 		System.out.println("You are right!");
	  	}
	 	else  {
	 		System.out.println("Your answer is invalid!");
	  	}
	 	
	    	return mcAnswers;
	    	
}
  
  
  
  
  
  
}
