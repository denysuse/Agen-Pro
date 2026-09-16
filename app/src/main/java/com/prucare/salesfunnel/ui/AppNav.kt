package com.prucare.salesfunnel.ui
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.prucare.salesfunnel.ui.screens.*
import com.prucare.salesfunnel.ui.theme.AppColors
@Composable fun AppNav(){
    var tab by remember { mutableStateOf(0) }
    Scaffold(bottomBar={
        NavigationBar(containerColor=Color.White){
            NavigationBarItem(icon={Icon(Icons.Default.Dashboard,null)}, label={Text("Dashboard")}, selected=tab==0, onClick={tab=0}, colors=NavigationBarItemDefaults.colors(selectedIconColor=AppColors.primary(), indicatorColor=AppColors.lightBg()))
            NavigationBarItem(icon={Icon(Icons.Default.FilterAlt,null)}, label={Text("Funnel")}, selected=tab==1, onClick={tab=1}, colors=NavigationBarItemDefaults.colors(selectedIconColor=AppColors.primary(), indicatorColor=AppColors.lightBg()))
            NavigationBarItem(icon={Icon(Icons.Default.EventNote,null)}, label={Text("Agenda")}, selected=tab==2, onClick={tab=2}, colors=NavigationBarItemDefaults.colors(selectedIconColor=AppColors.primary(), indicatorColor=AppColors.lightBg()))
            NavigationBarItem(icon={Icon(Icons.Default.People,null)}, label={Text("Leads")}, selected=tab==3, onClick={tab=3}, colors=NavigationBarItemDefaults.colors(selectedIconColor=AppColors.primary(), indicatorColor=AppColors.lightBg()))
            NavigationBarItem(icon={Icon(Icons.Default.Person,null)}, label={Text("Profil")}, selected=tab==4, onClick={tab=4}, colors=NavigationBarItemDefaults.colors(selectedIconColor=AppColors.primary(), indicatorColor=AppColors.lightBg()))
        }
    }){ pad -> Box(Modifier.padding(pad)){ when(tab){ 0->DashboardScreen(); 1->FunnelScreen(); 2->AgendaScreen(); 3->LeadsScreen(); 4->ProfileScreen() } } }
}
