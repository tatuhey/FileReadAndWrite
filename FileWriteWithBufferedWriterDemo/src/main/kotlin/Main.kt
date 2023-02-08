/*
    Name        : Raihan Khalil Abdillah
    ID          : 30065695
    AT1 - Portofolio 1, Activity 5 Task B
    File Write with Buffered Writer Demo
 */

import java.io.File

fun main(args: Array<String>){
    val fileName = "BufferedWriter.txt"
    val myfile = File(fileName)
    val message = """Kotlin is a pragmatic programming language for the JVM and Android that combines 
Object-Oriented and functional features and is focused on interoperability, safety, clarity, 
and tooling support.
Being a general-purpose language, Kotlin works everywhere where Java works."""

    myfile.bufferedWriter().use{out ->
        out.write(message+"\n")

    }
}

