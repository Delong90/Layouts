package com.example.layouts

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed


//class MainActivity : AppCompatActivity() {
//
//    private val handler = Handler()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContentView(R.layout.activity_cl_states_start)
//        stateConstraintLayout.loadLayoutDescription(R.xml.constraint_layout_states)
//        var changed = false
//        button.setOnClickListener {
//            stateConstraintLayout.setState(R.id.loading, 0, 0)
//            postDelayed(handler,  {
//                stateConstraintLayout.setState(if (changed) R.id.start else R.id.end,0, 0)
//                changed = !changed
//            }, null, 3000L)
//        }
//    }
//}




// свайп

//import android.os.Bundle
//import android.os.Handler
//import androidx.appcompat.app.AppCompatActivity
//import java.util.*
//import com.example.layouts.databinding.SwipeRefreshLayoutBinding
//
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var random: Random
//    private lateinit var handler: Handler
//    private lateinit var runnable: Runnable
//    private lateinit var binding: SwipeRefreshLayoutBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = SwipeRefreshLayoutBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//
//        random = Random()
//        handler = Handler()
//
//        binding.swipeRefreshLayout.setOnRefreshListener {
//            // Initialize a new Runnable
//            runnable = Runnable {
//                // Update the text view text with a random number
//                binding.textView.text = "Котика пора кормить. Его не кормили уже ${1 + random.nextInt(10)} минут"
//
//                // Hide swipe to refresh icon animation
//                binding.swipeRefreshLayout.isRefreshing = false
//            }
//
//            // Execute the task after specified time
//            handler.postDelayed(
//                runnable, 3000.toLong()
//            )
//        }
//
//        binding.swipeRefreshLayout.setColorSchemeResources(
//            android.R.color.holo_blue_bright,
//            android.R.color.holo_green_light,
//            android.R.color.holo_orange_light,
//            android.R.color.holo_red_light
//        )
//    }
//}