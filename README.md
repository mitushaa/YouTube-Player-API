# YouTube Player using Kotlin# YouTube Player Application using Kotlin

 ![](https://miro.medium.com/max/840/1*oyjW0tejW_oiznAo4hNThA.png)<br><br>


* In this project we will learn how to integrate and play a video using YouTube API in Android with Kotlin.<br>

* The YouTube Android Player API enables you to incorporate video playback functionality into your Android applications. <br>
* The API defines methods for loading and playing YouTube videos (and playlists) and for customizing and controlling the video playback experience.<br>
* Using the API, you can load or cue videos into a player view embedded in your application’s UI. You can then control playback programmatically. For example, you can play, pause, or seek to a specific point in the currently loaded video.<br>
* You can also register event listeners to get callbacks for certain events, such as the player loading a video or the player state changing. Finally, the API has helper functionality to support orientation changes as well as transitions to fullscreen playback.<br>

### Creating an Android Project:
### Step 1- Creating a new file project with an empty activity
 ![](https://miro.medium.com/max/840/1*sg9_J-JTg21TkDcjJTlZ6Q.png)<br><br>


Go to Files
Create a New Project
Select a Project Template- Basic Activity


### Step 2- Setting up YouTube Library and Manifest
In this part, we will see how to set up the YouTube API Client library for the project.
 ![](https://miro.medium.com/max/840/1*sK9qj_y_DODlANi-qtXwdg.png)<br><br>
  ![](https://miro.medium.com/max/840/1*KImSydyBDDwZaadYrQdjWA.png)<br><br>



Go to YouTube Android Player API and download YouTube Android Player API jar file<br>
Extract the jar files and add them to the “libs” folder.
Integration of YouTube Android Player in Screen using Kotlin
### Step 1: Go to Google Developer Console — https://console.developers.google.com/apis/library/
### Step 2: Enable YouTube Data API
  ![](https://miro.medium.com/max/840/1*f_tkRe2zgww2aURcXXvUdA.png)<br><br>


### Step 3: Go to “Help me choose” option
  ![](https://miro.medium.com/max/1400/1*ApItZsDNpE26ALZkc5jPZA.png)<br><br>


### Step 4: Select the credentials as shown below
  ![](https://miro.medium.com/max/1400/1*2BNW-yjgsnzQ1I2YnLaziQ.png)<br><br>

### Step 5: Go to Credentials

  ![](https://miro.medium.com/max/1400/1*2MxMU0xeGnlO2ePLunUqFQ.png)<br><br>
    ![](https://miro.medium.com/max/1400/1*hfGDexmoj5DCeGsNKFAwFw.png)<br><br>
      ![](https://miro.medium.com/max/1400/1*jdMz2WaJxYSE-bQ2hnRj3g.png)<br><br>

  ![](https://miro.medium.com/max/1400/1*pNbgmcjX0UGThhRI5Rpk0Q.png)<br><br>
    ![](https://miro.medium.com/max/1400/1*H9-xbaUumv2O9AvF84F7oQ.png)<br><br>




1. In the place of “Name” enter your package name
2. Generate the SHA-1 certificate fingerprint by running “signingReport”
3. Copy the generated SHA-1 certificate fingerprint and place it as shown above

