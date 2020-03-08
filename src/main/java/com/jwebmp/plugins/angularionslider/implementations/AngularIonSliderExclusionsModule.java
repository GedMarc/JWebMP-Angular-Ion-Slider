package com.jwebmp.plugins.angularionslider.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularIonSliderExclusionsModule
		implements IGuiceScanModuleExclusions<AngularIonSliderExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularionslider");
		return strings;
	}
}
