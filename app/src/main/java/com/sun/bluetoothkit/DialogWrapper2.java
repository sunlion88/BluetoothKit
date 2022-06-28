package com.sun.bluetoothkit;

import android.view.View;
import android.widget.EditText;

public class DialogWrapper2 {
    EditText Val[];
    View base = null;
    String user[] = {"0000FFE0-0000-1000-8000-00805F9B34FB",
            "0000FFE1-0000-1000-8000-00805F9B34FB",
            "0000FFE1-0000-1000-8000-00805F9B34FB"};

    DialogWrapper2(View base) {
        this.base = base;
        Val = new EditText[3];
        Val[0] = (EditText) base.findViewById(R.id.setserviceuuid);
        Val[1] = (EditText) base.findViewById(R.id.setnotifyuuid);
        Val[2] = (EditText) base.findViewById(R.id.setwriteuuid);
        setDefault();
    }

    private void setEdit(boolean en) {
        Val[0].setEnabled(en);
        Val[1].setEnabled(en);
        Val[2].setEnabled(en);
    }

    public void setDefault() {
        Val[0].setText(user[0]);
        Val[1].setText(user[1]);
        Val[2].setText(user[2]);
    }

    public String[] getUUID() {
        String[] res = new String[3];
        res[0] = Val[0].getText().toString();
        res[1] = Val[1].getText().toString();
        res[2] = Val[2].getText().toString();

        return res;
    }

    public void setEditUUID(String[] uuid) {
        user = uuid;
        Val[0].setText(uuid[0]);
        Val[1].setText(uuid[1]);
        Val[2].setText(uuid[2]);
    }

    public String[] getUsrUUID() {
        return user;
    }

}
