package com.example.mydaggjava.di;


import com.example.mydaggjava.di.auth.AuthModule;
import com.example.mydaggjava.di.auth.AuthScope;
import com.example.mydaggjava.di.auth.AuthViewModelsModule;
import com.example.mydaggjava.di.main.MainFragmentBuildersModule;
import com.example.mydaggjava.di.main.MainModule;
import com.example.mydaggjava.di.main.MainScope;
import com.example.mydaggjava.di.main.MainViewModelsModule;
import com.example.mydaggjava.ui.auth.AuthActivity;
import com.example.mydaggjava.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();


    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
