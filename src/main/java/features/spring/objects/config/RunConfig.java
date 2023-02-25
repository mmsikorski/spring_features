package features.spring.objects.config;

import features.spring.feature.ListInfo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RunConfig {

    @Bean
    String getListInfo(
            ObjectProvider<ListInfo<String>> objects
    ) {
        List<String> testList = new ArrayList<>() {
            {
                add("TestList");
                add("Test");
                add("List");
                add("Table");
                add("Harry Potter");
                add("Legacy");
            }
        };
        objects.forEach(x -> x.getInfo(testList));
        return "TEST";
    }
}
