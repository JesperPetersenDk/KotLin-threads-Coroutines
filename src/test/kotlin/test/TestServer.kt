package test

import junit.framework.Assert.assertEquals
import org.junit.Test
import server.Method
import server.Request

class  ProtocolTest{
    val  textRequest = """
            GET /greeter HTTP/1.1
            """.trimIndent()

    @Test
    fun testRequestResource(){
        val input = textRequest.byteInputStream()
        val request = Request(input)
        assertEquals("/greeter", request.resource)
    }

    @Test
    fun testRequestMethod(){
        val input = textRequest.byteInputStream()
        val request = Request(input)
        assertEquals(Method.GET, request.method)
    }


}