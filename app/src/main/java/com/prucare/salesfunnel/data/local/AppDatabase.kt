package com.prucare.salesfunnel.data.local
import androidx.room.*
@Entity data class LeadEntity(@PrimaryKey val id:String, val name:String, val stage:String, val premi:Long)
@Dao interface LeadDao { @Query("SELECT * FROM LeadEntity") suspend fun getAll(): List<LeadEntity>; @Insert(onConflict=OnConflictStrategy.REPLACE) suspend fun insertAll(vararg leads: LeadEntity) }
@Database(entities=[LeadEntity::class], version=1, exportSchema=false) abstract class AppDatabase: RoomDatabase(){ abstract fun leadDao(): LeadDao }
