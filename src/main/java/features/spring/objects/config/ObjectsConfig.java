package features.spring.objects.config;

import features.spring.feature.ListInfo;
import features.spring.feature.ListInfoElementsImpl;
import features.spring.feature.ListInfoLengthImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class ObjectsConfig {

    @Order(1)
    @Bean
    ListInfo<String> getListLength() {
        return new ListInfoLengthImpl<String>();
    }

    @Order(1)
    @Bean
    ListInfo<String> getListElements() {
        return new ListInfoElementsImpl<String>();
    }
}
