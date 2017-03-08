package com.noobs.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.noobs.draft2.R;
import com.noobs.model.BoDapAn;
import com.noobs.model.DapAn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SUNFLOWER on 3/8/2017.
 */

public class BoDapAnAdapter extends ArrayAdapter<BoDapAn> {

    Activity context;
    int resource;
    List<BoDapAn> objects;
    public BoDapAnAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull ArrayList<BoDapAn> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);
        TextView txtTenBoDapAn= (TextView) row.findViewById(R.id.txtTenBoDapAn);
        ImageButton btnDel= (ImageButton) row.findViewById(R.id.btnDel);

        BoDapAn boDapAn=this.objects.get(position);
        txtTenBoDapAn.setText(boDapAn.getName());
        return row;
    }
}
