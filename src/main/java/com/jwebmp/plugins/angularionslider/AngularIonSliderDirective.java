package com.jwebmp.plugins.angularionslider;

import com.jwebmp.core.FileTemplates;
import com.jwebmp.core.base.angular.directives.AngularDirectiveBase;

/**
 * The Angular Auto Focus Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularIonSliderDirective
		extends AngularDirectiveBase<AngularIonSliderDirective>
{
	/*
	 * Constructs a new AngularIonSliderDirective
	 */
	public AngularIonSliderDirective()
	{
		super("AngularIonSlider");
	}

	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(AngularIonSliderDirective.class, "angularIonSliderBinder", "ionSlider.min.js")
		                    .toString();
	}

	/**
	 * If this page configurator is enabled
	 *
	 * @return if the configuration must run
	 */
	@Override
	public boolean enabled()
	{
		return AngularIonSliderPageConfigurator.isEnabled();
	}
}
