# Final-Android-Project


                            ******* Android Picasso Library Tutorial ********
    
 Android Picasso library is a powerful android library, built by square, for image downloading and caching. It’s very simple to use and you need to write just a few lines of code to do the job.
In this tutorial, you will learn how to use android Picasso library for image downloading and caching.

Step 1 : Creating new Project
Follow steps written below to create a new project.
a. Goto File –> New –> New Project. Then, Write application name as PicassoLibrary and click next.
b. Select Minimum SDK 16 –> click next –> Select Empty Activity –> click next –> click finish.
If you have followed above process correctly, you will get a newly created project successfully. You will get folder structure like below.


Step 2 :  1.2 Add gradle for Picasso library in app/gradle
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:appcompat-v7:23.4.0'
 
    compile 'com.squareup.picasso:picasso:2.5.2'    //gradle for picasso.
}

Step 3 :  Add internet permission in AndroidManifest.xml
Since you are going to do network operations you need to add internet permission in your AndroidManifest.xml file.
    <uses-permission android:name="android.permission.INTERNET" />


Step 4 :  Add ImageView in activity_main.xml
For the sake of simplicity, we are going to download and show image in an imageView. So, go to activity_picasso.xml file and add ImageView in it.

Step 5 :  Add code to load image in ImageView
Go to Picasso.java file and add the code to load image into imageView using Picasso library.

Run the app. Congratulations! you just used Android Picasso library to download and load image into imageView.
 
 
 
                             ******* Android Picasso Library Tutorial ********

 
