package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val headingNews: TextView = findViewById(R.id.heading)
        val mainNews: TextView = findViewById(R.id.news)
        val imageNews: ImageView = findViewById(R.id.image_heading)

        val bundle: Bundle? = intent.extras
        val heading = bundle?.getString("heading") ?: "No heading available"
        val imageId = bundle?.getInt("imageId") ?: R.drawable.default_image
        val news = bundle?.getString("news") ?: "No news available"

        headingNews.text = heading
        mainNews.text = news
        imageNews.setImageResource(imageId)
    }
}
