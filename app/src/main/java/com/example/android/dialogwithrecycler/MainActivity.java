package com.example.android.dialogwithrecycler;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1);

        arrayAdapter.add("A");
        arrayAdapter.add("B");
        arrayAdapter.add("C");
        arrayAdapter.add("D");
        arrayAdapter.add("E");
        arrayAdapter.add("A");
        arrayAdapter.add("B");
        arrayAdapter.add("C");
        arrayAdapter.add("D");
        arrayAdapter.add("E");
        arrayAdapter.add("A");
        arrayAdapter.add("B");
        arrayAdapter.add("C");
        arrayAdapter.add("D");
        arrayAdapter.add("E");

        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Outer");

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_title, null);
        final View viewSpinner = inflater.inflate(R.layout.dialog_spinner,null);

        ImageView imageView = view.findViewById(R.id.btn);

        builder.setCustomTitle(view);
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "OK from the outside.", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        builder.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertDialog.Builder builderInner=new AlertDialog.Builder(MainActivity.this);
                builderInner.setTitle("Inner");
                builderInner.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "OK from the inside.", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                });
                builderInner.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builderInner.show();
            }
        });
        builder.show();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builderSpinner = new AlertDialog.Builder(MainActivity.this);
                builderSpinner.setTitle("Spinner");
                Spinner mSpinner=viewSpinner.findViewById(R.id.spinner);
                ArrayAdapter<String> adapterSpinner=new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_item,
                        getResources().getStringArray(R.array.applianceList));
                adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpinner.setAdapter(adapterSpinner);
                builderSpinner.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
            }
        });
    }
}
