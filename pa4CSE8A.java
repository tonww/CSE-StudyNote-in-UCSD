import java.util.Scanner;

public class pa4CSE8A {
	public static void main(String[] args) {
    	
		boolean[] answer0 = TrueorFalse();
	    boolean[] answer = multipleChoice();	
		
		for (int i = 0; i < answer.length; i++) {
			
		System.out.println(answer0[i]);
	    System.out.println(answer[i]);
	      }
		
		}
		public static boolean[] TrueorFalse() {
			
			boolean[] TorFAnswers= new boolean[5];
			
			System.out.println("\"green-eyed monster\" means jealousy.");
			
			System.out.println("Enter your answer: True/False");
			Scanner answer0 = new Scanner(System.in);
			String answerQ1 = answer0.next();
			
			if(answerQ1.equals ("True")) {
				System.out.println(TorFAnswers[0] = true);
				System.out.println("You are right!");
				}
			
			else if(answerQ1.equals("False")) {
				System.out.println(TorFAnswers[0] = false);
				System.out.println("You are wrong!");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	} 
		
			
			System.out.println("Polonius is Ophelia's father.");
			
			System.out.println("Enter your answer: True/False");
			String answerQ2 = answer0.next();
			
			if(answerQ2.equals ("True")) {
				System.out.println(TorFAnswers[1] = true);
				System.out.println("You are right!");
				}
			
			else if(answerQ2.equals("False")) {
				System.out.println(TorFAnswers[1] = false);
				System.out.println("You are wrong!");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	} 
		
		
			System.out.println("Elseneur is in Denmark.");
			
			System.out.println("Enter your answer: True/False");
			String answerQ3 = answer0.next();
			
			if(answerQ3.equals ("False")) {
				System.out.println(TorFAnswers[2] = true);
				System.out.println("You are right! Elseneur is in Scotland.");
				}
			
			else if(answerQ3.equals("True")) {
				System.out.println(TorFAnswers[2] = false);
				System.out.println("You are wrong! Elseneru is in Scotland.");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	} 
			
			
			System.out.println("The Globe was re-built by the Virgin Queen.");
			
			System.out.println("Enter your answer: True/False");
			String answerQ4 = answer0.next();
			
			if(answerQ4.equals ("False")) {
				System.out.println(TorFAnswers[3] = true);
				System.out.println("You are right! The Globe was rebuilt by an American actor.");
				}
			
			else if(answerQ4.equals("True")) {
				System.out.println(TorFAnswers[3] = false);
				System.out.println("You are wrong! The Globe was rebuilt by an American actor.");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	} 
		
		
			System.out.println("Benvolio is Romeo's dynamic friend.");
			
			System.out.println("Enter your answer: True/False");
			String answerQ5 = answer0.next();
			
			if(answerQ5.equals ("False")) {
				System.out.println(TorFAnswers[4] = true);
				System.out.println("You are right! The Globe was rebuilt by an American actor.");
				}
			
			else if(answerQ5.equals("True")) {
				System.out.println(TorFAnswers[4] = false);
				System.out.println("You are wrong! The Globe was rebuilt by an American actor.");
			}
			else  {
		 		System.out.println("Your answer is invalid!");
		 	} 
			
			return TorFAnswers;
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