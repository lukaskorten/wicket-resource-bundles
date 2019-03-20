package de.korten.wicket.examples.resourcebundles.jsresources;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class SecondJsResourceReference extends JavaScriptResourceReference {

    private static final SecondJsResourceReference INSTANCE = new SecondJsResourceReference();

    private SecondJsResourceReference() {
        super(SecondJsResourceReference.class, "second.js");
    }

    public static SecondJsResourceReference get() {
        return INSTANCE;
    }
}
