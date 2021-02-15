package sk.ehcache.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class DemoApplication {

    public static void main(final String[] args) {
        System.out.println("App started");
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        final StringsService stringsService = context.getBean(StringsService.class);

        final List<String> arg1 = Arrays.asList("1", "1", "1", "1");
        final List<String> arg2 = Arrays.asList("2", "2", "2", "2");
        final List<String> arg3 = Arrays.asList("3", "3", "3", "3");

//        EXAMPLE 1 - try to play with maxEntriesLocalHeap in ehcache.xml = alternate setting it to 1 or 2
        System.out.println("Call service and print with arg1");
        System.out.println(stringsService.strings(arg1));
        System.out.println("Call service and print with arg1");
        System.out.println(stringsService.strings(arg1));
        System.out.println("Call service and print with arg1");
        System.out.println(stringsService.strings(arg1));

        System.out.println("Call service and print with arg2");
        System.out.println(stringsService.strings(arg2));
        System.out.println("Call service and print with arg2");
        System.out.println(stringsService.strings(arg2));
        System.out.println("Call service and print with arg2");
        System.out.println(stringsService.strings(arg2));

        System.out.println("Call service and print with arg1");
        System.out.println(stringsService.strings(arg1));



//        EXAMPLE 2 - with strange key evaluation
//        System.out.println("Call service and print with arg1");
//        System.out.println(stringsService.strings("1", arg1));
//        System.out.println("Call service and print with arg2");
//        System.out.println(stringsService.strings("1", arg2));
//        System.out.println("Call service and print with arg3");
//        System.out.println(stringsService.strings("1", arg3));
//
//
//        System.out.println("Call service and print with arg2");
//        System.out.println(stringsService.strings("2", arg2));
//        System.out.println("Call service and print with arg1");
//        System.out.println(stringsService.strings("2", arg1));
    }

}
