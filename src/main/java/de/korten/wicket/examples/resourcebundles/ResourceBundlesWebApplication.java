package de.korten.wicket.examples.resourcebundles;

import de.korten.wicket.examples.resourcebundles.pages.FirstPage;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.wicketstuff.annotation.scan.AnnotatedMountScanner;

@Component
public class ResourceBundlesWebApplication extends WebApplication {

    private final ApplicationContext applicationContext;

    @Autowired
    public ResourceBundlesWebApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return FirstPage.class;
    }

    @Override
    protected void init() {
        super.init();

        initComponentInjector();
        initPageMounting();
        initMarkupSetting();
        initDebugSettings();
    }

    private void initDebugSettings() {
        getDebugSettings().setAjaxDebugModeEnabled(false);
    }

    private void initMarkupSetting() {
        getMarkupSettings().setStripWicketTags(true);
    }

    private void initComponentInjector() {
        getComponentInstantiationListeners().add(new SpringComponentInjector(this, applicationContext));
    }

    private void initPageMounting() {
        AnnotatedMountScanner mountScanner = new AnnotatedMountScanner();
        mountScanner.scanPackage("de.korten.wicket.examples.resourcebundles").mount(this);
    }
}
