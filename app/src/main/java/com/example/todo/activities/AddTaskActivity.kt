package com.example.todo.activities
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.todo.R
import com.example.todo.database.TaskEntity


class AddTaskActivity : AppCompatActivity() {

    private lateinit var taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        val saveButton = findViewById<Button>(R.id.saveButton)
        val titleInput = findViewById<EditText>(R.id.titleInput)
        val descriptionInput = findViewById<EditText>(R.id.descriptionInput)

        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
                
        saveButton.setOnClickListener {
            val title = titleInput.text.toString()
            val description = descriptionInput.text.toString()
            val dueDate = System.currentTimeMillis() // Simulando data

            val task = TaskEntity(
                title = title,
                description = description,
                dueDate = dueDate,
                isCompleted = false
            )

            taskViewModel.insert(task)
            finish() // Voltar para a tela principal
        }
    }
}

