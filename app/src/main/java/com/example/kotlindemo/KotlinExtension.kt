package com.example.kotlindemo

import androidx.appcompat.widget.SearchView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.launch

fun SearchView.setupSearchViewWithDebounce(
    onQueryTextChanged: (String) -> Unit,
    debounceTime: Long = 300, searchQueryFlow : MutableStateFlow<String>
) {
    setOnQueryTextListener(object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            // Handle submission if needed
            return true
        }

        override fun onQueryTextChange(newText: String?): Boolean {
            // Update the search query flow
            searchQueryFlow.value = newText.orEmpty()
            return true
        }
    })

    CoroutineScope(Dispatchers.Main).launch {
        searchQueryFlow
            .debounce(debounceTime)
            .collectLatest { query ->
                onQueryTextChanged(query)
            }
    }
}