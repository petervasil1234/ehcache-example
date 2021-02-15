package sk.ehcache.demo;

import org.springframework.cache.annotation.Cacheable;

import java.util.ArrayList;
import java.util.List;

public class StringsService {

    @Cacheable(value = "stringsCache")
    public List<String> strings(final List<String> strings) {
        System.out.println("Store to cache: " + "Arguments: " + String.join(",", strings));
        return new ArrayList<>(strings);
    }

    @Cacheable(value = "stringsCache", key = "#p0")
    public List<String> strings(final String key, final List<String> strings) {
        System.out.println("Store to cache: " + "Arguments: " + String.join(",", strings));
        return new ArrayList<>(strings);
    }

}
