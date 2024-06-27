package com.akirachix.myreaderblog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myreaderblog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvInfo.layoutManager=LinearLayoutManager(this)
        displayAuthor()
    }
    fun displayAuthor(){
        val author1=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author2=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author3=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author4=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author5=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author6=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author7=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author8=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author9=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author10=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
        val author11=Authors("","Ngugi","I will marry when I want","2046/575"," "," "," ")
val myauthors= listOf(author1,author2,author3,author4,author5,author6,author7,author8,author9,author10,author11)
        val authorsAdapter=AuthorsAdapter(myauthors)
        binding.rvInfo.adapter=authorsAdapter
    }
}