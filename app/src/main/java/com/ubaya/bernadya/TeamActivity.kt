package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.ubaya.bernadya.Bank.Play.AchievementClass
import com.ubaya.bernadya.databinding.ActivityTeamBinding
import java.util.ArrayList

class TeamActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityTeamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        //ambil data
        val teams = intent.getParcelableArrayListExtra<AchievementClass>("team")?: ArrayList()
        val gameName = intent.getStringExtra("nama")?: ""
        val gambarGame = intent.getIntExtra("gambar", 0)
        binding.imgGame3.setImageResource(gambarGame)
    }
}