/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.ros1.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Ros1AntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/fraunhofer/ipa/ros1/parser/antlr/internal/InternalRos1Parser.tokens");
	}
}