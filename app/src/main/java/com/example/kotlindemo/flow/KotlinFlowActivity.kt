package com.example.kotlindemo.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.kotlindemo.R
import com.example.kotlindemo.databinding.ActivityKotlinFlowBinding
import com.example.kotlindemo.setupSearchViewWithDebounce
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.launch

class KotlinFlowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKotlinFlowBinding
    private val searchQueryFlow: MutableStateFlow<String> = MutableStateFlow("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_kotlin_flow)

        binding.searchView.setupSearchViewWithDebounce(
            onQueryTextChanged = {
            performSearch(it)
        }, 500, searchQueryFlow)
    }

//    private fun SearchView.setupSearchViewWithDebounce(
//        onQueryTextChanged: (String) -> Unit,
//        debounceTime: Long = 300
//    ) {
//        setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                // Handle submission if needed
//                return true
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                // Update the search query flow
//                searchQueryFlow.value = newText.orEmpty()
//                return true
//            }
//        })
//
//        CoroutineScope(Dispatchers.Main).launch {
//            searchQueryFlow
//                .debounce(debounceTime)
//                .collectLatest { query ->
//                    onQueryTextChanged(query)
//                }
//        }
//    }

    private fun debouncingWithStateFlow() {
        // Observe changes in the search query
        searchQueryFlow
            .debounce(500) // Debounce for 500ms
            .distinctUntilChanged() // Only react to changes
            .onEach { query ->
                // Handle the search query
                performSearch(query)
            }
            .launchIn(lifecycleScope)

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                searchQueryFlow.value = newText.orEmpty()
                return false
            }

        })
    }

    private fun performSearch(query: String) {
        Log.e("TAG_VK", query)
    }
}