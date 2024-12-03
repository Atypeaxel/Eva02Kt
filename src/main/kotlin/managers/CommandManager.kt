package fr.atypeaxel.managers

import net.dv8tion.jda.api.events.session.ReadyEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import org.slf4j.LoggerFactory

class CommandManager : ListenerAdapter() {

    private val logger = LoggerFactory.getLogger(CommandManager::class.java)!!

    private val commands = HashMap<String, ICommand>()

    fun registerCommand(command: ICommand) {
        if (!commands.containsKey(command.name)) {
            commands[command.name] = command
        }
    }

    override fun onReady(event: ReadyEvent) {
        logger.info("Loading Command Manager")
    }
}

interface ICommand {
    val name: String
    val description: String

    val execute: Void
}