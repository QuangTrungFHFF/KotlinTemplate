package com.quangtrung.recyclerviewtemplate.fragment.verticallist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.quangtrung.recyclerviewtemplate.R
import com.quangtrung.recyclerviewtemplate.databinding.FragmentVerticalListBinding

/**
 * A simple RecyclerView that show a vertical list of items.
 */
class VerticalListFragment : Fragment() {

    private var _binding : FragmentVerticalListBinding? = null
    private val binding get() = _binding!!

    private val viewModel:VerticalListViewModel by lazy {
        val activity = requireNotNull(this.activity){
        }
        ViewModelProvider(this,VerticalListViewModel.Factory(activity.application)).get(VerticalListViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVerticalListBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}