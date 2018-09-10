package com.jwebmp.plugins.angularionslider;

import com.jwebmp.core.Page;
import com.jwebmp.plugins.ionrangeslider.IonRangeSliderTypes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngularIonSliderTest
{
	@Test
	void testMe()
	{
		AngularIonSlider<?> slider = new AngularIonSlider<>();
		slider.getOptions()
		      .setStep(5)
		      .setType(IonRangeSliderTypes.Double)
		      .setDualKnobs(true);
		slider.setCurrentValueVariableName("variable.currentValue");
		slider.setMinVariableName("variable.minValue");
		slider.setMaxVariableName("variable.maxValue");
		slider.setDisabledValueVariableName("variable.disabled");
		slider.setRenderIDAttribute(false);
		System.out.println(slider.toString(0));
		assertEquals(
				"<ionslider disabled=\"variable.disabled\" dual-knobs=\"true\" from=\"variable.currentValue\" max=\"variable.maxValue\" min=\"variable.minValue\" step=\"5\" type=\"double\"></ionslider>",
				slider.toString(0));
		Page<?> p = new Page();
		p.getOptions()
		 .setDynamicRender(false);
		p.add(slider);
		String pageOutput = p.toString(0);
		System.out.println(pageOutput);

		assertTrue(pageOutput.contains("jwApp.directive(\"ionslider\""));
		assertTrue(pageOutput.contains("'ngRoute'"));
	}
}
