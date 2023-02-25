package features.spring.feature;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ListInfoLengthImpl<T> implements ListInfo<T>{
    @Override
    public void getInfo(List<T> list) {
      log.info("List length: {}", list.size());
    }
}
