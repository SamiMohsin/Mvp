package com.graphicalinfo.mvp.base;

import androidx.appcompat.app.AppCompatActivity;

public abstract class MvpActivity<P extends Presenter>
        extends AppCompatActivity { protected abstract P createPresenter(); }

