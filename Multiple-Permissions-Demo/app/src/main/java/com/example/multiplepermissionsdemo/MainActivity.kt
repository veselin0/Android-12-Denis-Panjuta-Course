package com.example.multiplepermissionsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import android.Manifest
import android.os.Build
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.multiplepermissionsdemo.R.*

class MainActivity : AppCompatActivity() {

    private val cameraAndLocationResultLauncher: ActivityResultLauncher<Array<String>> =
        registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissions ->
            permissions.entries.forEach {
                val permissionName = it.key
                val isGranted = it.value
                if (isGranted) {
                    if (permissionName == Manifest.permission.ACCESS_FINE_LOCATION) {
                        Toast.makeText(
                            this, "Location Permission Granted",
                            Toast.LENGTH_LONG
                        ).show()
                    } else {


                        Toast.makeText(
                            this, "Camera Permission Granted",
                            Toast.LENGTH_LONG
                        ).show()
                    }

                } else {
                    if (permissionName == Manifest.permission.ACCESS_FINE_LOCATION) {
                        Toast.makeText(
                            this, "Location Permission Denied",
                            Toast.LENGTH_LONG
                        ).show()
                    } else {


                        Toast.makeText(
                            this, "Camera Permission Denied",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val btnPermissions: Button = findViewById(R.id.btnPermissions)
        btnPermissions.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
                    shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)) {
                showRationaleDialog("Permission Demo requires camera access",
                "Camera can not be used because access is denied")
            } else {
                cameraAndLocationResultLauncher.launch(
                    arrayOf(Manifest.permission.CAMERA,
                    Manifest.permission.ACCESS_FINE_LOCATION)
                )
            }
        }
    }

    private fun showRationaleDialog(
        title: String,
        message: String
    ) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle(title)
            .setMessage(message)
            .setPositiveButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
        builder.create().show()
    }
}