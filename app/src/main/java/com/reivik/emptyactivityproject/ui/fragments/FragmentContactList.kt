package com.reivik.emptyactivityproject.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import com.reivik.emptyactivityproject.R

class FragmentContactList : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_contacts_list_item, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().title = getString(R.string.contact_list)

        view.setOnClickListener {
            onClickListener()
        }
    }

    private fun onClickListener() {
        val transaction = parentFragmentManager.beginTransaction()
        transaction
            .replace(R.id.fragmentСontainer, FragmentContactDetails())
            .addToBackStack(null)
            .commit()
    }
}