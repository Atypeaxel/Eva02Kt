package fr.atypeaxel

import io.github.cdimascio.dotenv.Dotenv
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent

fun startBot(){
    val env = Dotenv.load()

    val jda = JDABuilder.createDefault(env.get("token"))
        .enableIntents(GatewayIntent.GUILD_MESSAGES)
        .enableIntents(GatewayIntent.MESSAGE_CONTENT)
        .enableIntents(GatewayIntent.DIRECT_MESSAGES)

    jda.build()
}

fun main() {
    startBot()
}