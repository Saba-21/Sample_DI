package com.example.saba.daggersamples.UI;

import javax.annotation.Nonnull;

class BasePresenter<T> {

    T mView;

    final void attach(@Nonnull final T view) {
        mView = view;
    }

    final void detach() {
        mView = null;
    }
}
