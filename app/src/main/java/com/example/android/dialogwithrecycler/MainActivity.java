package com.example.android.dialogwithrecycler;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View viewSpinner = getLayoutInflater().inflate(R.layout.dialog_spinner,null);
        final Spinner mSpinner = viewSpinner.findViewById(R.id.spinner);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1);
        final AlertDialog.Builder builderSpinner = new AlertDialog.Builder(MainActivity.this);

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

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_title, null);

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

            }
        });
        builder.show();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mSpinner.getParent().getParent()!=null) {
                    ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                }
                builderSpinner.setTitle("Spinner");
                builderSpinner.setView(viewSpinner);
                ArrayAdapter<String> adapterSpinner=new ArrayAdapter<>(MainActivity.this,
                        android.R.layout.simple_spinner_item,
                        getResources().getStringArray(R.array.applianceList));
                adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpinner.setAdapter(adapterSpinner);
                builderSpinner.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builderSpinner.show();
            }
        });

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("AC")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Fan")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Lift")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Geyser")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Washing Machine")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("RO")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Dishwasher")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Microwave")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Refrigerator")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("TV")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("CCTV")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Iron")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Induction")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Router")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Heater")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("D2H")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.VISIBLE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.GONE);
                    builderSpinner.show();
                }

                else if(mSpinner.getSelectedItem().toString().equalsIgnoreCase("Other")){
                    if(mSpinner.getParent().getParent()!=null) {
                        ((ViewGroup) mSpinner.getParent().getParent()).removeView((ViewGroup)mSpinner.getParent());
                    }
                    viewSpinner.findViewById(R.id.ACLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fanLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.liftLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.geyserLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.washingMachineLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ROLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.dishwasherLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.microwaveLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.fridgeLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.TVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.CCTVLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.ironLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.inductionLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.routerLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.heaterLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.D2HLayout).setVisibility(View.GONE);
                    viewSpinner.findViewById(R.id.otherLayout).setVisibility(View.VISIBLE);
                    builderSpinner.show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
