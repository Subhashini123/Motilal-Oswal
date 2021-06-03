package com.example.motilal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import com.example.motilal.models.RepositoriesItem
import kotlinx.android.synthetic.main.activity_detailed.*

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.setTitle("Detail of Repository ")
        actionBar?.setDisplayHomeAsUpEnabled(true)
        val d = intent.getParcelableExtra<RepositoriesItem>("DATA")
        println("RECEIVED DATA: $d")
        txt_title.text = d?.name
        txt_desc.text = d?.description
        txt_download_url.text = d?.downloads_url
        txt_commits.text = d?.commits_url

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}