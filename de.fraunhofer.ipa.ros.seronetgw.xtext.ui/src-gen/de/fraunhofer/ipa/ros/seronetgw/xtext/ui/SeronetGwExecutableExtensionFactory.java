/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.seronetgw.xtext.ui;

import com.google.inject.Injector;
import de.fraunhofer.ipa.ros.seronetgw.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SeronetGwExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtextActivator.getInstance().getInjector(XtextActivator.DE_FRAUNHOFER_IPA_ROS_SERONETGW_XTEXT_SERONETGW);
	}
	
}
