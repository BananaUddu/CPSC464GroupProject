public class CommandNode {
  public String request;
	public double length;
	CommandNode nextCommand;
	CommandNode classptr;
	CommandNode currentptr;
	
	public CommandNode(String request, double length) //constructor
	{
		this.request = request;
		this.length = length;
	}
	
	public void print()
	{
		System.out.println("This Works: " + request + "and " + length);
	}
	
	public String toString()
	{
		return request;
	}
}
public class Command {
  public CommandNode beginNode;
	
	Command()
	{
		beginNode = null;
		beginNode.classptr = null;
		beginNode.currentptr = null;
	}
	
	public void clearCommand()
	{
		CommandNode length = beginNode.size();
		for (int i = 0; i < size; i++) {
			length.remove(i);
	}
	
	public void addEntry(String request, int length)
	{
		CommandNode newNode = new CommandNode(request, length);
		newNode.nextCommand = beginNode;
		beginNode = newNode;
	}
	
	public int SendLength(int length)
	{
		return length;
	}
	
	public void print()
	{
		CommandNode commands = beginNode;
		while(commands != null)
		{
			commands.print();
			System.out.println("Next Node works: " + commands.nextCommand);
			commands = commands.nextCommand;
			System.out.println();
		}
	}
}
