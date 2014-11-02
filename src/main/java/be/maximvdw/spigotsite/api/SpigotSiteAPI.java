package be.maximvdw.spigotsite.api;

import be.maximvdw.spigotsite.api.resource.ResourceManager;
import be.maximvdw.spigotsite.api.user.UserManager;

public interface SpigotSiteAPI {
	/**
	 * Get spigot user manager
	 * 
	 * @return {@link be.maximvdw.spigotsite.api.user.UserManager}
	 */
	public UserManager getUserManager();

	/**
	 * Get spigot resource manager
	 * 
	 * @return {@link be.maximvdw.spigotsite.api.resource.ResourceManager}
	 */
	public ResourceManager getResourceManager();
}
