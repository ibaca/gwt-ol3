package ol.control;

import com.google.gwt.core.client.js.JsType;

/**
 *
 * @author Tino Desjardins
 *
 */
@JsType
public interface Attribution extends Control {

    void setCollapsed(boolean collapsed);

    void setCollapsible(boolean collapsible);

}
