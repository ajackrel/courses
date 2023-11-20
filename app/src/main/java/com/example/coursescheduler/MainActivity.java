/*
AUTHOR:
ASSIGNMENT:
DATE:
*/

/*
For this assignment you will continue building a fully-functional weekly class scheduler.
To get you started, you can copy the MainActivity.java and activity_main.xml files to this
new project. Just be sure your package name matches the project name!

ASSIGNMENT DETAILS:
-Modify the String array:
    -at least two classes must be labelled as
        -M/W/F MORNING
    -at least two classes must be labelled as
        -M/W/F AFTERNOON
    -at least two classes must be labelled as
        -T/Th MORNING
    -at least two classes must be labelled as
        -T/Th AFTERNOON
-Modify the part 1 to now do the following:
    -User will be able to select a class from the list and build their own schedule
    -User will make 5 selections to build a schedule
    -Make a list of at least 10 unique class names (be creative!, but appropriate please :))
    -User cannot select the same class twice
    -User cannot select a class that conflicts with another previously selected (day/time)
    -User cannot select more than 5 classes

    -Final schedule should list each day of the week along with each class selected displayed back
     to the user next to the correct label (ie, morning or afternoon)

NOTE: The strings.xml file can be found in app->res->values->values

*/

package com.example.coursescheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}