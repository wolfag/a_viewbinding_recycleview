package com.example.viewbindingrecycleview

object TaskList {
    fun taskList():ArrayList<Task>{
        var list = arrayListOf<Task>()

        for (i in 1..20){
            list.add(Task("Task $i", "${7 + i}:00 am"))
        }

        return list
    }
}