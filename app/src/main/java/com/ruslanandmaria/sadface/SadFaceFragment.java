package com.ruslanandmaria.sadface;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rusla on 21.03.2016.
 */
public class SadFaceFragment extends Fragment{

    private RecyclerView mRecyclerView;
    private static final String TAG = "SadFaceFragment";

    public static SadFaceFragment newInstance() {
        return new SadFaceFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_sad_face, container, false);

        mRecyclerView = (RecyclerView)v.findViewById(R.id.fragment_sad_face_recyler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        return v;
    }

}
