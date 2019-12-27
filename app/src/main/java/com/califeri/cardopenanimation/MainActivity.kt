package com.califeri.cardopenanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var button: MaterialButton
    private lateinit var rootLayout: MotionLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
    }

    private fun initializeViews() {
        rootLayout = findViewById(R.id.ml_root)
        button = findViewById(R.id.mb_start_animation)
        button.setOnClickListener {
            when (rootLayout.currentState) {
                R.id.start -> {
                    rootLayout.transitionToEnd()
                }
            }
        }
    }
}
