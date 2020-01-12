package com.chaitupenjudcoder.projecttemplates.tabsui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.chaitupenjudcoder.projecttemplates.R;

public class FragmentOne extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    int index;

    static FragmentOne newInstance(int index) {
        FragmentOne fragment = new FragmentOne();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_one, container, false);
        final TextView textView = root.findViewById(R.id.section_label);
        textView.setText("Fragment " + index);
        return root;
    }
}