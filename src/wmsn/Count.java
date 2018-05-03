package wmsn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Count {
	
	static Random rand = new Random();
	public static int NodesCount = 0;
	public static double EnergyConsumed = 0;
	public static Queue<value> NodesEnergy=new LinkedList<value>();
	

	public static double Delay = 0;
	public static int[][] NodesAndDelay = new int[10000][2];
	
	public static double cost = 0; 
	public static int[][] NodesAndCost = new int[10000][2];
	
	public static void increaseNodesCount()
	{
		
		NodesCount++;
		EnergyConsumed++;
		
		double  n = rand.nextInt(10) + 1;
		
		Delay = Delay + n/10;
		Delay = Delay + n/100;
		
		EnergyConsumed++;
		
		EnergyConsumed = EnergyConsumed + n/10;
		EnergyConsumed = EnergyConsumed + n/100 + Delay/100;
		if(NodesCount%100 == 0)
		{
			value v = new value();
			v.firstValue = EnergyConsumed;
			v.secondValue = Delay;
			NodesEnergy.add(v);
		}
	}
	
	public static void increaseEnergy()
	{
		EnergyConsumed++;
		double  n = rand.nextInt(10) + 1;
		n/=10;
		EnergyConsumed = EnergyConsumed + n;
		 
			value v = new value();
			v.firstValue = NodesCount;
			v.secondValue = EnergyConsumed;
			NodesEnergy.add(v);
		
	}
	
	public static void printQueueNodesEnergy()
	{
		for(value item : NodesEnergy){
		    item.print();
		}
	}
	
	
	
}
