package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ubaya.bernadya.databinding.ActivityAchievementBinding
import com.ubaya.bernadya.databinding.ActivityWhatWePlayBinding

class AchievementActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAchievementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityAchievementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.btnhome.setOnClickListener{
        //    val intent = Intent(this,MainActivity::class.java)
        //    startActivity(intent)
        //}

    }
}