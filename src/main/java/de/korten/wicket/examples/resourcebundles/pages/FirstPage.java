package de.korten.wicket.examples.resourcebundles.pages;

import de.korten.wicket.examples.resourcebundles.jsresources.FirstJsResourceReference;
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
        response.render(JavaScriptReferenceHeaderItem.forReference(FirstJsResourceReference.get()));
    }
}
