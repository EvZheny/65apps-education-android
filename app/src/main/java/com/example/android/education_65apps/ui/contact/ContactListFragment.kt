package com.example.android.education_65apps.ui.contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.education_65apps.R
import com.example.android.education_65apps.databinding.FragmentListContactBinding

class ContactListFragment : Fragment() {

    lateinit var binding: FragmentListContactBinding

    companion object {
        fun newInstance(): ContactListFragment {
            val args = Bundle()
            val fragment = ContactListFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListContactBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().setTitle(R.string.contact_list_title)
        binding.cvContactCard.setOnClickListener {
            val contactId =  getString(R.string.default_id)
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, ContactDetailsFragment.newInstance(contactId))
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

}
