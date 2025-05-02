import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import kotlinx.serialization.*

@Serializable
data class ApiResponse(val message: String)

suspend fun fetchDataFromBackend(): ApiResponse? {
    return withContext(Dispatchers.IO) {
        val client = HttpClient(CIO) {
            install(ContentNegotiation) {
                json(Json { ignoreUnknownKeys = true })
            }
        }
        try {
            val response: ApiResponse = client.get("http://127.0.0.1:5000/api/data").body()
            response
        } catch (e: Exception) {
            e.printStackTrace()
            null
        } finally {
            client.close()
        }
    }
}