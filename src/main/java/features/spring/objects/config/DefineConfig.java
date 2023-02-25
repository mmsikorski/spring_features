package features.spring.objects.config;

import features.spring.feature.ChangeListElements;
import features.spring.feature.ListInfo;
import features.spring.test.data.TestData;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefineConfig {

//    @Qualifier("LIST_INFO")
//    @Bean
//    ObjectProvider<ListInfo<String>> getListInfo(
//            ObjectProvider<ListInfo<String>> objects
//    ) {
//        return objects;
//    }

//    @Qualifier("CHANGE_ELEMENTS_CONFIG")
//    @Bean
//    ObjectProvider<ChangeListElements<String>> changeElements(
//            ObjectProvider<ChangeListElements<String>> objects
//    ) {
//        return objects;
//    }

//    @Qualifier("RUN_CONFIG")
    @Bean
    Boolean printInfoStartUp(
//            @Qualifier("LIST_INFO")
            ObjectProvider<ListInfo<String>> infoStream,
//            @Qualifier("CHANGE_ELEMENTS_CONFIG")
            ObjectProvider<ChangeListElements<String>> changeStream
    ) {
        infoStream.forEach(x -> x.getInfo(TestData.testList));
        changeStream.forEach(x -> x.changeListElements(TestData.testList));
        return true;
    }
}
