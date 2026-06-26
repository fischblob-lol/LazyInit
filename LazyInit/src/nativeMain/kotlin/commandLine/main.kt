/*___________________________________
| * the lazyinit project
| * proudly written in kotlin, bash and C++
| * by bigi,h3lix and sundowner
| * lazyinit is free software, with hopes that it
| * will be useful, but WITHOUT ANY WARRANTY OR LIABILITY AT ALL
| * this file serves for arguments
|________________________________
 */

fun main(args: Array<String>) {
    println("[LazyInit] Initialized!")

    if (args.isEmpty()) {
        println("Usage: lazyinitctl <command> [options]")
        println("Commands: start, stop, status, restart")
        return
    }

    val command = args[0]

    when (command) {
        "start" -> startService(args.drop(1))
        "stop" -> stopService(args.drop(1))
        "status" -> showStatus(args.drop(1))
        "restart" -> restartService(args.drop(1))
        "enable" -> enableService(args.drop(1))
        "disable" -> disableService(args.drop(1))
        "help" -> showHelp()
        "version" -> showVersion()
        else -> println("[ERROR] Unknown command: $command")
    }
}
// this is such fucking DDLC code oh my god
// didnt they have like 50 if elses this is it with functions :fr:

fun NoServiceGivenMSG() {
    println("[ERROR] No service has been specified. Aborting!")
}

fun showHelp() {

}



fun startService(args: List<String>) {
    if (args.isEmpty()) {
        NoServiceGivenMSG()
        return
    }
    else {
        println("[LazyInit] Started service: $args")
    }
}

fun stopService(args: List<String>) {
    if (args.isEmpty()) {
        NoServiceGivenMSG()
        return
    }
    else {
        println("[LazyInit] Stopped service: $args")
    }
}

fun showStatus(args: List<String>) {
    if (args.isEmpty()) {
        NoServiceGivenMSG()
        return
    }
    else {
        println("[LazyInit] Status of service: $args: ")
    }
}

fun restartService(args: List<String>) {
    if (args.isEmpty()) {
        NoServiceGivenMSG()
        return
    }
    else {
        println("[LazyInit] Restarted service: $args")
    }
}

fun enableService(args: List<String>) {
    if (args.isEmpty()) {
        NoServiceGivenMSG()
        return
    }
    else {
        println("[LazyInit] Enabled service: $args")
    }
}

fun disableService(args: List<String>) {
    if (args.isEmpty()) {
        NoServiceGivenMSG()
        return
    }
}

fun showVersion() {
    println("""
___________________________________
| * the lazyinit project
| * Version: 0.1 Beta 1 (pre-release)
| * written by bigi,hsd,h3lix,sund0wner and okla34
| * made in kotlin! :P
|___________________________________
    """.trimIndent())
}