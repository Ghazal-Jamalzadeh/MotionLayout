package com.example.motionlayout.project.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import com.example.motionlayout.R
import com.example.motionlayout.databinding.ActivityProjectSplashBinding
import com.example.motionlayout.project.home.ProjectHomeActivity

class ProjectSplashActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityProjectSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectSplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Auto run
        binding.splashMotionLayout.transitionToState(R.id.end)
        //Start home page
        binding.splashMotionLayout.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {

            }

            override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                startActivity(Intent(this@ProjectSplashActivity, ProjectHomeActivity::class.java))
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }

            override fun onTransitionTrigger(motionLayout: MotionLayout?, triggerId: Int, positive: Boolean, progress: Float) {

            }

        })

    }
}