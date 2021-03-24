package com.example.mydaggjava.di.main;

import androidx.lifecycle.ViewModel;

import com.example.mydaggjava.di.ViewModelKey;
import com.example.mydaggjava.ui.main.posts.PostsViewModel;
import com.example.mydaggjava.ui.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel viewModel);
}




