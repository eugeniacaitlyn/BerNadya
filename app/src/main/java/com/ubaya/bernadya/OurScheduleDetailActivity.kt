package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.ubaya.bernadya.databinding.ActivityScheduleDetailBinding

class OurScheduleDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScheduleDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityScheduleDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.txtNameSchedule.text = "Regional Qualifier - Valorant"
        binding.txtPlace.text = "Los Angeles, CA (10.00 AM)"
        binding.txtTeam.text = "TEAM A"
        binding.txtDescSchedule.text = "This tournament is an intense competition where top teams from various regions battle it out for a chance to advance to the main tournament. This stage serves as a proving ground for both established and up-and-coming teams, as they showcase their skills, strategies, and teamwork in one of the most competitive environments. With high stakes on the line, the qualifier will determine which teams are truly ready to compete at the highest level, providing a thrilling experience for both players and fans alike."

        binding.btnNotif.setOnClickListener {
            Toast.makeText(this, "Notification created", Toast.LENGTH_SHORT).show()
        }
    }
}