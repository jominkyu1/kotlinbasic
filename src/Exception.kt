import java.io.BufferedReader
import java.io.File
import java.io.FileReader

//JAVA의경우 IOException Checked Exception 처리를 해줘야 하지만 Kotlin은 모두 Unchecked로 처리
fun main(){
    readFile()
    println("----------")
    readFile2("./a.txt")
}

fun parseInt(str: String): Int{
    return try {
        str.toInt()
    }catch(e: NumberFormatException){
        throw IllegalArgumentException("${str}: 올바른 숫자가 아닙니다.")
    }
}

fun parseIntV2(str: String): Int?{
    return try{
        str.toInt()
    }catch(e: NumberFormatException){
        null
    }
}

fun readFile(){
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))

    while(reader.ready()){
        println(reader.readLine())
    }

    reader.close()
}

fun readFile2(path: String) {
    BufferedReader(FileReader(path)).use {
       it.lines().forEach { line -> println(line) }
    }
}