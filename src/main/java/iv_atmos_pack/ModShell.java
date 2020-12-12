package iv_atmos_pack;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * This class is just an empty shell to force Forge
 * to treat this pack as a mod. It serves no purpose other
 * than that. Being treated as a mod allows recipes to be
 * loaded.
 */
@Mod.EventBusSubscriber
@Mod(modid=ModShell.MODID, name=ModShell.MODNAME, version=ModShell.MODVER, dependencies=ModShell.DEPS, acceptedMinecraftVersions=ModShell.MCVERS)
public class ModShell{
	//The ID for your pack.  Must be unique to every mod and pack in the world!
	public static final String MODID="iv_atmos_pack";
	//Short title for your pack.
	public static final String MODNAME="ATMOS SciFi Pack";
	//Pack version.  May be linked to from other packs to force specific versions.  Otherwise unused.
	public static final String MODVER="0.1.0";
	//Mods/packs and the versions needed to run this pack.  Put whatever you want, but always leave MTS in here to ensure players have it loaded.
	public static final String DEPS="required-after:mts@[19.0.0,);";
	//What MC versions this pack supports.  If you're using an older ModShell file and older JSON you can support 1.10.2-1.12.2.
	public static final String MCVERS="[1.12.2,]";
	
	public ModShell(){
		
	}
}