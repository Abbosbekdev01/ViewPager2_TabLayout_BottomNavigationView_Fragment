package uz.abbosbek.myviewpager2_injava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

import uz.abbosbek.myviewpager2_injava.adapters.ViewPager2Adapter;
import uz.abbosbek.myviewpager2_injava.adapters.ViewPager2FragmentAdapter;
import uz.abbosbek.myviewpager2_injava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private List<String> list;
  //  private ViewPager2Adapter viewPager2Adapter; // 1 - usul recyclerViewAdapter
    private ViewPager2FragmentAdapter viewPager2FragmentAdapter;  // 2 - usul fragmentStateAdapter
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loadList();
        viewPager2FragmentAdapter = new ViewPager2FragmentAdapter(this, list);
        binding.viewPager2.setAdapter(viewPager2FragmentAdapter);
//        viewPager2Adapter = new ViewPager2Adapter(list);
//        binding.viewPager2.setAdapter(viewPager2Adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(binding.tabLayout, binding.viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText("Tab - " + position);
            }
        });
        tabLayoutMediator.attach();

        binding.viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {

            }
        });
    }

    private void loadList() {
        list = new ArrayList<>();

        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/AxrN8u_Cr7YQowuxxcy1eIWAbg7svfqg_medium.jpg");
        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/Tf2sFMYPHmMXTf_BvCyDOJQg56PPeuxO_medium.jpg");
        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/baCZ9G93FF45xh3-tL2TTs2BfCa8XMT9_medium.jpg");
        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/yeW-59qSYaXM9gUBJMQZUmFhRPm8z-DW_medium.jpg");
        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/O8c3gaRDIUEqolUrXEX2hlzSJA4BVr_P_medium.jpg");
    }
}