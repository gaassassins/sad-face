package com.ruslanandmaria.sadface;

import android.support.v4.app.Fragment;

public class SadFaceActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return SadFaceFragment.newInstance();
    }
}
