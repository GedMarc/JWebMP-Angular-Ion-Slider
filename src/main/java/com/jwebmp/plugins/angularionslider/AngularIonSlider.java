package com.jwebmp.plugins.angularionslider;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.ionrangeslider.IonRangeSliderOptions;

import javax.validation.constraints.NotNull;

/**
 * An angular data bound ion range slider
 *
 * @param <J>
 */
@SuppressWarnings("MissingClassJavaDoc")
public class AngularIonSlider<J extends AngularIonSlider<J>>
		extends DivSimple<J>
{
	/**
	 * The options object to use
	 */
	private IonRangeSliderOptions<?> options;

	/**
	 * The minimum variable name
	 */
	private String minVariableName;
	/**
	 * The maximum value variable name
	 */
	private String maxVariableName;
	/**
	 * The current value variable name
	 */
	private String currentValueVariableName;
	/**
	 * The disabled value variable name
	 */
	private String disabledValueVariableName;

	/**
	 * The angular range slider bound to data variables
	 */
	public AngularIonSlider()
	{
		setTag("ionslider");
	}

	@Override
	public void preConfigure()
	{
		getAttributes().putAll(getOptions().toAttributes());
		if (!Strings.isNullOrEmpty(getCurrentValueVariableName()))
		{
			addAttribute("from", getCurrentValueVariableName());
		}
		if (!Strings.isNullOrEmpty(getDisabledValueVariableName()))
		{
			addAttribute("disabled", getDisabledValueVariableName());
		}
		if (!Strings.isNullOrEmpty(getMaxVariableName()))
		{
			addAttribute("max", getMaxVariableName());
		}
		if (!Strings.isNullOrEmpty(getMinVariableName()))
		{
			addAttribute("min", getMinVariableName());
		}
		super.preConfigure();
	}

	/**
	 * The following options take effect
	 * <p>
	 * min: '=',
	 * max: '=',
	 * type: '@',
	 * prefix: '@',
	 * maxPostfix: '@',
	 * prettify: '@',
	 * grid: '@',
	 * gridMargin: '@',
	 * postfix: '@',
	 * step: '@',
	 * hideMinMax: '@',
	 * hideFromTo: '@',
	 * from: '=',
	 * disable: '=',
	 *
	 * @return this object
	 *
	 * @see com.jwebmp.core.base.ComponentFeatureBase#getOptions()
	 */
	@Override
	public IonRangeSliderOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new IonRangeSliderOptions<>();
		}
		return options;
	}

	/**
	 * min: '=',
	 * max: '=',
	 * type: '@',
	 * prefix: '@',
	 * maxPostfix: '@',
	 * prettify: '@',
	 * grid: '@',
	 * gridMargin: '@',
	 * postfix: '@',
	 * step: '@',
	 * hideMinMax: '@',
	 * hideFromTo: '@',
	 * from: '=',
	 * disable: '=',
	 *
	 * @param options
	 * 		the optoins
	 *
	 * @return This object
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOptions(IonRangeSliderOptions<?> options)
	{
		this.options = options;
		return (J) this;
	}

	public String getCurrentValueVariableName()
	{
		return currentValueVariableName;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setCurrentValueVariableName(String currentValueVariableName)
	{
		this.currentValueVariableName = currentValueVariableName;
		return (J) this;
	}

	public String getDisabledValueVariableName()
	{
		return disabledValueVariableName;
	}

	public String getMaxVariableName()
	{
		return maxVariableName;
	}

	public String getMinVariableName()
	{
		return minVariableName;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setMinVariableName(String minVariableName)
	{
		this.minVariableName = minVariableName;
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setMaxVariableName(String maxVariableName)
	{
		this.maxVariableName = maxVariableName;
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabledValueVariableName(String disabledValueVariableName)
	{
		this.disabledValueVariableName = disabledValueVariableName;
		return (J) this;
	}
}
