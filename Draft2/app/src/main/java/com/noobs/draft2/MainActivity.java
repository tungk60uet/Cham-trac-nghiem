package com.noobs.draft2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.noobs.adapter.BoDapAnAdapter;
import com.noobs.model.BoDapAn;
import com.noobs.model.DapAn;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBoDapAn;
    Button btnAdd;
    ArrayList<BoDapAn> dsBoDapAn;
    BoDapAnAdapter adapterBoDapAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyBtnAddClick();
            }
        });

    }

    private void xuLyBtnAddClick() {
        AlertDialog.Builder mBuilder=new AlertDialog.Builder(MainActivity.this);
        View mView=getLayoutInflater().inflate(R.layout.dialog_type_name,null);
        final EditText mName= (EditText) mView.findViewById(R.id.txtName);
        Button btnOk= (Button) mView.findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mName.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this,"Hãy nhập tên bộ đáp án!",Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(MainActivity.this,"Đi ăn cơm lát về xử lý!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBuilder.setView(mView);
        AlertDialog dialog=mBuilder.create();
        dialog.show();

    }

    private void addControls() {
        lvBoDapAn= (ListView) findViewById(R.id.lvBoDapAn);
        btnAdd= (Button) findViewById(R.id.btnAdd);
        dsBoDapAn=new ArrayList<>();
        adapterBoDapAn=new BoDapAnAdapter(MainActivity.this,R.layout.item,dsBoDapAn);
        lvBoDapAn.setAdapter(adapterBoDapAn);
        gialapbodapan();

    }

    private void gialapbodapan() {
        String arr1="Abcd";
        DapAn da1=new DapAn(123,arr1);
        DapAn da2=new DapAn(124,arr1);
        ArrayList<DapAn> dsDa=new ArrayList<>();
        dsDa.add(da1);
        dsDa.add(da2);
        BoDapAn boDa=new BoDapAn("VatLy",dsDa);
        BoDapAn boDa1=new BoDapAn("Toan",dsDa);
        BoDapAn boDa2=new BoDapAn("Hoa",dsDa);
        dsBoDapAn.add(boDa);
        dsBoDapAn.add(boDa1);
        dsBoDapAn.add(boDa2);
        adapterBoDapAn.notifyDataSetChanged();
    }
}
