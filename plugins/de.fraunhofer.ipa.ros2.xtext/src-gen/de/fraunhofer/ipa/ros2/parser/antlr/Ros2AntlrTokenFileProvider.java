/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros2.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Ros2AntlrTokenFileProvider implements IAntlrTokenFileProvider {

    @Override
    public InputStream getAntlrTokenFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResourceAsStream("de/fraunhofer/ipa/ros2/parser/antlr/internal/InternalRos2Parser.tokens");
    }
}
