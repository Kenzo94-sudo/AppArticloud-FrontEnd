package com.articloud.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.articloud.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Referencias
        val txtNombre = view.findViewById<TextView>(R.id.txtNombre)
        val txtEmail = view.findViewById<TextView>(R.id.txtEmail)
        val btnEditar = view.findViewById<Button>(R.id.btnEditar)
        val btnLogout = view.findViewById<Button>(R.id.btnLogout)

        // Datos de prueba (luego lo conectas a login)
        txtNombre.text = "Yeff Yandel"
        txtEmail.text = "yeff@email.com"

        // Eventos
        btnEditar.setOnClickListener {
            // Aquí puedes abrir otra pantalla
        }

        btnLogout.setOnClickListener {
            // Aquí cerrar sesión
            txtNombre.text = "Usuario Invitado"
            txtEmail.text = "correo@ejemplo.com"
        }
    }
}