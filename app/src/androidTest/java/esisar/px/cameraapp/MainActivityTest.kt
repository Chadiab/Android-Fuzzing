package esisar.px.cameraapp

import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.*

import org.junit.Test
import org.junit.runner.manipulation.Ordering

class MainActivityTest {

    @Test
    fun onRequestPermissionsResult() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext


        if(ContextCompat.checkSelfPermission(appContext,
                "android.permission.CAMERA") == PackageManager.PERMISSION_GRANTED){
            println("the uid: "+android.os.Process.myUid()+" Has the permission to access the camera!");


        }else{
            println("Error the uid: "+android.os.Process.myUid()+" Does not have the permission to access the camera!");

        }

         //assertTrue(
             //ContextCompat.checkSelfPermission(appContext,
            //"android.permission.CAMERA") == PackageManager.PERMISSION_GRANTED);


    }
}