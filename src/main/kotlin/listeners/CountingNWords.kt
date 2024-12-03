package fr.atypeaxel.listeners

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class CountingNWords : ListenerAdapter() {

    override fun onMessageReceived(event: MessageReceivedEvent) {
        if(event.author.isBot) return

        if(!event.message.contentRaw.contains("")){
            print("NAH BRO")
        }
    }
}