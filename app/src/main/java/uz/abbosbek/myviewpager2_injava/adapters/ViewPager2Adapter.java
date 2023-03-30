package uz.abbosbek.myviewpager2_injava.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import uz.abbosbek.myviewpager2_injava.databinding.ItemImageBinding;

public class ViewPager2Adapter extends RecyclerView.Adapter<ViewPager2Adapter.Vh>{

    private List<String> list;

    public ViewPager2Adapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Vh(ItemImageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Vh holder, int position) {
        Picasso.get().load(list.get(position)).into(holder.binding.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Vh extends RecyclerView.ViewHolder{
        ItemImageBinding binding;

        public Vh(@NonNull ItemImageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
