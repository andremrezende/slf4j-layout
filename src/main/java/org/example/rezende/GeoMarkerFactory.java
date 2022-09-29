package org.example.rezende;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Classe Utilitária que define contexto de negócio para Log.
 * @author andre.rezende
 */
public final class GeoMarkerFactory {

    /**
     * Através do pacote é determinado o contexto de negócio para rastreabilidade no log
     * @param clazz Informar classe para determinar o marcador do contexto de negócio.
     * @return Marker do log. Ex:
     * [Gestão]
     * [18:17] [51.024s] [main] DEBUG org.example.rezende.Test - teste de log
     */
    public static Marker getMarker(Class clazz) {
        final String pckg =  clazz.getPackageName();
        if(pckg.contains("rezende")) {
            return MarkerFactory.getMarker("Gestão");
        }
        return MarkerFactory.getMarker("Spreadsheet");
    }
}
