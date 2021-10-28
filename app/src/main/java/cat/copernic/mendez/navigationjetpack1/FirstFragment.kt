package cat.copernic.mendez.navigationjetpack1

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class FirstFragment : Fragment() {

    companion object {
        fun newInstance() = FirstFragment()
    }

//    private lateinit var viewModel: FirstViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val safeArgs: FirstFragmentArgs by navArgs()
        val nom = safeArgs.nom
        Toast.makeText(activity, "Hola: $nom", Toast.LENGTH_LONG).show()
        Log.d("FirstFragment", nom)
//        viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }


}