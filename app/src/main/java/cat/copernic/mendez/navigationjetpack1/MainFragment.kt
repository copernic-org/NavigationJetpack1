package cat.copernic.mendez.navigationjetpack1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import cat.copernic.mendez.navigationjetpack1.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private lateinit var binding: MainFragmentBinding

    companion object {
        fun newInstance() = MainFragment()
    }

//    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainFragmentBinding.inflate(inflater)
//        return inflater.inflate(R.layout.main_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val button = view.findViewById<Button>(R.id.mf_button)
        val button = binding.mfButton
        val action = MainFragmentDirections.actionMainFragmentToFirstFragment("Joan Martinez Lopez")
        button.setOnClickListener {
//            findNavController().navigate(R.id.action_mainFragment_to_firstFragment)
            findNavController().navigate(action)
        }
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}