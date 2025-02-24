package br.com.cfmaradeia.orgs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.cfmaradeia.orgs.R
import br.com.cfmaradeia.orgs.model.Produto
import br.com.cfmaradeia.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal


class MainActivity : AppCompatActivity(R.layout.activity_main){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = findViewById<RecyclerView>(R.id.listagem)
        recyclerView.adapter = ListaProdutosAdapter(context = this, listOf(
            Produto("Salada de fruta", "Manga, maçã e banana", BigDecimal("19.90")),
            Produto("Suco", "Laranja", BigDecimal("15.90"))
        ))
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
