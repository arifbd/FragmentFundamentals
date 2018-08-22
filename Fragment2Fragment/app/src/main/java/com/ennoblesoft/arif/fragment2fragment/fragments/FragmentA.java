package com.ennoblesoft.arif.fragment2fragment.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.ennoblesoft.arif.fragment2fragment.R;
import com.ennoblesoft.arif.fragment2fragment.interfaces.MyListener;

public class FragmentA extends Fragment implements View.OnClickListener {
    private EditText etFirst, etSecond;
    private Button btnSend;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        etFirst = view.findViewById(R.id.et_first_no);
        etSecond = view.findViewById(R.id.et_second_no);
        btnSend = view.findViewById(R.id.btn_send);
        btnSend.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_send:
                Send2Activity();
                break;
        }
    }

    private void Send2Activity() {
        float first = Float.parseFloat(etFirst.getText().toString().trim());
        float second = Float.parseFloat(etSecond.getText().toString().trim());

        MyListener listener = (MyListener) getActivity();
        listener.addNumbers(first, second);
    }
}
