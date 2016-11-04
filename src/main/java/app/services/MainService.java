package app.services;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

@Service("mainService")
public class MainService {

    public Map<Integer, String> getAllItems() {
        Map<Integer, String> items = new HashMap<>();

        IntStream.range(1, 10).forEach(index ->
                items.put(index, RandomStringUtils.randomAlphabetic(10))
        );
        return items;
    }
}
