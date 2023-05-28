import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Interpreter {

	
	
	
	
	public static void  codeParser (String filelocation){		  
          //hello
		   Queue<Instruction> queue= new LinkedList<>();
		   int numofInstruction=0;
		   
		   File file = new File(filelocation);
		   int PC_begin =Kernel.getPc();
           Kernel.setPc(Kernel.getPc()+4);		 
           Scanner scanner;
        
	        try {
	            scanner = new Scanner(file);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            return ; // Handle the exception or terminate the program
	        }
	        while (scanner.hasNextLine())
	        {   Instruction inst = new Instruction(scanner.nextLine());
	        	   
	        	queue.add(inst);
	        	numofInstruction++;

	        	
	        	
	        }
        	if (numofInstruction+4 <= (Kernel.getMEM().length-Kernel.getPc()))
        	{
        		while (!queue.isEmpty())
        		{
        		Kernel.getMEM()[Kernel.getPc()]=queue.remove();
        		Kernel.setPc(Kernel.getPc()+1);
        		}
        	}
        	else 
        	{
        		// block process 
        	}
        	
	        
			   PCB PCB=new PCB(Kernel.getProcessID(),"Ready",(PC_begin+4)+"-"+(Kernel.getPc()-1));
			   Kernel.setProcessID(Kernel.getProcessID()+1);
			   Process p= new Process(PCB);			  
			   Kernel.getReady().add(p);
			   Kernel.getMEM()[PC_begin]=PCB;

			   
          

	}
	
	
}
