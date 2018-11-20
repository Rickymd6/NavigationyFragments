package es.rickymena.navigationyfragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import es.rickymena.navigationyfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManageFragment extends Fragment {
    private TextView txtManage;
    private Button btnManage;
    private ImageView ivImage;
    //2 OPCION
    private  Context context;


    public ManageFragment() {
        // Required empty public constructor

    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();

        // Inflate the layout for this fragment
        //quitamos el reurn
        //return inflater.inflate(R.layout.fragment_manage, container, false);

        View rootView = inflater.inflate(R.layout.fragment_manage, container, false);

        //Todo el codigo necesario para que el Fragment funcione.
        txtManage=rootView.findViewById(R.id.lblManage);
        btnManage=rootView.findViewById(R.id.btnManage);
        ivImage=rootView.findViewById(R.id.ivImagen);

        btnManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Hola mundo",Toast.LENGTH_LONG).show();
            }
        });

        return  rootView;
    }

}
