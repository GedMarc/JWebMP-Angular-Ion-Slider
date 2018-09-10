import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularionslider.AngularIonSliderDirective;
import com.jwebmp.plugins.angularionslider.AngularIonSliderPageConfigurator;

module com.jwebmp.plugins.angularionslider {
	exports com.jwebmp.plugins.angularionslider;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.plugins.ionrangeslider;

	requires com.google.common;

	provides IPageConfigurator with AngularIonSliderPageConfigurator;
	provides IAngularDirective with AngularIonSliderDirective;

}
