package alexiuscrow.travels.lviv2016.core;

import com.owlike.genson.GensonBuilder;
import com.owlike.genson.ext.jaxrs.GensonJaxRSFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        packages("alexiuscrow.travels.lviv2016.ws");
        register(new GensonJaxRSFeature().use(new GensonBuilder().create()));
    }

}
