//package org.example.Q107;
//
//import java.util.List;
//import java.util.stream.Stream;
//
//public class Widget {
//    public static void main(String[] args) {
//        List<Widget> widgets = List.of(new Widget("Basic Widget", 19.55),
//
//                new Widget("Enhanced Widget", 19.55),
//                new Widget("Luxury Edition Widget", 19.55),);
//
//        Stream<Widget> widgetStream = widgets.stream();
//        widgetStream.filter(a -> a.getPrice() > 20.00).forEach(System.out::println);
//
//    }
//}
