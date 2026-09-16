package com.prucare.salesfunnel.ui.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prucare.salesfunnel.data.Repository
import com.prucare.salesfunnel.ui.components.AgendaCard
import com.prucare.salesfunnel.ui.theme.AppColors
@Composable fun AgendaScreen(){
    val repo = Repository()
    Column(Modifier.fillMaxSize().background(Brush.verticalGradient(AppColors.gradient())).padding(20.dp)){
        Text("Agenda Follow-up", color=Color.White, fontSize=26.sp, fontWeight=FontWeight.ExtraBold)
        Text("Jangan lewatkan follow-up penting", color=Color.White.copy(0.8f), fontSize=13.sp, modifier=Modifier.padding(bottom=20.dp))
        LazyColumn(verticalArrangement=Arrangement.spacedBy(14.dp)){ items(repo.getDummyAgenda()){ AgendaCard(it) } }
    }
}
