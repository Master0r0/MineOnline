package gg.codie.mineonline;

import gg.codie.mineonline.discord.DiscordPresence;
import gg.codie.mineonline.gui.MenuManager;
import gg.codie.mineonline.patches.LWJGLDisplayPatch;
import net.arikia.dev.drpc.DiscordRPC;

public class MineOnline {
    public static void main(String[] args) throws Exception{
        LibraryManager.extractLibraries();
        LibraryManager.updateClasspath();
        LibraryManager.updateNativesPath();

        LWJGLDisplayPatch.hijackLWJGLThreadPatch();

        System.setProperty("http.proxyHost", "0.0.0.0");
        System.setProperty("http.proxyPort", "" + args[0]);

        MenuManager.main(args);
    }
}
