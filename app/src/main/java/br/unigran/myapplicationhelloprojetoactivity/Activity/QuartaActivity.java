package br.unigran.myapplicationhelloprojetoactivity.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import br.unigran.myapplicationhelloprojetoactivity.Fragmentos.CadastroFornecedorFragment;
import br.unigran.myapplicationhelloprojetoactivity.Fragmentos.FornecedorListaFragment;
import br.unigran.myapplicationhelloprojetoactivity.R;

public class QuartaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);
        setResult(80);

        FornecedorListaFragment lista = new FornecedorListaFragment(); //cria fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction(); //cria transação

        transaction.add(R.id.idframe, lista); //add fragmento
        transaction.commit();//valida adição


    }
    public void primeiraTela(View view){
        getSupportFragmentManager().beginTransaction().//cria transacao
                replace(R.id.idframe,new FornecedorListaFragment())//add fragmento
                .commit();//valida a adição
    }
    public void segundaTela(View view){
        getSupportFragmentManager().beginTransaction().//cria transacao
                replace(R.id.idframe,new CadastroFornecedorFragment())//add fragmento
                .commit();//valida a adição
    }

}
