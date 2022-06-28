package com.sun.bluetoothkit;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DialogWrapper {
    EditText titleField = null;
    EditText valueField = null;
    EditText Val1, Val2, Val3;
    View base = null;

    DialogWrapper(View base) {
        this.base = base;
        TextView link = base.findViewById(R.id.links);
        if (link != null) {
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DeviceListActivity.goWeb();
                }
            });

        }
    }

    String getTitle() {
        return (getTitleField().getText().toString());
    }

    float getValue() {
        return (new Float(getValueField().getText().toString())
                .floatValue());
    }

    public String get_Edittext(int index) {
        if (index > 2) return "";
        if (index == 0) return Val1.getText().toString();
        if (index == 1) return Val2.getText().toString();
        if (index == 2) return Val3.getText().toString();
        return "";
    }


    private void setText(String str) {
        TextView mText = (TextView) base.findViewById(R.id.setttext);
        mText.setText(str);
    }

    void setNameText(String str) {
        EditText mText = (EditText) base.findViewById(R.id.settitle);
        mText.setText(str);
    }

    void setValueText(String str) {
        EditText mText = (EditText) base.findViewById(R.id.setvalue);
        mText.setText(str);
    }

    EditText getTitleField() {
        if (titleField == null) {
            titleField = (EditText) base.findViewById(R.id.settitle);
        }

        return (titleField);
    }

    EditText getValueField() {
        if (valueField == null) {
            valueField = (EditText) base.findViewById(R.id.setvalue);
        }

        return (valueField);
    }
}
