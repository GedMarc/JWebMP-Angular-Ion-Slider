import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularionslider.AngularIonSliderDirective;
import com.jwebmp.plugins.angularionslider.AngularIonSliderPageConfigurator;
import com.jwebmp.plugins.angularionslider.implementations.AngularIonSliderExclusionsModule;

module com.jwebmp.plugins.angularionslider {
	exports com.jwebmp.plugins.angularionslider;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.plugins.ionrangeslider;

	requires com.google.common;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides IPageConfigurator with AngularIonSliderPageConfigurator;
	provides IAngularDirective with AngularIonSliderDirective;

	provides IGuiceScanJarExclusions with AngularIonSliderExclusionsModule;
	provides IGuiceScanModuleExclusions with AngularIonSliderExclusionsModule;

}
