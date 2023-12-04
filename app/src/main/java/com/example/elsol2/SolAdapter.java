package com.example.elsol2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolAdapter extends RecyclerView.Adapter<SolViewHolder>{

    public static ArrayList<SolarItem> items = new ArrayList<> (Arrays.asList(
            new SolarItem("Corona Solar", R.drawable.corona_solar),
            new SolarItem("Erupción Solar", R.drawable.erupcionsolar),
            new SolarItem("Espículas", R.drawable.espiculas),
            new SolarItem("Filamentos", R.drawable.filamentos),
            new SolarItem("Magnetosfera", R.drawable.magnetosfera),
            new SolarItem("Mancha Solar", R.drawable.manchasolar)
    ));


    @NonNull
    @Override
    public SolViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new SolViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SolViewHolder holder, int position) {
        // Obtiene el item en la posición position
        SolarItem item = items.get(position);


        holder.imageView.setImageResource(item.getImagen());
        holder.toolbar.setTitle(item.getTitulo());
        holder.toolbar.setTitleTextColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.white));
        holder.toolbar.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.my_light_primary));
        holder.toolbar.inflateMenu(R.menu.menu_solar);


        holder.toolbar.setOnMenuItemClickListener(it -> {
            if(it.getItemId() == R.id.action_copiar) {

                // Crea una copia del item
                SolarItem itemCopia = new SolarItem(item.getTitulo() + " (copia)", item.getImagen());

                // Agrega la copia en la posición siguiente a la original
                items.add(position + 1, itemCopia);

                // Notifica al adaptador que se agregó un item en la posición position + 1
                notifyItemInserted(position + 1);

                return true;

            } else if(it.getItemId() == R.id.action_eliminar) {
                // Elimina el item en la posición position
                items.remove(position);

                // Notifica al adaptador que se eliminó un item en la posición position
                notifyItemRemoved(position);

                return true;
            } else {
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
