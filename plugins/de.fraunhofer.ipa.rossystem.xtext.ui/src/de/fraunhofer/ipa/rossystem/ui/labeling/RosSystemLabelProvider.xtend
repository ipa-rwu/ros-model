/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.rossystem.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for EObjects.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
class RosSystemLabelProvider extends DefaultEObjectLabelProvider {

    @Inject
    new(AdapterFactoryLabelProvider delegate) {
        super(delegate);
    }

    // Labels and icons can be computed like this:

//  def text(Greeting ele) {
//      'A greeting to ' + ele.name
//  }
//
//  def image(Greeting ele) {
//      'Greeting.gif'
//  }
}