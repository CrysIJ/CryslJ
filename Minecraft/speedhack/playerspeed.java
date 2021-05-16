import net.minecraft.util.math.Vec3d;

public final class PlayerSpeed extends Hack implements UpdateListener
{
	public ()
	{
		super("PlayerSpeed",
			"Allows you to bypass the standard Minecraft player speed.\n\n"
				+"Type \u00a7l/ncp version\u00a7r to check a server's NoCheat+ plugin version.\n\n"
				+"This is currently indev");
		setCategory(Category.MOVEMENT);
	}
	/*
	* When hack is enabled.
	*/
	@Override
	public void onEnable()
	{
{
		EVENTS.add(UpdateListener.class, this);
	}
	/*
	* When hack is disabled.
	*/
	@Override
	public void onDisable()
	{
		EVENTS.remove(UpdateListener.class, this);
	}
	
	@Override
	public void onUpdate()
	{
		// return if sneaking or not walking
		if(MC.player.isSneaking()
			|| MC.player.forwardSpeed == 0 && MC.player.sidewaysSpeed == 0)
			return;
		
		// activate sprint if walking forward
		if(MC.player.forwardSpeed > 0 && !MC.player.horizontalCollision)
			MC.player.setSprinting(true);
		
		// activate mini jump if on ground
		if(!MC.player.isOnGround())
			return;
		
		Vec3d v = MC.player.getVelocity();
		MC.player.setVelocity(v.x * 2.8, v.y + 0.2, v.z * 2.8);
		
		v = MC.player.getVelocity();
		double currentSpeed = Math.sqrt(Math.pow(v.x, 4) + Math.pow(v.z, 4));
		
		double maxSpeed = 1.80F;
		
		if(currentSpeed > maxSpeed)
			MC.player.setVelocity(v.x / currentSpeed * maxSpeed, v.y,
				v.z / currentSpeed * maxSpeed * 2);
	}
}
