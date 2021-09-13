package Package2;

class Instruction  // super class
{

  void display()  // METHOD OVERIDING 
  {
	  System.out.println("how to play :- \nCards that are face up and showing may be moved from stock pile or the columns to the foundation stacks or to other columns. To move a card to a column, it must be one less in rank and the opposite color." );
	  
	  
  }
}
class play extends Instruction  // subclass 1 (hierarchial inheritance )
{
	
	 void display(int a,int b)  // METHOD overloading
	  {
		  System.out.println("For example, if it was a "+a+" of hearts (red), you could put an " + b + " of spades or clubs onto it. Stacks of cards may be moved from one column to another as long as they maintain the same order (highest to lowest, alternating colors). \nIf you get an empty column, you can start a new column with a King. Any new column must be started with a King (or a stack of cards that starts with a King). To get new cards from the stock pile, you turn three cards at a time face up into the stack\nnext to the stock pile called the waist stack.");
		 
		  
	  }
}
class game extends Instruction   // subclass 2 (single inheritance)
{
	
	void display()  // METHOD overriding
	{
		System.out.println("You can only play the top card off the waist stack. If you run out of stock cards, turn the waist stack over to make a new stock pile and start again,pulling the top three cards off, turning them over, and starting a new waist stack.\n\n");
		
	}
	
}
	
