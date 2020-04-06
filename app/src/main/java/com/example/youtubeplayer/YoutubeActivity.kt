package com.example.youtubeplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer

class YoutubeActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_youtube)
       // val layout = findViewById<ConstraintLayout>(R.id.activity_youtube)
        val layout =  layoutInflater.inflate(R.layout.activity_youtube, null) as ConstraintLayout
        setContentView(layout)
        val button1 = Button(this)
        button1.layoutParams = ConstraintLayout.LayoutParams(600, 180)
        button1.text = "Button Added"
        layout.addView(button1)

    }

    override fun onInitializationSuccess(
        p0: YouTubePlayer.Provider?,
        p1: YouTubePlayer?,
        p2: Boolean
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        p1: YouTubeInitializationResult?
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
