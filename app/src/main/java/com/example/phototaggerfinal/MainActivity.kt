package com.example.phototaggerfinal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Step 1: view references
    private lateinit var imageThumbnail: ImageView
    private lateinit var editTag: EditText
    private lateinit var btnCapture: Button
    private lateinit var btnSave: Button
    private lateinit var btnLoad: Button
    private lateinit var btnBack: Button
    private lateinit var btnForward: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Step 1: find views by ID (must match activity_main.xml)
        imageThumbnail = findViewById(R.id.imageThumbnail)
        editTag = findViewById(R.id.editTag)
        btnCapture = findViewById(R.id.btnCapture)
        btnSave = findViewById(R.id.btnSave)
        btnLoad = findViewById(R.id.btnLoad)
        btnBack = findViewById(R.id.btnBack)
        btnForward = findViewById(R.id.btnForward)

        // Step 1: dummy click listeners so wiring is complete
        btnCapture.setOnClickListener {
            // TODO: open camera and show thumbnail
        }

        btnSave.setOnClickListener {
            // TODO: save tag + image info to DB
        }

        btnLoad.setOnClickListener {
            // TODO: load images by tag from DB
        }

        btnBack.setOnClickListener {
            // TODO: show previous image
        }

        btnForward.setOnClickListener {
            // TODO: show next image
        }

        // keep your edge-to-edge inset handling
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
