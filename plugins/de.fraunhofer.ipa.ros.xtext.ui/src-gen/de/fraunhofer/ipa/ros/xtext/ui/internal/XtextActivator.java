/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros.xtext.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fraunhofer.ipa.ros.BasicsRuntimeModule;
import de.fraunhofer.ipa.ros.RosRuntimeModule;
import de.fraunhofer.ipa.ros.ui.BasicsUiModule;
import de.fraunhofer.ipa.ros.ui.RosUiModule;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass.
 */
public class XtextActivator extends AbstractUIPlugin {

    public static final String PLUGIN_ID = "de.fraunhofer.ipa.ros.xtext.ui";
    public static final String DE_FRAUNHOFER_IPA_ROS_ROS = "de.fraunhofer.ipa.ros.Ros";
    public static final String DE_FRAUNHOFER_IPA_ROS_BASICS = "de.fraunhofer.ipa.ros.Basics";

    private static final Logger logger = Logger.getLogger(XtextActivator.class);

    private static XtextActivator INSTANCE;

    private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        INSTANCE = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        injectors.clear();
        INSTANCE = null;
        super.stop(context);
    }

    public static XtextActivator getInstance() {
        return INSTANCE;
    }

    public Injector getInjector(String language) {
        synchronized (injectors) {
            Injector injector = injectors.get(language);
            if (injector == null) {
                injectors.put(language, injector = createInjector(language));
            }
            return injector;
        }
    }

    protected Injector createInjector(String language) {
        try {
            com.google.inject.Module runtimeModule = getRuntimeModule(language);
            com.google.inject.Module sharedStateModule = getSharedStateModule();
            com.google.inject.Module uiModule = getUiModule(language);
            com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
            return Guice.createInjector(mergedModule);
        } catch (Exception e) {
            logger.error("Failed to create injector for " + language);
            logger.error(e.getMessage(), e);
            throw new RuntimeException("Failed to create injector for " + language, e);
        }
    }

    protected com.google.inject.Module getRuntimeModule(String grammar) {
        if (DE_FRAUNHOFER_IPA_ROS_ROS.equals(grammar)) {
            return new RosRuntimeModule();
        }
        if (DE_FRAUNHOFER_IPA_ROS_BASICS.equals(grammar)) {
            return new BasicsRuntimeModule();
        }
        throw new IllegalArgumentException(grammar);
    }

    protected com.google.inject.Module getUiModule(String grammar) {
        if (DE_FRAUNHOFER_IPA_ROS_ROS.equals(grammar)) {
            return new RosUiModule(this);
        }
        if (DE_FRAUNHOFER_IPA_ROS_BASICS.equals(grammar)) {
            return new BasicsUiModule(this);
        }
        throw new IllegalArgumentException(grammar);
    }

    protected com.google.inject.Module getSharedStateModule() {
        return new SharedStateModule();
    }


}
