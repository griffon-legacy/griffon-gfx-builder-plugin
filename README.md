
GfxBuilder Plugin
-----------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/gfx-builder](http://artifacts.griffon-framework.org/plugin/gfx-builder)


Brings the [GfxBuilder][1] on your Griffon application.

Usage
-----
Refer to the [builder's][1] page to known what nodes are available.

### Node

The following nodes become available to Swing views

| *None* | *Property* | *Type*  | *Required* | *Bindable* |
| ------ | ---------- | ------- | ---------- | ---------- |
| canvas | node       | GfxNode | false      | false      |

The following is an example of its usage (copy & paste it on SwingPad)

    canvas(preferredSize: [200,200]) {
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

SwingPad can be found in the `samples` directory on your Griffon distribution.


[1]: http://griffon.codehaus.org/GfxBuilder

