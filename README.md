<p align="center">
  <img src="https://cloud.githubusercontent.com/assets/4659608/22895545/f12d3986-f22d-11e6-81b4-dc5376fb76dd.png" >
</p>


# 🖼 Media Gallery
![](https://img.shields.io/badge/Platform-Android-brightgreen.svg)
![](https://img.shields.io/hexpm/l/plug.svg)
![](https://img.shields.io/badge/version-0.1.1_beta-blue.svg)

------
## 📝 Description

You may already know of [MediaPicker](https://github.com/alhazmy13/MediaPicker), the all in one solution for capturing pictures and selecting images. Based on the same concept that powers MediaPicker, MediaGallery has a clearer flow based on albums and focuses on the use case of selecting images.

## 📱 Screenshots 
<img src="https://cloud.githubusercontent.com/assets/4659608/22867461/c77d039e-f199-11e6-8be6-027ae6e7af75.gif" width="300" align="center">


## 🔧 Installation

**Maven**

```xml
<dependency>
  <groupId>net.alhazmy13.mediagallery</groupId>
  <artifactId>library</artifactId>
  <version>0.1.1-beta</version>
  <type>pom</type>
</dependency>
```


**Gradle**

```gradle

repositories {
   maven { url "https://jitpack.io" }
}

dependencies {
	compile 'net.alhazmy13.mediagallery:library:0.1.1-beta'
}
```

## Usage

### MeidaGallery Activity  
<img width="240" src="https://cloud.githubusercontent.com/assets/4659608/22868150/8e43286a-f1a3-11e6-909f-a351ee4e04cc.png" align="center">

```java
        MediaGallery.Builder(this,list)
                .title("Title")
                .backgroundColor(R.color.colorAccent)
                .placeHolder(R.drawable.placeholder)
                .selectedImagePosition(1)
                .show();
```



### MeidaGallery View
<img width="240"  src="https://cloud.githubusercontent.com/assets/4659608/22868151/8e4488b8-f1a3-11e6-819c-8ce420f806ea.png">

 
```java
<net.alhazmy13.mediagallery.library.views.MediaGalleryView
    android:id="@+id/gallery"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:place_holder="@drawable/placeholder"
    app:span_count="3" />

```

And from your activity :

```java
        MediaGalleryView view = (MediaGalleryView) findViewById(R.id.gallery);
        view.setImages(list);
        view.setOnImageClickListener(this);
        view.notifyDataSetChanged();

```

## 👤 Author

* Abdullah Alhazmy

## 📄 License

MediaGallery is available under the Apache 2 license. See the LICENSE file for more info.

