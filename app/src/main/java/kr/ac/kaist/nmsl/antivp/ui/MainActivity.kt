package kr.ac.kaist.nmsl.antivp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kr.ac.kaist.nmsl.antivp.AntiVPApplication
import kr.ac.kaist.nmsl.antivp.R
import kr.ac.kaist.nmsl.antivp.service.beAdminAndStartCallTracker


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        beAdminAndStartCallTracker(this)
    }
}