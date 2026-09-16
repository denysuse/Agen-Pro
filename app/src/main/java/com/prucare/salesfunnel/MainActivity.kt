package com.prucare.salesfunnel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.prucare.salesfunnel.ui.AppNav
import com.prucare.salesfunnel.ui.theme.AppTheme
import com.prucare.salesfunnel.ui.theme.activeTheme
class MainActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        activeTheme = AppTheme.RED // RED, GREEN, BLUE - GANTI TEMA DISINI
        setContent{ MaterialTheme{ Surface(Modifier.fillMaxSize()){ AppNav() } } }
    }
}
