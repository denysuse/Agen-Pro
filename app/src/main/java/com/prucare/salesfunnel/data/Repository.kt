package com.prucare.salesfunnel.data
import com.prucare.salesfunnel.data.model.*
class Repository {
    fun getDummyLeads() = listOf(
        Lead("1","A Rony Alwis-TK91","0812xxxx",FunnelStage.PRESENTASI,12000000,"25 Agu 2026","RA"),
        Lead("2","Zain","0821xxxx",FunnelStage.FOLLOW_UP,8500000,"27 Agu 2026","Z"),
        Lead("3","Budi Santoso","0813xxxx",FunnelStage.PROSPEK_BARU,15000000,"28 Agu 2026","BS"),
        Lead("4","Siti Aminah","0856xxxx",FunnelStage.CLOSING,25000000,"26 Agu 2026","SA")
    )
    fun getDummyAgenda() = listOf(
        com.prucare.salesfunnel.ui.components.AgendaItem("Meeting Penting","A Rony Alwis-TK91","Lainnya","25 Agu 2026, 17:02","RA"),
        com.prucare.salesfunnel.ui.components.AgendaItem("presentasi miuhc","Zain","Pertemuan","27 Agu 2026, 04:51","Z"),
        com.prucare.salesfunnel.ui.components.AgendaItem("Follow-up Polis","Budi Santoso","Follow-up","28 Agu 2026, 10:00","BS")
    )
    fun getFunnelStats() = mapOf(FunnelStage.PROSPEK_BARU to 12, FunnelStage.PENDEKATAN to 8, FunnelStage.PRESENTASI to 5, FunnelStage.FOLLOW_UP to 7, FunnelStage.CLOSING to 3)
}
