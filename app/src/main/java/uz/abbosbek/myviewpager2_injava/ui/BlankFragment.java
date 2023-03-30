package uz.abbosbek.myviewpager2_injava.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import uz.abbosbek.myviewpager2_injava.R;
import uz.abbosbek.myviewpager2_injava.databinding.FragmentBlankBinding;

public class BlankFragment extends Fragment {

   private static final String ARG_PARAM1 = "param1";


    private String mParam1;

    public BlankFragment() {
       }

     public static BlankFragment newInstance(String param1) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    private FragmentBlankBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBlankBinding.inflate(inflater, container, false);

        Picasso.get().load(mParam1).into(binding.image);
        return binding.getRoot();
    }
}