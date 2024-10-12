package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ubaya.bernadya.Bank.AchievementClass
import com.ubaya.bernadya.databinding.ActivityAchievementBinding
import com.ubaya.bernadya.databinding.ActivityWhatWePlayBinding
import java.util.ArrayList

class AchievementActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAchievementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityAchievementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


        val items = arrayOf("ALL", "2024", "2023", "2022", "2021")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.cbYear.adapter = adapter



        val achievements = intent.getParcelableArrayListExtra<AchievementClass>("achi")?: ArrayList()
        val gameName = intent.getStringExtra("nama")?: ""
//        binding.txtJudulGameAchi.text = gameName

        binding.cbYear.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedYear = parent.getItemAtPosition(position).toString()
                if (selectedYear == "ALL") {
                    displayAchievements(achievements, gameName)
                } else {
                    val filteredAchievements = achievements.filter { it.tahun.toString() == selectedYear }
                    displayAchievements(filteredAchievements, gameName)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }

        // Tampilkan semua achievement secara default
        displayAchievements(achievements, gameName)

    }
    private fun displayAchievements(achievements: List<AchievementClass>, gameName: String) {

        val stringBuilder = StringBuilder()
        stringBuilder.append("Achievements for $gameName:\n")

        achievements.forEachIndexed { index, achievement ->
            stringBuilder.append("${index + 1}. ${achievement.namaAchievement} \n")
        }

        binding.txtAchievement.text = stringBuilder.toString()
    }
}