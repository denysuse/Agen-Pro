package com.prucare.salesfunnel.data.model
import kotlinx.serialization.Serializable
@Serializable data class Lead(val id:String, val name:String, val phone:String, val stage:FunnelStage, val premi:Long, val lastContact:String, val avatar:String)
enum class FunnelStage { PROSPEK_BARU, PENDEKATAN, PRESENTASI, FOLLOW_UP, CLOSING }
