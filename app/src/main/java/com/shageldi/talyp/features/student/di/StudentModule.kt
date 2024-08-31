package com.shageldi.talyp.features.student.di

import com.shageldi.talyp.features.student.presentation.StudentViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val studentModule = module {
//    single<UserRepository> { UserRepositoryImpl() }
    viewModel { StudentViewModel() }
}