package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.net.Uri
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val address = Uri.parse("https://www.youtube.com/watch?v=6ZfuNTqbHE8")
            val openLinkIntent = Intent(Intent.ACTION_VIEW, address)

            if (openLinkIntent.resolveActivity(packageManager) != null) {
                startActivity(openLinkIntent)
            } else {
                Log.d("Intent", "Не получается обработать намерение!")
            }
        }
    }
}
