package com.prucare.salesfunnel.ui.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prucare.salesfunnel.data.Repository
import com.prucare.salesfunnel.ui.theme.AppColors
@Composable fun FunnelScreen(){
    val repo = Repository()
    Column(Modifier.fillMaxSize().background(Color(0xFFF9FAFB)).padding(16.dp)){
        Text("Sales Pipeline", fontSize=22.sp, fontWeight=FontWeight.Bold, modifier=Modifier.padding(bottom=16.dp))
        LazyColumn(verticalArrangement=Arrangement.spacedBy(12.dp)){
            items(repo.getDummyLeads()){ lead ->
                Card(Modifier.fillMaxWidth(), shape=RoundedCornerShape(16.dp), colors=CardDefaults.cardColors(containerColor=Color.White)){
                    Column(Modifier.padding(14.dp)){
                        Row(Modifier.fillMaxWidth(), horizontalArrangement=Arrangement.SpaceBetween){
                            Text(lead.name, fontWeight=FontWeight.Bold, fontSize=14.sp)
                            AssistChip(onClick={}, label={Text(lead.stage.name, fontSize=10.sp)}, colors=AssistChipDefaults.assistChipColors(containerColor=AppColors.lightBg(), labelColor=AppColors.primary()))
                        }
                        Text("Premi: Rp ${lead.premi/1000000}jt • ${lead.lastContact}", fontSize=11.sp, color=Color.Gray, modifier=Modifier.padding(top=4.dp))
                    }
                }
            }
        }
    }
}
