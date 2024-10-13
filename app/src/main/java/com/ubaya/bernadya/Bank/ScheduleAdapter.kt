package com.ubaya.bernadya.Bank

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ubaya.bernadya.OurScheduleDetailActivity
import com.ubaya.bernadya.databinding.SchedulesListBinding

class ScheduleAdapter() : RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>() {
    class ScheduleViewHolder(val binding: SchedulesListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        val binding = SchedulesListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return ScheduleViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ScheduleObject.schedule.size
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        holder.binding.imgGameSchedule.setImageResource(GameObject.games[position].gambar)
        holder.binding.txtDate.text = ScheduleObject.schedule[position].date.toString()
        //holder.binding.txtTeam.text = ScheduleObject.schedule[position].gameClass[]//teamnya
        holder.binding.txtEvent.text = ScheduleObject.schedule[position].event
        holder.binding.btnScheduleDetail.setOnClickListener{
            val context = holder.itemView.context //??
            val intent = Intent(context, OurScheduleDetailActivity::class.java)

            // mindah data ke schedule detail activity
            val scheduleDetailArrayList = ArrayList(ScheduleObject.schedule[position])
            intent.putParcelableArrayListExtra("schedule", scheduleDetailArrayList)
            intent.putExtra("event", ScheduleObject.schedule[position].event)
            intent.putExtra("gambar", GameObject.games[position].gambar)
            context.startActivity(intent)

//            val intent = Intent(holder.itemView.context, EditQuestionActivity::class.java)
//            intent.putExtra("question_index", position)
//            holder.itemView.context.startActivity(intent)
        }
    }
}