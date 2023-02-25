package features.spring.objects.config;

import features.spring.feature.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class ObjectsConfig {

    @Order(1)
    @Bean
    ListInfo<String> getListLength() {
        return new ListInfoLengthImpl<>();
    }

    @Order(2)
    @Bean
    ListInfo<String> getListElements() {
        return new ListInfoElementsImpl<>();
    }

    @Bean
    ChangeListElements<String> changeListElements() { return new ChangeListElementsImpl<>(); }

}
