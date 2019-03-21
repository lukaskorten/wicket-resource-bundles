package de.korten.wicket.examples.resourcebundles.css;

import org.apache.wicket.request.resource.CssResourceReference;

public class BaseCssResourceReference extends CssResourceReference {

    private static final BaseCssResourceReference INSTANCE = new BaseCssResourceReference();

    private BaseCssResourceReference() {
        super(BaseCssResourceReference.class, "base.css");
    }

    public static BaseCssResourceReference get() {
        return INSTANCE;
    }
}
