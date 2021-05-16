public final class PlayerSpeed extends Hack implements UpdateListener
{
	public ()
	{
		super("PlayerSpeed",
			"Allows you to bypass the standard Minecraft player speed.\n\n"
				+ "Type \u00a7l/ncp version\u00a7r to check a server's NoCheat+ plugin version.\n\n"
				+ "This is currently indev");
		setCategory(Category.MOVEMENT);
	}
	
	@Override
	public void onEnable()
	{
