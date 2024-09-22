package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.ubaya.bernadya.databinding.ActivitySceduleBinding

class OurScheduleActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySceduleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySceduleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnScheduleDetail.setOnClickListener{
            val intent = Intent(this,OurScheduleDetailActivity::class.java)
            startActivity(intent)
        }
    }
}