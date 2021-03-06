/*******************************************************************************
 * Copyright 2014, 2017 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.source;

import ol.GwtOL3BaseTestCase;

/**
 * A test case for {@link ol.source.TileWMS}.
 *
 * @author Peter Zanetti
 */
public class TileWMSTest extends GwtOL3BaseTestCase {

    @SuppressWarnings({ "static-method", "javadoc" })
    public void testTileWMS() {

        injectUrlAndTest(new TestWithInjection() {

            @Override
            public void test() {

                TileWMSParams params = new TileWMSParams();
                params.setLayers("topp:states");
                params.setTiled(true);

                TileWMSOptions options = new TileWMSOptions();
                options.setUrl("https://ahocevar.com/geoserver/wms");
                options.setParams(params);
                options.setServerType(WMSServerType.GEOSERVER);

                TileWMS source = new TileWMS(options);

                assertEquals("topp:states", source.getParams().getLayers());

                params.setLayers("topp");

                source.updateParams(params);
                assertEquals("topp", source.getParams().getLayers());
            }

        });

    }

}
