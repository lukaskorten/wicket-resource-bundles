package de.korten.wicket.examples.resourcebundles.pages;

import de.korten.wicket.examples.resourcebundles.css.BoxCssResourceReference;
import de.korten.wicket.examples.resourcebundles.js.FirstJsResourceReference;
import org.apache.wicket.markup.head.CssReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptReferenceHeaderItem;
import org.apache.wicket.markup.html.basic.Label;
import org.wicketstuff.annotation.mount.MountPath;

/**
 * The home page of the "hello-world"-application.
 */
@MountPath("/first")
public class FirstPage extends BasePage {

    public FirstPage() {
        add(new Label("label", "First Page"));
    }

    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);
        response.render(CssReferenceHeaderItem.forReference(BoxCssResourceReference.get()));
        response.render(JavaScriptReferenceHeaderItem.forReference(FirstJsResourceReference.get()));
    }

}
