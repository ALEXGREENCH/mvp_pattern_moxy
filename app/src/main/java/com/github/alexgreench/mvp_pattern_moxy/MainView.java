package com.github.alexgreench.mvp_pattern_moxy;

import com.arellomobile.mvp.MvpView;

public interface MainView extends MvpView {
    void showToast(String msg);
}
