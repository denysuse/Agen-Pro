# Sales Funnel Agen Asuransi - FULLSTACK PREMIUM (Ready to Push)

Projek **siap push ke GitHub** dengan Workflows + Gradle Wrapper + Full Kotlin Code.

![Theme](https://img.shields.io/badge/Theme-RED%20%7C%20GREEN%20%7C%20BLUE-red?style=for-the-badge)
![Kotlin](https://img.shields.io/badge/Kotlin-Compose-7F52FF?style=for-the-badge)
![CI](https://img.shields.io/badge/CI-GitHub%20Actions-green?style=for-the-badge)

## ✨ Fitur
- **5 Screens Premium**: Dashboard, Funnel Pipeline, Agenda Follow-up (data asli: Rony Alwis & Zain), Leads, Profile
- **3 Varian Tema**: RED `#DC2626`, GREEN `#16A34A`, BLUE `#2563EB` - ganti 1 baris di `Theme.kt`
- **Fullstack**: Android App (Compose) + Backend Ktor API + Room DB
- **CI/CD Ready**: `.github/workflows/android.yml` auto build APK setiap push
- **Gradle Ready**: wrapper, build files, manifest lengkap

## 🎨 Ganti Tema
Buka `app/src/main/java/com/prucare/salesfunnel/ui/theme/Theme.kt`
```kotlin
var activeTheme = AppTheme.RED // ganti ke GREEN atau BLUE
```

## 🚀 Cara Push ke Repo Baru (Tanpa Pengaruh Main)
1. Buat repo baru di GitHub: `prucare-bot/sales-funnel-fullstack-premium` (Public, jangan centang README)
2. Extract zip ini, buka terminal di foldernya:
```bash
git init
git add .
git commit -m "feat: fullstack premium full code with workflows"
git branch -M main
git remote add origin https://github.com/prucare-bot/sales-funnel-fullstack-premium.git
git push -u origin main
```
3. GitHub Actions akan otomatis build APK → cek di tab **Actions**

## 🏃‍♂️ Jalanin Lokal
**Android:**
- Open di Android Studio > Sync > Run

**Backend:**
```bash
./gradlew :backend:run
# http://localhost:8080
```

## 📦 Build APK
```bash
./gradlew :app:assembleDebug
# hasil di app/build/outputs/apk/debug/app-debug.apk
```

Repo lama `sales-funnel-agen-asuransi-kotlin-manus` tetap aman tidak tersentuh.

Dibuat untuk Deny Susetio - PruCare Bot
