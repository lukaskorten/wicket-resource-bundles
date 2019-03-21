package de.korten.wicket.examples.resourcebundles.css;

import org.apache.wicket.request.resource.CssResourceReference;

public class PatternCssResourceReference extends CssResourceReference {

    private static final PatternCssResourceReference INSTANCE = new PatternCssResourceReference();

    private PatternCssResourceReference() {
        super(PatternCssResourceReference.class, "pattern.css");
    }

    public static PatternCssResourceReference get() {
        return INSTANCE;
    }
}
