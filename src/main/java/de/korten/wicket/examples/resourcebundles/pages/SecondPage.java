package de.korten.wicket.examples.resourcebundles.pages;

import de.korten.wicket.examples.resourcebundles.css.BoxCssResourceReference;
import de.korten.wicket.examples.resourcebundles.css.PatternCssResourceReference;
import de.korten.wicket.examples.resourcebundles.js.FirstJsResourceReference;
import de.korten.wicket.examples.resourcebundles.js.SecondJsResourceReference;
import org.apache.wicket.markup.head.CssReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptReferenceHeaderItem;
import org.apache.wicket.markup.html.basic.Label;
import org.wicketstuff.annotation.mount.MountPath;

@MountPath("/second")
public class SecondPage extends BasePage {

    public SecondPage() {
        add(new Label("label", "Second Page"));
    }


    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);
        response.render(CssReferenceHeaderItem.forReference(BoxCssResourceReference.get()));
        response.render(CssReferenceHeaderItem.forReference(PatternCssResourceReference.get()));
        response.render(JavaScriptReferenceHeaderItem.forReference(FirstJsResourceReference.get()));
        response.render(JavaScriptReferenceHeaderItem.forReference(SecondJsResourceReference.get()));
    }
}
