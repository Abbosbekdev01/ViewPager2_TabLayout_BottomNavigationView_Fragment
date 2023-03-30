package uz.abbosbek.myviewpager2_injava.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

import uz.abbosbek.myviewpager2_injava.ui.BlankFragment;

public class ViewPager2FragmentAdapter extends FragmentStateAdapter {

    private List<String> list;

    public ViewPager2FragmentAdapter(@NonNull FragmentActivity fragmentActivity, List<String> list) {
        super(fragmentActivity);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return BlankFragment.newInstance(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
