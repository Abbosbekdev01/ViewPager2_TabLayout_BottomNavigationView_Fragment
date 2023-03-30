package uz.abbosbek.myviewpager2_injava.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationBarView;

import uz.abbosbek.myviewpager2_injava.R;
import uz.abbosbek.myviewpager2_injava.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment fragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.my_nav_host_fragment);
        assert fragment != null;
        NavController navController = fragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController);

//        binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                return false;
//            }
//        });
    }
}