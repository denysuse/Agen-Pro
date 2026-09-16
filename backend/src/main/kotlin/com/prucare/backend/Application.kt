package com.prucare.backend
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
@Serializable data class LeadDto(val id:String, val name:String, val stage:String, val premi:Long)
@Serializable data class AgendaDto(val id:String, val title:String, val client:String, val date:String)
fun main(){ embeddedServer(Netty, port=8080, module=Application::module).start(wait=true) }
fun Application.module(){
    install(ContentNegotiation){ json() }
    install(CORS){ anyHost() }
    routing{
        get("/") { call.respondText("PruCare Sales Funnel API Running") }
        get("/api/leads") { call.respond(listOf(LeadDto("1","A Rony Alwis-TK91","PRESENTASI",12000000), LeadDto("2","Zain","FOLLOW_UP",8500000))) }
        get("/api/agenda") { call.respond(listOf(AgendaDto("1","Meeting Penting","A Rony Alwis-TK91","25 Agu 2026, 17:02"), AgendaDto("2","presentasi miuhc","Zain","27 Agu 2026, 04:51"))) }
        get("/api/funnel/stats") { call.respond(mapOf("PROSPEK_BARU" to 12, "PENDEKATAN" to 8, "PRESENTASI" to 5, "FOLLOW_UP" to 7, "CLOSING" to 3)) }
    }
}
