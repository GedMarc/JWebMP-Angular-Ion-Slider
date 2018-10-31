package com.jwebmp.plugins.angularionslider;

import com.jwebmp.core.FileTemplates;
import com.jwebmp.core.base.angular.directives.AngularDirectiveBase;
import com.jwebmp.core.base.angular.services.IAngularDirective;

/**
 * The Angular Auto Focus Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularIonSliderDirective
		extends AngularDirectiveBase
		implements IAngularDirective<AngularIonSliderDirective>
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
}
