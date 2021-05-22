package com.quangtrung.recyclerviewtemplate.fragment.verticallist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VerticalListViewModel(
    application : Application
) : AndroidViewModel(application){







    /**
     * Factory for constructing InfoViewModel with parameter
     */
    class Factory(val app: Application) : ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if(modelClass.isAssignableFrom(VerticalListViewModel::class.java)){
                return VerticalListViewModel(app) as T
            }
            throw IllegalArgumentException("Unable to construct viewmodel")
        }

    }
}