package com.example.viewbindingrecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindingrecycleview.databinding.RecycleviewItemBinding

class TaskAdapter(val taskList: ArrayList<Task>):RecyclerView.Adapter<TaskAdapter.ViewHolder>() {
    inner class ViewHolder(private val itemBinding: RecycleviewItemBinding):RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(task: Task){
            itemBinding.tvTime.text = task.timestamp
            itemBinding.tvTitle.text = task.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RecycleviewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val task = taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return  taskList.size
    }
}