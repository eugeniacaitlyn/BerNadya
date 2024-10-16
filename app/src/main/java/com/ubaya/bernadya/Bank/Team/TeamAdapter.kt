package com.ubaya.bernadya.Bank.Play

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ubaya.bernadya.AchievementActivity
import com.ubaya.bernadya.Bank.Team.SelectedGameMember
import com.ubaya.bernadya.Bank.Team.SelectedTeam
import com.ubaya.bernadya.TeamActivity
import com.ubaya.bernadya.databinding.GameListBinding
import com.ubaya.bernadya.databinding.TeamListBinding

class TeamAdapter(private val teams: ArrayList<TeamClass>) : RecyclerView.Adapter<TeamAdapter.QuestionViewHolder>(){
    class QuestionViewHolder(val binding: TeamListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val binding = TeamListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return QuestionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return teams.size
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        holder.binding.imgTeam.setImageResource(GameObject.games[position].gambar)
        holder.binding.txtNamaTeam.text = teams[position].namaTeam

    }


}