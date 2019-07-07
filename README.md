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
 
 
 
                             ******* Android RecyclerView Tutorial ********

The RecyclerView class extends the ViewGroup class and implements ScrollingView interface. It is introduced in Marshmallow. It is an advanced version of the ListView with improved performance and other benefits.

In this tutorial, we will create a list of items with ImageView (for the icon) and TextView (for description) using RecyclerView and performs click listener on the item of its list.

Step 1 :  Create an Android project, and add the RecyclerView support library com.android.support:recyclerview-v7:23.1.0 or above this version in build.gradle file.

Step 2 :  In the activity_recycle.xml file in layout directory, add the RecyclerView widget.
Check activity_recycle.xml in above project.

Step 3 :  Create a custom layout list_item.xml file and add textview and imageview.
Check list_item.xml in above project.

Step 4 :  Create a border.xml file in the drawable directory which is used to decorate the border of RecyclerView items.
Check border.xml in above project.

Step 5 :  Create a MyListData.java class with the following code. This class is used as (POJO) class which sets the properties of the items.
Check MyListData.java in above project.

Step 6 :  Create a MyListAdapter.java class and add the following code. This class extends RecyclerView.Adapter class and override its unimplemented methods. The onCreateViewHolder() methods inflates the list_item.xml. In the onBindViewHolder() method each data items are set to each row.
Check MyListAdapter.java in above project.

Step 7 :  Finally, in Recycle.java class create the array of items for MyListData class and set the adapter class to RecyclerView.
Check Recycle.java in above project.

Run the app. Congratulations! you just created RecyclerView in Android.

