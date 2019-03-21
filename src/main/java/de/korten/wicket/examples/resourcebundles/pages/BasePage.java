package de.korten.wicket.examples.resourcebundles.pages;

import de.korten.wicket.examples.resourcebundles.css.BaseCssResourceReference;
import org.apache.wicket.markup.head.CssReferenceHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;

public class BasePage extends WebPage {

    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);
        response.render(CssReferenceHeaderItem.forReference(BaseCssResourceReference.get()));
    }
}
