/*******************************************************************************
 * Copyright 2014, 2016 gwt-ol3
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
package ol;

import ol.control.Attribution;
import ol.control.Control;

/**
 *
 * @author Tino Desjardins
 *
 */
public class CollectionTest extends GwtOL3BaseTestCase {

    public void testCollection() {

        this.injectUrlAndTest(new TestWithInjection() {

            @Override
            public void test() {
                Collection<Control> controls = new Collection<Control>();

                assertNotNull(controls);
                assertTrue(controls.getLength() == 0);
                assertTrue(controls.isEmpty());

                assertNotNull(controls.getArray());

                // Does not work before ol v3.20. because bug in ol3.
                int length = controls.push(new Attribution());
                assertTrue(length == 1);

                assertTrue(controls.getLength() == 1);
                assertFalse(controls.isEmpty());
                assertNotNull(controls.getArray());
                assertTrue(controls.getArray().length == 1);

                Control control = controls.pop();
                assertTrue(control instanceof Attribution);

                assertTrue(controls.getLength() == 0);
                assertTrue(controls.isEmpty());

                Attribution attribution =  new Attribution();
                controls.push(attribution);
                assertTrue(controls.contains(attribution));
                assertFalse(controls.contains(new Attribution()));
            }
        });

    }

}
