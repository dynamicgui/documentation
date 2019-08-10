public class AddPermissionFunction extends Function {

	private static final long serialVersionUID = 6578996849784218130L;
	
	public AddPermissionFunction(String name) 
	{
		super(name);
	}
	
	@Override
	public boolean function(final PlayerWrapper<?> playerWrapper)
	{
		return playerWrapper.addPermission(this.getData());
	}
}