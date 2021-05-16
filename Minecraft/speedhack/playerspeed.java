public final class SpeedHackHack extends Hack implements UpdateListener
{
	public ()
	{
		super("PlayerSpeed",
			"Allows you to bypass the standard Minecraft player speed.\n\n"
				+ "\u00a76\u00a7lWARNING:\u00a7r Patched in NoCheat+ version 3.13.2.\n"
				+ "Will only bypass older versions of the NoCheat+ plgin.\n"
				+ "Type \u00a7l/ncp version\u00a7r to check a server's NoCheat+ plugin version.\n"
				+ "This is currently indev. Do not download until ready");
		setCategory(Category.MOVEMENT);
	}
	
	@Override
	public void onEnable()
	{
