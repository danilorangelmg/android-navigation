package br.com.example.kotlin_architecture_nav.ui

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import br.com.example.kotlin_architecture_nav.R
import kotlinx.android.synthetic.main.fragment_home.*

class FragmentHome: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bt_click.setOnClickListener{
            Navigation.findNavController(it.context as Activity, R.id.nav_host).navigate(R.id.fragmentDetail)
        }
    }
}
