package de.korten.wicket.examples.resourcebundles.pages;

import de.korten.wicket.examples.resourcebundles.jsresources.FirstJsResourceReference;
import de.korten.wicket.examples.resourcebundles.jsresources.SecondJsResourceReference;
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
        response.render(JavaScriptReferenceHeaderItem.forReference(FirstJsResourceReference.get()));
        response.render(JavaScriptReferenceHeaderItem.forReference(SecondJsResourceReference.get()));
    }
}
