package ol.proj;

import com.google.gwt.core.client.js.JsType;

import ol.Extent;

/**
 * Projection definition class. One of these is created for each projection
 * supported in the application and stored in the {@link ol.proj} namespace. You
 * can use these in applications, but this is not required, as API params and
 * options use {@link ol.proj.ProjectionLike} which means the simple string code
 * will suffice.
 *
 * You can use {@link ol.proj.get} to retrieve the object for a particular
 * projection.
 *
 * The library includes definitions for `EPSG:4326` and `EPSG:3857`, together
 * with the following aliases: * `EPSG:4326`: CRS:84,
 * urn:ogc:def:crs:EPSG:6.6:4326, urn:ogc:def:crs:OGC:1.3:CRS84,
 * urn:ogc:def:crs:OGC:2:84, http://www.opengis.net/gml/srs/epsg.xml#4326,
 * urn:x-ogc:def:crs:EPSG:4326 * `EPSG:3857`: EPSG:102100, EPSG:102113,
 * EPSG:900913, urn:ogc:def:crs:EPSG:6.18:3:3857,
 * http://www.opengis.net/gml/srs/epsg.xml#3857
 *
 * If you use proj4js, aliases can be added using `proj4.defs()`; see
 * [documentation](https://github.com/proj4js/proj4js).
 *
 * @author Tino Desjardins
 *
 */
@JsType
public interface Projection {

    String getCode();

    Extent getExtent();

    double getMetersPerUnit();

    String getUnits();

    boolean isGlobal();

    void setExtent(Extent extent);

}
