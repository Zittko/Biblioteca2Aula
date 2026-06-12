package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;
import java.util.zip.Inflater;

public class AdapterLivros extends RecyclerView.Adapter<AdapterLivros.ViewHolder> {
    private Context context;
    private List<Livros> LstLivros;

    public AdapterLivros(Context context, List<Livros> lstLivros) {
        this.context = context;
        LstLivros = lstLivros;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_livros, parent, false);

        return new ViewHolder(view);
        // inflate
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Faz o posicionamento dos componentes e o recebimento dos cliques (todos os mecanismos ficam aqui) get e set, etc.
        holder.ModeloImgLivros.setImageResource(LstLivros.get(position).getImgLivro());
        holder.ModeloTituloLivro.setText(LstLivros.get(position).getTitulo());
        holder.ModeloDescLivro.setText(LstLivros.get(position).getDescricao());
    }

    @Override
    public int getItemCount() {
        // Quantos itens tem na lista?
        // MUDAR A VARIAVEL
        return LstLivros.size();

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView ModeloCardLivros;
        ImageView ModeloImgLivros;
        TextView ModeloTituloLivro;
        TextView ModeloDescLivro;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            ModeloCardLivros =  itemView.findViewById(R.id.ModeloCardLivros);
            ModeloImgLivros = itemView.findViewById(R.id.ModeloImgLivros);
            ModeloTituloLivro = itemView.findViewById(R.id.ModeloTituloLivro);
            ModeloDescLivro = itemView.findViewById(R.id.ModeloDescLivro);
        }
    }
}