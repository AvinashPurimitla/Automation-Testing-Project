

public class CommandLineArgument {
	// passing arguments  from command line arguments and
	//how to run java program  using command line.
	public static void main(String[] args) {
		if(args.length>0) {
			
			for(String word:args) {
				System.out.println(word);
			/*compile file
				command: javac CommandLineArgument.java 
				now pass an arguments from command line
				 command :java commandlineArguments avinash akash ramesh suresh ramesh
			      output:
				  avinash
				  akash
				  ramesh
				  suresh
				  ramesh
				 how to comments of code
				  single liner command== ctrl+/   and uncomment ctrl+/
				  multi line comments==ctrl+shift+/  and   uncomments ctrl+shift+\  */
				 
				 
			}
			
		}
	}

}
