package com.example.myapplication

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class PermissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        val ask = findViewById<Button>(R.id.ask)
        ask.setOnClickListener {
            val cameraPermissionCheck = ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.CAMERA
            )
            if(cameraPermissionCheck != PackageManager.PERMISSION_GRANTED){
                //권한이 없는 경우
                ActivityCompat.requestPermissions(
                        this,
                        arrayOf(android.Manifest.permission.CAMERA),
                        1000 //권한 요청이 사용자가 허락을 했는지의 여부(처리가 어떻게 됐는지?)
                )
            }else{
                //권한이 있는 경우
                Log.d("permissionsss", "권한이 이미 있음")
            }
        }

    }

    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 1000){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                //승낙
                Log.d("permissionsss", "승낙")
            }else{
                //거부
                Log.d("permissionsss", "거부")
            }
        }

    }


}