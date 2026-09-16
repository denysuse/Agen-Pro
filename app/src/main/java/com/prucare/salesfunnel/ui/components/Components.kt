package com.prucare.salesfunnel.ui.components
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prucare.salesfunnel.ui.theme.AppColors
data class AgendaItem(val title:String, val client:String, val category:String, val date:String, val initials:String)
@Composable fun AgendaCard(item: AgendaItem){
    Card(Modifier.fillMaxWidth(), shape=RoundedCornerShape(20.dp), colors=CardDefaults.cardColors(containerColor=Color.White), elevation=CardDefaults.cardElevation(6.dp)){
        Row(Modifier.fillMaxWidth()){
            Box(Modifier.width(6.dp).height(100.dp).background(AppColors.primary()))
            Column(Modifier.padding(16.dp).weight(1f)){
                Row(verticalAlignment=Alignment.CenterVertically){
                    Box(Modifier.size(36.dp).clip(RoundedCornerShape(10.dp)).background(AppColors.lightBg()), contentAlignment=Alignment.Center){
                        Text(item.initials, fontWeight=FontWeight.Bold, color=AppColors.primary(), fontSize=14.sp)
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(Modifier.weight(1f)){
                        Text(item.title, fontWeight=FontWeight.Bold, fontSize=15.sp)
                        Text("${item.client} • ${item.category} • ${item.date}", fontSize=11.sp, color=Color.Gray)
                    }
                }
            }
        }
    }
}
@Composable fun StatCard(title:String, value:String, sub:String){
    Card(Modifier.width(150.dp), shape=RoundedCornerShape(18.dp), colors=CardDefaults.cardColors(containerColor=Color.White)){
        Column(Modifier.padding(16.dp)){
            Text(title, fontSize=11.sp, color=Color.Gray)
            Text(value, fontSize=22.sp, fontWeight=FontWeight.ExtraBold, color=Color(0xFF111827), modifier=Modifier.padding(top=4.dp))
            Text(sub, fontSize=10.sp, color=AppColors.primary(), modifier=Modifier.padding(top=2.dp))
        }
    }
}
