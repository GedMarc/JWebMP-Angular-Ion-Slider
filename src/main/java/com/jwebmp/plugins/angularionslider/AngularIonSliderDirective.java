package com.jwebmp.plugins.angularionslider;

import com.jwebmp.FileTemplates;
import com.jwebmp.base.angular.directives.AngularDirectiveBase;

/**
 * The Angular Auto Focus Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularIonSliderDirective
		extends AngularDirectiveBase
{

	private static final long serialVersionUID = 1L;

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
		return FileTemplates.getFileTemplate(AngularIonSliderDirective.class, "ionSlider", "ionSlider.min.js")
		                    .toString();
	}
}