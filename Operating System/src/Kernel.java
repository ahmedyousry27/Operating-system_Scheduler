import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kernel {
	
	private static int  ProcessID;
	private static Memory_Element [] MEM;
    static int pc;
	private static Queue <Process> Ready;
    private static  Process RunningProcess;
    
    public Kernel() {
    	
    	this.ProcessID = 0;
    	this.MEM = new Memory_Element [40]; 
    	this.pc = 0;
    	this.Ready  = new LinkedList<>();
    	this.RunningProcess = null;
    }

    
    
		public static int getProcessID() {
		return ProcessID;
	}



	public static void setProcessID(int processID) {
		ProcessID = processID;
	}



	public static Memory_Element[] getMEM() {
		return MEM;
	}



	public static void setMEM(Memory_Element[] mEM) {
		MEM = mEM;
	}



	public static int getPc() {
		return pc;
	}



	public static int setPc(int pc) {
		return Kernel.pc = pc;
	}



	public static Queue<Process> getReady() {
		return Ready;
	}



	public static void setReady(Queue<Process> ready) {
		Ready = ready;
	}



	public static Process getRunningProcess() {
		return RunningProcess;
	}



	public static void setRunningProcess(Process runningProcess) {
		RunningProcess = runningProcess;
	}



		public static void decode (String i) throws FileNotFoundException{
			
			
		
	}
//	public static void execute (int begin,int end)
//	{
//		
//		int timer =2;
//		while (timer-->0)
//		{
//			String i = (String) MEM[0];
//		//	decode(i);
//			
//					
//		}
//				
//	}



	
	

}
