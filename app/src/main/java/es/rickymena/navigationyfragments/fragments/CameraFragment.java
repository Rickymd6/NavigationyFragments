package es.rickymena.navigationyfragments.fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import es.rickymena.navigationyfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends Fragment {

private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSuma,btnResta,btnCalcular;
private TextView txtSolu;
    private String operador;
    private int op1,op2;
    int res = 0;
    private Context context;
    public CameraFragment() {
        // Required empty public constructor
        context = getActivity();
    }



    //Llama al inflater que se encarga de inflar ese xml que se va a usar.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_camera, container, false);
        btn1=rootView.findViewById(R.id.btn1);
        btn2=rootView.findViewById(R.id.btn2);
        btn3=rootView.findViewById(R.id.btn3);
        btn4=rootView.findViewById(R.id.btn4);
        btn5=rootView.findViewById(R.id.btn5);
        btn6=rootView.findViewById(R.id.btn6);
        btn7=rootView.findViewById(R.id.btn7);
        btn8=rootView.findViewById(R.id.btn8);
        btn9=rootView.findViewById(R.id.btn9);
        btnSuma=rootView.findViewById(R.id.btnSuma);
        btnResta=rootView.findViewById(R.id.btnResta);
        btnCalcular=rootView.findViewById(R.id.btnCalcular);
        txtSolu=rootView.findViewById(R.id.txtSolu);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolu.append("1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolu.append("2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolu.append("3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolu.append("4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolu.append("5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolu.append("6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolu.append("7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolu.append("8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSolu.append("9");

            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1=Integer.parseInt(txtSolu.getText().toString());
                operador="suma";
                txtSolu.setText("");


            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1=Integer.parseInt(txtSolu.getText().toString());
                operador="resta";
                txtSolu.setText("");


            }
        });
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                op2=Integer.parseInt(txtSolu.getText().toString());
                if (operador=="suma"){
                    res=op1+op2;
                    txtSolu.setText(res);

                } else if (operador=="resta"){
                    res=op1-op2;
                    txtSolu.setText(res);

                }
            }
        });


        return  rootView;
    }

}
