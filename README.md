------------------------------------------------------------------------------------------------------------
###Music-Cover-ViewWithSquare
is forked from [andremion/Music-Cover-View](http://github.com/andremion/Music-Cover-View) project, adding a new 'square' shape


        <attr name="shape" format="enum">
            <enum name="rectangle" value="0"/>
            <enum name="circle" value="1"/>
            <enum name="square" value="2"/>
        </attr>

that shows a full squared image in a squared ImageView.

Calling start() it rotates 10sec the squared image as a circled image with decored center.

Calling morph() it switches to full squared image or to circled image again.

![SampleWithSquare](https://github.com/GPack1/Music-Cover-ViewWithSquare/blob/master/art/samplewithsquare.gif)

See at [sample](https://github.com/GPack1/Music-Cover-ViewWithSquare/tree/master/sample%20with%20square).


#### andremion/Music-Cover-View project's License

    Copyright 2016 André Mion

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

#### Changes done in this fork are licensed under:

    Copyright 2016 Paolo Giacomini

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
------------------------------------------------------------------------------------------------------------





[![Android Arsenal Music-Cover-View](https://img.shields.io/badge/Android%20Arsenal-Music--Cover--View-green.svg?style=true)](https://android-arsenal.com/details/1/4218)
[![License Apache 2.0](https://img.shields.io/badge/License-Apache%202.0-blue.svg?style=true)](http://www.apache.org/licenses/LICENSE-2.0)
![minSdkVersion 21](https://img.shields.io/badge/minSdkVersion-21-red.svg?style=true)
![compileSdkVersion 24](https://img.shields.io/badge/compileSdkVersion-24-yellow.svg?style=true)
# Music Cover View

A Subclass of [ImageView](https://developer.android.com/reference/android/widget/ImageView.html) that 'morphs' into a circle shape and can rotates. Useful to be used as album cover in Music apps.

![Sample](https://raw.githubusercontent.com/andremion/Music-Cover-View/master/art/sample.gif)

It's used by this [Music Player](https://github.com/andremion/Music-Player) prototype.

![Music Player](https://raw.githubusercontent.com/andremion/Music-Player/master/art/music_player_code.gif)

## Installation

Include the library in your `build.gradle`

```groovy
dependencies{
    compile 'com.github.andremion:musiccoverview:1.0.0'
}
```

or in your `pom.xml` if you are using Maven

```xml
<dependency>
  <groupId>com.github.andremion</groupId>
  <artifactId>musiccoverview</artifactId>
  <version>1.0.0</version>
  <type>aar</type>
</dependency>
```

## Usage

```xml
<com.andremion.music.MusicCoverView
        android:id="@+id/cover"
        android:layout_width="match_parent"
        android:layout_height="@dimen/cover_height"
        android:src="@drawable/album_cover"/>
```

###Custom attributes

- The shape of the View
```xml
<attr name="shape" format="enum">
    <enum name="rectangle" value="0"/>
    <enum name="circle" value="1"/>
</attr>
```
    
- The color of the tracks when the shape is circle
```xml
<attr name="trackColor" format="color"/>
```

See more at the [sample](https://github.com/andremion/Music-Cover-View/tree/master/sample)

## License

    Copyright 2016 André Mion

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
