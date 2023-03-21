/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.rossystem;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fraunhofer.ipa.ros.BasicsStandaloneSetup;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class RosSystemStandaloneSetupGenerated implements ISetup {

    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        BasicsStandaloneSetup.doSetup();

        Injector injector = createInjector();
        register(injector);
        return injector;
    }

    public Injector createInjector() {
        return Guice.createInjector(new RosSystemRuntimeModule());
    }

    public void register(Injector injector) {
        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rossystem", resourceFactory);
        IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("rossystem", serviceProvider);
    }
}
