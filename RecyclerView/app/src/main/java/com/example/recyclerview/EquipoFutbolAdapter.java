package com.example.recyclerview;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EquipoFutbolAdapter extends RecyclerView.Adapter<EquipoFutbolAdapter.EquipoFutbolViewHolder> {

    private ArrayList<EquipoFutbol> datos;


    public static class EquipoFutbolViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNombreEquipo;
        private TextView tvEntrenador;
        private TextView tvEstadio;

        public EquipoFutbolViewHolder(View itemView) {
            super(itemView);
            tvNombreEquipo = (TextView) itemView.findViewById(R.id.tvNombreEquipo);
            tvEntrenador = (TextView) itemView.findViewById(R.id.tvEntrenador);
            tvEstadio = (TextView) itemView.findViewById(R.id.tvEstadio);
        }


        public void bindEquipoFutbol(final EquipoFutbol equipoFutbol) {
            tvNombreEquipo.setText(equipoFutbol.getNombreEquipo());
            tvEntrenador.setText(equipoFutbol.getEntrenador());
            tvEstadio.setText(equipoFutbol.getEstadio());
        }
    }


    public EquipoFutbolAdapter(ArrayList<EquipoFutbol> datos) {
        this.datos = datos;
    }

    @Override
    public EquipoFutbolViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_equipofutbol, viewGroup, false);
        EquipoFutbolViewHolder equipoFutbolViewHolderVH = new EquipoFutbolViewHolder(itemView);
        return equipoFutbolViewHolderVH;
    }

    @Override
    public void onBindViewHolder(EquipoFutbolViewHolder viewHolder, int pos) {
        EquipoFutbol coche = datos.get(pos);
        viewHolder.bindEquipoFutbol(coche);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
