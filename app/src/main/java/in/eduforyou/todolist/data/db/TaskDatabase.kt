package `in`.eduforyou.todolist.data.db

import androidx.room.*

import `in`.eduforyou.todolist.data.model.CategoryInfo
import `in`.eduforyou.todolist.data.model.TaskInfo

@Database(entities = [TaskInfo::class, CategoryInfo::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun getTaskCategoryDao() : TaskCategoryDao
}