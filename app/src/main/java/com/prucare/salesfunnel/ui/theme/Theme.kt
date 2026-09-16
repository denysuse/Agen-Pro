package com.prucare.salesfunnel.ui.theme
import androidx.compose.ui.graphics.Color
enum class AppTheme { RED, GREEN, BLUE }
var activeTheme = AppTheme.RED
object AppColors {
    val redPrimary = Color(0xFFDC2626); val redDark = Color(0xFF7F1D1D); val redLight = Color(0xFFFFF5F5)
    val greenPrimary = Color(0xFF16A34A); val greenDark = Color(0xFF14532D); val greenLight = Color(0xFFF0FDF4)
    val bluePrimary = Color(0xFF2563EB); val blueDark = Color(0xFF1E3A8A); val blueLight = Color(0xFFEFF6FF)
    val gold = Color(0xFFF59E0B); val bg = Color(0xFFF9FAFB)
    fun primary() = when(activeTheme){ AppTheme.RED->redPrimary; AppTheme.GREEN->greenPrimary; AppTheme.BLUE->bluePrimary }
    fun dark() = when(activeTheme){ AppTheme.RED->redDark; AppTheme.GREEN->greenDark; AppTheme.BLUE->blueDark }
    fun lightBg() = when(activeTheme){ AppTheme.RED->redLight; AppTheme.GREEN->greenLight; AppTheme.BLUE->blueLight }
    fun gradient() = when(activeTheme){ AppTheme.RED->listOf(redDark, redPrimary); AppTheme.GREEN->listOf(greenDark, greenPrimary); AppTheme.BLUE->listOf(blueDark, bluePrimary) }
}
