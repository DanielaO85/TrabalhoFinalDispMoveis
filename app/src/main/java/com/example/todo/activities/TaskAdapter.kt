package com.example.todo.activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R
import com.example.todo.database.TaskEntity
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class TaskAdapter() : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {
    private var tasks = emptyList<TaskEntity>()

    inner class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.taskTitle)
        val description: TextView = view.findViewById(R.id.taskDescription)
        val dueDate: TextView = view.findViewById(R.id.taskDueDate)
        val checkbox: CheckBox = view.findViewById(R.id.taskCompletedCheckbox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasks[position]
        holder.title.text = task.title
        holder.description.text = task.description
        val dateTime = Calendar.getInstance()
        dateTime.timeInMillis = task.dueDate
        val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        holder.dueDate.text = dateFormat.format(dateTime.time)
        holder.checkbox.isSelected = task.isCompleted
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    fun setTasks(tasks: List<TaskEntity>) {
        this.tasks = tasks
        notifyDataSetChanged()
    }
}
