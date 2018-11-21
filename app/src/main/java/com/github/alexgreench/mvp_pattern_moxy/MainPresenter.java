package com.github.alexgreench.mvp_pattern_moxy;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    void inputText(String text) {
        String reverse_text = new StringBuilder(text).reverse().toString();
        getViewState().showToast(reverse_text);
    }
}
