package map_nestedMap;

import java.util.HashMap;
import java.util.Map;

public class soru1 {
    public static void main(String[] args) {
          /*
        {
            "firstname": "Ahmet",
            "lastname": "Bulut",
            "totalprice":500,
            "depositpaid": false,
            "bookingdates": {
                "checkin": "2023-07-21",
                "checkout": "2023-08-10"
                },
            "additionalneeds": "wi-fi" }
         */
        Map<String, Object> bookingMap= new HashMap<>();
        Map<String,String> bookingDatesMap= new HashMap<>();
        bookingDatesMap.put("checkin","2023-07-21");
        bookingDatesMap.put("checkout","2023-08-10");
        bookingMap.put("firstname","Ahmet");
        bookingMap.put("lastname","Bulut");
        bookingMap.put("totalprice",500);
        bookingMap.put("bookingdates",bookingDatesMap);
        bookingMap.put("additionalneeds","wi-fi");
        System.out.println(bookingMap);
    }
}
