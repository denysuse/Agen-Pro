package com.prucare.salesfunnel.ui.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prucare.salesfunnel.ui.theme.AppColors
@Composable fun ProfileScreen(){
    Column(Modifier.fillMaxSize().background(Color(0xFFF9FAFB)).padding(20.dp)){
        Text("Profil Agen", fontWeight=FontWeight.Bold, fontSize=22.sp)
        Spacer(Modifier.height(16.dp))
        Card(Modifier.fillMaxWidth(), shape=RoundedCornerShape(20.dp), colors=CardDefaults.cardColors(containerColor=Color.White)){
            Column(Modifier.padding(20.dp)){
                Text("Deny Susetio", fontWeight=FontWeight.Bold, fontSize=18.sp)
                Text("Agen Senior • PruCare", color=Color.Gray, fontSize=12.sp)
                Spacer(Modifier.height(16.dp))
                Text("Target Bulanan", fontSize=12.sp)
                LinearProgressIndicator(progress=0.72f, modifier=Modifier.fillMaxWidth().height(8.dp).padding(top=6.dp), color=AppColors.primary())
                Text("72% • Rp 72jt / Rp 100jt", fontSize=11.sp, color=AppColors.primary(), modifier=Modifier.padding(top=6.dp))
            }
        }
    }
}
