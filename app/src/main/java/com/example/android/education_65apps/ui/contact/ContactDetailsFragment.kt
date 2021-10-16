package com.example.android.education_65apps.ui.contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.education_65apps.R
import com.example.android.education_65apps.common.Constants
import com.example.android.education_65apps.databinding.FragmentDetailsContactBinding

class ContactDetailsFragment : Fragment() {

    lateinit var binding: FragmentDetailsContactBinding

    companion object {
        fun newInstance(contactId: String? = null): ContactDetailsFragment {
            val args = Bundle()
            contactId?.let {
                args.putString(Constants.CONTACT_ID, it)
            }
            val fragment = ContactDetailsFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsContactBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().setTitle(R.string.contact_details_title)
        val contactId = arguments?.getString(Constants.CONTACT_ID, null)
        val contactName = contactId?.let {
            R.string.default_contact_name
        } ?: kotlin.run {
            R.string.no_contact_id
        }
        binding.tvContactName.setText(contactName)
    }

}
