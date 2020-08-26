package ScalaDev

import common.CommonConfig

object LoadConfig extends App{
    println("LoadConfig now...")

    val _user = CommonConfig.user
    val _directory = CommonConfig.directory
    val _dbname = CommonConfig.dbname
    val _dbschema = CommonConfig.dbschema
    
    println(_user)
    println(_directory)
    println(_dbname)
    println(_dbschema)
}