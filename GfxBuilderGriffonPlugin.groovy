/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class GfxBuilderGriffonPlugin {
    String version = '0.7'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-gfx-builder-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'GfxBuilder Plugin'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Brings the [GfxBuilder][1] on your Griffon application.

Usage
----
Refer to the [builder's][1] page to known what nodes are available.

### Node

The following nodes become available to Swing views

| *None* | *Property* | *Type*  | *Required* | *Bindable* |
| ------ | ---------- | ------- | ---------- | ---------- |
| canvas | node       | GdxNode | false      | false      |

The following is an example of its usage (copy & paste it on SwingPad )

        canvas(size: [200,200]) {
            group(borderColor: 'none') {
                antialias true
                background(color: color('white'))
                rect(x: 50, y: 50, w: 100, h: 100, fill: color('red'))
                rect(x: 100, y: 100, w: 100, h: 100, fill: color('green'))
                path {
                    moveTo(x: 100, y: 100)
                    lineTo(x: 150, y: 150)
                    lineTo(x: 50, y: 200)
                    close()
                }
            }
        }


[1]: http://griffon.codehaus.org/GfxBuilder
'''
}
