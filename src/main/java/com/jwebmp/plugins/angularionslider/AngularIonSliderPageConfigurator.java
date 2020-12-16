/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularionslider;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * Allows for elements to have an auto expand by adding a class
 *
 * @author GedMarc
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Angular Ion Slider",
		pluginDescription = "Watches Angular Values for Ion Slider",
		pluginUniqueName = "jwebswing-angular-auto-focus",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,focus,ui,web ui, framework",
		pluginSubtitle = "Watches Angular Values for Ion Slider",
		pluginSourceUrl = "https://github.com/kashban/ionRangeSlider-Angular-Directive",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-Ion-Slider/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-Ion-Slider",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://www.akveo.com/products.html",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-angular-ion-slider",
		pluginGroupId = "com.jwebmp.plugins.angular",
		pluginArtifactId = "jwebmp-angular-ion-slider",
		pluginModuleName = "com.jwebmp.plugins.angularionslider",
		pluginStatus = PluginStatus.Released
)
@ComponentInformation(name = "Angular Ion Slider Directive",
		description = "Watches Angular Values for Ion Slider",
		url = "https://www.akveo.com/products.html")
public class AngularIonSliderPageConfigurator
		implements IPageConfigurator<AngularIonSliderPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularIonSliderPageConfigurator
	 */
	public AngularIonSliderPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularIonSliderPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularIonSliderPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		JQueryPageConfigurator.setRequired(true);
		AngularPageConfigurator.setRequired(true);
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularIonSliderPageConfigurator.enabled;
	}
}
