package es.rickymena.navigationyfragments.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import es.rickymena.navigationyfragments.R;



public class SlideShowFragment extends Fragment {



    public SlideShowFragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_slide_show, container, false);
        Toast.makeText(getActivity(),"HOLA",Toast.LENGTH_LONG).show();
        return rootView;
    }


}
