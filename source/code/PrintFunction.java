public class PrintFunction extends Function {

	//Your ide should autogenerate a serial version id

	public PrintFunction(String name) 
	{
		super(name);
	}
	
	@Override
	public boolean function(final PlayerWrapper<?> playerWrapper)
	{
		System.out.println(this.getData());
		return true;
	}
}