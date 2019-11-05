package server

import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.OutputStream

enum class Method {GET, POST, PUT, DELETE}

class Request (input: InputStream)
{
    val resource: String
    val method: Method
    init
    {
        val reader = input.bufferedReader()
        val line = reader.readLine()
        val parts = line.split(" ")
        resource = parts[1]
        method = Method.valueOf(parts[0])
    }
}

class Response(output: OutputStream)
{
    fun appende(text: String)
    {
        TODO("Implement")
    }
    fun send()
    {
        TODO("SEND")
    }
}

fun main() {
    var output = ByteArrayOutputStream(1024)
    val writer = output.bufferedWriter()

    

}

fun main() {
    val requestText = """
        GET /resuource HTTP/1.1
    """.trimIndent()

    val bytes = requestText.toByteArray().inputStream()
    val bin = bytes.bufferedReader()
    println(bin.readLine())
}