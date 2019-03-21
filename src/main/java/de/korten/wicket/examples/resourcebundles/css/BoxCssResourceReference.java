package de.korten.wicket.examples.resourcebundles.css;

import org.apache.wicket.request.resource.CssResourceReference;

public class BoxCssResourceReference extends CssResourceReference {

    private static final BoxCssResourceReference INSTANCE = new BoxCssResourceReference();

    private BoxCssResourceReference() {
        super(BoxCssResourceReference.class, "box.css");
    }

    public static BoxCssResourceReference get() {
        return INSTANCE;
    }
}
