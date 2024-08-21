//Kotlin File에 직접 함수로 정의하면 자바의 static 함수처럼 접근가능
//패키지명이 없는경우 default package로 속하게 되어, 함수명으로 바로 접근 (package 사용 권장)
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}
