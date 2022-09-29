package org.example.rezende;

import org.example.Main;
import org.junit.jupiter.api.Test;
import org.slf4j.Marker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoMarkerFactoryTest {

    @Test
    public void testSpreadsheetMarker() {
        //GIVEN
        Class clazz = org.example.rezende.Test.class;

        //WHEN
        Marker marker = GeoMarkerFactory.getMarker(clazz);

        //THEN
        assertEquals("Gestão", marker.getName());
    }

    @Test
    public void testGestaoMarker() {
        //GIVEN
        Class clazz = Main.class;

        //WHEN
        Marker marker = GeoMarkerFactory.getMarker(clazz);

        //THEN
        assertEquals("Spreadsheet", marker.getName());
    }
}
