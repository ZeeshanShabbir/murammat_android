package com.markhorist.murammat.fragments;


import android.hardware.Camera;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.markhorist.murammat.R;
import com.markhorist.murammat.helpers.CameraPreview;

/**
 * Created by shani on 7/16/2016.
 */
public class CameraFragment extends Fragment {
    View view;

    private Camera mCamera;
    private CameraPreview mPreview;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.camera_layout, container, false);
        mCamera = getCameraInstance();
        initUi();
        initCamera();
        return view;
    }

    private void initCamera() {

        // Create our Preview view and set it as the content of our activity.
        mPreview = new CameraPreview(getContext(), mCamera);
        FrameLayout preview = (FrameLayout) view.findViewById(R.id.camera_preview);
        preview.addView(mPreview);
    }

    private void initUi() {
    }

    public static Camera getCameraInstance() {
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        } catch (Exception e) {
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }
}
