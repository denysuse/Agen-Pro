package com.prucare.salesfunnel.ui.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Message
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prucare.salesfunnel.data.Repository
import com.prucare.salesfunnel.ui.theme.AppColors
@Composable fun LeadsScreen(){
    val repo = Repository()
    Column(Modifier.fillMaxSize().background(Color(0xFFF9FAFB)).padding(16.dp)){
        Text("Daftar Prospek", fontWeight=FontWeight.Bold, fontSize=20.sp, modifier=Modifier.padding(bottom=12.dp))
        LazyColumn(verticalArrangement=Arrangement.spacedBy(10.dp)){
            items(repo.getDummyLeads()){ lead ->
                Card(Modifier.fillMaxWidth(), shape=RoundedCornerShape(16.dp), colors=CardDefaults.cardColors(containerColor=Color.White)){
                    Row(Modifier.padding(12.dp), verticalAlignment=Alignment.CenterVertically){
                        Box(Modifier.size(44.dp).clip(RoundedCornerShape(12.dp)).background(AppColors.lightBg()), contentAlignment=Alignment.Center){ Text(lead.avatar, fontWeight=FontWeight.Bold, color=AppColors.primary()) }
                        Spacer(Modifier.width(12.dp))
                        Column(Modifier.weight(1f)){ Text(lead.name, fontWeight=FontWeight.Bold, fontSize=14.sp); Text(lead.phone+" • "+lead.lastContact, fontSize=11.sp, color=Color.Gray) }
                        IconButton(onClick={}){ Icon(Icons.Default.Message, contentDescription=null, tint=AppColors.primary()) }
                        IconButton(onClick={}){ Icon(Icons.Default.Call, contentDescription=null, tint=Color.Gray) }
                    }
                }
            }
        }
    }
}
