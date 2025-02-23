package br.com.cfmaradeia.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.cfmaradeia.orgs.R
import br.com.cfmaradeia.orgs.model.Produto
import br.com.cfmaradeia.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal


class MainActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.listagem)
        recyclerView.adapter = ListaProdutosAdapter(context = this, listOf(
            Produto("Salada de fruta", "Manga, maçã e banana", BigDecimal("19.90")),
            Produto("Suco", "Laranja", BigDecimal("15.90"))
        ))
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
