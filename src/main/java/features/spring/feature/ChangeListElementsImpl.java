package features.spring.feature;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ChangeListElementsImpl<T> implements ChangeListElements<T> {
    @Override
    public void changeListElements(List<T> list) {
        list.stream().map(x -> ((String) x).toLowerCase()).forEach(x -> log.info("To lower case: {}", x));
    }
}
