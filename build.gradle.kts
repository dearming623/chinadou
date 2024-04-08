//import java.util.Properties


// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}

//var storePwd by extra("")
//var storeFilePath by extra("")
//var keyAlias by extra("")
//var keyPwd by extra("")
//
//// 在Gradle构建脚本中
//val properties: Properties = Properties()
//// 确保文件存在
//val localPropertiesFile: File = project.rootProject.file("local.properties")
//if (localPropertiesFile.exists()) {
//    properties.load(localPropertiesFile.inputStream())
//    properties.getProperty("sdk.dir")
//    storePwd = properties.getProperty("store.pwd")
//    storeFilePath = properties.getProperty("store.filePath")
//    keyAlias = properties.getProperty("key.Alias")
//    keyPwd = properties.getProperty("key.pwd")
//}








