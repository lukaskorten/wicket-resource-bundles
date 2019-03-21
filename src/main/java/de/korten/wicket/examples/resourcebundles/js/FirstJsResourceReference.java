package de.korten.wicket.examples.resourcebundles.js;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class FirstJsResourceReference extends JavaScriptResourceReference {

    private static final FirstJsResourceReference INSTANCE = new FirstJsResourceReference();

    private FirstJsResourceReference() {
        super(FirstJsResourceReference.class, "first.js");
    }

    public static FirstJsResourceReference get() {
        return INSTANCE;
    }
}
