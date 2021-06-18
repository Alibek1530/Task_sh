package com.example.task.homeui.detals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.task.R
import com.example.task.fragment.ShoppingFragment
import com.example.task.homeui.viewsourc.ViewActivity

class DetalsActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var imageView: ImageView
    lateinit var back: ImageView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detals)


        textView = findViewById(R.id.detalsText)
        imageView = findViewById(R.id.detalsImage)
        button = findViewById(R.id.detalsReg)
        back = findViewById(R.id.backPressed)


        back.setOnClickListener {
            onBackPressed()
        }


        textView.text = intent.getStringExtra("name")
        val image = intent.getStringExtra("image")?.let { imageView.setImageResource(it.toInt()) }

        button.setOnClickListener {

            val intent = Intent(this, ViewActivity::class.java)

            intent.putExtra("name1", textView.text)
            intent.putExtra("image1", image.toString())

            startActivity(intent)

        }

    }
}