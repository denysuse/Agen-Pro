package com.prucare.salesfunnel.ui.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prucare.salesfunnel.data.Repository
import com.prucare.salesfunnel.ui.components.StatCard
import com.prucare.salesfunnel.ui.theme.AppColors
@Composable fun DashboardScreen(){
    val repo = Repository()
    val stats = repo.getFunnelStats()
    Column(Modifier.fillMaxSize().background(Brush.verticalGradient(AppColors.gradient())).padding(20.dp)){
        Text("Halo, Agen Hebat! 👋", color=Color.White, fontSize=24.sp, fontWeight=FontWeight.Bold)
        Text("Ringkasan penjualan hari ini", color=Color.White.copy(0.8f), fontSize=13.sp, modifier=Modifier.padding(bottom=20.dp))
        LazyRow(horizontalArrangement=Arrangement.spacedBy(12.dp)){
            items(listOf(Triple("Total Prospek","35","↑ 12%"), Triple("Follow-up","7 Hari ini","3 overdue"), Triple("Closing Rate","42%","↑ 8%"))){ StatCard(it.first, it.second, it.third) }
        }
        Spacer(Modifier.height(20.dp))
        Card(Modifier.fillMaxWidth(), shape=RoundedCornerShape(20.dp), colors=CardDefaults.cardColors(containerColor=Color.White)){
            Column(Modifier.padding(16.dp)){
                Text("Funnel Hari Ini", fontWeight=FontWeight.Bold)
                Spacer(Modifier.height(12.dp))
                stats.forEach{ (stage,count) -> Row(Modifier.fillMaxWidth().padding(vertical=4.dp), horizontalArrangement=Arrangement.SpaceBetween){ Text(stage.name.replace("_"," "), fontSize=12.sp); Text("$count", fontWeight=FontWeight.Bold, color=AppColors.primary()) } }
            }
        }
    }
}
