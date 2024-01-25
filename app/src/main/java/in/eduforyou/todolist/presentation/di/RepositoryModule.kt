package `in`.eduforyou.todolist.presentation.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import `in`.eduforyou.todolist.data.db.TaskCategoryDao
import `in`.eduforyou.todolist.data.repository.TaskCategoryRepositoryImpl
import `in`.eduforyou.todolist.domain.TaskCategoryRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideTaskCategoryRepository(taskCategoryDao: TaskCategoryDao) : TaskCategoryRepository {
        return TaskCategoryRepositoryImpl(taskCategoryDao)
    }
}